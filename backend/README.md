###How to run:

#### 1. backend/
    docker-compose up

#### 2. backend/food-service/
    ./gradlew build --stacktrace
    java -jar build/libs/food-service-0.0.1-SNAPSHOT.jar

#### 3. http://localhost:8080/food?id=17
#### 4. http://localhost:8080/food/all