
package panel;
import javax.swing.*;
import controller.LibroController;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;
import model.Libro;
import model.LibroCategoria;




public class PanelLibro extends javax.swing.JFrame {
    
    
    int cond =0;
    
    

    public PanelLibro() {
        initComponents();
        
        
    }
    
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        crearButton = new javax.swing.JButton();
        leerButton = new javax.swing.JButton();
        actualizarButton = new javax.swing.JButton();
        eliminarButton = new javax.swing.JButton();
        idField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tituloField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        aceptarButton = new javax.swing.JToggleButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        libroTable = new javax.swing.JTable();
        autorField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        editorialField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        anioField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        isbnField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        solicitudLabel = new javax.swing.JLabel();
        resultadoLabel = new javax.swing.JLabel();
        atrasButton = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        categoriaIdField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        libroCategoriaTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        idField.setEditable(false);

        jLabel1.setText("ID");

        tituloField.setEditable(false);

        jLabel2.setText("Titulo");

        jLabel3.setText("LIBRO");

        jLabel4.setText("¿Qué desea hacer? ");

        jLabel5.setText("Solicitud:");

        jLabel6.setText("Resultado:");

        aceptarButton.setText("Aceptar");
        aceptarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarButtonActionPerformed(evt);
            }
        });

        libroTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Titulo", "Autor", "Editorial", "Año publicación", "Isbn"
            }
        ));
        jScrollPane3.setViewportView(libroTable);

        autorField.setEditable(false);

        jLabel7.setText("Autor");

        editorialField.setEditable(false);

        jLabel8.setText("Editorial");

        anioField.setEditable(false);

        jLabel9.setText("Año Publicacion");

        isbnField.setEditable(false);

        jLabel10.setText("ISBN");

        solicitudLabel.setText("-");

        resultadoLabel.setText("-");

        atrasButton.setText("< Atras");
        atrasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasButtonActionPerformed(evt);
            }
        });

        jLabel11.setText("Categoria ID");

        categoriaIdField.setEditable(false);

        libroCategoriaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Libro ID", "Categoria ID"
            }
        ));
        jScrollPane1.setViewportView(libroCategoriaTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tituloField, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(autorField, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editorialField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(anioField))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(isbnField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(categoriaIdField)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                        .addComponent(aceptarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(169, 169, 169)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(crearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(leerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(actualizarButton)
                                                .addGap(18, 18, 18)
                                                .addComponent(eliminarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(137, 137, 137))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(solicitudLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(atrasButton)
                                .addGap(322, 322, 322)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(resultadoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 825, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(atrasButton))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eliminarButton)
                    .addComponent(actualizarButton)
                    .addComponent(leerButton)
                    .addComponent(crearButton))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(solicitudLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aceptarButton)
                    .addComponent(autorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editorialField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anioField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(isbnField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoriaIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(resultadoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearButtonActionPerformed
        // TODO add your handling code here:
        condicion1();
        idField.setEditable(false);
        tituloField.setEditable(true);
        autorField.setEditable(true);
        editorialField.setEditable(true);
        anioField.setEditable(true);
        isbnField.setEditable(true);
        categoriaIdField.setEditable(true);
                


    }//GEN-LAST:event_crearButtonActionPerformed

    private void leerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leerButtonActionPerformed
        // TODO add your handling code here:
       
        leerLibro();
        resultadoLabel.setText("Solicitud aceptada");
        idField.setEditable(false);
        tituloField.setEditable(false);
        autorField.setEditable(false);
        editorialField.setEditable(false);
        anioField.setEditable(false);
        isbnField.setEditable(false);
        categoriaIdField.setEditable(false);        

 
    }//GEN-LAST:event_leerButtonActionPerformed

    private void actualizarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarButtonActionPerformed
        // TODO add your handling code here:
        condicion2();
        idField.setEditable(true);
        tituloField.setEditable(true);
        autorField.setEditable(true);
        editorialField.setEditable(true);
        anioField.setEditable(true);
        isbnField.setEditable(true);
        categoriaIdField.setEditable(true);

        
    }//GEN-LAST:event_actualizarButtonActionPerformed

    private void eliminarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarButtonActionPerformed
        // TODO add your handling code here:
        condicion3();
        idField.setEditable(true);
        tituloField.setEditable(false);
        autorField.setEditable(false);
        editorialField.setEditable(false);
        anioField.setEditable(false);
        isbnField.setEditable(false);
        categoriaIdField.setEditable(false);

    }//GEN-LAST:event_eliminarButtonActionPerformed

    private void aceptarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarButtonActionPerformed
        // TODO add your handling code here:
        

    condicionFinal(cond);
        
    }//GEN-LAST:event_aceptarButtonActionPerformed

    private void atrasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasButtonActionPerformed
        // TODO add your handling code here:
        Inicio newFrame = new Inicio();
        newFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_atrasButtonActionPerformed


    private void condicionFinal(int cond){

                do {
            switch (cond) {
                case 1:
                    crearLibro();
                    break;
                case 2:
                    actualizarLibro();
                    break;
                case 3:
                    eliminarLibro();
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
        solicitudLabel.setText("Por favor escriba en Titulo del libro, Autor, Editorial, Año publicación, ISBN a crear y despues aprete el boton ACEPTAR");
        return cond;
    }
    public int  condicion2(){
        cond =2;
        //leerCategoria();
        solicitudLabel.setText("Por favor escriba la ID, Titulo del libro, Autor, Editorial, Año publicación, ISBN y despues aprete el boton ACEPTAR");
        return cond;
    }
        public int condicion3(){
        cond =3;
        //leerCategoria();
        solicitudLabel.setText("Por favor escriba la ID y despues aprete el boton ACEPTAR");
        return cond;
    }
    
    
    
         
    public void crearLibro(){
        LibroController libro = new LibroController();
        int id = libro.crearLibroButton(tituloField.getText(),autorField.getText(), editorialField.getText() , Integer.parseInt(anioField.getText()),isbnField.getText());
        LibroController lCategoria = new LibroController();
        lCategoria.crearLibroCategoriaButton(id, Integer.parseInt(categoriaIdField.getText()));
        resultadoLabel.setText("Libro "+tituloField.getText()+" creado exitosamente ");
    }
   
    public void leerLibro(){
                DefaultTableModel model = (DefaultTableModel) libroTable.getModel();//instanciar la tabla
        model.setRowCount(0);//resetea la tabla
        ArrayList<Libro> libros = new ArrayList();//intanciar una lista arreglo
        LibroController libro = new LibroController ();//insanciando e controller
        List<Libro> leer = libro.leerlibrosButton();//consultado los datos y asignandolos
        libros.addAll(leer);//asignar a la lista arreglo la lista para que la tabla acepte los datos
        
        Object columnas[] = new Object[6];//crea una array c
        for(Libro c : libros){
            columnas[0]=c.getId();
            columnas[1]=c.getTitulo();
            columnas[2]=c.getAutor();
            columnas[3]=c.getEditorial();
            columnas[4]=c.getAnio_publicacion();
            columnas[5]=c.getIsbn();
            model.addRow(columnas);
        }
        DefaultTableModel model2 = (DefaultTableModel) libroCategoriaTable.getModel();//instanciar la tabla
        model2.setRowCount(0);//resetea la tabla
        ArrayList<LibroCategoria> libros2 = new ArrayList();//intanciar una lista arreglo
        LibroController libroCategoria = new LibroController ();//insanciando e controller
        List<LibroCategoria> leer2 = libroCategoria.leerlibrosCategoriasButton();//consultado los datos y asignandolos
        libros2.addAll(leer2);//asignar a la lista arreglo la lista para que la tabla acepte los datos
        
        Object columnas2[] = new Object[2];//crea una array c
        for(LibroCategoria c : libros2){
            columnas2[0]=c.getLibroId();
            columnas2[1]=c.getCategoriaId();

            model2.addRow(columnas2);
        }
       
        
    }
    
    public void actualizarLibro(){
        LibroController libroCategoria = new LibroController();
        libroCategoria.actualizarLibroCategoriaButton(Integer.parseInt(idField.getText()),Integer.parseInt(categoriaIdField.getText()));
        LibroController libro = new LibroController();
        libro.actualizarLibroButton(Integer.parseInt(idField.getText()),tituloField.getText(),autorField.getText(), editorialField.getText() , Integer.parseInt(anioField.getText()),isbnField.getText());
        resultadoLabel.setText("Libro "+idField.getText()+". "+tituloField.getText()+" actualizado exitosamente ");
    }
    
    public void eliminarLibro(){
        LibroController libroCategoria = new LibroController();
        libroCategoria.eliminarLibroCategoriaButton(Integer.parseInt(idField.getText()));
        LibroController libro = new LibroController();
        libro.eliminarLibroButton(Integer.parseInt(idField.getText()));
        
        
        resultadoLabel.setText("Libro "+idField.getText()+" eliminado exitosamente ");
    }
    



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton aceptarButton;
    private javax.swing.JButton actualizarButton;
    private javax.swing.JTextField anioField;
    private javax.swing.JButton atrasButton;
    private javax.swing.JTextField autorField;
    private javax.swing.JTextField categoriaIdField;
    private javax.swing.JButton crearButton;
    private javax.swing.JTextField editorialField;
    private javax.swing.JButton eliminarButton;
    private javax.swing.JTextField idField;
    private javax.swing.JTextField isbnField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton leerButton;
    private javax.swing.JTable libroCategoriaTable;
    private javax.swing.JTable libroTable;
    private javax.swing.JLabel resultadoLabel;
    private javax.swing.JLabel solicitudLabel;
    private javax.swing.JTextField tituloField;
    // End of variables declaration//GEN-END:variables
}
