FROM openjdk:11
COPY ./src/Teste.java /app/
WORKDIR /app
RUN javac Teste.java
ENTRYPOINT ["java", "Teste"]