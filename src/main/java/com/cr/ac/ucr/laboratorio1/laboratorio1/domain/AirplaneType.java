package com.cr.ac.ucr.laboratorio1.laboratorio1.domain;

public class AirplaneType {
    private int id;
    private String code;
    private String description;

    public AirplaneType() {}

    public AirplaneType(int id, String code, String description) {
        this.id = id;
        this.code = code;
        this.description = description;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}