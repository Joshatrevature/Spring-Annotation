package org.genspark;

import org.springframework.beans.factory.annotation.Required;

import java.util.Arrays;
import java.util.List;

public class Student {
    private int id;
    private String name;
    private List<Phone> ph;
    private Address add;


    public int getId() {
        return id;
    }
    @Required
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    @Required
    public void setName(String name) {
        this.name = name;
    }

    public List<Phone> getPh() {
        return ph;
    }

    public void setPh(List<Phone> ph) {
        this.ph = ph;
    }

    public Address getAdd() {
        return add;
    }

    public void setAdd(Address add) {
        this.add = add;
    }

    void show(){
        System.out.println(id+" "+ name + " "+ph + " " +add );
        System.out.println(add.toString());
        System.out.println(ph.stream().toList());
    }
}
