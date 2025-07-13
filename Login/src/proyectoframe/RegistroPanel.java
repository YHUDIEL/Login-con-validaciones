/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectoframe;

import java.awt.Color;
import javax.swing.BorderFactory;
import ProyectoTap.ValidadorTexto;

/**
 * Clase que representa una ventana de registro/inicio de sesión con interfaz gráfica personalizada.
 * Permite al usuario introducir su correo y contraseña, realizar validaciones y navegar hacia otras ventanas.
 * 
 * @author Yhudiel Mendoza
 * @version 1.0
 */
public class RegistroPanel extends javax.swing.JFrame {

    /**
     * Constructor de la clase RegistroPanel.
     * Configura componentes visuales, estilos, comportamiento de los campos y botones.
     */
    public RegistroPanel() {
        
        setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null);
        
        btnRegistro.setContentAreaFilled(false);     // Sin fondo
        btnRegistro.setBorderPainted(false);         // Sin borde
        btnRegistro.setForeground(new Color(0, 102, 204)); // Azul claro
        btnRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.setContentAreaFilled(false);     // Sin fondo
        btnCerrar.setBorderPainted(false);         // Sin borde
        
        // Personalización visual del botón INGRESAR
btnIngresar.setBackground(new Color(0, 102, 204)); // Azul profesional
btnIngresar.setForeground(Color.WHITE);            // Texto blanco
//btnIngresar.setFont(new java.awt.Font("Segoe UI", Font.BOLD , 12));
btnIngresar.setFocusPainted(false);                // Sin borde de foco
btnIngresar.setBorderPainted(false);               // Sin borde exterior
btnIngresar.setContentAreaFilled(true);            // Relleno activado
btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
//btnIngresar.setPreferredSize(new java.awt.Dimension(180, 45)); // Tamaño más grande


        
        lblImagen.setToolTipText("Recomendación: usa imágenes de 128x128 px");

        
        // Se oculta borde completo y se dibuja solo línea inferior
        txtCorreo.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.GRAY));
        txtCorreo.setBackground(new Color(0,0,0,0)); // fondo transparente
        txtCorreo.setOpaque(false); // fondo del panel
        txtCorreo.setForeground(Color.GRAY);
        
        // Lógica para mostrar/ocultar texto en txtCorreo
        txtCorreo.setText("Introduce tu correo");
        txtCorreo.addFocusListener(new java.awt.event.FocusAdapter() {
        @Override
        public void focusGained(java.awt.event.FocusEvent e) {
            if (txtCorreo.getText().equals("Introduce tu correo")) {
                txtCorreo.setText("");
                txtCorreo.setForeground(Color.BLACK);
            }
        }
        @Override
        public void focusLost(java.awt.event.FocusEvent e) {
            if (txtCorreo.getText().isEmpty()) {
                txtCorreo.setText("Introduce tu correo");
                txtCorreo.setForeground(Color.GRAY);
            }
        }
    });
        
        // ==== Personalización visual de txtContrasena ====
        txtContrasena.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.GRAY));
        txtContrasena.setBackground(new Color(0,0,0,0));
        txtContrasena.setOpaque(false);
        txtContrasena.setForeground(Color.GRAY);
        txtContrasena.setText("Introduce tu contraseña");

        // Lógica para texto en txtContrasena
        txtContrasena.addFocusListener(new java.awt.event.FocusAdapter() {
        @Override
        public void focusGained(java.awt.event.FocusEvent e) {
            if (String.valueOf(txtContrasena.getPassword()).equals("Introduce tu contraseña")) {
                txtContrasena.setText("");
                txtContrasena.setEchoChar('•'); // o '*'
                txtContrasena.setForeground(Color.BLACK);
            }
        }
        @Override
        public void focusLost(java.awt.event.FocusEvent e) {
            if (String.valueOf(txtContrasena.getPassword()).isEmpty()) {
                txtContrasena.setEchoChar((char)0);
                txtContrasena.setText("Introduce tu contraseña");
                txtContrasena.setForeground(Color.GRAY);
            }
        }
        });
    }
    
    /**
     * Asigna un ícono al JLabel de imagen.
     * @param icono Imagen a asignar
     */
    public void setIconoImagen1(javax.swing.Icon icono) {
        lblImagen.setIcon(icono);
    }

    /**
     * Obtiene el ícono actual asignado a lblImagen.
     * @return Icono actual
     */
    public javax.swing.Icon getIconoImagen1() {
        return lblImagen.getIcon();
    }

    /**
     * Cambia el color de fondo del panel izquierdo.
     * @param color Color deseado
     */
    public void setColorFondoPanel1(Color color) {
        jPanel2.setBackground(color);
    }

    /**
     * Obtiene el color de fondo del panel izquierdo.
     * @return Color actual
     */
    public Color getColorFondoPanel1() {
        return jPanel2.getBackground();
    }

    /**
     * Cambia el color de fondo del panel derecho.
     * @param color Color deseado
     */
    public void setColorFondoPanel2(Color color) {
        jPanel3.setBackground(color);
    }

    /**
     * Obtiene el color de fondo del panel derecho.
     * @return Color actual
     */
    public Color getColorFondoPanel2() {
        return jPanel3.getBackground();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblImagen = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblMensaje = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        txtContrasena = new javax.swing.JPasswordField();
        btnRegistro = new javax.swing.JButton();
        btnIngresar = new javax.swing.JButton();
        lblErrorContrasena = new javax.swing.JLabel();
        lblErrorCorreo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblPregunta = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(816, 500));
        setSize(new java.awt.Dimension(1000, 650));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lblImagen.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        lblImagen.setForeground(new java.awt.Color(255, 255, 255));
        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoframe/—Pngtree—colorful abstract square pattern background_5072255 (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImagen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        lblMensaje.setFont(new java.awt.Font("Segoe UI Semibold", 2, 36)); // NOI18N
        lblMensaje.setText("Iniciar Sesión");

        txtCorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCorreoFocusGained(evt);
            }
        });
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });

        btnRegistro.setBackground(new java.awt.Color(0, 0, 51));
        btnRegistro.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        btnRegistro.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistro.setText("REGISTRARSE");
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });

        btnIngresar.setBackground(new java.awt.Color(0, 0, 51));
        btnIngresar.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("Entrar");
        btnIngresar.setBorder(null);
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        lblErrorContrasena.setForeground(new java.awt.Color(200, 0, 0));

        lblErrorCorreo.setForeground(new java.awt.Color(200, 0, 0));

        jLabel1.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        jLabel1.setText("Correo:");

        jLabel2.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        jLabel2.setText("Contraseña:");

        lblPregunta.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        lblPregunta.setText("¿Aun no tienes cuenta?");

        btnCerrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(204, 0, 0));
        btnCerrar.setText("X");
        btnCerrar.setBorder(null);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(lblPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRegistro)
                        .addGap(88, 88, 88))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(lblMensaje)
                        .addGap(95, 95, 95))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(lblErrorCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(lblErrorContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 61, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCerrar)
                .addGap(53, 53, 53)
                .addComponent(lblMensaje)
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErrorCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErrorContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistro)
                    .addComponent(lblPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(180, 180, 180))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCorreoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCorreoFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoFocusGained

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    /**
     * Acción del botón "REGISTRARSE".
     * Abre la ventana FormularioRegistro.
     * @param evt Evento del botón
     */
    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
    FormularioRegistro fr = new FormularioRegistro();
    fr.setVisible(true);
    }//GEN-LAST:event_btnRegistroActionPerformed

    /**
     * Acción del botón "Entrar".
     * Valida los campos y abre la ventana principal si las credenciales son válidas.
     * @param evt Evento del botón
     */
    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed

        String correo = txtCorreo.getText();
        String pass = new String(txtContrasena.getPassword());

        boolean correoValido = ValidadorTexto.esCorreoValido(correo);
        boolean contrasenaValida = ValidadorTexto.esContrasenaSegura(pass);

        // Mostrar errores
        lblErrorCorreo.setVisible(!correoValido);
        lblErrorContrasena.setVisible(!contrasenaValida);

        if (!correoValido) {
            lblErrorCorreo.setText("Correo inválido");
        }

        if (!contrasenaValida) {
            lblErrorContrasena.setText("Contraseña incorrecta");
        }
        // mestra el mensaje si el registro es exitoso
        if (correoValido && contrasenaValida) {
            lblErrorCorreo.setVisible(false);
            lblErrorContrasena.setVisible(false);            
        VentanaPrincipal vp = new VentanaPrincipal();
        vp.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    /**
     * Acción del botón de cerrar ventana.
     * Cierra completamente la aplicación.
     * @param evt Evento del botón
     */
    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_btnCerrarActionPerformed

    /**
     * Método principal. Lanza la ventana RegistroPanel.
     * @param args Argumentos de línea de comandos
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistroPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblErrorContrasena;
    private javax.swing.JLabel lblErrorCorreo;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblPregunta;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtCorreo;
    // End of variables declaration//GEN-END:variables
}
