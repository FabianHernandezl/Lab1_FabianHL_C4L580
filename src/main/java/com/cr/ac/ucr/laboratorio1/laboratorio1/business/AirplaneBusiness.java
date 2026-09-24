package com.cr.ac.ucr.laboratorio1.laboratorio1.business;

import com.cr.ac.ucr.laboratorio1.laboratorio1.data.AirplaneData;
import com.cr.ac.ucr.laboratorio1.laboratorio1.domain.Airplane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirplaneBusiness {

    @Autowired
    private AirplaneData airplaneData;

    public List<Airplane> getByTypeId(int typeId) {
        return airplaneData.getByTypeId(typeId);
    }
}