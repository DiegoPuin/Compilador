/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analizador;

import java.awt.Color;
import java.io.*;
import java.util.logging.*;
import java_cup.runtime.Symbol;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


/**
 *
 * @author Andres Ramirez
 * Codigo: 20161020077
 * Ciencias de la computacion 3
 */
public class FrmAnalizador extends javax.swing.JFrame {

    /**
     * Creates new form FrmAnalizador
     */
    public FrmAnalizador() {
        initComponents();
    }

    private File rutaArchivo = null; 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaLexico = new javax.swing.JTextArea();
        btn_AnalisisLexico = new javax.swing.JButton();
        btn_AbrirFuente = new javax.swing.JButton();
        btn_BorrarSintactico = new javax.swing.JButton();
        btn_AnalisisSintactico = new javax.swing.JButton();
        btn_BorrarLexico = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        textAreaSintactico = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        textAreaFuente = new javax.swing.JTextArea();
        btn_Guardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textAreaLexico.setColumns(20);
        textAreaLexico.setRows(5);
        jScrollPane1.setViewportView(textAreaLexico);
        textAreaLexico.getAccessibleContext().setAccessibleName("JtextAnalisis");

        btn_AnalisisLexico.setText("Analisis Lexico");
        btn_AnalisisLexico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AnalisisLexicoActionPerformed(evt);
            }
        });

        btn_AbrirFuente.setText("Abrir fuente");
        btn_AbrirFuente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AbrirFuenteActionPerformed(evt);
            }
        });

        btn_BorrarSintactico.setText("Borrar");
        btn_BorrarSintactico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BorrarSintacticoActionPerformed(evt);
            }
        });

        btn_AnalisisSintactico.setText("Analisis Sintactico");
        btn_AnalisisSintactico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AnalisisSintacticoActionPerformed(evt);
            }
        });

        btn_BorrarLexico.setText("Borrar");
        btn_BorrarLexico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BorrarLexicoActionPerformed(evt);
            }
        });

        textAreaSintactico.setColumns(20);
        textAreaSintactico.setRows(5);
        jScrollPane2.setViewportView(textAreaSintactico);

        textAreaFuente.setColumns(20);
        textAreaFuente.setRows(5);
        jScrollPane3.setViewportView(textAreaFuente);

        btn_Guardar.setText("Guardar");
        btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_AbrirFuente)
                                .addGap(18, 18, 18)
                                .addComponent(btn_Guardar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_AnalisisSintactico)
                                .addGap(18, 18, 18)
                                .addComponent(btn_BorrarSintactico)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_AnalisisLexico)
                                .addGap(18, 18, 18)
                                .addComponent(btn_BorrarLexico)
                                .addGap(0, 141, Short.MAX_VALUE))
                            .addComponent(jScrollPane1))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_AbrirFuente)
                    .addComponent(btn_BorrarLexico)
                    .addComponent(btn_AnalisisLexico)
                    .addComponent(btn_Guardar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_BorrarSintactico)
                    .addComponent(btn_AnalisisSintactico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_AnalisisLexico.getAccessibleContext().setAccessibleName("BtnAnalisis");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AnalisisLexicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AnalisisLexicoActionPerformed
        int cont = 1;
        try {
            Reader lectura= new BufferedReader(new FileReader(rutaArchivo));
            Lexer lexicos =new Lexer(lectura);
            String result= "";
        while(true){
            Tokens tokens= lexicos.yylex();
            if (tokens==null){
                result+= "Final";
                textAreaLexico.setText(result);
                return;
            }
            switch(tokens) {
                case Linea:
                cont++;
                result += "LINEA " + cont + "\n";
                break;
                case Comillas:
                result += " <Comillas>\t\t" + lexicos.lexeme + "\n";
                break;
                case Comillas_S:
                result += " <Comillas simples>\t\t" + lexicos.lexeme + "\n";
                break;
                case Cadena:
                result += " <Tipo de dato>\t\t" + lexicos.lexeme + "\n";
                break;
                case T_datoN:
                result += " <Tipo de dato>\t\t" + lexicos.lexeme + "\n";
                break;
                case Vacio:
                result += " <Tipo de dato vacio>\t\t" + lexicos.lexeme + "\n";
                break;
                case Nulo:
                result += " <Tipo de dato nulo>\t\t" + lexicos.lexeme + "\n";
                break;
                case Include:
                result += " <Reservada include>\t\t" + lexicos.lexeme + "\n";
                break;
                case If:
                result += " <Reservada if>\t" + lexicos.lexeme + "\n";
                break;
                case Else:
                result += " <Reservada else>\t" + lexicos.lexeme + "\n";
                break;
                case Do:
                result += " <Reservada do>\t" + lexicos.lexeme + "\n";
                break;
                case While:
                result += " <Reservada while>\t" + lexicos.lexeme + "\n";
                break;
                case For:
                result += " <Reservada while>\t" + lexicos.lexeme + "\n";
                break;
                case Switch:
                result += " <Reservada switch>\t" + lexicos.lexeme + "\n";
                break;    
                case Case:
                result += " <Reservada case>\t" + lexicos.lexeme + "\n";
                break;    
                case Break:
                result += " <Reservada break>\t" + lexicos.lexeme + "\n";
                break;
                case Default:
                result += " <Reservada default>\t" + lexicos.lexeme + "\n";
                break;
                case Print:
                result += " <Reservada printf>\t" + lexicos.lexeme + "\n";
                break;
                case Scan:
                result += " <Reservada scan>\t" + lexicos.lexeme + "\n";
                break;
                case Gets:
                result += " <Reservada gets>\t" + lexicos.lexeme + "\n";
                break;
                case Return:
                result += " <Reservada return>\t" + lexicos.lexeme + "\n";
                break;
                case Unsigned:
                result += " <Reservada unsigned>\t" + lexicos.lexeme + "\n";
                break;
                case Sistema:
                result += " <Reservada system>\t" + lexicos.lexeme + "\n";
                break;
                case SizeOf:
                result += " <Reservada sizeOf>\t" + lexicos.lexeme + "\n";
                break;
                case Igual:
                result += " <Operador igual>\t" + lexicos.lexeme + "\n";
                break;
                case Suma:
                result += " <Operador suma>\t" + lexicos.lexeme + "\n";
                break;
                case Resta:
                result += " <Operador resta>\t" + lexicos.lexeme + "\n";
                break;
                case Multiplicacion:
                result += " <Operador multiplicacion>\t" + lexicos.lexeme + "\n";
                break;
                case Division:
                result += " <Operador division>\t" + lexicos.lexeme + "\n";
                break;
                case Modulo:
                result += " <Operador modulo>\t" + lexicos.lexeme + "\n";
                break;
                case Op_logico:
                result += " <Operador logico>\t" + lexicos.lexeme + "\n";
                break;
                case Op_incremento:
                result += " <Operador incremento>\t" + lexicos.lexeme + "\n";
                break;
                case Op_relacional:
                result += " <Operador relacional>\t" + lexicos.lexeme + "\n";
                break;
                case Op_atribucion:
                result += " <Operador atribucion>\t" + lexicos.lexeme + "\n";
                break;
                case Op_booleano:
                result += " <Operador booleano>\t" + lexicos.lexeme + "\n";
                break;
                case Numeral:
                result += " <Numeral>\t" + lexicos.lexeme + "\n";
                break;
                case Parentesis_a:
                result += " <Parentesis de apertura>\t" + lexicos.lexeme + "\n";
                break;
                case Parentesis_c:
                result += " <Parentesis de cierre>\t" + lexicos.lexeme + "\n";
                break;
                case Llave_a:
                result += " <Llave de apertura>\t" + lexicos.lexeme + "\n";
                break;
                case Llave_c:
                result += " <Llave de cierre>\t" + lexicos.lexeme + "\n";
                break;
                case Corchete_a:
                result += " <Corchete de apertura>\t" + lexicos.lexeme + "\n";
                break;
                case Corchete_c:
                result += " <Corchete de cierre>\t" + lexicos.lexeme + "\n";
                break;
                case Main:
                result += " <Reservada main>\t" + lexicos.lexeme + "\n";
                break;
                case P_coma:
                result += " <Punto y coma>\t" + lexicos.lexeme + "\n";
                break;
                case Dos_P:
                result += " <Dos puntos>\t" + lexicos.lexeme + "\n";
                break;
                case Identificador:
                result += " <Identificador>\t\t" + lexicos.lexeme + "\n";
                break;
                case Numero:
                result += " <Numero>\t\t" + lexicos.lexeme + "\n";
                break;
                case ERROR:
                result += " <Simbolo no definido>\n";
                break;
                default:
                result += " < " + lexicos.lexeme + " >\n";
                break;
            }
        }
        }catch (FileNotFoundException ex){
            Logger.getLogger(FrmAnalizador.class.getName()).log(Level.SEVERE,null,ex);
        }catch (IOException ex){
            Logger.getLogger(FrmAnalizador.class.getName()).log(Level.SEVERE,null,ex);
        }
    }//GEN-LAST:event_btn_AnalisisLexicoActionPerformed

    private void btn_AbrirFuenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AbrirFuenteActionPerformed
        textAreaFuente.setText(abrirArchivo());
    }//GEN-LAST:event_btn_AbrirFuenteActionPerformed

    private void btn_AnalisisSintacticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AnalisisSintacticoActionPerformed
        Reader lectura = null;
        try {
            lectura = new BufferedReader(new FileReader(rutaArchivo));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FrmAnalizador.class.getName()).log(Level.SEVERE, null, ex);
        }
        Sintaxis s = new Sintaxis(new Analizador.LexicoCup(lectura));
        
        try{
            textAreaSintactico.setText(s.parse().toString());
            textAreaSintactico.setText("Analisis realizado correctamente");
            //textAreaSintactico.setForeground(Color.red);
        } catch(Exception ex){
            Symbol sym = s.getS();
            textAreaSintactico.setText("Error de sintaxis. Linea: " + (sym.right+1) + ", Columna: " + (sym.left+1) + ", Texto: " + sym.value);
            textAreaSintactico.setForeground(Color.red);
        }
    }//GEN-LAST:event_btn_AnalisisSintacticoActionPerformed

    private void btn_BorrarLexicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BorrarLexicoActionPerformed
        textAreaLexico.setText(null);
    }//GEN-LAST:event_btn_BorrarLexicoActionPerformed

    private void btn_BorrarSintacticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BorrarSintacticoActionPerformed
        textAreaSintactico.setText(null);
    }//GEN-LAST:event_btn_BorrarSintacticoActionPerformed

    private void btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuardarActionPerformed
        int lon = rutaArchivo.toString().length();
        String rutaArchivoNuevo = rutaArchivo.toString();
        rutaArchivoNuevo = rutaArchivoNuevo.substring(0, lon-4);
        rutaArchivoNuevo += "Lexico.txt";
        
        File archivoLexico = new File(rutaArchivoNuevo);
        BufferedWriter bw;
        if(archivoLexico.exists()){
            try{
                bw = new BufferedWriter(new FileWriter(archivoLexico));
                bw.write(textAreaLexico.getText());
                System.out.println("Existe: " + textAreaLexico.getText());
                bw.close();
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Error al guardar el archivo", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            try {
                bw = new BufferedWriter(new FileWriter(archivoLexico));
                bw.write(textAreaLexico.getText());
                System.out.println("No existe: " + textAreaLexico.getText());
                bw.close();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error al guardar el archivo", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_GuardarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmAnalizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAnalizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAnalizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAnalizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAnalizador().setVisible(true);
            }
        });
    }
    
    private String abrirArchivo(){
        String codigo = "";
	JFileChooser escoger=new JFileChooser();
        escoger.showOpenDialog(null);
        try {
            BufferedReader lectura= new BufferedReader(new FileReader(escoger.getSelectedFile()));
            rutaArchivo = escoger.getSelectedFile();
            while(lectura.ready()){
                codigo += lectura.readLine() + "\n";
            }
        }catch(IOException e) {
            e.printStackTrace();
	}
        return codigo;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_AbrirFuente;
    private javax.swing.JButton btn_AnalisisLexico;
    private javax.swing.JButton btn_AnalisisSintactico;
    private javax.swing.JButton btn_BorrarLexico;
    private javax.swing.JButton btn_BorrarSintactico;
    private javax.swing.JButton btn_Guardar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea textAreaFuente;
    private javax.swing.JTextArea textAreaLexico;
    private javax.swing.JTextArea textAreaSintactico;
    // End of variables declaration//GEN-END:variables
}