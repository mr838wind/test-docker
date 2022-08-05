# docker 사용법 정리
* [get-started](https://docs.docker.com/get-started/)
* 설명: 도커(Docker)는 리눅스의 응용 프로그램들을 프로세스 격리 기술들을 사용해 컨테이너로 실행하고 관리하는 오픈 소스 프로젝트이다. (운영 체제 수준 가상화)
* 설명: 다중 docker container 구성 편하게 하는 도구
* 
* 참고 [www.docker.com](https://www.docker.com/get-started/)
  * [docker-desktop](https://www.docker.com/products/docker-desktop/)
  * [docker-hub](https://hub.docker.com/)
* intellij docker plugin 추천

## install docker
* [(PC) docker desktop 설치 <PC>](https://www.docker.com/products/docker-desktop/)
  * [windows 설치 주의점 참고:](https://www.lainyzine.com/ko/article/a-complete-guide-to-how-to-install-docker-desktop-on-windows-10/)
* [(server) install docker on ubuntu](https://docs.docker.com/engine/install/ubuntu/)

## install docker-compose
* docker desktop 설치 시 같이 설치됨
* linux server:
  * [Install and Use Docker Compose on Ubuntu 20.04](https://www.digitalocean.com/community/tutorials/how-to-install-and-use-docker-compose-on-ubuntu-20-04)


## docker-hub 에서 image 검색
* [docker-hub](https://hub.docker.com/) 


## docker 명령어 참고 
```
상태: docker ps
실행: docker run -d IMAGE[:TAG]
    docker run -d docker/getting-started:latest

-------------
종료: docker stop COINTAINER_ID
시작: docker start COINTAINER_ID
재시작: docker restart COINTAINER_ID
삭제: docker rm COINTAINER_ID
``` 

## docker compose 명령어 참고
* 00-0-prepare/00-create-network.sh 실행해줌 (container 서로 찾을 수 있게)
* docker-compose.yml 가 있는 폴더 에서 명령어 실행

```
상태확인: 
  docker-compose ps
생성 밑 실행: 
  docker-compose up -d
종료 밑 삭제: 
  docker-compose down
  
------------- 
시작/종료/재기동: 
  docker-compose stop
  docker-compose start
  docker-compose restart
```

## sample project

## setting: db

## setting: nginx, tomcat
* build 시 spring.profiles.active 를 docker 로 바꾸고 gradle: build task 실행
* build/libs/ROOT.war 를 배포

## build: spring boot docker build 





