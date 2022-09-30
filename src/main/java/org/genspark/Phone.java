package org.genspark;

import org.springframework.beans.factory.annotation.Required;

import java.util.Collections;
import java.util.List;

public class Phone {
    private String mob;

    public String getMob() {
        return mob;
    }
    @Required
    public void setMob(String mob) {
        this.mob = mob;
    }

    public String toString(){
        return mob;
    }
}
