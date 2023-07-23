
package app.views.book;

import app.models.Category;
import app.models.Author;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class BookDetailsPanel extends javax.swing.JPanel {

    public BookDetailsPanel() {
        initComponents();
    }

    public JComboBox<Author> getDetailsAuthor() {
        return detailsAuthor;
    }

    public JComboBox<Category> getDetailsCategory() {
        return detailsCategory;
    }

    public JTextArea getDetailsDescription() {
        return detailsDescription;
    }

    public JTextField getDetailsName() {
        return detailsName;
    }

    public JFormattedTextField getDetailsPrice() {
        return detailsPrice;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        detailsName = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        detailsCategory = new javax.swing.JComboBox<>();
        detailsAuthor = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        detailsDescription = new javax.swing.JTextArea();
        detailsPrice = new javax.swing.JFormattedTextField();

        setOpaque(false);

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel6.setForeground(java.awt.Color.black);
        jLabel6.setText("Libro");

        detailsName.setBackground(new java.awt.Color(255, 255, 255));
        detailsName.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        detailsName.setForeground(new java.awt.Color(204, 204, 204));
        detailsName.setText("Ingrese el Nombre del Libro");
        detailsName.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 4, 4, 8));
        detailsName.setSelectionColor(new java.awt.Color(30, 30, 30));
        detailsName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                detailsNameFocusGained(evt);
            }
        });
        detailsName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                detailsNameMousePressed(evt);
            }
        });
        detailsName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailsNameActionPerformed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        detailsAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailsAuthorActionPerformed(evt);
            }
        });

        detailsDescription.setColumns(20);
        detailsDescription.setRows(5);
        jScrollPane1.setViewportView(detailsDescription);

        detailsPrice.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                    .addComponent(detailsName)
                    .addComponent(detailsCategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(detailsAuthor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(detailsPrice))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel6)
                .addGap(8, 8, 8)
                .addComponent(detailsName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(detailsCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(detailsAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(detailsPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void detailsNameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detailsNameMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_detailsNameMousePressed

    private void detailsNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailsNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_detailsNameActionPerformed

    private void detailsNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_detailsNameFocusGained
        // TODO add your handling code here:
        detailsName.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_detailsNameFocusGained

    private void detailsAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailsAuthorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_detailsAuthorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Author> detailsAuthor;
    private javax.swing.JComboBox<Category> detailsCategory;
    private javax.swing.JTextArea detailsDescription;
    private javax.swing.JTextField detailsName;
    private javax.swing.JFormattedTextField detailsPrice;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}