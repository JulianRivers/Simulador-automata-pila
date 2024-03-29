/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Automata.Automata3Var;
import Automata.AutomataPila;
import javax.swing.JOptionPane;

/**
 *
 * @author op7in
 */
public class Lenguaje2 extends javax.swing.JFrame {

    /**
     * Creates new form Lenguaje3
     */
    private char[] sigma;
    private String[] palabras;
    private Automata3Var at;

    public Lenguaje2() {

        initComponents();
        iniciarComponentes();
        at = new Automata3Var();

    }

    private void iniciarComponentes() {
        this.setTitle("S_A_P_A");
        alfabeto.setText("");
        cargarPalabrasBtn.setEnabled(false);
        inputPalabras.setEnabled(false);
        outputValidacion.setEnabled(false);
        this.setLocationRelativeTo(null);
    }

    private boolean comprobarEntradaAlfabeto(String alfabeto) {
        alfabeto = alfabeto.replace(" ", "");
        String[] caracteres = alfabeto.split(",");
        System.out.println(alfabeto);
        for (int i = 0; i < caracteres.length; i++) {
            System.out.println(caracteres[i]);
        }
        return alfabeto.length() == 5 && !seRepitenCaracteres(caracteres);
    }

    private boolean seRepitenCaracteres(String[] caracteres) {
        for (int i = 0; i < caracteres.length; i++) {
            String car = caracteres[i];
            for (int j = i + 1; j < caracteres.length; j++) {
                if (car == null ? caracteres[i] == null : car.equals(caracteres[j]) || caracteres[i].length() > 1) {
                    return true;
                }
            }
        }
        return false;
    }

    private void obtenerAlfabeto() {
        String alfabet = this.alfabeto.getText();
        alfabet = alfabet.replace(",", "");
        alfabet = alfabet.replace(" ", "");
        sigma = alfabet.toCharArray();
    }

    private void obtenerPalabrasAValidar() {

        palabras = inputPalabras.getText().split("\n");

        /*Quitamos los espacios de entrada y sallida */
        for (byte i = (byte) (palabras.length - 1); i >= 0; i--) {
            palabras[i].replace(" ", "");
        }

        JOptionPane.showMessageDialog(null, "¡Palabras cargadas con éxito!", "¡A validar!", JOptionPane.INFORMATION_MESSAGE);
        outputValidacion.setEnabled(true);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        alfabeto = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        cleanBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputPalabras = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        outputValidacion = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        w = new javax.swing.JLabel();
        y = new javax.swing.JLabel();
        x = new javax.swing.JLabel();
        alfabetoBtn = new javax.swing.JButton();
        cargarPalabrasBtn = new javax.swing.JButton();
        inicio = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo_a.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 90));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText(" Automata Pila");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 150, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Alfabeto:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 80, 30));

        alfabeto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        alfabeto.setForeground(new java.awt.Color(102, 102, 102));
        alfabeto.setText("  Ingrese el texto");
        alfabeto.setToolTipText("");
        alfabeto.setBorder(null);
        alfabeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alfabetoActionPerformed(evt);
            }
        });
        jPanel2.add(alfabeto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 410, 40));

        jPanel3.setBackground(new java.awt.Color(0, 153, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 410, 2));

        cleanBtn.setText("Limpiar campos");
        cleanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanBtnActionPerformed(evt);
            }
        });
        jPanel2.add(cleanBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, 150, 40));

        inputPalabras.setColumns(20);
        inputPalabras.setRows(5);
        jScrollPane1.setViewportView(inputPalabras);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 330, 100));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Ingrese las palabras: ");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        outputValidacion.setColumns(20);
        outputValidacion.setRows(5);
        jScrollPane2.setViewportView(outputValidacion);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 330, 100));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Resultado: ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        w.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        w.setText("w");
        jPanel2.add(w, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 20, -1));

        y.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        y.setText(" y");
        jPanel2.add(y, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 30, 40));
        y.getAccessibleContext().setAccessibleName("X");

        x.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        x.setText(" x");
        jPanel2.add(x, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 30, 40));

        alfabetoBtn.setText("Validar alfabeto");
        alfabetoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alfabetoBtnActionPerformed(evt);
            }
        });
        jPanel2.add(alfabetoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 150, 30));

        cargarPalabrasBtn.setText("Validar palabras");
        cargarPalabrasBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarPalabrasBtnActionPerformed(evt);
            }
        });
        jPanel2.add(cargarPalabrasBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 150, 40));

        inicio.setText("Volver al inicio");
        inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioActionPerformed(evt);
            }
        });
        jPanel2.add(inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 120, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lenguaje2_0.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 470, 70));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargarPalabrasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarPalabrasBtnActionPerformed
        // TODO add your handling code here:
        outputValidacion.setText("");
        obtenerPalabrasAValidar();
        boolean palabraValida = false;
        String mensaje = "";
        for (byte i = 0; i < palabras.length; i++) {

            palabraValida = at.verificacion(sigma, palabras[i]);

            mensaje = palabraValida ? "Palabra valida\n" : "Palbra no reconocida por el lenguaje\n";

            outputValidacion.setText(outputValidacion.getText() + mensaje);
        }
    }//GEN-LAST:event_cargarPalabrasBtnActionPerformed

    private void cleanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanBtnActionPerformed
        // TODO add your handling code here:
        alfabeto.setText("");
        alfabeto.setEnabled(true);

        inputPalabras.setText("");
        inputPalabras.setEnabled(false);

        outputValidacion.setText("");
        outputValidacion.setEnabled(false);

        cargarPalabrasBtn.setEnabled(false);
    }//GEN-LAST:event_cleanBtnActionPerformed

    private void alfabetoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alfabetoBtnActionPerformed

        boolean valido = comprobarEntradaAlfabeto(alfabeto.getText());

        if (!valido) {
            JOptionPane.showMessageDialog(null, "¡El alfabeto debe estar compuesto de 3 caracteres!\n Ingrese el alfabeto con sus terminales separadas por comas", "¡Error en el alfabeto", JOptionPane.ERROR_MESSAGE);
        } else {
            alfabeto.setEnabled(false);
            inputPalabras.setEnabled(true);
            cargarPalabrasBtn.setEnabled(true);
            obtenerAlfabeto();
            w.setText(String.valueOf(sigma[0]));
            x.setText(String.valueOf(sigma[1]));
            y.setText(String.valueOf(sigma[2]));

        }
    }//GEN-LAST:event_alfabetoBtnActionPerformed

    private void alfabetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alfabetoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alfabetoActionPerformed

    private void inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioActionPerformed
        inicio ini = new inicio();
        ini.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_inicioActionPerformed

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
            java.util.logging.Logger.getLogger(Lenguaje3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lenguaje3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lenguaje3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lenguaje3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lenguaje3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alfabeto;
    private javax.swing.JButton alfabetoBtn;
    private javax.swing.JButton cargarPalabrasBtn;
    private javax.swing.JButton cleanBtn;
    private javax.swing.JButton inicio;
    private javax.swing.JTextArea inputPalabras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea outputValidacion;
    private javax.swing.JLabel w;
    private javax.swing.JLabel x;
    private javax.swing.JLabel y;
    // End of variables declaration//GEN-END:variables
}
