# datahem.serializer
Serialize structured data, currently using protocol buffers

## 0.8 (2018-08-30): Measurement Protocol from proto3 to proto2 
Changed to proto2 to support values that are the same as defaults in proto3, eg. 0 for int.

## 0.7 (2018-06-14): Measurement Protocol fields Camel Case naming
Changed the field naming to camel case in measurementprotocol proto

Generate java files by running:
protoc -I=./proto --java_out=./src/main/java/ ./proto/*.proto