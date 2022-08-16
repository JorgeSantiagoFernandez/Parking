package jsfernandez;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PanelIngresarVehiculo extends javax.swing.JPanel {

    public PanelIngresarVehiculo() {
        initComponents();
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(ClassNotFoundException ex){
            Logger.getLogger(PanelIngresarVehiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoVehiculo = new javax.swing.ButtonGroup();
        labelModulo = new javax.swing.JLabel();
        labelPlaca = new javax.swing.JLabel();
        TextFieldPlaca = new javax.swing.JTextField();
        labelPropietario = new javax.swing.JLabel();
        TextFieldPropietario = new javax.swing.JTextField();
        labelTipo = new javax.swing.JLabel();
        jRadioButtonMoto = new javax.swing.JRadioButton();
        jRadioButtonAutomovil = new javax.swing.JRadioButton();
        btnRegistrar = new javax.swing.JButton();

        labelModulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelModulo.setText("Modulo de ingreso de vehiculos al parking");

        labelPlaca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPlaca.setText("Placa");

        TextFieldPlaca.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        labelPropietario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPropietario.setText("Nombre del propietario");

        TextFieldPropietario.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        labelTipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTipo.setText("Tipo de vehiculo");

        GrupoVehiculo.add(jRadioButtonMoto);
        jRadioButtonMoto.setText("Motocicleta");
        jRadioButtonMoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMotoActionPerformed(evt);
            }
        });

        GrupoVehiculo.add(jRadioButtonAutomovil);
        jRadioButtonAutomovil.setText("Automovil");

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(labelPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(labelModulo, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextFieldPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButtonAutomovil)
                                    .addComponent(jRadioButtonMoto)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(TextFieldPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelModulo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelPlaca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextFieldPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextFieldPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(labelTipo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonMoto)
                .addGap(7, 7, 7)
                .addComponent(jRadioButtonAutomovil)
                .addGap(18, 18, 18)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonMotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonMotoActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String claseVehiculo = "";
        String fechaHora = "";
        
        if(jRadioButtonMoto.isSelected())
            claseVehiculo = "Moto";
        if(jRadioButtonAutomovil.isSelected())
            claseVehiculo = "Automovil";
        
        if((jRadioButtonMoto.equals("") && jRadioButtonAutomovil.equals("")) ||
                TextFieldPlaca.getText().equals("") || TextFieldPropietario.getText().equals(""))
            JOptionPane.showMessageDialog(null, "Faltan datos por rellenar");
        else{
            try{
                Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/proyectomaven", "root", "8033");
                DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd hh:mm:ss");
                Calendar calendario = Calendar.getInstance();
                Date date = calendario.getTime();
                fechaHora =  dateFormat.format(date);
                Statement stat = conexion.createStatement();
                String sql = "INSERT INTO bdparking (placa, propietario,tipovehiculo,horaentrada,estado) VALUES ('"+ TextFieldPlaca.getText() +"','"+ TextFieldPropietario.getText() +"','"+ claseVehiculo +"','"+ fechaHora +"','"+ "Disponible')";
                stat.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "El vehiculo se ha registrado con exito");
            }
            catch(SQLException ex){
                Logger.getLogger(PanelIngresarVehiculo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        String destino = "Escritorio/Reportes/ejemplo.pdf";
        
        /*try{
            PdfWriter pdfWriter = new PdfWriter(destino);
            PdfDocument pdfDoc = new PdfDocument(pdfWriter);
            Document document = new Document(pdfDoc, A4);
            pdfDoc.addNewPage();
        
            Paragraph para = new Paragraph("Recibo parking");
            para.setBorder(Border.NO_BORDER);
            para.setBold();
        
            Paragraph para1 = new Paragraph("Placa Vehiculo: "+TextFieldPlaca.getText());
            Paragraph para2 = new Paragraph("Nombre del propietario: "+TextFieldPropietario.getText());
            Paragraph para3 = new Paragraph("Hora de ingreso: "+fechaHora);
        
            document.add(para);
            document.add(para1);
            document.add(para2);
            document.add(para3);
            document.close();
        }
        catch(FileNotFoundException ex){
            Logger.getLogger(PanelIngresarVehiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(IOException ex){
            Logger.getLogger(PanelIngresarVehiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try{
            if(new File("Escritorio/Reportes/ejemplo.pdf")).exists()){
                Process p = Runtime.getRuntime()
                .exec("rund1132 url.dll, FileProtocolHandler Escritorio/Reportes/ejemplo.pdf");
                p.wairFor();
            }
        }
        catch(Exception ex){
        }
            ex.printStackTrace();
        */
        
    }//GEN-LAST:event_btnRegistrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GrupoVehiculo;
    private javax.swing.JTextField TextFieldPlaca;
    private javax.swing.JTextField TextFieldPropietario;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JRadioButton jRadioButtonAutomovil;
    private javax.swing.JRadioButton jRadioButtonMoto;
    private javax.swing.JLabel labelModulo;
    private javax.swing.JLabel labelPlaca;
    private javax.swing.JLabel labelPropietario;
    private javax.swing.JLabel labelTipo;
    // End of variables declaration//GEN-END:variables
}
