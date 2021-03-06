/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adrian.ake.sistemabibliotecario.views;

import com.adrian.ake.sistemabibliotecario.controllers.UsuarioController;
import com.adrian.ake.sistemabibliotecario.models.Usuario;
import com.adrian.ake.sistemabibliotecario.tools.Encrypt;
import com.adrian.ake.sistemabibliotecario.tools.PlaceholderPasswordField;
import com.adrian.ake.sistemabibliotecario.tools.PlaceholderTextField;
import com.adrian.ake.sistemabibliotecario.tools.Utilities;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import javax.annotation.Resource;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author adrianake
 */
@Component
public final class DlgLogin extends javax.swing.JDialog {

    @Resource
    private UsuarioController userController;
    private Usuario usuarioLogeado;

    /**
     * Creates new form Login
     *
     * @param parent
     * @param modal
     */
    public DlgLogin(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initCloseAction();
        initComponents();
        cargarPersonalizacion();
    }

    @Autowired
    public DlgLogin(UsuarioController userController) {
        super(null, ModalityType.APPLICATION_MODAL);
        initCloseAction();
        initComponents();
        this.userController = userController;
        cargarPersonalizacion();

    }

    public void cargarPersonalizacion() {
        Utilities.setDialogIcon(this);
        this.jtxtCorreo.setUI(new PlaceholderTextField("Correo Electronico", false));
        this.jpwdtxtPassword.setUI(new PlaceholderPasswordField("Contraseña", false));
        setMnemonic();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnIngresar = new javax.swing.JButton();
        jtxtCorreo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jpwdtxtPassword = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(237, 237, 237));

        btnIngresar.setBackground(new java.awt.Color(50, 118, 177));
        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/adrian/ake/sistemabibliotecario/resources/enter_system_login.png"))); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        jtxtCorreo.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jtxtCorreo.setBorder(null);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Bienvenido | Ingreso de Usuario");

        jpwdtxtPassword.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jpwdtxtPassword.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jpwdtxtPassword)
                                .addComponent(jtxtCorreo)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jtxtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpwdtxtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        if (this.validarInputsVacios()) {
            Usuario usuario_encontrado = this.getUsuarioXCredenciales(this.jtxtCorreo.getText(), String.valueOf(this.jpwdtxtPassword.getPassword()));
            if (usuario_encontrado != null) {
                this.setUsuarioLogeado(usuario_encontrado);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "El usuario o contraseña son incorrectos!");
                this.jpwdtxtPassword.setText("");
                this.jtxtCorreo.selectAll();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Los campos de correo y contraseña son obligatorios!");
        }

    }//GEN-LAST:event_btnIngresarActionPerformed

    public Usuario getUsuarioXCredenciales(String correo, String password) {
        return this.userController.getUsuarioXCredenciales(correo, Encrypt.MD5(password));
    }

    public boolean validarInputsVacios() {
        return !this.jtxtCorreo.getText().isEmpty() && !String.valueOf(this.jpwdtxtPassword.getPassword()).isEmpty();
    }

    private void initCloseAction() {
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                if (JOptionPane.showConfirmDialog(null, "¿Está seguro de salir?", "Aviso", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
                    System.exit(0);
                } else {
                    setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
                }
            }
        });
    }

    public final void setMnemonic() {
        getActionMap(this.btnIngresar, "Ingresar", KeyEvent.VK_ENTER);
        this.btnIngresar.setMnemonic(KeyEvent.VK_ENTER);
    }

    public void getActionMap(JComponent componente, String nombreAccion, int tecla) {
        componente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
                KeyStroke.getKeyStroke(tecla, 0), nombreAccion);
        componente.getActionMap().put(nombreAccion,
                newAbstractAction(nombreAccion));
    }

    public AbstractAction newAbstractAction(String nombreAccion) {
        if (nombreAccion.equals("cerrar")) {
            return new AbstractAction(nombreAccion) {
                @Override
                public void actionPerformed(ActionEvent evt) {

                }
            };
        } else if (nombreAccion.equals("Ingresar")) {
            return new AbstractAction(nombreAccion) {
                @Override
                public void actionPerformed(ActionEvent evt) {
                    btnIngresarActionPerformed(evt);
                }
            };
        }
        return null;
    }

    public Usuario getUsuarioLogeado() {
        return usuarioLogeado;
    }

    public void setUsuarioLogeado(Usuario usuarioLogeado) {
        this.usuarioLogeado = usuarioLogeado;
    }

    @Override
    public void setVisible(boolean b) {
        super.setVisible(b); //To change body of generated methods, choose Tools | Templates.
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPasswordField jpwdtxtPassword;
    private javax.swing.JTextField jtxtCorreo;
    // End of variables declaration//GEN-END:variables
}
