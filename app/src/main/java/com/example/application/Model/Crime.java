package com.example.application.Model;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

public class Crime implements Serializable {
    private UUID Id;
    private String tm;
    private Date rn;
    private boolean gh;

    public Crime(String tm) {
        Id = UUID.randomUUID();
        this.tm = tm;
        this.rn = new Date();
        this.gh = false;
    }

    public void setTm(String tm) {
        this.tm = tm;
    }

    public void setGh(boolean gh) {
        this.gh = gh;
    }

    public UUID getId() {
        return Id;
    }

    public String getTm() {
        return tm;
    }

    public Date getRn() {
        return rn;
    }

    public boolean isGh() {
        return gh;
    }
}
