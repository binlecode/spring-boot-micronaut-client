# Spring Boot Micronaut Client

A simple proof of concept app demonstrating the use of a Micronaut
http client bean in a Spring Boot REST application.

Run the app:

    ./gradlew bootRun
    
Send requests to retrieve search results from the iTunes store:

    curl http://localhost:8080/search/Rush
    curl http://localhost:8080/search/Riverside
    etc...
