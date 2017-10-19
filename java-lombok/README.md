This sample extends the java sample in aws-sam-local and uses Lombok in java classes.

To run this sample:
```
mvn clean package shade:shade
sam local invoke GetHelloWorld -e "src/test/resources/event.json"
```

