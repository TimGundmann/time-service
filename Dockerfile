  
FROM openjdk:10.0.2-13-jre-sid

COPY target/time-service.jar /app/time-service.jar

CMD ["java", "-jar", "/app/news-service.jar"]
