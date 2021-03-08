package Interfaz_Grafica;

import javax.swing.JOptionPane;
import Herencia.*;
import Metodos_Pago.FrmPasarelaPagos;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;

import javax.swing.table.DefaultTableModel;

public class Datos extends javax.swing.JFrame {

    public static String contadorPrecios;

    DefaultTableModel fila_tabla;
    int contadorM;
    Metodos llenado[];

    int filaSeleccionada;
    public static String prueba;

    public Datos() {

        llenado = new Metodos[1000];
        initComponents();

        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setLocationRelativeTo(null);

        //Primera Tabla
        fila_tabla = new DefaultTableModel();

        fila_tabla.addColumn("Nombre");
        fila_tabla.addColumn("Apellido");
        fila_tabla.addColumn("Marca de auto");
        fila_tabla.addColumn("ID");
        fila_tabla.addColumn("Telefono");

        tblDatos.setModel(fila_tabla);

        contadorM = 0;

    }

    public void agregar() {
        llenado[contadorM] = new Metodos(txtNombre.getText(),
                txtApellido.getText(),
                txtMarca_Auto.getText(),
                Integer.parseInt(txtID.getText()),
                Integer.parseInt(txtTelefono.getText()));

        fila_tabla.setRowCount(contadorM + 1);
        tblDatos.setValueAt(llenado[contadorM].getNombres(), contadorM, 0);
        tblDatos.setValueAt(llenado[contadorM].getApellido(), contadorM, 1);
        tblDatos.setValueAt(llenado[contadorM].getMarca_auto(), contadorM, 2);
        tblDatos.setValueAt(llenado[contadorM].getID(), contadorM, 3);
        tblDatos.setValueAt(llenado[contadorM].getTelefono(), contadorM, 4);

        contadorM++;

        txtNombre.setText("");
        txtApellido.setText("");
        txtID.setText("");
        txtMarca_Auto.setText("");
        txtTelefono.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtMarca_Auto = new javax.swing.JTextField();
        btnagregar = new javax.swing.JButton();
        txtTelefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        cmbDiagnostico = new javax.swing.JComboBox<>();
        btnAgregarDiagnosticoCotizacion = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaDatosDiagnoticos = new javax.swing.JTextArea();
        btnPagar = new javax.swing.JButton();
        txtMostrarTotal = new javax.swing.JTextField();
        lblNombreMostrar = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        btnSeleccionar = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDatos = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblDatos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 880, 210));

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel1.setText("Bienvenido ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos cliente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Nombre:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 90, -1));

        jLabel3.setText("Apellido:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));
        jPanel2.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 90, -1));

        jLabel4.setText("ID:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));
        jPanel2.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 90, -1));

        jLabel5.setText("Marca de auto: ");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, -1, -1));
        jPanel2.add(txtMarca_Auto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 90, -1));

        btnagregar.setMnemonic('A');
        btnagregar.setText("Agregar");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });
        jPanel2.add(btnagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, -1, -1));
        jPanel2.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 90, -1));

        jLabel6.setText("Telefono:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 380, 290));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Realizar diagnostico y cotizacion", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmbDiagnostico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Cambio de aceite y filtro de aceite.", "Cambio del filtro de aire.", "Mantenimiento programado.", "Cambio llantas nuevas.", "Servicio/reparación de frenos." }));
        cmbDiagnostico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDiagnosticoActionPerformed(evt);
            }
        });
        jPanel3.add(cmbDiagnostico, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        btnAgregarDiagnosticoCotizacion.setText("Agregar");
        btnAgregarDiagnosticoCotizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarDiagnosticoCotizacionActionPerformed(evt);
            }
        });
        jPanel3.add(btnAgregarDiagnosticoCotizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 80, -1));

        jLabel8.setText("Diagnostico");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        txtAreaDatosDiagnoticos.setColumns(20);
        txtAreaDatosDiagnoticos.setRows(5);
        txtAreaDatosDiagnoticos.setEnabled(false);
        jScrollPane2.setViewportView(txtAreaDatosDiagnoticos);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 380, 130));

        btnPagar.setText("Pagar");
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });
        jPanel3.add(btnPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 80, -1));

        txtMostrarTotal.setEnabled(false);
        txtMostrarTotal.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtMostrarTotalCaretUpdate(evt);
            }
        });
        txtMostrarTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMostrarTotalActionPerformed(evt);
            }
        });
        jPanel3.add(txtMostrarTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 90, -1));
        jPanel3.add(lblNombreMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 290, 20));

        lblCliente.setText("Cliente:");
        jPanel3.add(lblCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 490, 290));

        btnSeleccionar.setText("Seleccionar");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });
        jPanel1.add(btnSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 550, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 887, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        agregar();
    }//GEN-LAST:event_btnagregarActionPerformed

    private void cmbDiagnosticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDiagnosticoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbDiagnosticoActionPerformed

    private void btnAgregarDiagnosticoCotizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarDiagnosticoCotizacionActionPerformed
        // TODO add your handling code here:
        boolean verificar = txtMostrarTotal.getText().toString().isEmpty();
        double contadorPrecios;

        if (verificar) {
            contadorPrecios = 0;
        } else {
            contadorPrecios = Double.parseDouble(txtMostrarTotal.getText());
        }
        String seleccion = cmbDiagnostico.getSelectedItem().toString();

        if (seleccion.equals("Cambio de aceite y filtro de aceite.")) {
            txtAreaDatosDiagnoticos.append("Cambio de aceite y filtro de aceite $250.000\n");
            contadorPrecios = contadorPrecios + 250000;
        }
        if (seleccion.equals("Cambio del filtro de aire.")) {
            txtAreaDatosDiagnoticos.append("Cambio del filtro de aire $100.000\n");
            contadorPrecios = contadorPrecios + 100000;
        }
        if (seleccion.equals("Mantenimiento programado.")) {
            txtAreaDatosDiagnoticos.append("Mantenimiento programado $450.000\n");
            contadorPrecios = contadorPrecios + 450000;
        }
        if (seleccion.equals("Cambio llantas nuevas.")) {
            txtAreaDatosDiagnoticos.append("Cambio de llantas nuevas $320.000\n");
            contadorPrecios = contadorPrecios + 320000;
        }
        if (seleccion.equals("Servicio/reparación de frenos.")) {
            txtAreaDatosDiagnoticos.append("Servicio/reparacion de frenos $180.000\n");
            contadorPrecios = contadorPrecios + 180000;
        }
        if (seleccion.equals("Seleccionar")) {
            JOptionPane.showMessageDialog(this, "Ingrese una opcion valida");
        }
        txtMostrarTotal.setText("" + contadorPrecios);
        String otro;
        otro = String.valueOf(contadorPrecios);
        prueba = otro;
    }//GEN-LAST:event_btnAgregarDiagnosticoCotizacionActionPerformed

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        // TODO add your handling code here:
        FrmPasarelaPagos pasarela_pagos = new FrmPasarelaPagos();
        pasarela_pagos.setVisible(true);
    }//GEN-LAST:event_btnPagarActionPerformed

    private void txtMostrarTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMostrarTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMostrarTotalActionPerformed

    private void txtMostrarTotalCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtMostrarTotalCaretUpdate
        // TODO add your handling code here:

    }//GEN-LAST:event_txtMostrarTotalCaretUpdate

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        // TODO add your handling code here:
        filaSeleccionada = tblDatos.getSelectedRow();
        String nombre = tblDatos.getValueAt(filaSeleccionada, 0).toString();
        String apellido = tblDatos.getValueAt(filaSeleccionada, 1).toString();
        lblNombreMostrar.setText(nombre.concat(" " + apellido));
        //lblNombreMostrar.setText(tblDatos.getValueAt(filaSeleccionada, 1).toString());
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    /**
     * @param args the command line arguments
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
            java.util.logging.Logger.getLogger(Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Datos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarDiagnosticoCotizacion;
    private javax.swing.JButton btnPagar;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JButton btnagregar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbDiagnostico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblNombreMostrar;
    private javax.swing.JTable tblDatos;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextArea txtAreaDatosDiagnoticos;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMarca_Auto;
    private javax.swing.JTextField txtMostrarTotal;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
