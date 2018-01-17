/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adrian.ake.sistemabibliotecario.repositories;

import com.adrian.ake.sistemabibliotecario.models.Usuario;



/**
 *
 * @author adrianake
 */
public interface UserDAOI {

    public Usuario getUsuarioXCredenciales(String correo, String password);
    
}
