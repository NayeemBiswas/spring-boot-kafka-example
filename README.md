# spring-boot-kafka-example

### First i need to install kafka server.
    Step of Kafka Server Configure.
    1. Download your suitable version File from [Kafka](https://kafka.apache.org/downloads)
    2. Extract this File.
    3. Keep it it hard drive
**Now you are Successfully Configure your Kafka Server**

## Run Your Server
     1. for zookeeper run execute this command: bin\windows\zookeeper-server-start.bat config\zookeeper.properties
     2. for kafka run execute this command: bin\windows\kafka-server-start.bat config\server.properties
## Create Topic
     1. for Create a topic run execute this command:  bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --partitions 1 --topic Test
     2. for see list of topic run execute this command: bin\windows\kafka-topics.bat --list --zookeeper localhost:2181
