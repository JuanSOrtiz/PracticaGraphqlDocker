package com.udea.graphqludea.entity;



import javax.persistence.*;


@Entity
public class FlightType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name; // "Nacional", "Internacional"

    public FlightType(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public FlightType() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}