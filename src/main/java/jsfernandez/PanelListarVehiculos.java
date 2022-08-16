package jsfernandez;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class PanelListarVehiculos extends javax.swing.JPanel {

    public PanelListarVehiculos() {
        initComponents();
        radioBtnFuera.setSelected(true);
        TableColumnModel columnModel = tablaVehiculo.getColumnModel();
        
        columnModel.getColumn(0).setPreferredWidth(40);
        columnModel.getColumn(1).setPreferredWidth(70);
        columnModel.getColumn(2).setPreferredWidth(150);
        columnModel.getColumn(3).setPreferredWidth(100);
        columnModel.getColumn(4).setPreferredWidth(70);
        columnModel.getColumn(5).setPreferredWidth(70);
        columnModel.getColumn(6).setPreferredWidth(100);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbUbicacion = new javax.swing.ButtonGroup();
        rbVehiculo = new javax.swing.ButtonGroup();
        labelListar = new javax.swing.JLabel();
        labelPlaca = new javax.swing.JLabel();
        labelPropietario = new javax.swing.JLabel();
        labelFecha = new javax.swing.JLabel();
        TextFieldPlaca = new javax.swing.JTextField();
        TextFieldPropietario = new javax.swing.JTextField();
        TextFieldFecha = new javax.swing.JTextField();
        labelTipo = new javax.swing.JLabel();
        checkBoxMoto = new javax.swing.JCheckBox();
        checkBoxAuto = new javax.swing.JCheckBox();
        labelUbicacion = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnCierre = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVehiculo = new javax.swing.JTable();
        radioBtnParking = new javax.swing.JRadioButton();
        radioBtnFuera = new javax.swing.JRadioButton();
        jCalendario = new com.toedter.calendar.JDateChooser();

        labelListar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelListar.setText("Listar Vehiculos");

        labelPlaca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPlaca.setText("Placa");

        labelPropietario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPropietario.setText("Propietario");

        labelFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelFecha.setText("Fecha");

        TextFieldPropietario.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        TextFieldPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldPropietarioActionPerformed(evt);
            }
        });

        labelTipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTipo.setText("Tipo de vehiculo");

        checkBoxMoto.setText("Motocicleta");

        checkBoxAuto.setText("Automovil");

        labelUbicacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelUbicacion.setText("Ubicacion del vehiculo");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnCierre.setText("Cierre");
        btnCierre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCierreActionPerformed(evt);
            }
        });

        tablaVehiculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Placa", "Propietario", "Tipo de Vehiculo", "Hora Entrada", "Hora Salida", "Pago"
            }
        ));
        tablaVehiculo.setCellSelectionEnabled(true);
        jScrollPane1.setViewportView(tablaVehiculo);

        rbUbicacion.add(radioBtnParking);
        radioBtnParking.setText("Parking");

        rbUbicacion.add(radioBtnFuera);
        radioBtnFuera.setText("Fuera");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(labelListar, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(btnBuscar)
                        .addGap(57, 57, 57)
                        .addComponent(btnCierre))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TextFieldPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(labelPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TextFieldPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(54, 54, 54)
                                                .addComponent(labelPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(labelUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkBoxMoto)
                                    .addComponent(checkBoxAuto))
                                .addGap(113, 113, 113)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radioBtnFuera)
                                    .addComponent(radioBtnParking))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextFieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(201, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelListar)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPlaca)
                    .addComponent(labelPropietario)
                    .addComponent(labelFecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCalendario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TextFieldPlaca)
                            .addComponent(TextFieldPropietario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 13, Short.MAX_VALUE)
                        .addComponent(labelUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(labelTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(radioBtnParking)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioBtnFuera)
                            .addComponent(TextFieldFecha))
                        .addGap(32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkBoxMoto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkBoxAuto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(btnCierre))
                .addGap(408, 408, 408))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TextFieldPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldPropietarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldPropietarioActionPerformed
    
    String consulta, tipoVehiculo = "otro", estado="", fecha = "";
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tablaVehiculo.getModel();
        modelo.setRowCount(0);
        
        if(checkBoxMoto.isSelected())
            tipoVehiculo = "Motocicleta";
        if(checkBoxAuto.isSelected())
            tipoVehiculo = "Automovil";
        if(radioBtnFuera.isSelected())
            estado="No Disponible";
        if(radioBtnParking.isSelected())
            estado="Disponible";
        if(jCalendario.getDate() != null){
            DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd hh:mm:ss");
            Date date = jCalendario.getDate();
            fecha = dateFormat.format(date);
        }
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/proyectomaven", "root", "8033");
                Statement stat = conexion.createStatement();
                consulta = "SELECT * FROM bdparking WHERE estado='" +estado+ "' AND tipovehiculo LIKE'%" +tipoVehiculo+ "%' AND placa LIKE '%" +TextFieldPlaca.getText()+ "%' AND propietario LIKE '%" +TextFieldPropietario.getText()+ "%' AND horaentrada LIKE '%" +fecha+"%'"; 
                ResultSet rs = stat.executeQuery(consulta);
                if (rs != null){
                rs.next();
                
                do{
                    String horaSalida = rs.getString(6);
                    String pago = rs.getString(7);
                    if(horaSalida == null){
                        horaSalida = "No ha salido";
                        pago = "0.0";
                    }
                    else{
                        horaSalida = rs.getString(6).substring(10).substring(0,6);
                        pago = rs.getString(7);
                    }
                    String[] fila = {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5).substring(10).substring(0,6),horaSalida,pago};
                    modelo.addRow(fila);
                }
                while(rs.next());
            }
            }
            catch(SQLException ex){
                Logger.getLogger(PanelIngresarVehiculo.class.getName()).log(Level.SEVERE, null, ex);
            } 
            catch (ClassNotFoundException ex) {
                Logger.getLogger(PanelListarVehiculos.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCierreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCierreActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/proyectomaven", "root", "8033");
            Statement stat = conexion.createStatement();
            consulta = "SELECT SUM(valorpagado) FROM bdparking WHERE estado='" +estado+ "' AND tipoehiculo LIKE'%" +tipoVehiculo+ "'% AND placa LIKE '%" +TextFieldPlaca.getText()+ "'% AND propietario LIKE '%" +TextFieldPropietario.getText()+ "%' AND horaentrada LIKE '" +fecha+"%'"; 
            ResultSet rs = stat.executeQuery(consulta);
            rs.first();
            DecimalFormat df = new DecimalFormat("#.00");
            Double ingresosTotales = Double.parseDouble(rs.getString(1));
            JOptionPane.showMessageDialog(null, "El ingreso total del dia es: " +df.format(ingresosTotales) +"euros");
        }
        catch(SQLException ex){
            Logger.getLogger(PanelIngresarVehiculo.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (ClassNotFoundException ex) {
            Logger.getLogger(PanelListarVehiculos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCierreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextFieldFecha;
    private javax.swing.JTextField TextFieldPlaca;
    private javax.swing.JTextField TextFieldPropietario;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCierre;
    private javax.swing.JCheckBox checkBoxAuto;
    private javax.swing.JCheckBox checkBoxMoto;
    private com.toedter.calendar.JDateChooser jCalendario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelListar;
    private javax.swing.JLabel labelPlaca;
    private javax.swing.JLabel labelPropietario;
    private javax.swing.JLabel labelTipo;
    private javax.swing.JLabel labelUbicacion;
    private javax.swing.JRadioButton radioBtnFuera;
    private javax.swing.JRadioButton radioBtnParking;
    private javax.swing.ButtonGroup rbUbicacion;
    private javax.swing.ButtonGroup rbVehiculo;
    private javax.swing.JTable tablaVehiculo;
    // End of variables declaration//GEN-END:variables
}
