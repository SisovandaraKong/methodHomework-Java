package EncapAirplane;

import lombok.*;

import java.sql.Timestamp;
import java.time.LocalDate;
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Airplane {
    private Integer id;
    private String uuid;
    private String name;
    private Integer wheel;
    private Integer wing;
    private LocalDate createdDate;
    private Timestamp timestamp;
    private String brand;
    private Integer numberOfPeople;


}
