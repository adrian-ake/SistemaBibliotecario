package com.adrian.ake.sistemabibliotecario.models;
// Generated 17/01/2018 08:36:31 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Editorial generated by hbm2java
 */
public class Editorial  implements java.io.Serializable {


     private Integer ideditorial;
     private String nombres;
     private Date createdAt;
     private Date updatedAt;
     private Set libros = new HashSet(0);

    public Editorial() {
    }

	
    public Editorial(String nombres) {
        this.nombres = nombres;
    }
    public Editorial(String nombres, Date createdAt, Date updatedAt, Set libros) {
       this.nombres = nombres;
       this.createdAt = createdAt;
       this.updatedAt = updatedAt;
       this.libros = libros;
    }
   
    public Integer getIdeditorial() {
        return this.ideditorial;
    }
    
    public void setIdeditorial(Integer ideditorial) {
        this.ideditorial = ideditorial;
    }
    public String getNombres() {
        return this.nombres;
    }
    
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public Date getCreatedAt() {
        return this.createdAt;
    }
    
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    public Date getUpdatedAt() {
        return this.updatedAt;
    }
    
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
    public Set getLibros() {
        return this.libros;
    }
    
    public void setLibros(Set libros) {
        this.libros = libros;
    }




}

