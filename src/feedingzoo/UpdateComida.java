package feedingzoo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class UpdateComida extends javax.swing.JDialog {
    private final HashMap ht;
    private final Database db;

    public UpdateComida(java.awt.Frame parent, Database db) {
        super(parent, true);
        initComponents();
        this.db = db;
        ht = new HashMap<String, Integer>();
        buildCombo(db);
    }
    
    private void buildCombo(Database db){
        final String sql = "SELECT nombre_comida FROM comida ORDER BY nombre_comida";
        ResultSet rs = null;
        try {
            // Enviar consulta a la base de datos
            rs = db.query(sql);
            while (rs.next()) {
                String label = rs.getString(1);
                // Agregar nombre de la comida al combo
                comboComida.addItem(label);
                //System.out.println(label);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textNum1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jMenuItem1 = new javax.swing.JMenuItem();
        labetipo = new javax.swing.JLabel();
        labelubicacion = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtTipo = new javax.swing.JTextField();
        txtUbicacion = new javax.swing.JTextField();
        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        labelnombre = new javax.swing.JLabel();
        comboComida = new javax.swing.JComboBox<>();
        nombrecomida = new javax.swing.JLabel();

        textNum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNum1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("espacio asignado");

        jScrollPane2.setViewportView(jTextPane1);

        jMenuItem1.setText("jMenuItem1");

        labetipo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labetipo.setText("Tipo");

        labelubicacion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelubicacion.setText("Ubicación");

        txtNombre.setColumns(42);
        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtTipo.setColumns(11);
        txtTipo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtUbicacion.setColumns(11);
        txtUbicacion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        okButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        okButton.setText("Editar");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        cancelButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancelButton.setText("Cancelar");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        labelnombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelnombre.setText("Nombre comida");

        nombrecomida.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nombrecomida.setText("Comida");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelnombre)
                    .addComponent(nombrecomida)
                    .addComponent(labetipo)
                    .addComponent(labelubicacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboComida, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(okButton)
                            .addGap(26, 26, 26)
                            .addComponent(cancelButton))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUbicacion, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
                            .addComponent(txtTipo, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
                            .addComponent(txtNombre))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboComida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombrecomida))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelnombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labetipo)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelubicacion)
                    .addComponent(txtUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okButton)
                    .addComponent(cancelButton))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textNum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNum1ActionPerformed

    }//GEN-LAST:event_textNum1ActionPerformed

    private void txtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusLost
        String text = labelnombre.getText().trim();
        if (text.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Introducir el nombre de la comida.");
        }
    }//GEN-LAST:event_txtNombreFocusLost

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        String nombre_comida = comboComida.getSelectedItem().toString();
        String nombrec = txtNombre.getText();
        String tipo = txtTipo.getText();
        String ubicacion = txtUbicacion.getText();

        final String sqlid = "SELECT id_comida FROM comida WHERE nombre_comida='"+nombre_comida+"'";
        ResultSet rs;
        try {
            rs = db.query(sqlid);
            rs.next();
            String id =rs.getString(1);
            
            String sql = "UPDATE comida SET "
                + "nombre_comida ='"+nombrec+"', "
                + "tipo ='"+tipo+"', "
                + "ubicacion ='"+ubicacion+"' "
                + "WHERE ID_COMIDA="+id
                +";"
            ;
            
            System.out.println(sql);
            db.update(sql);
            
        } catch (SQLException ex) {
            Logger.getLogger(UpdateComida.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error al editar comida.");
            System.out.println( ex.getMessage() );
        }

        setVisible(false);
    }//GEN-LAST:event_okButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        setVisible(false);
    }//GEN-LAST:event_cancelButtonActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JComboBox<String> comboComida;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel labelnombre;
    private javax.swing.JLabel labelubicacion;
    private javax.swing.JLabel labetipo;
    private javax.swing.JLabel nombrecomida;
    private javax.swing.JButton okButton;
    private javax.swing.JTextField textNum1;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTipo;
    private javax.swing.JTextField txtUbicacion;
    // End of variables declaration//GEN-END:variables

}
