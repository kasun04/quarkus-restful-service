package org.kasun.order;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

public class OrderInfo {

    private String id; 
    private String name; 
    private String desc; 


    public OrderInfo() {
    }

    public OrderInfo(String id, String name, String desc) {
        this.id = id;
        this.name = name;
        this.desc = desc;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public OrderInfo id(String id) {
        this.id = id;
        return this;
    }

    public OrderInfo name(String name) {
        this.name = name;
        return this;
    }

    public OrderInfo desc(String desc) {
        this.desc = desc;
        return this;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", desc='" + getDesc() + "'" +
            "}";
    }

}