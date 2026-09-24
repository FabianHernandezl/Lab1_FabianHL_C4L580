package com.cr.ac.ucr.laboratorio1.laboratorio1.data;

import com.cr.ac.ucr.laboratorio1.laboratorio1.domain.AirplaneType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AirplaneTypeDataTest {

    //Arrage
    @Autowired
    private AirplaneTypeData airplaneTypeData;

    @Test
    void FindAll_NoEmptyLists() {
        // Act
        List<AirplaneType> resultado = airplaneTypeData.findAll();

        // Assert
        assertNotNull(resultado, "La lista no debe ser null");
        assertFalse(resultado.isEmpty(), "La lista no debe estar vacía");
    }

}