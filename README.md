# Kafka-Basics
This project is to make a base study of kafka producers and consumers.

## Prerequisites
- Docker
- Docker compose
- Java 17
- Maven

## Usage
- Use docker compose on the root to run the containers for kafka.
- Access [kafka-ui](http://localhost:8081) for visualizing kafka dashboard.
- Click on `Configure new cluster`.
- Add any name for your cluster.
- On Bootstrap Servers, add `kafka-1` to your host and `29092` on port.
- Click on `Validate` button and if it shows green notification then you can Click on `Submit`. Now return to your dashboard and refresh the page to see your kafka cluster.
- There is 2 subdirectories in this project, both are spring-boot applications. Please start the producer first. 
- In the Documentation folder there is a postman collection, import it and send a request. If you check your dashboard, it will appear a new topic in your cluster named "send-email" with one new message.
- Run the consumer application. Once is running the consumer will process the previously sended message and print it on the log.

## Examples
### Request example
![request-example](documentation/request-example.png)

### Processed message
![processed-message](documentation/processed-message.png)

### Kafka-UI
![kafka-ui](documentation/kafka-ui.png)
![kafka-ui-message](documentation/kafka-ui-message.png)