package io.rsi.codespace.kafka.springbootkafkaproducerexample.resources;

import io.rsi.codespace.kafka.springbootkafkaproducerexample.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KafkaProducer {

    private static final String TOPIC = "Kafka_Example_json";
    @Autowired
    KafkaTemplate<String, User> kafkaTemplate;

    @GetMapping
    @RequestMapping("/publish/{name}/{age}/{dept}")
    public String post(@PathVariable String name, @PathVariable String age, @PathVariable String dept) {
        ListenableFuture<SendResult<String, User>> future = kafkaTemplate.send(TOPIC, User.builder().name(name).age(age).dept(dept).build());

        final String[] message = new String[1];
        future.addCallback(new ListenableFutureCallback<SendResult<String, User>>() {
            @Override
            public void onFailure(Throwable throwable) {
                message[0] =  "Message sending failed";
            }

            @Override
            public void onSuccess(SendResult<String, User> stringUserSendResult) {
                message[0] =  "Sent Message Successfully" + stringUserSendResult.getRecordMetadata();
                System.out.println("Messafe : " + message[0]);
            }
        });
        return message[0];
    }
}
