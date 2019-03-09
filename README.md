# quarkus-restful-service




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

```
http://localhost:8080/order
```