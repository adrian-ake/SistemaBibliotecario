/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adrian.ake.sistemabibliotecario.services;

import com.adrian.ake.sistemabibliotecario.models.Usuario;
import com.adrian.ake.sistemabibliotecario.repositories.UserDAOI;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 *
 * @author adrian.ake
 */
@Service
public class UsuarioService {

    @Resource
    private UserDAOI userDAOI;

    public Usuario getUsuarioXCredenciales(String correo, String password) {
        return this.userDAOI.getUsuarioXCredenciales(correo, password);
    }

}
