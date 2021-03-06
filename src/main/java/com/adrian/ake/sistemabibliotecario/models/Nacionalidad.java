package com.adrian.ake.sistemabibliotecario.models;
// Generated 17/01/2018 08:36:31 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Nacionalidad generated by hbm2java
 */
public class Nacionalidad  implements java.io.Serializable {


     private Integer idpais;
     private String pais;
     private String nacionalidad;
     private Set autors = new HashSet(0);

    public Nacionalidad() {
    }

	
    public Nacionalidad(String pais, String nacionalidad) {
        this.pais = pais;
        this.nacionalidad = nacionalidad;
    }
    public Nacionalidad(String pais, String nacionalidad, Set autors) {
       this.pais = pais;
       this.nacionalidad = nacionalidad;
       this.autors = autors;
    }
   
    public Integer getIdpais() {
        return this.idpais;
    }
    
    public void setIdpais(Integer idpais) {
        this.idpais = idpais;
    }
    public String getPais() {
        return this.pais;
    }
    
    public void setPais(String pais) {
        this.pais = pais;
    }
    public String getNacionalidad() {
        return this.nacionalidad;
    }
    
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    public Set getAutors() {
        return this.autors;
    }
    
    public void setAutors(Set autors) {
        this.autors = autors;
    }




}


