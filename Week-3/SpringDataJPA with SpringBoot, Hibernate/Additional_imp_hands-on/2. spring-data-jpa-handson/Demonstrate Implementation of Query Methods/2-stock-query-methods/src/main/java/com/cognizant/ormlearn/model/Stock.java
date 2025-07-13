package com.cognizant.ormlearn.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "stock")
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "st_id")
    private int id;

    @Column(name = "st_code")
    private String code;

    @Column(name = "st_date")
    @Temporal(TemporalType.DATE)
    private Date date;

    @Column(name = "st_open")
    private Double open;

    @Column(name = "st_close")
    private Double close;

    @Column(name = "st_volume")
    private Long volume;

    // Getters, Setters, toString()
    public String toString() {
        return "[code=" + code + ", date=" + date + ", open=" + open + ", close=" + close + ", volume=" + volume + "]";
    }
}
