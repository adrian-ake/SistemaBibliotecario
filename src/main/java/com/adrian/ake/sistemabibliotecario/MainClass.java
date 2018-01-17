/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adrian.ake.sistemabibliotecario;

import com.adrian.ake.sistemabibliotecario.tools.SpringContextLoad;
import com.adrian.ake.sistemabibliotecario.views.DlgLogin;
import com.alee.laf.WebLookAndFeel;
import javax.swing.UIManager;
import org.apache.log4j.Logger;

/**
 *
 * @author adrian.ake
 */
public class MainClass {

    final static Logger logger = Logger.getLogger(MainClass.class);

    public static void main(String[] args) {
        MainClass mainClass = new MainClass();
        logger.info("Iniciando Servicios -> Sistema Biblioteca...");
        mainClass.instalarThema();
        logger.info("Iniciando Tema -> Servicios Sistema Biblioteca...");
        mainClass.iniciarLogin();
    }

    private void iniciarLogin() {
        DlgLogin dlgLogin = SpringContextLoad.getContext().getBean(DlgLogin.class);
        dlgLogin.setLocationRelativeTo(null);
        dlgLogin.setVisible(true);
    }

    private void instalarThema() {
        try {
            WebLookAndFeel.install();
            UIManager.setLookAndFeel(new WebLookAndFeel());
            UIManager.setLookAndFeel("com.alee.laf.WebLookAndFeel");
            UIManager.setLookAndFeel(WebLookAndFeel.class.getCanonicalName());
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("Error al tratar de instalar tema LaF " + e.getMessage(), e);
        }
    }
}
