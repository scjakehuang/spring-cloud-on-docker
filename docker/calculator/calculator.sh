#!/usr/bin/env
echo server_name:${SERVER_NAME}
echo ${EUREKA_URL}
echo ${SERVER_PORT}

java -jar /${SERVER_NAME}.jar --server.port=${SERVER_PORT} --eureka.client.serviceUrl.defaultZone=http://${EUREKA_URL}/eureka/