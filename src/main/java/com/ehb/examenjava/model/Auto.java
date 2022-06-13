package com.ehb.examenjava.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Auto {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;

    @NotBlank
    private String chassisnr;

    @NotBlank
    private String merk;

    @NotBlank
    private String fabrikant;

    @NotBlank
    private String deuren;

    public Auto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getChassisnr() {
        return chassisnr;
    }

    public void setChassisnr(String chassisnr) {
        this.chassisnr = chassisnr;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getFabrikant() {
        return fabrikant;
    }

    public void setFabrikant(String fabrikant) {
        this.fabrikant = fabrikant;
    }

    public String getDeuren() {
        return deuren;
    }

    public void setDeuren(String deuren) {
        this.deuren = deuren;
    }
}
