package com.cr.ac.ucr.laboratorio1.laboratorio1.domain;

public class Airline {
    private int id;
    private String iata;
    private String name;
    private String baseAirport;

    public Airline() {}

    public Airline(int id, String iata ,String name,String baseAirport) {
        this.id = id;
        this.iata = iata;
        this.name = name;
        this.baseAirport = baseAirport;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getIata() { return iata; }
    public void setIata(String iata) { this.iata = iata; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getBaseAirport() { return baseAirport; }
    public void setBaseAirport(String baseAirport) { this.baseAirport = baseAirport; }

}