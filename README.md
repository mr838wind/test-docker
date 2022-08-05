




------------------------------------------------------------
## test spring boot docker build task: bootBuildImage

## run docker
docker run -d -p 7100:7100 -e "SPRING_PROFILES_ACTIVE=docker" mr838wind/test-setting

## check result
http://localhost:7100/board/1
