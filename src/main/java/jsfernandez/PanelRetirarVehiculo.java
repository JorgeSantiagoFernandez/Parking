package jsfernandez;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PanelRetirarVehiculo extends javax.swing.JPanel {

    public PanelRetirarVehiculo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelModulo = new javax.swing.JLabel();
        jTextFieldPlaca = new javax.swing.JTextField();
        labelPlaca = new javax.swing.JLabel();
        Retirar = new javax.swing.JButton();

        labelModulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelModulo.setText("Modulo de salida de vehiculos del Parking");

        labelPlaca.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelPlaca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPlaca.setText("Placa");

        Retirar.setBackground(new java.awt.Color(255, 51, 51));
        Retirar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Retirar.setForeground(new java.awt.Color(255, 255, 255));
        Retirar.setText("Retirar");
        Retirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetirarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Retirar, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelModulo, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(labelModulo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(labelPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jTextFieldPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(Retirar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(206, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void RetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetirarActionPerformed
        double valorAPagar = 0.0;
        DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd hh:mm:ss");
        Calendar calendario = Calendar.getInstance();
        Date date = calendario.getTime();
        String fechaHora = dateFormat.format(date);
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/proyectomaven", "root", "8033");
            Statement stat = conexion.createStatement();
            ResultSet rs = stat.executeQuery("SELECT horaentrada, tipovehiculo FROM bdparking WHERE placa='" +jTextFieldPlaca.getText()+"' AND estado ='Disponible'");
            rs.first();
            String horasalida = rs.getString(1);
            Date horaSalida = dateFormat.parse(horasalida);
            int minutosACobrar = (int) (date.getTime()-horaSalida.getTime()) / 60000;
            
            if(rs.getString(2) == "Automovil")
                valorAPagar = minutosACobrar*33.333;
            if(rs.getString(2) == "Motocicleta")
                valorAPagar = minutosACobrar*16.666;
            
            stat.executeUpdate("UPDATE bdparking SET horasalida='" +fechaHora+ "', estado='No Disponible', valorpagado='" +valorAPagar+"' WHERE placa='"+jTextFieldPlaca.getText()+"' AND estado='Disponible'");
            int respuesta = JOptionPane.showConfirmDialog(null, "Valor a pagar: " +valorAPagar+ "'\nDesea imprimir recibo'", "Salida de vehiculo", JOptionPane.YES_NO_OPTION);
        }
        catch(ClassNotFoundException ex){
            Logger.getLogger(PanelRetirarVehiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "El vehículo no se encuentra en el parking, por favor revise los datos");
            Logger.getLogger(PanelRetirarVehiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(ParseException ex){
            Logger.getLogger(PanelRetirarVehiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_RetirarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Retirar;
    private javax.swing.JTextField jTextFieldPlaca;
    private javax.swing.JLabel labelModulo;
    private javax.swing.JLabel labelPlaca;
    // End of variables declaration//GEN-END:variables
}
