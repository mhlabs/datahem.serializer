# datahem.serializer
Serialize structured data, currently using protocol buffers

## 0.7 (2018-06-14): Measurement Protocol Views Camel Case naming
Changed the field naming to camel case

Generate java files by running:
protoc -I=./proto --java_out=./src/main/java/ ./proto/*.proto