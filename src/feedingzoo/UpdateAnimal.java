package feedingzoo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class UpdateAnimal extends javax.swing.JDialog {
    private final HashMap ht;
    private final Database db;

    public UpdateAnimal(java.awt.Frame parent, Database db) {
        super(parent, true);
        initComponents();
        this.db = db;
        ht = new HashMap<String, Integer>();
        buildCombo(db);
        buildComboA(db);
    }

    private void buildCombo(Database db) {
                // Agregar nombre del habitat al combo
                comboHabitat.addItem("sabana");
                comboHabitat.addItem("polar");
                comboHabitat.addItem("desierto");
                comboHabitat.addItem("oceano");         
    }
    
    private void buildComboA(Database db){
        final String sql = "SELECT nombre_animal FROM animal ORDER BY nombre_animal";
        ResultSet rs = null;
        try {
            // Enviar consulta a la base de datos
            rs = db.query(sql);
            while (rs.next()) {
                String label = rs.getString(1);
                // Agregar nombre del animal al combo
                comboAnimal.addItem(label);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nombreanimal = new javax.swing.JTextField();
        txtEspecie = new javax.swing.JTextField();
        txtEspacio = new javax.swing.JTextField();
        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        nombre_animal = new javax.swing.JLabel();
        comboHabitat = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        comboAnimal = new javax.swing.JComboBox<>();
        nombre_animal1 = new javax.swing.JLabel();

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

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Habitat");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("especie");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("espacio asignado");

        nombreanimal.setColumns(42);
        nombreanimal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtEspecie.setColumns(11);
        txtEspecie.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtEspacio.setColumns(11);
        txtEspacio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

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

        nombre_animal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nombre_animal.setText("Nombre animal");

        comboHabitat.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("descripcion");

        txtDescripcion.setColumns(11);
        txtDescripcion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        nombre_animal1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nombre_animal1.setText("Animal");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(okButton)
                .addGap(26, 26, 26)
                .addComponent(cancelButton)
                .addGap(41, 41, 41))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtEspacio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
                                .addComponent(txtEspecie, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(comboHabitat, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDescripcion, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nombre_animal)
                                .addComponent(nombre_animal1))
                            .addGap(29, 29, 29)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(comboAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nombreanimal, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre_animal1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre_animal)
                    .addComponent(nombreanimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEspacio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okButton)
                    .addComponent(cancelButton))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textNum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNum1ActionPerformed

    }//GEN-LAST:event_textNum1ActionPerformed

    private void nombreanimalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreanimalFocusLost
        String text = nombreanimal.getText().trim();
        if (text.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Introducir el nombre del animal.");
        }
    }//GEN-LAST:event_nombreanimalFocusLost

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        String nombre_animal = nombreanimal.getText();
        String habitat = comboHabitat.getSelectedItem().toString();
        //Integer id_animal = Integer.parseInt(txtID.getText());
        String especie = txtEspecie.getText();
        String espacio_asignado = txtEspacio.getText();
        String descripcion = txtDescripcion.getText();
        String nombre = (String) comboAnimal.getSelectedItem();

        final String sqlid = "SELECT id_animal FROM animal WHERE nombre_animal='"+nombre+"'";
        ResultSet rs;
        try {
            rs = db.query(sqlid);
            rs.next();
            String id =rs.getString(1);
            
            String sql = "UPDATE animal SET "
                + "nombre_animal ='"+nombre_animal+"', "
                + "habitat ='"+habitat+"', "
                               //+ "id_animal ='"+id_animal+"', "
                + "especie ='"+especie+"', "
                + "espacio_asignado ='"+espacio_asignado+"', "
                + "descripcion ='"+descripcion+"' "
                + "WHERE ID_ANIMAL="+id
                +";"
            ;
            
            System.out.println(sql);
            db.update(sql);
            
        } catch (SQLException ex) {
            Logger.getLogger(UpdateAnimal.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error al editar animal.");
            System.out.println( ex.getMessage() );
        }

        setVisible(false);
    }//GEN-LAST:event_okButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        setVisible(false);
    }//GEN-LAST:event_cancelButtonActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JComboBox<String> comboAnimal;
    private javax.swing.JComboBox<String> comboHabitat;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel nombre_animal;
    private javax.swing.JLabel nombre_animal1;
    private javax.swing.JTextField nombreanimal;
    private javax.swing.JButton okButton;
    private javax.swing.JTextField textNum1;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtEspacio;
    private javax.swing.JTextField txtEspecie;
    // End of variables declaration//GEN-END:variables

}
