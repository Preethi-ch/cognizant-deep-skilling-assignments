package com.cognizant.orm_learn.model;

import jakarta.persistence.*;

@Entity
@Table(name = "product")
public class Product {

    @Id
    private int id;

    private String name;
    private String cpu;

    @Column(name = "ram_size")
    private int ramSize;

    @Column(name = "hdd_size")
    private int hddSize;

    @Column(name = "cpu_speed")
    private float cpuSpeed;

    private String os;
    private float weight;

    @Column(name = "customer_review")
    private int customerReview;

    
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCpu() { return cpu; }
    public void setCpu(String cpu) { this.cpu = cpu; }

    public int getRamSize() { return ramSize; }
    public void setRamSize(int ramSize) { this.ramSize = ramSize; }

    public int getHddSize() { return hddSize; }
    public void setHddSize(int hddSize) { this.hddSize = hddSize; }

    public float getCpuSpeed() { return cpuSpeed; }
    public void setCpuSpeed(float cpuSpeed) { this.cpuSpeed = cpuSpeed; }

    public String getOs() { return os; }
    public void setOs(String os) { this.os = os; }

    public float getWeight() { return weight; }
    public void setWeight(float weight) { this.weight = weight; }

    public int getCustomerReview() { return customerReview; }
    public void setCustomerReview(int customerReview) { this.customerReview = customerReview; }
}
