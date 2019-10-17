/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avioapp.view;

import avioapp.utility.Utility;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author PC
 */
public class Izbornik extends javax.swing.JFrame {

    /**
     * Creates new form Izbornik
     */
    public Izbornik() {
        initComponents();
        setTitle(Utility.getNazivAplikacije());
        new Vrijeme().start();
    }
    
       private class Vrijeme extends Thread{
       
        SimpleDateFormat df = new SimpleDateFormat(
                Utility.getFormatDatumaIVremena());
        
        @Override
        public void run() {
            
           lblVrijeme.setText(df.format(new Date()));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
               
            }
            run();
        }
       
   }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        lblVrijeme = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menbIzbornik = new javax.swing.JMenu();
        menPutnici = new javax.swing.JMenuItem();
        menLetovi = new javax.swing.JMenuItem();
        menAvioni = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        separator = new javax.swing.JPopupMenu.Separator();
        menIzlaz = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jToolBar1.setRollover(true);

        lblVrijeme.setText("Vrijeme");
        jToolBar1.add(lblVrijeme);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Izbornik.jpg"))); // NOI18N

        menbIzbornik.setText("Izbornik");

        menPutnici.setText("Putnici");
        menPutnici.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menPutniciActionPerformed(evt);
            }
        });
        menbIzbornik.add(menPutnici);

        menLetovi.setText("Letovi");
        menLetovi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menLetoviActionPerformed(evt);
            }
        });
        menbIzbornik.add(menLetovi);

        menAvioni.setText("Avioni");
        menAvioni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menAvioniActionPerformed(evt);
            }
        });
        menbIzbornik.add(menAvioni);

        jMenuItem1.setText("Booking");
        menbIzbornik.add(jMenuItem1);
        menbIzbornik.add(separator);

        menIzlaz.setText("Izlaz");
        menIzlaz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menIzlazActionPerformed(evt);
            }
        });
        menbIzbornik.add(menIzlaz);

        jMenuBar1.add(menbIzbornik);

        jMenu2.setText("Pomoć");

        jMenuItem2.setText("jMenuItem2");
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menPutniciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menPutniciActionPerformed
        new FormaPutnici().setVisible(true);
    }//GEN-LAST:event_menPutniciActionPerformed

    private void menLetoviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menLetoviActionPerformed
        new FormaLetovi().setVisible(true);
    }//GEN-LAST:event_menLetoviActionPerformed

    private void menIzlazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menIzlazActionPerformed
       dispose();
    }//GEN-LAST:event_menIzlazActionPerformed

    private void menAvioniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menAvioniActionPerformed
        new FormaAvioni().setVisible(true);
    }//GEN-LAST:event_menAvioniActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblVrijeme;
    private javax.swing.JMenuItem menAvioni;
    private javax.swing.JMenuItem menIzlaz;
    private javax.swing.JMenuItem menLetovi;
    private javax.swing.JMenuItem menPutnici;
    private javax.swing.JMenu menbIzbornik;
    private javax.swing.JPopupMenu.Separator separator;
    // End of variables declaration//GEN-END:variables
}
