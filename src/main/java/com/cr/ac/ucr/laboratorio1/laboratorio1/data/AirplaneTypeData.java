package com.cr.ac.ucr.laboratorio1.laboratorio1.data;

import com.cr.ac.ucr.laboratorio1.laboratorio1.domain.AirplaneType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AirplaneTypeData {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<AirplaneType> findAll() {
        // Alias AS id / AS code para que coincidan con las propiedades
        // de la clase AirplaneType (id, code, description).
        String sql = """
            SELECT type_id     AS id,
                   identifier  AS code,
                   description AS description
            FROM airplane_type
            ORDER BY type_id
        """;
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(AirplaneType.class));
    }
}