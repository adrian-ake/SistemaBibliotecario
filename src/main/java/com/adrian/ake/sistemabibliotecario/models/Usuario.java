package com.adrian.ake.sistemabibliotecario.models;
// Generated 17/01/2018 08:36:31 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private Integer idusuario;
     private Perfiles perfiles;
     private String nombres;
     private String apellidos;
     private String correo;
     private String password;
     private Boolean activo;
     private Date createdAt;
     private Date updatedAt;

    public Usuario() {
    }

	
    public Usuario(Perfiles perfiles, String nombres, String apellidos, String correo, String password) {
        this.perfiles = perfiles;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.password = password;
    }
    public Usuario(Perfiles perfiles, String nombres, String apellidos, String correo, String password, Boolean activo, Date createdAt, Date updatedAt) {
       this.perfiles = perfiles;
       this.nombres = nombres;
       this.apellidos = apellidos;
       this.correo = correo;
       this.password = password;
       this.activo = activo;
       this.createdAt = createdAt;
       this.updatedAt = updatedAt;
    }
   
    public Integer getIdusuario() {
        return this.idusuario;
    }
    
    public void setIdusuario(Integer idusuario) {
        this.idusuario = idusuario;
    }
    public Perfiles getPerfiles() {
        return this.perfiles;
    }
    
    public void setPerfiles(Perfiles perfiles) {
        this.perfiles = perfiles;
    }
    public String getNombres() {
        return this.nombres;
    }
    
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getApellidos() {
        return this.apellidos;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public Boolean getActivo() {
        return this.activo;
    }
    
    public void setActivo(Boolean activo) {
        this.activo = activo;
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




}

