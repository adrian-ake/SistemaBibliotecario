/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adrian.ake.sistemabibliotecario.controllers;

import com.adrian.ake.sistemabibliotecario.models.Usuario;
import com.adrian.ake.sistemabibliotecario.services.UsuarioService;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;

/**
 *
 * @author adrian.ake
 */
@Controller
public class UsuarioController {
    @Resource
    private UsuarioService usuarioService;
    public Usuario getUsuarioXCredenciales(String correo, String password) {
        return this.usuarioService.getUsuarioXCredenciales(correo,password);
    }
    
}
