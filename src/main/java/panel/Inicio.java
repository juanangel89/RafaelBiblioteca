
package panel;


public class Inicio extends javax.swing.JFrame {

    public Inicio() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        librosButton = new javax.swing.JButton();
        categoriasButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        usuariosButton = new javax.swing.JButton();
        prestamosButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        librosButton.setText("LIBROS");
        librosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                librosButtonActionPerformed(evt);
            }
        });

        categoriasButton.setText("CATEGORIAS");
        categoriasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriasButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("BIBLIOTECA");

        usuariosButton.setText("USUARIOS");
        usuariosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuariosButtonActionPerformed(evt);
            }
        });

        prestamosButton.setText("PRESTAMOS");
        prestamosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prestamosButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(categoriasButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(librosButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usuariosButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(prestamosButton, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(librosButton)
                    .addComponent(usuariosButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoriasButton)
                    .addComponent(prestamosButton))
                .addContainerGap(128, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void librosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_librosButtonActionPerformed
        // TODO add your handling code here:
        PanelLibro newFrame = new PanelLibro();
        newFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_librosButtonActionPerformed

    private void categoriasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriasButtonActionPerformed
        // TODO add your handling code here:
        PanelCategorias newFrame = new PanelCategorias();
        newFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_categoriasButtonActionPerformed

    private void usuariosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuariosButtonActionPerformed
        // TODO add your handling code here:
        PanelUsuarios newFrame = new PanelUsuarios();
        newFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_usuariosButtonActionPerformed

    private void prestamosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prestamosButtonActionPerformed
        // TODO add your handling code here:
        PanelPrestamos newFrame = new PanelPrestamos();
        newFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_prestamosButtonActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton categoriasButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton librosButton;
    private javax.swing.JButton prestamosButton;
    private javax.swing.JButton usuariosButton;
    // End of variables declaration//GEN-END:variables
}
