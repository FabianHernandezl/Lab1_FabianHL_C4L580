package com.cr.ac.ucr.laboratorio1.laboratorio1.data;

import com.cr.ac.ucr.laboratorio1.laboratorio1.domain.Airline;
import com.cr.ac.ucr.laboratorio1.laboratorio1.domain.Airplane;
import com.cr.ac.ucr.laboratorio1.laboratorio1.domain.AirplaneType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class AirplaneData {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Airplane> getByTypeId(int typeId) {
        String sql = """
            SELECT a.airplane_id          AS airplane_id,
                   a.capacity             AS airplane_capacity,
                   al.airline_id          AS airline_id,
                   al.iata                AS airline_iata,
                   al.airlinename         AS airline_name,
                   al.base_airport        AS airline_base_airport,
                   at.type_id             AS type_id,
                   at.identifier          AS type_identifier,
                   at.description         AS type_description
            FROM airplane a
            INNER JOIN airline al       ON a.airline_id = al.airline_id
            INNER JOIN airplane_type at ON a.type_id    = at.type_id
            WHERE at.type_id = ?
        """;

        return jdbcTemplate.query(sql, new ResultSetExtractor<List<Airplane>>() {
            @Override
            public List<Airplane> extractData(ResultSet rs) throws SQLException {
                List<Airplane> list = new ArrayList<>();
                while (rs.next()) {

                    Airline airline = new Airline(
                        rs.getInt("airline_id"),
                        rs.getString("airline_iata"),
                        rs.getString("airline_name"),
                        rs.getString("airline_base_airport")
                    );

                    AirplaneType type = new AirplaneType(
                        rs.getInt("type_id"),
                        rs.getString("type_identifier"),
                        rs.getString("type_description")
                    );

                    Airplane airplane = new Airplane(
                        rs.getInt("airplane_id"),
                        rs.getInt("airplane_capacity"),
                        airline,
                        type
                    );

                    list.add(airplane);
                }
                return list;
            }
        }, typeId);
    }
}