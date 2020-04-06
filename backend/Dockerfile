# Moved here to test one java script.
# That connects to mysql database on another contianer
FROM openjdk:10-jre-slim

FROM openjdk:10-jre-slim AS TEMP_BUILD_IMAGE
ENV APP_HOME=/home/gradle/
WORKDIR $APP_HOME
COPY food-service/build.gradle food-service/settings.gradle food-service/gradlew $APP_HOME
COPY food-service/gradle $APP_HOME/gradle
RUN ./gradlew build || return 0
COPY food-service .
#RUN ./gradlew build
#
#
#ENV ARTIFACT_NAME=food-service-0.0.1-SNAPSHOT.jar
#ENV APP_HOME=/home/gradle/
#WORKDIR $APP_HOME
#COPY --from=TEMP_BUILD_IMAGE $APP_HOME/build/libs/$ARTIFACT_NAME .
#CMD ["java","-jar",$ARTIFACT_NAME]