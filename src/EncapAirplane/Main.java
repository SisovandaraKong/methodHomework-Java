package EncapAirplane;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane(1,UUID.randomUUID().toString(),"AirBus",4,2,LocalDate.now(),Timestamp.valueOf(LocalDateTime.now()),"AirLine",200);
//        airplane1.setId(1);
//        airplane1.setUuid(UUID.randomUUID().toString());
//        airplane1.setName("AirBus");
//        airplane1.setWheel(4);
//        airplane1.setWing(2);
//        airplane1.setCreatedDate(LocalDate.now());
//        airplane1.setTimestamp(Timestamp.valueOf(LocalDateTime.now()));
//        airplane1.setBrand("Airline");
//        airplane1.setNumberOfPeople(200);
        System.out.println(airplane1);
    }
}
