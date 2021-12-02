/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import bd.Conexion;
import controlador.Registro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import modelo.Empleado;

/**
 *
 * @author sobarzolicandeo
 */
public class ActualizarEmpleado extends javax.swing.JFrame {

    Registro reg = new Registro();
    /**
     * Creates new form ActualizarEmpleado
     */
    public ActualizarEmpleado() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbl_actualizar = new javax.swing.JLabel();
        jtxt_userRut = new javax.swing.JTextField();
        jlbl_actualizar1 = new javax.swing.JLabel();
        jbtn_actualizar = new javax.swing.JButton();
        jbtn_volver = new javax.swing.JButton();
        jbtn_buscar = new javax.swing.JButton();
        jtxt_numrut = new javax.swing.JTextField();
        jtxt_dvrut = new javax.swing.JTextField();
        jtxt_nombre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlbl_actualizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbl_actualizar.setText("Actualizar Datos De Usuario ");

        jtxt_userRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_userRutActionPerformed(evt);
            }
        });

        jlbl_actualizar1.setText("Rut usuario sin dígito verificador");

        jbtn_actualizar.setText("Actualizar");
        jbtn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_actualizarActionPerformed(evt);
            }
        });

        jbtn_volver.setText("Volver");
        jbtn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_volverActionPerformed(evt);
            }
        });

        jbtn_buscar.setText("Buscar");
        jbtn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlbl_actualizar)
                .addGap(149, 149, 149))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlbl_actualizar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jbtn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jtxt_userRut, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jbtn_buscar)
                            .addGap(42, 42, 42))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jbtn_actualizar)
                            .addGap(99, 99, 99)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtxt_nombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtxt_numrut, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxt_dvrut, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(190, 190, 190))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jlbl_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbl_actualizar1)
                    .addComponent(jtxt_userRut)
                    .addComponent(jbtn_buscar))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt_numrut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxt_dvrut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtxt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 231, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_actualizar)
                    .addComponent(jbtn_volver))
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxt_userRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_userRutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_userRutActionPerformed

    private void jbtn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_volverActionPerformed
      dispose();
    }//GEN-LAST:event_jbtn_volverActionPerformed

    private void jbtn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_actualizarActionPerformed
      String userRut; 
              userRut= this.jtxt_userRut.getText();
      
    }//GEN-LAST:event_jbtn_actualizarActionPerformed

    private void jbtn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_buscarActionPerformed
        String numRutBuscar = this.jtxt_userRut.getText();
        
        Empleado empleado = reg.buscarPorNumRut(numRutBuscar);
        
        String numRut = empleado.getNumRut();
        String dvRut = empleado.getDvRut();
        String nombre = empleado.getNombre();
        
        
        this.jtxt_numrut.setText(numRut);
        this.jtxt_dvrut.setText(dvRut);
        this.jtxt_nombre.setText(nombre);
        
        
    }//GEN-LAST:event_jbtn_buscarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtn_actualizar;
    private javax.swing.JButton jbtn_buscar;
    private javax.swing.JButton jbtn_volver;
    private javax.swing.JLabel jlbl_actualizar;
    private javax.swing.JLabel jlbl_actualizar1;
    private javax.swing.JTextField jtxt_dvrut;
    private javax.swing.JTextField jtxt_nombre;
    private javax.swing.JTextField jtxt_numrut;
    private javax.swing.JTextField jtxt_userRut;
    // End of variables declaration//GEN-END:variables

  public Empleado buscarPorNumRut(String numRut){
        
        Empleado empleado = new Empleado();
        
        try {
            Conexion con = new Conexion();
            try (Connection cnx = con.obtenerConexion()) {
                String query = "SELECT numrut_emp,dvrut_emp,nombre_emp,appaterno_emp,apmaterno_emp,genero_emp,fecnac_emp,estcivil_emp,fono_emp,direccion_emp,feccont_emp,activo_emp FROM empleado WHERE numrut_emp = ?";
                try (PreparedStatement stmt = cnx.prepareStatement(query)) {
                    stmt.setString(1, numRut);
                    
                    try (ResultSet rs = stmt.executeQuery()) {
                        if (rs.next()) {
                            empleado.setNumRut(rs.getString("numrut_emp"));
                            empleado.setDvRut(rs.getString("dvrut_emp"));
                            empleado.setNombre(rs.getString("nombre_emp"));
                            empleado.setAppaterno(rs.getString("appaterno_emp"));
                            empleado.setApmaterno(rs.getString("apmaterno_emp"));
                            empleado.setGenero(rs.getString("genero_emp"));
                            empleado.setFecNac(rs.getDate("fecnac_emp"));
                            empleado.setEstCivil(rs.getString("estcivil_emp"));
                            empleado.setFono(rs.getInt("fono_emp"));
                            empleado.setDireccion(rs.getString("direccion_emp"));
                            empleado.setFecCont(rs.getDate("feccont_emp"));
                            empleado.setActivo(rs.getBoolean("activo_emp"));
                        }
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println("Error SQL al buscar Empleado: " + e.getMessage());
            
        } catch(Exception e){
            System.out.println("Error al buscar Empleado (EXCEPTION): " + e.getMessage());
            
        }
        return empleado;
        
    }
    
}