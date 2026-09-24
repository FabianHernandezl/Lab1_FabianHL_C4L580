package com.cr.ac.ucr.laboratorio1.laboratorio1.business;

import com.cr.ac.ucr.laboratorio1.laboratorio1.data.AirplaneTypeData;
import com.cr.ac.ucr.laboratorio1.laboratorio1.domain.AirplaneType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirplaneTypeBusiness {

    @Autowired
    private AirplaneTypeData airplaneTypeData;

    public List<AirplaneType> findAll() {
        return airplaneTypeData.findAll();
    }

    public AirplaneType getById(int id) {
        return airplaneTypeData.findAll().stream()
                .filter(t -> t.getId() == id)
                .findFirst()
                .orElse(null);
    }
}