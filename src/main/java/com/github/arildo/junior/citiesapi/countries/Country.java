package com.github.arildo.junior.citiesapi.countries;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pais")
public class Country {

    @Id
    private Long id;

    @Column(name = "nome")
    private String name;

    @Column(name = "nome_pt")
    private String portugueseName;

    @Column(name = "sigla")
    private String code;

    private Integer bacen;

    public Country() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPortugueseName() {
        return portugueseName;
    }

    public String getCode() {
        return code;
    }

    public Integer getBacen() {
        return bacen;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPortugueseName(String portugueseName) {
        this.portugueseName = portugueseName;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setBacen(Integer bacen) {
        this.bacen = bacen;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", portugueseName='" + portugueseName + '\'' +
                ", code='" + code + '\'' +
                ", bacen=" + bacen +
                '}';
    }


}