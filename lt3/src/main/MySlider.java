/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Hashtable;
import javax.swing.JLabel;

/**
 *
 * @author HieuTT
 */
public class MySlider extends javax.swing.JFrame {

    /**
     * Creates new form MySlider
     */
    public MySlider() {
        initComponents();
        Hashtable data = new Hashtable();
        String []months={"Jan","Fed","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        for(int i=0; i<12; i++)
            data.put(i, new JLabel(months[i]));
        sldMonth.setLabelTable(data);
//        Calendar can = Calendar.getInstance();
//        sldDay.setValue(can.get(Calendar.DAY_OF_MONTH));
//        sldMonth.setValue(can.get(Calendar.MONTH));
//        sldYear.setValue(can.get(Calendar.YEAR));
        disPlayDate();
    }
public void disPlayDate()
{
    SimpleDateFormat sdf = new SimpleDateFormat("EEE, dd-MMM-yyyy");
    int dd= sldDay.getValue();
    int mm= sldMonth.getValue();
    int yy= sldYear.getValue()-1900;
    Date d = new Date(yy, mm, dd);
    lblValue.setText(sdf.format(d));
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sldDay = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sldMonth = new javax.swing.JSlider();
        jLabel3 = new javax.swing.JLabel();
        sldYear = new javax.swing.JSlider();
        jLabel4 = new javax.swing.JLabel();
        lblValue = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Slider");

        sldDay.setBackground(new java.awt.Color(255, 153, 153));
        sldDay.setMajorTickSpacing(10);
        sldDay.setMaximum(30);
        sldDay.setMinorTickSpacing(2);
        sldDay.setPaintLabels(true);
        sldDay.setPaintTicks(true);
        sldDay.setToolTipText("");
        sldDay.setValue(5);
        sldDay.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldDayStateChanged(evt);
            }
        });

        jLabel1.setText("Day");

        jLabel2.setText("Month");

        sldMonth.setMaximum(11);
        sldMonth.setMinorTickSpacing(1);
        sldMonth.setPaintLabels(true);
        sldMonth.setPaintTicks(true);
        sldMonth.setToolTipText("");
        sldMonth.setValue(2);
        sldMonth.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldMonthStateChanged(evt);
            }
        });

        jLabel3.setText("Year");

        sldYear.setMajorTickSpacing(10);
        sldYear.setMaximum(2030);
        sldYear.setMinimum(2010);
        sldYear.setMinorTickSpacing(1);
        sldYear.setPaintLabels(true);
        sldYear.setPaintTicks(true);
        sldYear.setToolTipText("");
        sldYear.setValue(2020);
        sldYear.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldYearStateChanged(evt);
            }
        });

        jLabel4.setText("Value");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sldMonth, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
                    .addComponent(sldYear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sldDay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sldDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sldMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sldYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValue, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sldDayStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldDayStateChanged
        if(sldDay.getValueIsAdjusting()) //neu Slide chưa dừng thì không làm gì cả
            return;
        disPlayDate();
    }//GEN-LAST:event_sldDayStateChanged

    private void sldMonthStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldMonthStateChanged
        if(sldMonth.getValueIsAdjusting()) //neu Slide chưa dừng thì không làm gì cả
            return;
        disPlayDate();
    }//GEN-LAST:event_sldMonthStateChanged

    private void sldYearStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldYearStateChanged
        if(sldYear.getValueIsAdjusting()) //neu Slide chưa dừng thì không làm gì cả
            return;
        disPlayDate();
    }//GEN-LAST:event_sldYearStateChanged

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
            java.util.logging.Logger.getLogger(MySlider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MySlider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MySlider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MySlider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MySlider().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblValue;
    private javax.swing.JSlider sldDay;
    private javax.swing.JSlider sldMonth;
    private javax.swing.JSlider sldYear;
    // End of variables declaration//GEN-END:variables
}
