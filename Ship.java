package com.entities;
import java.sql.date;

public class Ship {
    private int id;
    private String berthNumber;
    private String bollardNumber;
    private String name;
    private DateTime ETA;
    private String ETD;
    private String lastPort;
    private String nextPort;


    public Ship() {
    }

    public Ship(String berthNumber, String bollardNumber, String name, String ETA, String ETD, String lastPort, String nextPort) {
        this.berthNumber = berthNumber;
        this.bollardNumber = bollardNumber;
        this.name = name;
        this.ETA = ETA;
        this.ETD = ETD;
        this.lastPort = lastPort;
        this.nextPort = nextPort;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBerthNumber() {
        return berthNumber;
    }

    public void setBerthNumber(String berthNumber) {
        this.berthNumber = berthNumber;
    }

    public String getBollardNumber() {
        return bollardNumber;
    }

    public void setBollardNumber(String bollardNumber) {
        this.bollardNumber = bollardNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getETA() {
        return ETA;
    }

    public void setETA(String ETA) {
        this.ETA = ETA;
    }

    public String getETD() {
        return ETD;
    }

    public void setETD(String ETD) {
        this.ETD = ETD;
    }

    public String getLastPort() {
        return lastPort;
    }

    public void setLastPort(String lastPort) {
        this.lastPort = lastPort;
    }

    public String getNextPort() {
        return nextPort;
    }

    public void setNextPort(String nextPort) {
        this.nextPort = nextPort;
    }
}
