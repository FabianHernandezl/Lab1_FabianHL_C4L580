
SELECT type_id, identifier, description
                    FROM airplane_type

Consulta 2


SELECT
                    a.airplane_id,
                    a.capacity,
                    a.type_id,
                    t.identifier,
                    t.description,
                    a.airline_id,
                    al.iata,
                    al.airlinename,
                    al.base_airport
                FROM airplane a
                INNER JOIN airplane_type t
                    ON a.type_id = t.type_id
                LEFT JOIN airline al
                    ON a.airline_id = al.airline_id
                WHERE a.type_id = ?
