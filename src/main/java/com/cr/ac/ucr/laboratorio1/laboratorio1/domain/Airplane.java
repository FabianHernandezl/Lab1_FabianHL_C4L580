package com.cr.ac.ucr.laboratorio1.laboratorio1.domain;

public class Airplane {
    private int id;
    private int capacity;
    private Airline airline;
    private AirplaneType airplaneType;

    public Airplane() {}

    public Airplane(int id, int capacity, Airline airline, AirplaneType airplaneType) {
        this.id = id;
        this.capacity = capacity;
        this.airline = airline;
        this.airplaneType = airplaneType;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getCapacity() { return capacity; }
    public void setCapacity(int capacity) { this.capacity = capacity; }

    public Airline getAirline() { return airline; }
    public void setAirline(Airline airline) { this.airline = airline; }

    public AirplaneType getAirplaneType() { return airplaneType; }
    public void setAirplaneType(AirplaneType airplaneType) { this.airplaneType = airplaneType; }
}