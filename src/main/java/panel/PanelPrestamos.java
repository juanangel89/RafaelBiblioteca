
package panel;
import controller.PrestamoController;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Prestamo;


public class PanelPrestamos extends javax.swing.JFrame {
       int cond =0;
    


    public PanelPrestamos() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        atrasButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        crearButton = new javax.swing.JButton();
        leerButton = new javax.swing.JButton();
        actualizarButton = new javax.swing.JButton();
        eliminarButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        solicitudLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        libroIdField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        usuarioIdField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        fechaPreField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        fechaDevField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        aceptarButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        prestamoTable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        resultadoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        atrasButton.setText("< Atras");
        atrasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("PRESTAMOS");

        jLabel2.setText("¿Qué desea hacer?");

        crearButton.setText("Crear");
        crearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearButtonActionPerformed(evt);
            }
        });

        leerButton.setText("Leer");
        leerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leerButtonActionPerformed(evt);
            }
        });

        actualizarButton.setText("Actualizar");
        actualizarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarButtonActionPerformed(evt);
            }
        });

        eliminarButton.setText("Eliminar");
        eliminarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Solicitud:");

        solicitudLabel.setText("-");

        jLabel4.setText("ID");

        idField.setEditable(false);

        libroIdField.setEditable(false);

        jLabel5.setText("Libro ID");

        usuarioIdField.setEditable(false);

        jLabel6.setText("Usuario ID");

        fechaPreField.setEditable(false);

        jLabel7.setText("Fecha Prestamo");

        fechaDevField.setEditable(false);

        jLabel8.setText("Fecha Devolución");

        aceptarButton.setText("Aceptar");
        aceptarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarButtonActionPerformed(evt);
            }
        });

        prestamoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Libro ID", "Usuario ID", "Fecha prestamo", "Fecha devolución"
            }
        ));
        jScrollPane1.setViewportView(prestamoTable);

        jLabel9.setText("Resultado: ");

        resultadoLabel.setText("-");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(libroIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(usuarioIdField, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                    .addComponent(fechaPreField))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                    .addComponent(fechaDevField))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(aceptarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(atrasButton)
                                        .addGap(351, 351, 351)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(solicitudLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(resultadoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 123, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(crearButton)
                                .addGap(18, 18, 18)
                                .addComponent(leerButton)
                                .addGap(18, 18, 18)
                                .addComponent(actualizarButton)
                                .addGap(18, 18, 18)
                                .addComponent(eliminarButton)
                                .addGap(260, 260, 260))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(378, 378, 378))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(atrasButton)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(crearButton)
                    .addComponent(leerButton)
                    .addComponent(actualizarButton)
                    .addComponent(eliminarButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(solicitudLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(libroIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usuarioIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechaPreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechaDevField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aceptarButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(resultadoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atrasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasButtonActionPerformed
        // TODO add your handling code here:
        Inicio newFrame = new Inicio();
        newFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_atrasButtonActionPerformed

    private void crearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearButtonActionPerformed
        // TODO add your handling code here:
        condicion1();
        idField.setEditable(false);
        libroIdField.setEditable(true);
        usuarioIdField.setEditable(true);
        fechaPreField.setEditable(true);
        fechaDevField.setEditable(true);

    }//GEN-LAST:event_crearButtonActionPerformed

    private void leerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leerButtonActionPerformed
        // TODO add your handling code here:
        leerPrestamo();
        resultadoLabel.setText("Solicitud aceptada");
        idField.setEditable(false);
        libroIdField.setEditable(false);
        usuarioIdField.setEditable(false);
        fechaPreField.setEditable(false);
        fechaDevField.setEditable(false);
    }//GEN-LAST:event_leerButtonActionPerformed

    private void actualizarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarButtonActionPerformed
        // TODO add your handling code here:
        condicion2();
        idField.setEditable(true);
        libroIdField.setEditable(true);
        usuarioIdField.setEditable(true);
        fechaPreField.setEditable(true);
        fechaDevField.setEditable(true);
    }//GEN-LAST:event_actualizarButtonActionPerformed

    private void eliminarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarButtonActionPerformed
        // TODO add your handling code here:
        condicion3();
        idField.setEditable(true);
        libroIdField.setEditable(true);
        usuarioIdField.setEditable(true);
        fechaPreField.setEditable(true);
        fechaDevField.setEditable(true);
    }//GEN-LAST:event_eliminarButtonActionPerformed

    private void aceptarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarButtonActionPerformed
        // TODO add your handling code here:
        condicionFinal(cond);
        
    }//GEN-LAST:event_aceptarButtonActionPerformed

    private void condicionFinal(int cond){

                do {
            switch (cond) {
                case 1:
                    crearPrestamo();
                    break;
                case 2:
                    actualizarPrestamo();
                    break;
                case 3:
                    eliminarPrestamo();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
         
        }while (cond == 0);
    
    }
    public int condicion1(){
                cond =1;
        solicitudLabel.setText("Por favor escriba el ID del libro, el ID del usuario, fecha del prestamo del libro, fecha de devolución del libro y despues aprete el boton ACEPTAR");
        return cond;
    }
    public int  condicion2(){
        cond =2;
        //leerCategoria();
        solicitudLabel.setText("Por favor escriba la ID, ID del libro, el ID del usuario, fecha del prestamo del libro, fecha de devolución del libro y despues aprete el boton ACEPTAR");
        return cond;
    }
        public int condicion3(){
        cond =3;
        //leerCategoria();
        solicitudLabel.setText("Por favor escriba la ID y despues aprete el boton ACEPTAR");
        return cond;
    }
    
    
    
         
    public void crearPrestamo(){
        PrestamoController prestamo = new PrestamoController();
        prestamo.crearPrestamoButton(Integer.parseInt(libroIdField.getText()),Integer.parseInt(usuarioIdField.getText()),fechaPreField.getText(),fechaDevField.getText());
        resultadoLabel.setText("Prestamo creado exitosamente ");
    }
   
    public void leerPrestamo(){
                DefaultTableModel model = (DefaultTableModel) prestamoTable.getModel();//instanciar la tabla
        model.setRowCount(0);//resetea la tabla
        ArrayList<Prestamo> prestamos = new ArrayList();//intanciar una lista arreglo
        PrestamoController prestamo = new PrestamoController ();//insanciando e controller
        List<Prestamo> leer = prestamo.leerPrestamosButton();//consultado los datos y asignandolos
        prestamos.addAll(leer);//asignar a la lista arreglo la lista para que la tabla acepte los datos
        
        Object columnas[] = new Object[5];//crea una array c
        for(Prestamo c : prestamos){
            columnas[0]=c.getId();
            columnas[1]=c.getLibroId();
            columnas[2]=c.getUsuarioId();
            columnas[3]=c.getFechaPrestamo();
            columnas[4]=c.getFechaDevolucion();
            model.addRow(columnas);
        }
        
    }
    
    public void actualizarPrestamo(){
        PrestamoController prestamo = new PrestamoController();
        prestamo.actualizarPrestamoButton(Integer.parseInt(idField.getText()),Integer.parseInt(libroIdField.getText()),Integer.parseInt(usuarioIdField.getText()), fechaPreField.getText() , fechaPreField.getText());
        resultadoLabel.setText("Prestamo "+idField.getText()+" actualizado exitosamente ");
    }
    
    public void eliminarPrestamo(){
        PrestamoController prestamo = new PrestamoController();
        prestamo.eliminarPrestamoButton(Integer.parseInt(idField.getText()));
        resultadoLabel.setText("Prestamo "+idField.getText()+" eliminado exitosamente ");
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarButton;
    private javax.swing.JButton actualizarButton;
    private javax.swing.JButton atrasButton;
    private javax.swing.JButton crearButton;
    private javax.swing.JButton eliminarButton;
    private javax.swing.JTextField fechaDevField;
    private javax.swing.JTextField fechaPreField;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton leerButton;
    private javax.swing.JTextField libroIdField;
    private javax.swing.JTable prestamoTable;
    private javax.swing.JLabel resultadoLabel;
    private javax.swing.JLabel solicitudLabel;
    private javax.swing.JTextField usuarioIdField;
    // End of variables declaration//GEN-END:variables
}
