# Quarks RESTful service 

A Kubernetes Native Java stack tailored for GraalVM & OpenJDK HotSpot, crafted from the best of breed Java libraries and standards. 
https://quarkus.io/

This is a simple RESTful service build using Quarks. 

```
mvn io.quarkus:quarkus-maven-plugin:0.11.0:create \
    -DprojectGroupId=org.kasun \
    -DprojectArtifactId=order-service \
    -DclassName="org.kasun.order.OrderResource" \
    -Dpath="/order"
```


```
mvn compile quarkus:dev
```

Packaging 

```
>> mvn package
>> java -jar target/order-service-1.0-SNAPSHOT-runner.jar 
2019-03-09 14:29:56,243 INFO  [io.quarkus] (main) Quarkus 0.11.0 started in 0.694s. Listening on: http://127.0.0.1:8080
2019-03-09 14:29:56,246 INFO  [io.quarkus] (main) Installed features: [cdi, resteasy, resteasy-jsonb] 
```

```
http://localhost:8080/order
```