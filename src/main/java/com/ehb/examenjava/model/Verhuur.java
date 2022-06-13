package com.ehb.examenjava.model;

import javax.persistence.*;
import javax.validation.constraints.Future;
import java.time.LocalDateTime;

@Entity
public class Verhuur {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @OneToOne
    @JoinColumn(name = "Auto")
    private Auto autoid;

    @OneToOne
    @JoinColumn(name = "Huurder")
    private Huurder huurderid;

    @Future
    private LocalDateTime startdatum;

    @Future
    private LocalDateTime Einddatum;

    public Verhuur() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Auto getAutoid() {
        return autoid;
    }

    public void setAutoid(Auto autoid) {
        this.autoid = autoid;
    }

    public Huurder getHuurderid() {
        return huurderid;
    }

    public void setHuurderid(Huurder huurderid) {
        this.huurderid = huurderid;
    }

    public LocalDateTime getStartdatum() {
        return startdatum;
    }

    public void setStartdatum(LocalDateTime startdatum) {
        this.startdatum = startdatum;
    }

    public LocalDateTime getEinddatum() {
        return Einddatum;
    }

    public void setEinddatum(LocalDateTime einddatum) {
        Einddatum = einddatum;
    }
}
