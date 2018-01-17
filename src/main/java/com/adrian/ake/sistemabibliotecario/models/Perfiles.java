package com.adrian.ake.sistemabibliotecario.models;
// Generated 17/01/2018 08:36:31 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Perfiles generated by hbm2java
 */
public class Perfiles  implements java.io.Serializable {


     private int idperfil;
     private String descripcion;
     private Boolean esvisible;
     private Date createdAt;
     private Date updatedAt;
     private Set usuarios = new HashSet(0);

    public Perfiles() {
    }

	
    public Perfiles(int idperfil, String descripcion) {
        this.idperfil = idperfil;
        this.descripcion = descripcion;
    }
    public Perfiles(int idperfil, String descripcion, Boolean esvisible, Date createdAt, Date updatedAt, Set usuarios) {
       this.idperfil = idperfil;
       this.descripcion = descripcion;
       this.esvisible = esvisible;
       this.createdAt = createdAt;
       this.updatedAt = updatedAt;
       this.usuarios = usuarios;
    }
   
    public int getIdperfil() {
        return this.idperfil;
    }
    
    public void setIdperfil(int idperfil) {
        this.idperfil = idperfil;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Boolean getEsvisible() {
        return this.esvisible;
    }
    
    public void setEsvisible(Boolean esvisible) {
        this.esvisible = esvisible;
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
    public Set getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Set usuarios) {
        this.usuarios = usuarios;
    }




}

