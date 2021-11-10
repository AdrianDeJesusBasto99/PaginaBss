FROM openjdk:8
COPY . /usr/src/myapp
WORKDIR /usr/src/myapp
RUN javac Test.java
CMD ["java", "-cp", "Test.java"]