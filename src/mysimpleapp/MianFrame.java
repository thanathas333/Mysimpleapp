/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mysimpleapp;

/**
 *
 * @author Administrator
 */
public class MianFrame extends javax.swing.JFrame {

    /**
     * Creates new form MianFrame
     */
    public MianFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtA = new javax.swing.JTextField();
        lbPlus = new javax.swing.JLabel();
        txtB = new javax.swing.JTextField();
        lbEqual = new javax.swing.JLabel();
        txtC = new javax.swing.JTextField();
        lbCalaculate = new javax.swing.JButton();
        txtA1 = new javax.swing.JTextField();
        lbPlus1 = new javax.swing.JLabel();
        txtB1 = new javax.swing.JTextField();
        lbEqual1 = new javax.swing.JLabel();
        txtC1 = new javax.swing.JTextField();
        lbCalaculate1 = new javax.swing.JButton();
        txtA2 = new javax.swing.JTextField();
        lbPlus2 = new javax.swing.JLabel();
        txtB2 = new javax.swing.JTextField();
        lbEqual2 = new javax.swing.JLabel();
        txtC2 = new javax.swing.JTextField();
        lbCalaculate2 = new javax.swing.JButton();
        txtA3 = new javax.swing.JTextField();
        lbPlus3 = new javax.swing.JLabel();
        txtB3 = new javax.swing.JTextField();
        lbEqual3 = new javax.swing.JLabel();
        txtC3 = new javax.swing.JTextField();
        lbCalaculate3 = new javax.swing.JButton();
        txtA4 = new javax.swing.JTextField();
        lbPlus4 = new javax.swing.JLabel();
        txtB4 = new javax.swing.JTextField();
        lbEqual4 = new javax.swing.JLabel();
        txtC4 = new javax.swing.JTextField();
        lbCalaculate4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hello Word");

        lbPlus.setText("+");

        lbEqual.setText("=");

        lbCalaculate.setText("Calaculate");
        lbCalaculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbCalaculateActionPerformed(evt);
            }
        });

        lbPlus1.setText("-");

        lbEqual1.setText("=");

        lbCalaculate1.setText("Calaculate");
        lbCalaculate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbCalaculate1ActionPerformed(evt);
            }
        });

        lbPlus2.setText("*");

        lbEqual2.setText("=");

        lbCalaculate2.setText("Calaculate");
        lbCalaculate2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbCalaculate2ActionPerformed(evt);
            }
        });

        lbPlus3.setText("/");

        lbEqual3.setText("=");

        lbCalaculate3.setText("Calaculate");
        lbCalaculate3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbCalaculate3ActionPerformed(evt);
            }
        });

        lbPlus4.setText("+");

        lbEqual4.setText("=2");

        lbCalaculate4.setText("Calaculate");
        lbCalaculate4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbCalaculate4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtB, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtC, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbCalaculate))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtA1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbPlus1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtB1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbEqual1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtC1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbCalaculate1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtA2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbPlus2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtB2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbEqual2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtC2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbCalaculate2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtA3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbPlus3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtB3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbEqual3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtC3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbCalaculate3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtA4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbPlus4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtB4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbEqual4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtC4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbCalaculate4)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPlus)
                    .addComponent(txtB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEqual)
                    .addComponent(txtC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCalaculate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPlus1)
                    .addComponent(txtB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEqual1)
                    .addComponent(txtC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCalaculate1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPlus2)
                    .addComponent(txtB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEqual2)
                    .addComponent(txtC2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCalaculate2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtA3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPlus3)
                    .addComponent(txtB3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEqual3)
                    .addComponent(txtC3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCalaculate3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtA4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPlus4)
                    .addComponent(txtB4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEqual4)
                    .addComponent(txtC4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCalaculate4))
                .addContainerGap(150, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbCalaculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbCalaculateActionPerformed
        // TODO add your handling code here:
        
        String a = txtA.getText();
        String b = txtB.getText();
        
        int intA = new Integer(a);
        int intB = new Integer(b);
        int intC = intA+intB;
        
        
        String c = Integer.toString(intC);
        
        txtC.setText(c);
    }//GEN-LAST:event_lbCalaculateActionPerformed

    private void lbCalaculate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbCalaculate1ActionPerformed
        // TODO add your handling code here:
        String a = txtA1.getText();
        String b = txtB1.getText();
        
        int intA = new Integer(a);
        int intB = new Integer(b);
        int intC = intA-intB;
        
        
        String c = Integer.toString(intC);
        
        txtC1.setText(c);
    }//GEN-LAST:event_lbCalaculate1ActionPerformed

    private void lbCalaculate2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbCalaculate2ActionPerformed
        // TODO add your handling code here:
        String a = txtA2.getText();
        String b = txtB2.getText();
        
        int intA = new Integer(a);
        int intB = new Integer(b);
        int intC = intA*intB;
        
        
        String c = Integer.toString(intC);
        
        txtC2.setText(c);
    }//GEN-LAST:event_lbCalaculate2ActionPerformed

    private void lbCalaculate3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbCalaculate3ActionPerformed
        // TODO add your handling code here:
        String a = txtA3.getText();
        String b = txtB3.getText();
        
        int intA = new Integer(a);
        int intB = new Integer(b);
        int intC = intA/intB;
        
        
        String c = Integer.toString(intC);
        
        txtC3.setText(c);
    }//GEN-LAST:event_lbCalaculate3ActionPerformed

    private void lbCalaculate4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbCalaculate4ActionPerformed
        // TODO add your handling code here:
        String a = txtA4.getText();
        String b = txtB4.getText();
        
        int intA = new Integer(a);
        int intB = new Integer(b);
        int intC = intA+intB;
        
        
        String c = Integer.toBinaryString(intC);
        
        txtC4.setText(c);
    }//GEN-LAST:event_lbCalaculate4ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton lbCalaculate;
    private javax.swing.JButton lbCalaculate1;
    private javax.swing.JButton lbCalaculate2;
    private javax.swing.JButton lbCalaculate3;
    private javax.swing.JButton lbCalaculate4;
    private javax.swing.JLabel lbEqual;
    private javax.swing.JLabel lbEqual1;
    private javax.swing.JLabel lbEqual2;
    private javax.swing.JLabel lbEqual3;
    private javax.swing.JLabel lbEqual4;
    private javax.swing.JLabel lbPlus;
    private javax.swing.JLabel lbPlus1;
    private javax.swing.JLabel lbPlus2;
    private javax.swing.JLabel lbPlus3;
    private javax.swing.JLabel lbPlus4;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtA1;
    private javax.swing.JTextField txtA2;
    private javax.swing.JTextField txtA3;
    private javax.swing.JTextField txtA4;
    private javax.swing.JTextField txtB;
    private javax.swing.JTextField txtB1;
    private javax.swing.JTextField txtB2;
    private javax.swing.JTextField txtB3;
    private javax.swing.JTextField txtB4;
    private javax.swing.JTextField txtC;
    private javax.swing.JTextField txtC1;
    private javax.swing.JTextField txtC2;
    private javax.swing.JTextField txtC3;
    private javax.swing.JTextField txtC4;
    // End of variables declaration//GEN-END:variables
}
