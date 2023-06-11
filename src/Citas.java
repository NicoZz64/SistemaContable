import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import java.text.DateFormat;
/**
 *
 * @author User
 */
public class Citas extends javax.swing.JPanel {
    
    public static ArrayList<String> NombreApellido = new ArrayList<>(Arrays.asList("Juan Perez", "Alfonso Laso"));
    public static ArrayList<String> Edad = new ArrayList<>(Arrays.asList("67", "55"));
    public static ArrayList<String> CI = new ArrayList<>(Arrays.asList("1787878686", "1309867485"));
    public static ArrayList<String> Telefono = new ArrayList<>(Arrays.asList("0975647345", "0945673498"));
    public static ArrayList<Date> Fecha = new ArrayList<>(Arrays.asList(new Date(07-27-2020),new Date(07-27-2023) ));
    
    DefaultTableModel mt = new DefaultTableModel();
    
    public Citas() {
        initComponents();
        String ids [] = {"NombreApellido", "Edad", "C.I.", "Telefono", "Fecha"};
        mt.setColumnIdentifiers(ids);
        tablaCitas.setModel(mt);
        cargarProductos();
    }
    
    void cargarProductos(){
        for (int i = 0; i < Edad.size(); i++){
            mt.addRow(new Object[]{
                NombreApellido.get(i),
                Edad.get(i),
                CI.get(i),
                Telefono.get(i),
                Fecha.get(i)
            });
        }
    }
    boolean verificarFecha(Date date){
        for (int i = 0; i < Fecha.size(); i++){
            if(Fecha.get(i).getDate() == date.getDate()){
                return false;
            }
        }
        return true;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        citasPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombreApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDoc = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        calFecha = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaCitas = new javax.swing.JTable();
        bttnEliminar = new javax.swing.JButton();
        bttnGuardar1 = new javax.swing.JButton();

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

        setPreferredSize(new java.awt.Dimension(483, 332));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 2, 24)); // NOI18N
        jLabel1.setText("Agendar una Cita");

        jLabel2.setText("Nombre y Apellido del Paciente:");

        jLabel4.setText("Edad:");

        jLabel5.setText("Número de Documento de Identidad:");

        jLabel6.setText("Número de Telefono:");

        jLabel7.setText("Fecha:");

        tablaCitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Juan Lopez",  new Integer(65), "17898756", "0976856437", "15-09-10"},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NombreApellido", "Edad", "C.I.", "Telefono", "Fecha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaCitas);

        bttnEliminar.setText("Eliminar");
        bttnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnEliminarActionPerformed(evt);
            }
        });

        bttnGuardar1.setText("Guardar");
        bttnGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnGuardar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout citasPanelLayout = new javax.swing.GroupLayout(citasPanel);
        citasPanel.setLayout(citasPanelLayout);
        citasPanelLayout.setHorizontalGroup(
            citasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, citasPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(12, 12, 12)
                .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
            .addGroup(citasPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(citasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bttnEliminar)
                    .addGroup(citasPanelLayout.createSequentialGroup()
                        .addGroup(citasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(citasPanelLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(citasPanelLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(calFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bttnGuardar1))
                    .addComponent(jScrollPane2)
                    .addGroup(citasPanelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        citasPanelLayout.setVerticalGroup(
            citasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(citasPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(citasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(citasPanelLayout.createSequentialGroup()
                        .addGroup(citasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNombreApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(citasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(citasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(citasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7))
                            .addComponent(calFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(bttnGuardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bttnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        add(citasPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 330));
    }// </editor-fold>//GEN-END:initComponents

    private void bttnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnEliminarActionPerformed
        
        if (tablaCitas.getSelectedRow() != -1){
            int ind = tablaCitas.getSelectedRow();
            NombreApellido.remove(ind);
            Edad.remove(ind);
            CI.remove(ind);
            Telefono.remove(ind);
            Fecha.remove(ind);
            mt.removeRow(tablaCitas.getSelectedRow());
        }else{
            JOptionPane.showMessageDialog(this, "Seleccione una fila primero!");
        }
    }//GEN-LAST:event_bttnEliminarActionPerformed

    private void bttnGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnGuardar1ActionPerformed
        
        String NA = txtNombreApellido.getText();
        String edad = txtEdad.getText();
        String ci = txtDoc.getText();
        String tel = txtTel.getText();
        Date date = calFecha.getDate();
        if (verificarFecha(date)){
            NombreApellido.add(NA);
            Telefono.add(tel);
            CI.add(ci);
            Edad.add(edad);
            Fecha.add(date);
            mt.addRow(new Object[]{
                NA,
                edad,
                ci,
                tel,
                date
            });
            txtNombreApellido.setText("");
            txtEdad.setText("");
            txtDoc.setText("");
            txtTel.setText("");
        }
        else {
            JOptionPane.showMessageDialog(this, "Esa fecha está ocupada!");
        }
    }//GEN-LAST:event_bttnGuardar1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnEliminar;
    private javax.swing.JButton bttnGuardar1;
    private com.toedter.calendar.JDateChooser calFecha;
    private javax.swing.JPanel citasPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tablaCitas;
    private javax.swing.JTextField txtDoc;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombreApellido;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
}

