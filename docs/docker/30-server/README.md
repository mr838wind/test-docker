# server info
    nginx,tomcat

## 주의점
* build 시 spring.profiles.active 를 docker 로 바꾸고 gradle: build task 실행
* build/libs/ROOT.war tomcat-webapps로 copy 해서 배포

## info
* nginx-conf.d :  nginx 설정 파일 
* nginx-html :  nginx html path
* tomcat-webapps :  tomcat path

