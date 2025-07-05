package com.cognizant.orm_learn.model;

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
    private String stCode;

    @Temporal(TemporalType.DATE)
    @Column(name = "st_date")
    private Date stDate;

    @Column(name = "st_open")
    private float stOpen;

    @Column(name = "st_close")
    private float stClose;

    @Column(name = "st_volume")
    private int stVolume;

   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStCode() {
        return stCode;
    }

    public void setStCode(String stCode) {
        this.stCode = stCode;
    }

    public Date getStDate() {
        return stDate;
    }

    public void setStDate(Date stDate) {
        this.stDate = stDate;
    }

    public float getStOpen() {
        return stOpen;
    }

    public void setStOpen(float stOpen) {
        this.stOpen = stOpen;
    }

    public float getStClose() {
        return stClose;
    }

    public void setStClose(float stClose) {
        this.stClose = stClose;
    }

    public int getStVolume() {
        return stVolume;
    }

    public void setStVolume(int stVolume) {
        this.stVolume = stVolume;
    }
}
