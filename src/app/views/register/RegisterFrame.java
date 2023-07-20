/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package app.views.register;

import components.register.formSteps.Step1;
import components.register.formSteps.Step2;
import components.register.formSteps.Step3;
import java.awt.Component;
import java.time.Duration;

/**
 *
 * @author Cristian Vega
 */
public class RegisterFrame extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public RegisterFrame() {
        initComponents();
        Component[] components = new Component[]{new Step1(), new Step2(), new Step3()};
        panelSlider.setSliderComponent(components);
        progressIndicator.initSlider(panelSlider);
//        back.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jPanel3 = new javax.swing.JPanel();
        cardForm = new javax.swing.JPanel();
        cardForm1 = new javax.swing.JPanel();
        progressIndicator = new components.progressindicator.ProgressIndicator();
        panelSlider = new components.progressindicator.PanelSlider();
        back = new components.ButtonGradient_blue();
        next = new components.ButtonGradient_blue();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(39, 37, 37));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cardForm.setBackground(new java.awt.Color(39, 37, 37));
        cardForm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cardForm1.setBackground(new java.awt.Color(255, 255, 255));

        progressIndicator.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Tu Cuenta ", "Personal", "Final " };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        progressIndicator.setOpaque(false);
        progressIndicator.setProgress(0.0F);
        progressIndicator.setProgressColor(new java.awt.Color(51, 153, 255));
        progressIndicator.setProgressColorGradient(new java.awt.Color(204, 51, 255));
        progressIndicator.setProgressFont(new java.awt.Font("Segoe UI Symbol", 1, 17)); // NOI18N

        panelSlider.setOpaque(false);

        back.setText("Volver ");
        back.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        next.setText("Siguiente \n");
        next.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cardForm1Layout = new javax.swing.GroupLayout(cardForm1);
        cardForm1.setLayout(cardForm1Layout);
        cardForm1Layout.setHorizontalGroup(
            cardForm1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardForm1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(progressIndicator, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 53, Short.MAX_VALUE))
            .addGroup(cardForm1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(cardForm1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        cardForm1Layout.setVerticalGroup(
            cardForm1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardForm1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(progressIndicator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(panelSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(cardForm1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        cardForm.add(cardForm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 430, 600));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/EllipseRegister.png"))); // NOI18N
        cardForm.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, -90, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/EllipseRegister.png"))); // NOI18N
        cardForm.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, -1, 280));

        jPanel3.add(cardForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 450, 620));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/UnionRegister.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 0, 670, 430));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/EllipseRegister.png"))); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 500, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, 760));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    int position = 0; 
    final int INITIAL_STEP = 0;
    final int FINAL_STEP = 2;
    
    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        progressIndicator.previous();
        
//        if(position > INITIAL_STEP) position -=1;
//        
//        if(position == INITIAL_STEP){
//            back.setVisible(false);
//        }  
//        if(position < FINAL_STEP && next.getText() == "Registrarme") {
//            next.setText("Siguiente");
//        };
    }//GEN-LAST:event_backActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        // TODO add your handling code here:
        progressIndicator.next();
        
//        if(position < FINAL_STEP) position +=1;
//        
//        if(position != INITIAL_STEP && !back.isVisible()) {
//            back.setVisible(true);
//        } 
//        if(position == FINAL_STEP) {
//            next.setText("Registrarme");
//        }
        
    }//GEN-LAST:event_nextActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterFrame().setVisible(true);
            }
        });
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private components.ButtonGradient_blue back;
    private javax.swing.JPanel cardForm;
    private javax.swing.JPanel cardForm1;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private components.ButtonGradient_blue next;
    private components.progressindicator.PanelSlider panelSlider;
    private components.progressindicator.ProgressIndicator progressIndicator;
    // End of variables declaration//GEN-END:variables
    


}

