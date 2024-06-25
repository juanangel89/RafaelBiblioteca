
package panel;

import controller.UsuarioController;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Usuario;


public class PanelUsuarios extends javax.swing.JFrame {
    
    int cond = 0;


    public PanelUsuarios() {
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
        jLabel5 = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        nombreField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        telefonoField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        aceptarButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        usuarioTable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        resultadoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        atrasButton.setText("< Atras");
        atrasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("USUARIOS");

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

        jLabel5.setText("ID");

        idField.setEditable(false);

        nombreField.setEditable(false);

        jLabel6.setText("Nombre");

        emailField.setEditable(false);

        jLabel7.setText("E-Mail");

        telefonoField.setEditable(false);

        jLabel8.setText("Telefono");

        aceptarButton.setText("Aceptar");
        aceptarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarButtonActionPerformed(evt);
            }
        });

        usuarioTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "E-Mail", "Telefono"
            }
        ));
        jScrollPane1.setViewportView(usuarioTable);

        jLabel9.setText("Resultado:");

        resultadoLabel.setText("-");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(crearButton)
                .addGap(18, 18, 18)
                .addComponent(leerButton)
                .addGap(18, 18, 18)
                .addComponent(actualizarButton)
                .addGap(18, 18, 18)
                .addComponent(eliminarButton)
                .addGap(269, 269, 269))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(telefonoField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(aceptarButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(atrasButton)
                                .addGap(345, 345, 345)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(solicitudLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(397, 397, 397)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 104, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resultadoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(crearButton)
                    .addComponent(leerButton)
                    .addComponent(actualizarButton)
                    .addComponent(eliminarButton))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(solicitudLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefonoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aceptarButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(resultadoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        nombreField.setEditable(true);
        emailField.setEditable(true);
        telefonoField.setEditable(true);

        
    }//GEN-LAST:event_crearButtonActionPerformed

    private void leerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leerButtonActionPerformed
        // TODO add your handling code here:
        leerUsuario();
        resultadoLabel.setText("Solicitud aceptada");
        idField.setEditable(false);
        nombreField.setEditable(false);
        emailField.setEditable(false);
        telefonoField.setEditable(false);
    }//GEN-LAST:event_leerButtonActionPerformed

    private void actualizarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarButtonActionPerformed
        // TODO add your handling code here:
        condicion2();
        idField.setEditable(true);
        nombreField.setEditable(true);
        emailField.setEditable(true);
        telefonoField.setEditable(true);
    }//GEN-LAST:event_actualizarButtonActionPerformed

    private void eliminarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarButtonActionPerformed
        // TODO add your handling code here:
        condicion3();
        idField.setEditable(true);
        nombreField.setEditable(false);
        emailField.setEditable(false);
        telefonoField.setEditable(false);
    }//GEN-LAST:event_eliminarButtonActionPerformed

    private void aceptarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarButtonActionPerformed
        // TODO add your handling code here:
        condicionFinal(cond);
    }//GEN-LAST:event_aceptarButtonActionPerformed
  private void condicionFinal(int cond){

                do {
            switch (cond) {
                case 1:
                    crearUsuario();
                    break;
                case 2:
                    actualizarUsuario();
                    break;
                case 3:
                    eliminarUsuario();
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
        solicitudLabel.setText("Por favor escriba el Nombre del Usuario, E-Mail, Telefono a crear y despues aprete el boton ACEPTAR");
        return cond;
    }
    public int  condicion2(){
        cond =2;
        leerUsuario();
        solicitudLabel.setText("Por favor escriba la ID, Nombre de usuario, E-Mail, Telefono y despues aprete el boton ACEPTAR");
        return cond;
    }
        public int condicion3(){
        cond =3;
        leerUsuario();
        solicitudLabel.setText("Por favor escriba la ID y despues aprete el boton ACEPTAR");
        return cond;
    }
    
    
    
         
    public void crearUsuario(){
        UsuarioController usuario = new UsuarioController();
        usuario.crearUsuarioButton(nombreField.getText(),emailField.getText(), telefonoField.getText());
        resultadoLabel.setText("Usuario "+nombreField.getText()+" creado exitosamente ");
    }
   
    public void leerUsuario(){
                DefaultTableModel model = (DefaultTableModel) usuarioTable.getModel();//instanciar la tabla
        model.setRowCount(0);//resetea la tabla
        ArrayList<Usuario> usuarios = new ArrayList();//intanciar una lista arreglo
        UsuarioController usuario = new UsuarioController ();//insanciando e controller
        List<Usuario> leer = usuario.leerUsuariosButton();//consultado los datos y asignandolos
        usuarios.addAll(leer);//asignar a la lista arreglo la lista para que la tabla acepte los datos
        
        Object columnas[] = new Object[4];//crea una array c
        for(Usuario c : usuarios){
            columnas[0]=c.getId();
            columnas[1]=c.getNombre();
            columnas[2]=c.getEmail();
            columnas[3]=c.getTelefono();
            model.addRow(columnas);
        }
        
    }
    
    public void actualizarUsuario(){
        UsuarioController usuario = new UsuarioController();
        usuario.actualizarUsuarioButton(Integer.parseInt(idField.getText()),nombreField.getText(),emailField.getText(),telefonoField.getText());
        resultadoLabel.setText("Usuario "+idField.getText()+". "+nombreField.getText()+" actualizado exitosamente ");
    }
    
    public void eliminarUsuario(){
        UsuarioController usuario = new UsuarioController();
        usuario.eliminarUsuarioButton(Integer.parseInt(idField.getText()));
        resultadoLabel.setText("Usuario "+idField.getText()+" eliminado exitosamente ");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarButton;
    private javax.swing.JButton actualizarButton;
    private javax.swing.JButton atrasButton;
    private javax.swing.JButton crearButton;
    private javax.swing.JButton eliminarButton;
    private javax.swing.JTextField emailField;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton leerButton;
    private javax.swing.JTextField nombreField;
    private javax.swing.JLabel resultadoLabel;
    private javax.swing.JLabel solicitudLabel;
    private javax.swing.JTextField telefonoField;
    private javax.swing.JTable usuarioTable;
    // End of variables declaration//GEN-END:variables
}
