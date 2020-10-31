## Steps to create docker image

- Create a docker file with name Dockerfile
- FROM - add the images which are required to build the project (here openjdk)
- ADD - add the image which needs to be added to docker
- EXPOSE - mention the port number where application needs to be exposed
- build docker image command  (  docker build -f Dockerfile -t docker-spring-boot . )
- run docker ( docker run -p 8085:8085 docker-spring-boot)

- push image to docker hub
     docker tag docker-spring-boot 060420/docker-spring-boot
     docker push  060420/docker-spring-boot
     
 - Run with repo image