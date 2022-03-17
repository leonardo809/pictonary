/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuestionarios;

import Cuestionarios.Menu_Resultados;
import com.sun.awt.AWTUtilities;
import java.io.*;
import javax.swing.*;

/**
 *
 * @author USUARIO
 */
public class I_Cuestionario extends javax.swing.JFrame {
int x,y;
    public I_Cuestionario() {
        initComponents();
        this.setLocationRelativeTo(null);
        AWTUtilities.setWindowOpaque(this, false);
                
        op_Cafeteria.add(op1);
        op_Cafeteria.add(op2);
        op_Cafeteria.add(op3);
            
        cor1.setVisible(false);
        preg.setText("");
        ///Aqui se debe marcar la pregunta incial;!!!!!!!!!!!!!!!!
        ///Aqui se debe marcar la pregunta incial;!!!!!!!!!!!!!!!!
        ///Aqui se debe marcar la pregunta incial;!!!!!!!!!!!!!!!!
        ///Aqui se debe marcar la pregunta incial;!!!!!!!!!!!!!!!!
    }
    

    //Variables:
    
    //q = Numero de la pregunta.
    //acieto = Respuestas correctas.
    //error = Respuestas incorrectas.
    //b = bandera
    int q=1, acierto=0, error=0, b=0 ;
    String nom;    
    int eje2;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        op_Cafeteria = new javax.swing.ButtonGroup();
        bSalir = new javax.swing.JButton();
        bMinimizar = new javax.swing.JButton();
        lBarra = new javax.swing.JLabel();
        Bot_in = new javax.swing.JButton();
        preg = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bot1 = new javax.swing.JButton();
        score_a = new javax.swing.JLabel();
        cor1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        op3 = new javax.swing.JCheckBox();
        op1 = new javax.swing.JCheckBox();
        op2 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        score_e = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Test");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cuestionarios/Botones/Salir/20.png"))); // NOI18N
        bSalir.setBorder(null);
        bSalir.setBorderPainted(false);
        bSalir.setContentAreaFilled(false);
        bSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bSalir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Cuestionarios/Botones/Salir/10.png"))); // NOI18N
        bSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Cuestionarios/Botones/Salir/15.png"))); // NOI18N
        bSalir.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Cuestionarios/Botones/Salir/10.png"))); // NOI18N
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });
        getContentPane().add(bSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 5, -1, -1));

        bMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cuestionarios/Botones/Minimizar/20.png"))); // NOI18N
        bMinimizar.setBorder(null);
        bMinimizar.setBorderPainted(false);
        bMinimizar.setContentAreaFilled(false);
        bMinimizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bMinimizar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Cuestionarios/Botones/Minimizar/10.png"))); // NOI18N
        bMinimizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Cuestionarios/Botones/Minimizar/15.png"))); // NOI18N
        bMinimizar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Cuestionarios/Botones/Minimizar/20.png"))); // NOI18N
        bMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMinimizarActionPerformed(evt);
            }
        });
        getContentPane().add(bMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 5, -1, -1));

        lBarra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cuestionarios/Barra.jpg"))); // NOI18N
        lBarra.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lBarra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lBarraMouseDragged(evt);
            }
        });
        lBarra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lBarraMousePressed(evt);
            }
        });
        getContentPane().add(lBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 30));

        Bot_in.setFont(new java.awt.Font("Caviar Dreams", 1, 30)); // NOI18N
        Bot_in.setForeground(new java.awt.Color(255, 255, 255));
        Bot_in.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cuestionarios/Botones/Normal/Normal150.png"))); // NOI18N
        Bot_in.setText("START");
        Bot_in.setBorder(null);
        Bot_in.setBorderPainted(false);
        Bot_in.setContentAreaFilled(false);
        Bot_in.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Bot_in.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Cuestionarios/Botones/Normal/Normal130.png"))); // NOI18N
        Bot_in.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Cuestionarios/Botones/Normal/Normal140.png"))); // NOI18N
        Bot_in.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bot_inActionPerformed(evt);
            }
        });
        getContentPane().add(Bot_in, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 200, 150, 48));

        preg.setFont(new java.awt.Font("Caviar Dreams", 1, 36)); // NOI18N
        preg.setForeground(new java.awt.Color(255, 255, 255));
        preg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(preg, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 140, 130));

        jLabel4.setBackground(new java.awt.Color(255, 102, 51));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cuestionarios/FondoAnimadoImagen.gif"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 500, 450));

        bot1.setFont(new java.awt.Font("Caviar Dreams", 1, 30)); // NOI18N
        bot1.setForeground(new java.awt.Color(255, 255, 255));
        bot1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cuestionarios/Botones/Normal/Normal150.png"))); // NOI18N
        bot1.setText("Enter");
        bot1.setBorderPainted(false);
        bot1.setContentAreaFilled(false);
        bot1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bot1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Cuestionarios/Botones/Normal/Normal130.png"))); // NOI18N
        bot1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Cuestionarios/Botones/Normal/Normal140.png"))); // NOI18N
        bot1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot1ActionPerformed(evt);
            }
        });
        getContentPane().add(bot1, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 305, 150, 48));

        score_a.setFont(new java.awt.Font("Caviar Dreams", 1, 24)); // NOI18N
        score_a.setForeground(new java.awt.Color(255, 255, 255));
        score_a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        score_a.setText("0");
        score_a.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(score_a, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 400, 30, -1));

        cor1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/O_O/ico_cor.png"))); // NOI18N
        getContentPane().add(cor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 265, -1, -1));

        jLabel3.setFont(new java.awt.Font("Caviar Dreams", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Score");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 365, 80, -1));

        op3.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        op3.setForeground(new java.awt.Color(255, 255, 255));
        op3.setText("op3");
        op3.setOpaque(false);
        getContentPane().add(op3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 412, 170, -1));

        op1.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        op1.setForeground(new java.awt.Color(255, 255, 255));
        op1.setText("op1");
        op1.setOpaque(false);
        op1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op1ActionPerformed(evt);
            }
        });
        getContentPane().add(op1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 289, 170, -1));

        op2.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        op2.setForeground(new java.awt.Color(255, 255, 255));
        op2.setText("op2");
        op2.setOpaque(false);
        op2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op2ActionPerformed(evt);
            }
        });
        getContentPane().add(op2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 170, -1));

        jLabel5.setBackground(new java.awt.Color(255, 102, 51));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cuestionarios/CuestionarioImagen.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 500, 450));

        score_e.setFont(new java.awt.Font("Caviar Dreams", 1, 24)); // NOI18N
        score_e.setForeground(new java.awt.Color(255, 255, 255));
        score_e.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        score_e.setText("0");
        score_e.setEnabled(false);
        getContentPane().add(score_e, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 70, -1));

        jLabel2.setFont(new java.awt.Font("Caviar Dreams", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Error");
        jLabel2.setEnabled(false);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 90, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    Menu_Resultados MR = new Menu_Resultados();
    
    /*
    NO MODIFICAR!!!!!!!!!! SON LOS OBJETOS DE LAS RESPUESTAS!!!!!
    */
    
    public void ac1(){
            if(op1.isSelected()){
                cor1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/O_O/ico_cor.png")));
                cor1.setVisible(true);
                acierto++;
                score_a.setText(String.valueOf(acierto));
                bot1.setText("Next");
                b++;
                op1.setEnabled(false);
                op2.setEnabled(false);
                op3.setEnabled(false);
            }
            if(op2.isSelected()){
                cor1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/O_O/ico_inco.png")));
                cor1.setVisible(true);
                error++;
                score_e.setText(String.valueOf(error));
                bot1.setText("Next");
                b++;
                op1.setEnabled(false);
                op2.setEnabled(false);
                op3.setEnabled(false);
            }
            if(op3.isSelected()){
                cor1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/O_O/ico_inco.png")));
                cor1.setVisible(true);
                error++;
                score_e.setText(String.valueOf(error));
                bot1.setText("Next");
                b++;
                op1.setEnabled(false);
                op2.setEnabled(false);
                op3.setEnabled(false);
            }    
}
    
    public void ac2(){
            if(op1.isSelected()){
                cor1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/O_O/ico_inco.png")));
                cor1.setVisible(true);
                error++;
                score_e.setText(String.valueOf(error));
                bot1.setText("Next");
                b++;
                op1.setEnabled(false);
                op2.setEnabled(false);
                op3.setEnabled(false);
            }
            if(op2.isSelected()){
                cor1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/O_O/ico_cor.png")));
                cor1.setVisible(true);
                acierto++;
                score_a.setText(String.valueOf(acierto));
                bot1.setText("Next");
                b++;
                op1.setEnabled(false);
                op2.setEnabled(false);
                op3.setEnabled(false);
            }
            if(op3.isSelected()){
                cor1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/O_O/ico_inco.png")));
                cor1.setVisible(true);
                error++;
                score_e.setText(String.valueOf(error));
                bot1.setText("Next");
                b++;
                op1.setEnabled(false);
                op2.setEnabled(false);
                op3.setEnabled(false);
            }
}
    
    public void ac3(){
            if(op1.isSelected()){
                cor1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/O_O/ico_inco.png")));
                cor1.setVisible(true);
                error++;
                score_e.setText(String.valueOf(error));
                bot1.setText("Next");
                b++;
                op1.setEnabled(false);
                op2.setEnabled(false);
                op3.setEnabled(false);
            }
            if(op2.isSelected()){
                cor1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/O_O/ico_inco.png")));
                cor1.setVisible(true);
                error++;
                score_e.setText(String.valueOf(error));
                bot1.setText("Next");
                b++;
                op1.setEnabled(false);
                op2.setEnabled(false);
                op3.setEnabled(false);
            }
            if(op3.isSelected()){
                cor1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/O_O/ico_cor.png")));
                cor1.setVisible(true);
                acierto++;
                score_a.setText(String.valueOf(acierto));
                bot1.setText("Next");
                b++;
                op1.setEnabled(false);
                op2.setEnabled(false);
                op3.setEnabled(false);
            }
}
    
    
    
    
    private void bot1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot1ActionPerformed
        // TODO add your handling code here:
//        JOptionPane.showMessageDialog(null,"Es " + eje);
        if(!op3.isSelected() && !op2.isSelected() && !op1.isSelected()){
            JOptionPane.showMessageDialog(null,"Check an option");
        }
        if(b==1){
            bot1.setText("ACcept");
            q++;    b=0;
            op_Cafeteria.clearSelection();
            op1.setEnabled(true);
            op2.setEnabled(true);
            op3.setEnabled(true);
        }
        cor1.setVisible(false);

        //No modificar;
        pregunta_selec();

        if(q==11){
        MR.l1.setText(String.valueOf(acierto));
        MR.l2.setText(String.valueOf(error));
        MR.l3.setText(nom);
        MR.setVisible(true);
        this.dispose();    
        }
    
    }//GEN-LAST:event_bot1ActionPerformed

    private void op1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_op1ActionPerformed

    //Aqui se escriben la primera pregunta!!!!!!!!!!!!!!!!
    //Aqui se escriben la primera pregunta!!!!!!!!!!!!!!!!
    //Aqui se escriben la primera pregunta!!!!!!!!!!!!!!!!
    //Aqui se escriben la primera pregunta!!!!!!!!!!!!!!!!
    //Es un boton "INICIO" que escribe la primera pregunta, se borra 
    //se oculta despues de precionarlo; si en el Frame anterior
    //si selecciono en el Frame anterior ("Munu_Test") un modo que no ha 
    //sido añadido dara "error 505"
    
    private void Bot_inActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bot_inActionPerformed
        // TODO add your handling code here:
            switch (eje2) {
            case 0:
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/TOYS.png")));
            op1.setText("Tooys"); 
            op2.setText("Tuys");
            op3.setText("Toys");//corr
            Bot_in.setVisible(false);   jLabel4.setVisible(false);
            break;        
                
            case 1:
			preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/ban_1.png")));
            op1.setText("Stock Exchange");
            op2.setText("Stock Excchange");
            op3.setText("Stocck Exchange"); //car
            Bot_in.setVisible(false);   jLabel4.setVisible(false);
            break;
            
            case 2:
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/SHELF.png")));
            op1.setText("Shel");
            op2.setText("Sheelf");
            op3.setText("Shelf"); //corr
            Bot_in.setVisible(false);   jLabel4.setVisible(false);
            break;
            
            case 3:
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/11.png")));
            op1.setText("air machine");///Corecta
            op2.setText("air machin");
            op3.setText("eir machine"); 
            Bot_in.setVisible(false);   jLabel4.setVisible(false);
            break;
            
            case 4:
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/d_caf_1.png")));
            op1.setText("Cupcake"); //corr
            op2.setText("CupCakke");
            op3.setText("CupCakee");
            Bot_in.setVisible(false);   jLabel4.setVisible(false);
            break;

            case 5:
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/31.png")));
            op1.setText("lolli pops");///Corecta
            op2.setText("loli pops");
            op3.setText("lolly pops"); 
            Bot_in.setVisible(false);   jLabel4.setVisible(false);
            break;
            
            case 6:
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/1.png")));
            op1.setText("token");//Corecta
            op2.setText("toquen");
            op3.setText("touken"); 
            Bot_in.setVisible(false);   jLabel4.setVisible(false);
            break;
            
            case 7:
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Cin_7_001.png")));
            op1.setText("Soft-drink"); //cor
            op2.setText("Soft-drinck");
            op3.setText("Soft-drinc");
            Bot_in.setVisible(false);   jLabel4.setVisible(false);
            break;    
            
            case 8:
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/rop_1.png")));
            op1.setText("Bloouse");
            op2.setText("Blouse");
            op3.setText("Blousse"); //car
            Bot_in.setVisible(false);   jLabel4.setVisible(false);
            break;    
            
            case 9:
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Com_9_001.png")));
            op1.setText("Keyboard"); //Cor
            op2.setText("Keybord"); 
            op3.setText("Keyboord");
            Bot_in.setVisible(false);   jLabel4.setVisible(false);
            break;    
            
            case 10:
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/tec_1.png")));
            op1.setText("Iroon");
            op2.setText("Iron");
            op3.setText("Airon"); //car
            Bot_in.setVisible(false);   jLabel4.setVisible(false);
            break; 
            
            case 11:
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/cr_1.png")));
            op1.setText("Frid Chicken");
            op2.setText("Fried Chicken");
            op3.setText("Frid Chiken"); //car
            Bot_in.setVisible(false);   jLabel4.setVisible(false);
            break; 
            
            case 12:
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/CASH REGISTRER.png")));
            op1.setText("Cash registrer"); //corr
            op2.setText("Cashes registret");
            op3.setText("Cash ");
            Bot_in.setVisible(false);   jLabel4.setVisible(false);
            break;

            case 13:
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/GLASSES.png")));
            op1.setText("Glasess"); 
            op2.setText("Glass");
            op3.setText("Glasses");//corr
            break;

            case 14:
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/TICKET.png")));
            op1.setText("Tickett"); 
            op2.setText("Tick");
            op3.setText("Ticket");//corr
            Bot_in.setVisible(false);   jLabel4.setVisible(false);
            break;
            
            case 15:
			preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Masc_16_001.png")));
            op1.setText("Thois");
            op2.setText("Tois"); 
            op3.setText("Toys"); // cor
            Bot_in.setVisible(false);   jLabel4.setVisible(false);
            break;
            
            case 16:
			preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/res_1.png")));
            op1.setText("Rasted Chicken");
            op2.setText("Roasted Chicken");
            op3.setText("Rosted Chiken"); //car
            Bot_in.setVisible(false);   jLabel4.setVisible(false);
            break;            
            
            case 17:  ///////////
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Dep_17_001.png")));
            op1.setText("Jelmet"); 
            op2.setText("Helmet"); //Correcto
            op3.setText("Elmet");
            Bot_in.setVisible(false);   jLabel4.setVisible(false);
            break;    

            case 18:
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/21.png")));
            op1.setText("brand");///Corecta
            op2.setText("bran");
            op3.setText("vrand"); 
            Bot_in.setVisible(false);   jLabel4.setVisible(false);
            break;
            
            case 19:
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Jug_20_001.png")));
            op1.setText("Toy hopps");
            op2.setText("Toy hops");
            op3.setText("Toy hoops"); //car
            Bot_in.setVisible(false);   jLabel4.setVisible(false);
            break;
            
            case 20:
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/vid_1.png")));
            op1.setText("Fire Alaarm");
            op2.setText("Fire Alarm");
            op3.setText("Fir Alarm"); //car
            Bot_in.setVisible(false);   jLabel4.setVisible(false);
            break;
            
            case 21:
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/41.png")));
            op1.setText("mirror");///Corecta
            op2.setText("miror");
            op3.setText("mirorr"); 
            Bot_in.setVisible(false);   jLabel4.setVisible(false);
            break;
            default: JOptionPane.showMessageDialog(null,"Error 505"); break;
        }
            
    }//GEN-LAST:event_Bot_inActionPerformed

    private void lBarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lBarraMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_lBarraMouseDragged

    private void lBarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lBarraMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_lBarraMousePressed

    private void bMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMinimizarActionPerformed
        this.setExtendedState(ICONIFIED);
        this.setExtendedState(1);
    }//GEN-LAST:event_bMinimizarActionPerformed

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_bSalirActionPerformed

    private void op2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_op2ActionPerformed

//Aqui se escbriben las preguntas y las opciones para contestar;

    public void imagen_cafeteria(){
                //Pregunta 1-------------------------        
        if(q==1){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/d_caf_1.png")));
            op1.setText("Cupcake"); //corr
            op2.setText("CupCakke");
            op3.setText("CupCakee");
            ac1();
        }
        
//Pregunta 2-------------------------
        if(q==2){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/d_caf_2.png")));
            op1.setText("Drinks machin");
            op2.setText("Drincks machinne");
            op3.setText("Drinks machine");  //Corecta
            ac3();
        }
            
//Pregunta 3-------------------------
        if(q==3){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/d_caf_3.png")));
            op1.setText("Wallet"); //correcta
            op2.setText("Whalet");  
            op3.setText("Whallet");
            ac1();
        }
        
        
//Pregunta 4-------------------------
        if(q==4){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/d_caf_4.png")));
            op1.setText("Bag"); //Correcto
            op2.setText("Bagg");
            op3.setText("Baag");
            ac1();
        }

//Pregunta 5-------------------------
        if(q==5){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/d_caf_5.png")));
            op1.setText("Pizza"); //Correcto
            op2.setText("Pitza");
            op3.setText("Piza");
            ac1();
        }
        
//Pregunta 6-------------------------
        if(q==6){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/d_caf_6.png")));
            op1.setText("FriesChips"); 
            op2.setText("FriesShip"); //Correcto
            op3.setText("FriesChi");
            ac2();
        }        
        
//Pregunta 7-------------------------
        if(q==7){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/d_caf_7.png")));
            op1.setText("Knyfe"); 
            op2.setText("Kife");
            op3.setText("Knife"); //Correcto
            ac3();
        }        
        
//Pregunta 8-------------------------
        if(q==8){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/d_caf_8.png")));
            op1.setText("Milkshake"); //Correcto
            op2.setText("Milkshacke");
            op3.setText("Shakemilk");
            ac1();
        }        
        
//Pregunta 9-------------------------
        if(q==9){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/d_caf_9.png")));
            op1.setText("Lemon"); 
            op2.setText("Lemonada");
            op3.setText("Lemonade");//Correcto
            ac3();
        }
        
//Pregunta 10-------------------------
        if(q==10){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/d_caf_10.png")));
            op1.setText("Coffee"); //Correcto
            op2.setText("Cofe");
            op3.setText("Coffe");
            ac1();
        }  
    }
    
    public void imagen_cine() {
        //Pregunta 1-------------------------        
        if(q==1){  
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Cin_7_001.png")));
            op1.setText("Soft-drink"); //cor
            op2.setText("Soft-drinck");
            op3.setText("Soft-drinc");
            ac1();
        }
        
//Pregunta 2-------------------------
        if(q==2){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Cin_7_002.png")));
            op1.setText("3D Glasses"); //Corecta
            op2.setText("3D Glases");
            op3.setText("3D Glasess"); 
            ac2();
        }
            
//Pregunta 3-------------------------
        if(q==3){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Cin_7_003.png")));
            op1.setText("Advert"); //correcta
            op2.setText("Addvert");  
            op3.setText("Advertt");
            ac1();           
        }
        
        
//Pregunta 4-------------------------
        if(q==4){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Cin_7_004.png")));
            op1.setText("Poporn machine"); 
            op2.setText("Popcorn machine"); //Correcto
            op3.setText("Popcorn machinne");
            ac2();
        }

//Pregunta 5-------------------------
        if(q==5){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Cin_7_005.png")));
            op1.setText("Tickets"); //Correcto
            op2.setText("Ticket");
            op3.setText("Tikets");
            ac1();
        }
        
//Pregunta 6-------------------------
        if(q==6){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Cin_7_006.png")));
            op1.setText("Popcorn"); //Correcto
            op2.setText("Popkorn"); 
            op3.setText("Pocorn");
            ac1();
        }        
        
//Pregunta 7-------------------------
        if(q==7){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Cin_7_007.png")));
            op1.setText("Posster"); 
            op2.setText("Posteer");
            op3.setText("Poster"); //Correcto
            ac3();
        }        
        
//Pregunta 8-------------------------
        if(q==8){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Cin_7_008.png")));
            op1.setText("Ad"); //Correcto
            op2.setText("Add");
            op3.setText("Aad");
            ac1();
        }        
        
//Pregunta 9-------------------------
        if(q==9){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Cin_7_009.png")));
            op1.setText("Cande"); 
            op2.setText("Candi");
            op3.setText("Candy");//Correcto
            ac3();
        }
        
//Pregunta 10-------------------------
        if(q==10){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Cin_7_010.png")));
            op1.setText("Ice cream"); //Correcto
            op2.setText("Hice cream");
            op3.setText("Ice creeam");
            ac1();
        }          
    }
    // 7
    public void imagen_mascotas(){
        //Pregunta 1-------------------------    
        if(q==1){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Masc_16_001.png")));
            op1.setText("Thois");
            op2.setText("Tois"); 
            op3.setText("Toys"); // cor
            ac3();
        }
        
//Pregunta 2-------------------------
        if(q==2){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Masc_16_002.png")));
            op1.setText("Bowl"); //Corecta
            op2.setText("Boul");
            op3.setText("Boowl");  
            ac1();
        }
            
//Pregunta 3-------------------------
        if(q==3){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Masc_16_003.png")));
            op1.setText("Lizard"); //correcta
            op2.setText("Lizzard");  
            op3.setText("Lisard");
            ac1();            
        }
        
        
//Pregunta 4-------------------------
        if(q==4){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Masc_16_004.png")));
            op1.setText("Dogy"); 
            op2.setText("Doog");
            op3.setText("Dog"); //Correcto
            ac3();
        }

//Pregunta 5-------------------------
        if(q==5){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Masc_16_005.png")));
            op1.setText("Lesh"); 
            op2.setText("Leash"); //Correcto
            op3.setText("Leach");
            ac2();
        }
        
//Pregunta 6-------------------------
        if(q==6){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Masc_16_006.png")));
            op1.setText("Bircage"); 
            op2.setText("Birdcage"); //Correcto
            op3.setText("Birdcaje");
            ac2();
        }        
        
//Pregunta 7-------------------------
        if(q==7){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Masc_16_007.png")));
            op1.setText("Bresh"); 
            op2.setText("Brosh");
            op3.setText("Brush"); //Correcto
            ac3();
        }        
        
//Pregunta 8-------------------------
        if(q==8){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Masc_16_008.png")));
            op1.setText("Collar"); //Correcto
            op2.setText("Coyar");
            op3.setText("Coll");
            ac1();
        }        
        
//Pregunta 9-------------------------
        if(q==9){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Masc_16_009.png")));
            op1.setText("Ferret"); //Correcto
            op2.setText("Feret");
            op3.setText("Fereet");
            ac1();
        }
        
//Pregunta 10-------------------------
        if(q==10){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Masc_16_010.png")));
            op1.setText("Pet food"); //Correcto
            op2.setText("Pet fod");
            op3.setText("Pet fuod");
            ac1();
        }
    }
    
    public void imagen_computo(){
        //Pregunta 1-------------------------        
        if(q==1){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Com_9_001.png")));
            op1.setText("Keyboard"); //Cor
            op2.setText("Keybord"); 
            op3.setText("Keyboord");
            ac1();
        }
        
//Pregunta 2-------------------------
        if(q==2){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Com_9_002.png")));
            op1.setText("Lisense");
            op2.setText("Lisence");
            op3.setText("License");  //Corecta
            ac3();
        }
            
//Pregunta 3-------------------------
        if(q==3){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Com_9_003.png")));
            op1.setText("Printer"); //correcta
            op2.setText("Priter");  
            op3.setText("Prynter");
            ac1();                 
        }
        
//Pregunta 4-------------------------
        if(q==4){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Com_9_004.png")));
            op1.setText("Poguer supply"); 
            op2.setText("Power supply"); //Correcto
            op3.setText("Power suply");
            ac2();
        }

//Pregunta 5-------------------------
        if(q==5){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Com_9_005.png")));
            op1.setText("Pen drive"); //Correcto
            op2.setText("Peen drive");
            op3.setText("Pen dryve");
            ac1();
        }
        
//Pregunta 6-------------------------
        if(q==6){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Com_9_006.png")));
            op1.setText("Mose"); 
            op2.setText("Mouse"); //Correcto
            op3.setText("Mouce");
            ac2();
        }        
        
//Pregunta 7-------------------------
        if(q==7){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Com_9_007.png")));
            op1.setText("Sofware"); 
            op2.setText("Softguare");
            op3.setText("Software"); //Correcto
            ac3();
        }        
        
//Pregunta 8-------------------------
        if(q==8){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Com_9_008.png")));
            op1.setText("Hornys"); 
            op2.setText("Horns"); //Correcto
            op3.setText("Hornis");
            ac2();
        }        
        
//Pregunta 9-------------------------
        if(q==9){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Com_9_009.png")));
            op1.setText("Disko"); 
            op2.setText("Dick");
            op3.setText("Disk");//Correcto
            ac3();
        }
        
//Pregunta 10-------------------------
        if(q==10){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Com_9_010.png")));
            op1.setText("Charger"); //Correcto
            op2.setText("Chargger");
            op3.setText("Chargeer");
            ac1();
        }        

}
    
    public void imagen_deportes(){
        
//Pregunta 1-------------------------
        if(q==1){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Dep_17_001.png")));
            op1.setText("Jelmet"); 
            op2.setText("Helmet"); //Correcto
            op3.setText("Elmet");
            ac2();     
    }
        
//Pregunta 2-------------------------
        if(q==2){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Dep_17_002.png")));
            op1.setText("Ax ice");
            op2.setText("Axe Ice");
            op3.setText("Axe Hice");  //Corecta
            ac3();
        }
            
//Pregunta 3-------------------------
        if(q==3){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Dep_17_003.png")));
            op1.setText("Hula hula Ring"); //correcta
            op2.setText("hula hula rin");  
            op3.setText("hula ula Ring");
            ac1();              
        }
        
        
//Pregunta 4-------------------------
        if(q==4){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Dep_17_004.png")));
            op1.setText("Florete"); 
            op2.setText("Flooret"); 
            op3.setText("Floret"); //Correcto
            ac3();
        }

//Pregunta 5-------------------------
        if(q==5){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Dep_17_005.png")));
            op1.setText("Boxing gloves"); //Correcto
            op2.setText("Box gloves");
            op3.setText("Boxing globes");
            ac1();
        }
        
//Pregunta 6-------------------------
        if(q==6){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Dep_17_006.png")));
            op1.setText("hockey stic"); 
            op2.setText("Hockey stick"); //Correcto
            op3.setText("Hokey stick");
            ac2();
        }        
        
//Pregunta 7-------------------------
        if(q==7){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Dep_17_007.png")));
            op1.setText("Cui"); 
            op2.setText("Cue"); //Correcto
            op3.setText("Cuu"); 
            ac2();
        }        
        
//Pregunta 8-------------------------
        if(q==8){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Dep_17_008.png")));
            op1.setText("Racquet"); //Correcto
            op2.setText("Racquett");
            op3.setText("Raquet");
            ac1();
        }        
        
//Pregunta 9-------------------------
        if(q==9){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Dep_17_009.png")));
            op1.setText("Uniociclo"); 
            op2.setText("Unicycle");
            op3.setText("Unicycle");//Correcto
            ac3();
        }
        
//Pregunta 10-------------------------
        if(q==10){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Dep_17_010.png")));
            op1.setText("Goggles"); //Correcto
            op2.setText("Gogles");
            op3.setText("Goglees");
            ac1();
        }        
}
    
    public void imagen_juguetes(){
       
        //Pregunta 1-------------------------        
        if(q==1){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Jug_20_001.png")));
            op1.setText("Toy hopps");
            op2.setText("Toy hops");
            op3.setText("Toy hoops"); //car
            ac3();
        }
        
//Pregunta 2-------------------------
        if(q==2){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Jug_20_002.png")));
            op1.setText("Toy chopper"); //Corecta
            op2.setText("Toi chopper");
            op3.setText("Toy choper");
            ac1();
        }
            
//Pregunta 3-------------------------
        if(q==3){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Jug_20_003.png")));
            op1.setText("Balln"); 
            op2.setText("Ballonn");  //correcta
            op3.setText("Ballon");
            ac2();              
        }
        
        
//Pregunta 4-------------------------
        if(q==4){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Jug_20_004.png")));
            op1.setText("Toy sword"); //Correcto
            op2.setText("Toy swor");
            op3.setText("Toy sowrd");
            ac1();
        }

//Pregunta 5-------------------------
        if(q==5){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Jug_20_005.png")));
            op1.setText("Toy rockett"); //Correcto
            op2.setText("Toy rocket");
            op3.setText("Toy roket");
            ac1();
        }
        
//Pregunta 6-------------------------
        if(q==6){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Jug_20_006.png")));
            op1.setText("Toy dock"); 
            op2.setText("Toy duk");
            op3.setText("Toy duck"); //Correcto
            ac3();
        }        
        
//Pregunta 7-------------------------
        if(q==7){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Jug_20_007.png")));
            op1.setText("Soldier"); //Correcto
            op2.setText("Solder");
            op3.setText("Solier");
            ac1();
        }        
        
//Pregunta 8-------------------------
        if(q==8){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Jug_20_008.png")));
            op1.setText("Dols");
            op2.setText("Dolls"); //Correcto
            op3.setText("Dools");
            ac2();
        }        
        
//Pregunta 9-------------------------
        if(q==9){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Jug_20_009.png")));
            op1.setText("Toy chicken");//Correcto
            op2.setText("Toy chiken");
            op3.setText("Toy chikeen"); 
            ac1();
        }
        
//Pregunta 10-------------------------
        if(q==10){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/David/Jug_20_010.png")));
            op1.setText("kinte"); 
            op2.setText("kinite");
            op3.setText("kite"); //Correcto
            ac3();      
    }
}   

 //FRANSITO FRANSITO FRANSITO FRANSITO FRANSITO FRANSITO FRANSITO FRANSITO FRANSITO FRANSITO FRANSITO FRANSITO FRANSITO FRANSITO 
 //BANCOS 

    public void imagen_banco(){
       
        //Pregunta 1-------------------------        
        if(q==1){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/ban_1.png")));
            op1.setText("Stock Exchange");
            op2.setText("Stock Excchange");
            op3.setText("Stocck Exchange"); //car
            ac1();
        }
        
//Pregunta 2-------------------------
        if(q==2){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/ban_2.png")));
            op1.setText("Worldwide Mapp"); //Corecta
            op2.setText("Worldwide Map");
            op3.setText("Worldwid Map");
            ac2();
        }
            
//Pregunta 3-------------------------
        if(q==3){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/ban_3.png")));
            op1.setText("Security Cam"); 
            op2.setText("Securiti Cam");  //correcta
            op3.setText("Securitty Cam");
            ac1();              
        }
        
        
//Pregunta 4-------------------------
        if(q==4){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/ban_4.png")));
            op1.setText("Thief"); //Correcto
            op2.setText("Thif");
            op3.setText("Thieff");
            ac1();
        }

//Pregunta 5-------------------------
        if(q==5){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/ban_5.png")));
            op1.setText("ATMM"); //Correcto
            op2.setText("ATM");
            op3.setText("ATTM");
            ac2();
        }
        
//Pregunta 6-------------------------
        if(q==6){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/ban_6.png")));
            op1.setText("Wallet"); 
            op2.setText("Walet");
            op3.setText("Wallett"); //Correcto
            ac1();
        }        
        
//Pregunta 7-------------------------
        if(q==7){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/ban_7.png")));
            op1.setText("Safe Locck Box"); //Correcto
            op2.setText("Saffe Lock Box");
            op3.setText("Safe Lock Box");
            ac3();
        }        
        
//Pregunta 8-------------------------
        if(q==8){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/ban_8.png")));
            op1.setText("Clocck");
            op2.setText("Clock"); //Correcto
            op3.setText("Cloc");
            ac2();
        }        
        
//Pregunta 9-------------------------
        if(q==9){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/ban_9.png")));
            op1.setText("Coin");//Correcto
            op2.setText("Coins");
            op3.setText("Cooins"); 
            ac2();
        }
        
//Pregunta 10-------------------------
        if(q==10){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/ban_10.png")));
            op1.setText("Carpet"); 
            op2.setText("Carrpet");
            op3.setText("Carpett"); //Correcto
            ac1();      
    }
}
    
//ROPA   
    
    public void imagen_ropa(){
       
        //Pregunta 1-------------------------        
        if(q==1){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/rop_1.png")));
            op1.setText("Bloouse");
            op2.setText("Blouse");
            op3.setText("Blousse"); //car
            ac2();
        }
        
//Pregunta 2-------------------------
        if(q==2){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/rop_2.png")));
            op1.setText("Topp"); //Corecta
            op2.setText("Top");
            op3.setText("Toop");
            ac2();
        }
            
//Pregunta 3-------------------------
        if(q==3){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/rop_3.png")));
            op1.setText("Dress"); 
            op2.setText("Dres");  //correcta
            op3.setText("Drees");
            ac1();              
        }
        
        
//Pregunta 4-------------------------
        if(q==4){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/rop_4.png")));
            op1.setText("Socks"); //Correcto
            op2.setText("Socs");
            op3.setText("Sock");
            ac1();
        }

//Pregunta 5-------------------------
        if(q==5){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/rop_5.png")));
            op1.setText("Hells"); //Correcto
            op2.setText("Hels");
            op3.setText("Heels");
            ac3();
        }
        
//Pregunta 6-------------------------
        if(q==6){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/rop_6.png")));
            op1.setText("Belt"); 
            op2.setText("Velt");
            op3.setText("Veltt"); //Correcto
            ac1();
        }        
        
//Pregunta 7-------------------------
        if(q==7){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/rop_7.png")));
            op1.setText("Capp"); //Correcto
            op2.setText("Cap");
            op3.setText("Kap");
            ac2();
        }        
        
//Pregunta 8-------------------------
        if(q==8){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/rop_8.png")));
            op1.setText("Shirtt");
            op2.setText("Shirt"); //Correcto
            op3.setText("Chirt");
            ac2();
        }        
        
//Pregunta 9-------------------------
        if(q==9){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/rop_9.png")));
            op1.setText("T-Shirt");//Correcto
            op2.setText("T-Shirrt");
            op3.setText("T-Shirtt"); 
            ac1();
        }
        
//Pregunta 10-------------------------
        if(q==10){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/rop_10.png")));
            op1.setText("Sut"); 
            op2.setText("Suitt");
            op3.setText("Suit"); //Correcto
            ac3();      
    }
}    

//ELECTRÃ“NICOS
    
    public void imagen_electronicos(){
       
        //Pregunta 1-------------------------        
        if(q==1){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/tec_1.png")));
            op1.setText("Iroon");
            op2.setText("Iron");
            op3.setText("Airon"); //car
            ac2();
        }
        
//Pregunta 2-------------------------
        if(q==2){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/tec_2.png")));
            op1.setText("Televicion"); //Corecta
            op2.setText("Television");
            op3.setText("Telebicion");
            ac2();
        }
            
//Pregunta 3-------------------------
        if(q==3){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/tec_3.png")));
            op1.setText("Laptop"); 
            op2.setText("Laptopp");  //correcta
            op3.setText("Laptoop");
            ac1();              
        }
        
        
//Pregunta 4-------------------------
        if(q==4){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/tec_4.png")));
            op1.setText("Multifunctional"); //Correcto
            op2.setText("Multifuntional");
            op3.setText("Multifuncional");
            ac1();
        }

//Pregunta 5-------------------------
        if(q==5){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/tec_5.png")));
            op1.setText("Celphone"); //Correcto
            op2.setText("Cellphon");
            op3.setText("Cellphone");
            ac3();
        }
        
//Pregunta 6-------------------------
        if(q==6){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/tec_6.png")));
            op1.setText("Tablet"); 
            op2.setText("Tavlet");
            op3.setText("Tablett"); //Correcto
            ac1();
        }        
        
//Pregunta 7-------------------------
        if(q==7){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/tec_7.png")));
            op1.setText("Bacum"); //Correcto
            op2.setText("Vacumm");
            op3.setText("Bacuum");
            ac2();
        }        
        
//Pregunta 8-------------------------
        if(q==8){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/tec_8.png")));
            op1.setText("Fann");
            op2.setText("Fan"); //Correcto
            op3.setText("Faan");
            ac2();
        }        
        
//Pregunta 9-------------------------
        if(q==9){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/tec_9.png")));
            op1.setText("Headphones");//Correcto
            op2.setText("Headphoness");
            op3.setText("Headpohnes"); 
            ac1();
        }
        
//Pregunta 10-------------------------
        if(q==10){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/tec_10.png")));
            op1.setText("Fridgge"); 
            op2.setText("Fridg");
            op3.setText("Fridge"); //Correcto
            ac3();      
    }
}  

//COMIDAFAST
    
   public void imagen_comidafast(){
       
        //Pregunta 1-------------------------        
        if(q==1){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/cr_1.png")));
            op1.setText("Frid Chicken");
            op2.setText("Fried Chicken");
            op3.setText("Frid Chiken"); //car
            ac2();
        }
        
//Pregunta 2-------------------------
        if(q==2){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/cr_2.png")));
            op1.setText("French Fris"); //Corecta
            op2.setText("French Fries");
            op3.setText("French Friez");
            ac2();
        }
            
//Pregunta 3-------------------------
        if(q==3){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/cr_3.png")));
            op1.setText("Milkshake"); 
            op2.setText("Milksake");  //correcta
            op3.setText("Milksheik");
            ac1();              
        }
        
        
//Pregunta 4-------------------------
        if(q==4){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/cr_4.png")));
            op1.setText("Plate"); //Correcto
            op2.setText("Platte");
            op3.setText("Platee");
            ac1();
        }

//Pregunta 5-------------------------
        if(q==5){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/cr_5.png")));
            op1.setText("Vags"); //Correcto
            op2.setText("Baggs");
            op3.setText("Bags");
            ac3();
        }
        
//Pregunta 6-------------------------
        if(q==6){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/cr_6.png")));
            op1.setText("Beverage"); 
            op2.setText("Veberage");
            op3.setText("Veberagge"); //Correcto
            ac1();
        }        
        
//Pregunta 7-------------------------
        if(q==7){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/cr_7.png")));
            op1.setText("Capp"); //Correcto
            op2.setText("Cap");
            op3.setText("Caap");
            ac2();
        } 
        
//Pregunta 8-------------------------
        if(q==8){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/cr_8.png")));
            op1.setText("Vowwel");
            op2.setText("Bowl"); //Correcto
            op3.setText("Vowl");
            ac2();
        }        
        
//Pregunta 9-------------------------
        if(q==9){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/cr_9.png")));
            op1.setText("Dessert");//Correcto
            op2.setText("Desert");
            op3.setText("Dissert"); 
            ac1();
        }
        
//Pregunta 10-------------------------
        if(q==10){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/cr_10.png")));
            op1.setText("Skiwerrs"); 
            op2.setText("Skiwers");
            op3.setText("Skewers"); //Correcto
            ac3();      
    }
}   
    
//RESTAURANTE
    
   public void imagen_restaurante(){
       
        //Pregunta 1-------------------------        
        if(q==1){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/res_1.png")));
            op1.setText("Rasted Chicken");
            op2.setText("Roasted Chicken");
            op3.setText("Rosted Chiken"); //car
            ac2();
        }
        
//Pregunta 2-------------------------
        if(q==2){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/res_2.png")));
            op1.setText("Saladd"); //Corecta
            op2.setText("Salad");
            op3.setText("Sallad");
            ac2();
        }
            
//Pregunta 3-------------------------
        if(q==3){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/res_3.png")));
            op1.setText("Bottle of Wine"); 
            op2.setText("Bottle of Winne");  //correcta
            op3.setText("Vottle of Wine");
            ac1();              
        }
        
        
//Pregunta 4-------------------------
        if(q==4){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/res_4.png")));
            op1.setText("Cup of Wine"); //Correcto
            op2.setText("Cap of Wine");
            op3.setText("Cupp of Wine");
            ac1();
        }

//Pregunta 5-------------------------
        if(q==5){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/res_5.png")));
            op1.setText("Dich"); //Correcto
            op2.setText("Dish");
            op3.setText("Dissh");
            ac2();
        }
        
//Pregunta 6-------------------------
        if(q==6){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/res_6.png")));
            op1.setText("Flower Pot"); 
            op2.setText("Flower Pott");
            op3.setText("Flower Poot"); //Correcto
            ac1();
        }        
        
//Pregunta 7-------------------------
        if(q==7){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/res_7.png")));
            op1.setText("Channdelier"); //Correcto
            op2.setText("Chandelier");
            op3.setText("Chandellier");
            ac2();
        } 
        
//Pregunta 8-------------------------
        if(q==8){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/res_8.png")));
            op1.setText("Tavlee");
            op2.setText("Table"); //Correcto
            op3.setText("Tavle");
            ac2();
        }        
        
//Pregunta 9-------------------------
        if(q==9){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/res_9.png")));
            op1.setText("Waiter");//Correcto
            op2.setText("Waitter");
            op3.setText("Waiterr"); 
            ac1();
        }
        
//Pregunta 10-------------------------
        if(q==10){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/res_10.png")));
            op1.setText("Tablecot"); 
            op2.setText("Tavlecoth");
            op3.setText("Tablecoth"); //Correcto
            ac3();      
    }
}   
   
//VIDEOJUEGOS   

    public void imagen_videojuegos(){
       
        //Pregunta 1-------------------------        
        if(q==1){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/vid_1.png")));
            op1.setText("Fire Alaarm");
            op2.setText("Fire Alarm");
            op3.setText("Fir Alarm"); //car
            ac2();
        }
        
//Pregunta 2-------------------------
        if(q==2){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/vid_2.png")));
            op1.setText("Add"); //Corecta
            op2.setText("Ad");
            op3.setText("Adds");
            ac2();
        }
            
//Pregunta 3-------------------------
        if(q==3){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/vid_3.png")));
            op1.setText("Security Cam"); 
            op2.setText("Securiti Cam");  //correcta
            op3.setText("Security Camm");
            ac1();              
        }
        
        
//Pregunta 4-------------------------
        if(q==4){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/vid_4.png")));
            op1.setText("Teddy Bear"); //Correcto
            op2.setText("Tedy Bear");
            op3.setText("Teddy Ber");
            ac1();
        }

//Pregunta 5-------------------------
        if(q==5){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/vid_5.png")));
            op1.setText("Comick"); //Correcto
            op2.setText("Comik");
            op3.setText("Comic");
            ac3();
        }
        
//Pregunta 6-------------------------
        if(q==6){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/vid_6.png")));
            op1.setText("Wallet"); 
            op2.setText("Whale");
            op3.setText("While"); //Correcto
            ac1();
        }        
        
//Pregunta 7-------------------------
        if(q==7){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/vid_7.png")));
            op1.setText("Capp"); //Correcto
            op2.setText("Cap");
            op3.setText("Caap");
            ac2();
        }        
        
//Pregunta 8-------------------------
        if(q==8){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/vid_8.png")));
            op1.setText("Vidgame");
            op2.setText("Videogame"); //Correcto
            op3.setText("Gamevideo");
            ac2();
        }        
        
//Pregunta 9-------------------------
        if(q==9){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/vid_9.png")));
            op1.setText("Console");//Correcto
            op2.setText("Coonsol");
            op3.setText("Consol"); 
            ac1();
        }
        
//Pregunta 10-------------------------
        if(q==10){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fran/vid_10.png")));
            op1.setText("Gift Kard"); 
            op2.setText("Gif Card");
            op3.setText("Gift Card"); //Correcto
            ac3();      
    }
}     
   
//FRANSITO FRANSITO FRANSITO FRANSITO FRANSITO FRANSITO FRANSITO FRANSITO FRANSITO FRANSITO FRANSITO FRANSITO FRANSITO FRANSITO  

//Rebeca //Rebeca //Rebeca //Rebeca  //Rebeca //Rebeca //Rebeca //Rebeca //Rebeca //Rebeca //Rebeca //Rebeca //Rebeca 
    
public void imagen_joyeria(){
        //Pregunta 1-------------------------        
        if(q==1){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/CASH REGISTRER.png")));
            op1.setText("Cash registrer"); //corr
            op2.setText("Cashes registret");
            op3.setText("Cash ");
            ac1();
        }
        //Pregunta 2-------------------------
        if(q==2){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/BAG.png")));
            op1.setText("Bag"); //corr
            op2.setText("Bog");
            op3.setText("Beg");
            ac1();
        }
        //Pregunta 3-------------------------
        if(q==3){       
             preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/BOX.png")));
            op1.setText("Boch"); 
            op2.setText("Box");//corr
            op3.setText("Bocc");
            ac2();
        }
        //Pregunta 4-------------------------
        if(q==4){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/MIRROR.png")));
            op1.setText("Marror"); 
            op2.setText("Merror");
            op3.setText("Mirror");//corr
            ac3();
        }
        //Pregunta 5-------------------------
        if(q==5){       
             preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/BRACELETE.png")));
            op1.setText("Bracet"); 
            op2.setText("Bacelete");
            op3.setText("Bracelet");//corr
            ac3();
        }
        //Pregunta 6-------------------------
        if(q==6){       
             preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/BROOCH.png")));
            op1.setText("Broch"); 
            op2.setText("Brooch");//corr
            op3.setText("Broche");
            ac2();
        }
        //Pregunta 7-------------------------
        if(q==7){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/RING.png")));
            op1.setText("Ring"); //corr
            op2.setText("Rang");
            op3.setText("Rinng");
            ac1();
        }
        //Pregunta 8-------------------------
        if(q==8){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/LINK.png")));
            op1.setText("Linkk"); 
            op2.setText("LLink");
            op3.setText("Link");//corr
            ac3();
        }
        //Pregunta 9-------------------------
        if(q==9){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/EARRINGS.png")));
            op1.setText("Earrings"); //corr
            op2.setText("Earrig");
            op3.setText("Earings");
            ac1();
        }
        //Pregunta 10-------------------------
        if(q==10){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/SALESWOMAN.png")));
            op1.setText("Slesswoman"); 
            op2.setText("Saleswoman");//corr
            op3.setText("Shaleswoman");
            ac2();
        }
   
    }
    
public void imagen_estacionamiento(){
        //Pregunta 1-------------------------
        if(q==1){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/TICKET.png")));
            op1.setText("Tickett"); 
            op2.setText("Tick");
            op3.setText("Ticket");//corr
            ac3();
        }
        //Pregunta 2-------------------------
        if(q==2){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/PICKET.png")));
            op1.setText("Picket"); //corr
            op2.setText("Pikcet");
            op3.setText("Piicket");
            ac1();
        }
        //Pregunta 3-------------------------
        if(q==3){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/LOKERPARK.png")));
            op1.setText("Lokcer park"); 
            op2.setText("Locker park");//corr
            op3.setText("Locker parks");
            ac2();
        }
        //Pregunta 4-------------------------
        if(q==4){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/PARKING PEN.png")));
            op1.setText("Parck pen"); 
            op2.setText("Park pen");
            op3.setText("Parking pen");//corr
            ac3();
        }
        //Pregunta 5-------------------------
        if(q==5){       
             preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/CAMARA.png")));
            op1.setText("Securyti cam"); 
            op2.setText("Securiti cam");
            op3.setText("Security cam");//corr
            ac3();
        }
        //Pregunta 6-------------------------
        if(q==6){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/OFICIAL.png")));
            op1.setText("Oficial"); 
            op2.setText("Official");//corr
            op3.setText("Oficiial");
            ac2();
        }
        //Pregunta 7-------------------------
        if(q==7){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/SKULLS.png")));
            op1.setText("Skulls"); //corr
            op2.setText("Skull");
            op3.setText("Skuuls");
            ac1();
        }
        //Pregunta 8-------------------------
        if(q==8){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/SIGNALBOOT.png")));
            op1.setText("Signall bot"); 
            op2.setText("Signall boot");
            op3.setText("Signal boot");//corr
            ac3();
        }
        //Pregunta 9-------------------------
        if(q==9){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/CAR.png")));
            op1.setText("Car"); //corr
            op2.setText("Carr");
            op3.setText("Caar");
            ac1();
        }
        //Pregunta 10-------------------------
        if(q==10){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/SPEENDOMETER.png")));
            op1.setText("Speendometer"); 
            op2.setText("Spendometer");//corr
            op3.setText("Spendoometer");
            ac2();
        }
    }
  
public void imagen_bebe(){
        
        //Pregunta 1-------------------------
        if(q==1){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/TOYS.png")));
            op1.setText("Tooys"); 
            op2.setText("Tuys");
            op3.setText("Toys");//corr
            ac3();
        }
        //Pregunta 2-------------------------
        if(q==2){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/T-SHIRT.png")));
            op1.setText("T-shirt"); //corr
            op2.setText("T-shirtt");
            op3.setText("T-shert");
            ac1();
        }
        //Pregunta 3-------------------------
        if(q==3){       
           preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/DRESS.png")));
            op1.setText("Drees"); 
            op2.setText("Dress");//corr
            op3.setText("Dreser");
            ac2();
        }
        //Pregunta 4-------------------------
        if(q==4){       
           preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/ARMCHAIR.png")));
            op1.setText("Armenchair"); 
            op2.setText("Armechair");
            op3.setText("Armchair");//corr
            ac3();
        }
        //Pregunta 5-------------------------
        if(q==5){       
           preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/FURNITURE.png")));
            op1.setText("Farniture"); 
            op2.setText("Furnitur");
            op3.setText("Furniture");//corr
            ac3();
        }
        //Pregunta 6-------------------------
        if(q==6){       
           preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/PACIFIER.png")));
            op1.setText("Pacifear"); 
            op2.setText("Pacifier");//corr
            op3.setText("Pacifir");
            ac2();
        }
        //Pregunta 7-------------------------
        if(q==7){       
           preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/WOODY HOURSE.png")));
            op1.setText("Woody hourse"); //corr
            op2.setText("Wudy hourse");
            op3.setText("Wudy horse");
            ac1();
        }
        //Pregunta 8-------------------------
        if(q==8){       
           preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/MILK POWDER.png")));
            op1.setText("Milk powde"); 
            op2.setText("Milk pouder");
            op3.setText("Milk powder");//corr
            ac3();
        }
        //Pregunta 9-------------------------
        if(q==9){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/DEAPERS.png")));
            op1.setText("Diaper"); //corr
            op2.setText("Deper");
            op3.setText("Daper");
            ac1();
        }
        //Pregunta 10-------------------------
        if(q==10){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/jumpers.png")));
            op1.setText("Jumpe"); 
            op2.setText("Jumpers");//corr
            op3.setText("Jumpes");
            ac2();
        }
           
        
        
    }
        
public void imagen_optica(){
        
        //Pregunta 1-------------------------
        if(q==1){       
           preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/GLASSES.png")));
            op1.setText("Glasess"); 
            op2.setText("Glass");
            op3.setText("Glasses");//corr
            ac3();
        }
        //Pregunta 2-------------------------
        if(q==2){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/EYE.png")));
            op1.setText("Eye"); //corr
            op2.setText("Eyess");
            op3.setText("Eys");
            ac1();
        }
        //Pregunta 3-------------------------
        if(q==3){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/LAMP.png")));
            op1.setText("Limp"); 
            op2.setText("Lamp");//corr
            op3.setText("Lampe");
            ac2();
        }
        //Pregunta 4-------------------------
        if(q==4){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/PATIENT.png")));
            op1.setText("Pacient"); 
            op2.setText("Pathiente");
            op3.setText("Patient");//corr
            ac3();
        }
        //Pregunta 5-------------------------
        if(q==5){       
           preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/DESK.png")));
            op1.setText("Dosk"); 
            op2.setText("Dask");
            op3.setText("Desk");//corr
            ac3();
        }
        //Pregunta 6-------------------------
        if(q==6){       
           preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/SCREW.png")));
            op1.setText("Scraw"); 
            op2.setText("Screw");//corr
            op3.setText("Srew");
            ac2();
        }
        //Pregunta 7-------------------------
        if(q==7){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/OPTOMETRIC CHAR.png")));
            op1.setText("Optometric char"); //corr
            op2.setText("Opthometric char");
            op3.setText("Optometric table");
            ac1();
        }
        //Pregunta 8-------------------------
        if(q==8){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/NURSE.png")));
            op1.setText("Nuse"); 
            op2.setText("Norse");
            op3.setText("Nurse");//corr
            ac3();
        }
        //Pregunta 9-------------------------
        if(q==9){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/OPTI..png")));
            op1.setText("Ophthalmologist"); //corr
            op2.setText("Opttalmologisth");
            op3.setText("Optalmologist");
            ac1();
        }
        //Pregunta 10-------------------------
        if(q==10){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/COMPUTER.png")));
            op1.setText("Camputer"); 
            op2.setText("Computer");//corr
            op3.setText("Computehtor");
            ac2();
        }
           
        
        
    }
    
public void imagen_belleza(){
        
        //Pregunta 1-------------------------
        if(q==1){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/SHELF.png")));
            op1.setText("Shel");
            op2.setText("Sheelf");
            op3.setText("Shelf"); //corr
            ac1();
        }
        //Pregunta 2-------------------------
        if(q==2){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/BRUSH.png")));
            op1.setText("Brush"); //corr
            op2.setText("Brosh");
            op3.setText("Bruch");
            ac1();
        }
        //Pregunta 3-------------------------
        if(q==3){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/CHAIR.png")));
            op1.setText("Char"); 
            op2.setText("Chair");//corr
            op3.setText("Cheir");
            ac2();
        }
        //Pregunta 4-------------------------
        if(q==4){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/FLOWERS.png")));
            op1.setText("Flowerser"); 
            op2.setText("Flawers");
            op3.setText("Flowers");//corr
            ac3();
        }
        //Pregunta 5-------------------------
        if(q==5){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/HAIR DRYER.png")));
            op1.setText("Hair drir"); 
            op2.setText("Hair drier");
            op3.setText("Hair dryer");//corr
            ac3();
        }
        //Pregunta 6-------------------------
        if(q==6){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/HAIR IRON.png")));
            op1.setText("Hair irun"); 
            op2.setText("Hair iron");//corr
            op3.setText("Hair irn");
            ac2();
        }
        //Pregunta 7-------------------------
        if(q==7){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/MIRROR.png")));
            op1.setText("Mirror"); //corr
            op2.setText("Miror");
            op3.setText("Morrir");
            ac1();
        }
        //Pregunta 8-------------------------
        if(q==8){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/SHAMPOO.png")));
            op1.setText("Shaampo"); 
            op2.setText("Shampo");
            op3.setText("Shampoo");//corr
            ac3();
        }
        //Pregunta 9-------------------------
        if(q==9){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/SPRAY.png")));
            op1.setText("Spray"); //corr
            op2.setText("Sprey");
            op3.setText("Spresy");
            ac1();
        }
        //Pregunta 10-------------------------
        if(q==10){       
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Rebe/TOILET PAPER.png")));
            op1.setText("Toiltett paper"); 
            op2.setText("Toilte paper");//corr
            op3.setText("Toil paper");
            ac2();
        }
           
        
        
    }
    

//Rebeca //Rebeca //Rebeca //Rebeca  //Rebeca //Rebeca //Rebeca //Rebeca //Rebeca //Rebeca //Rebeca //Rebeca //Rebeca 

 // leo
public void i_casino(){
       
        //Pregunta 1-------------------------        
        if(q==1){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/1.png")));
            op1.setText("token");//Corecta
            op2.setText("toquen");
            op3.setText("touken"); 
            ac1();
        }
        
//Pregunta 2-------------------------
        if(q==2){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/2.png")));
            op1.setText("cart"); 
            op2.setText("card");//Corecta
            op3.setText("car");
            ac2();
        }
            
//Pregunta 3-------------------------
        if(q==3){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/3.png")));
            op1.setText("poker table");//Corecta 
            op2.setText("pokerr table");  
            op3.setText("poker teibol");
            ac1();              
        }
        
        
//Pregunta 4-------------------------
        if(q==4){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/4.png")));
            op1.setText("slott machine"); 
            op2.setText("slot machin");
            op3.setText("slot machine");//Corecta
            ac3();
        }

//Pregunta 5-------------------------
        if(q==5){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/5.png")));
            op1.setText("lever");//Corecta 
            op2.setText("leber");
            op3.setText("leverr");
            ac1();
        }
        
//Pregunta 6-------------------------
        if(q==6){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/6.png")));
            op1.setText("shandelier"); 
            op2.setText("chandelier");//Corecta
            op3.setText("chandellier"); 
            ac1();
        }        
        
//Pregunta 7-------------------------
        if(q==7){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/7.png")));
            op1.setText("capp"); 
            op2.setText("Cap");//Corecta
            op3.setText("caap");
            ac2();
        }        
        
//Pregunta 8-------------------------
        if(q==8){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/8.png")));
            op1.setText("roulette");//Corecta
            op2.setText("roulete"); 
            op3.setText("rulete");
            ac1();
        }        
        
//Pregunta 9-------------------------
        if(q==9){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/9.png")));
            op1.setText("chair");//Corecta
            op2.setText("char");
            op3.setText("cheir"); 
            ac1();
        }
        
//Pregunta 10-------------------------
        if(q==10){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/10.png")));
            op1.setText("clock"); //Corecta
            op2.setText("cloc");
            op3.setText("clok"); 
            ac3();      
    }
}
public void i_libreria(){
       
        //Pregunta 1-------------------------        
        if(q==1){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/11.png")));
            op1.setText("air machine");///Corecta
            op2.setText("air machin");
            op3.setText("eir machine"); 
            ac1();
        }
        
//Pregunta 2-------------------------
        if(q==2){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/12.png")));
            op1.setText("book case"); 
            op2.setText("booc case");//Corecta
            op3.setText("bok case");
            ac2();
        }
            
//Pregunta 3-------------------------
        if(q==3){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/13.png")));
            op1.setText("books");//Corecta 
            op2.setText("boks");  
            op3.setText("vooks");
            ac1();              
        }
        
        
//Pregunta 4-------------------------
        if(q==4){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/14.png")));
            op1.setText("ofer"); 
            op2.setText("hoffer");
            op3.setText("offer");//Corecta
            ac3();
        }

//Pregunta 5-------------------------
        if(q==5){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/15.png")));
            op1.setText("credit card");//Corecta 
            op2.setText("credit car");
            op3.setText("creditt card");
            ac1();
        }
        
//Pregunta 6-------------------------
        if(q==6){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/16.png")));
            op1.setText("monytor"); 
            op2.setText("monitor");//Corecta
            op3.setText("monittor"); 
            ac1();
        }        
        
//Pregunta 7-------------------------
        if(q==7){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/17.png")));
            op1.setText("cach register"); 
            op2.setText("cash register");//Corecta
            op3.setText("cash registe");
            ac2();
        }        
        
//Pregunta 8-------------------------
        if(q==8){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/18.png")));
            op1.setText("ticket printer");//Corecta
            op2.setText("tiket printer"); 
            op3.setText("ticket print");
            ac1();
        }        
        
//Pregunta 9-------------------------
        if(q==9){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/19.png")));
            op1.setText("counter");//Corecta
            op2.setText("conter");
            op3.setText("countter"); 
            ac1();
        }
        
//Pregunta 10-------------------------
        if(q==10){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/20.png")));
            op1.setText("certification"); //Corecta
            op2.setText("certificaition");
            op3.setText("certificattion"); 
            ac3();      
    }
}
public void i_telefoinia(){
       
        //Pregunta 1-------------------------        
        if(q==1){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/21.png")));
            op1.setText("brand");///Corecta
            op2.setText("bran");
            op3.setText("vrand"); 
            ac1();
        }
        
//Pregunta 2-------------------------
        if(q==2){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/22.png")));
            op1.setText("cel phone"); 
            op2.setText("cell phone");//Corecta
            op3.setText("cell phon");
            ac2();
        }
            
//Pregunta 3-------------------------
        if(q==3){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/23.png")));
            op1.setText("mica");//Corecta 
            op2.setText("mika");  
            op3.setText("micka");
            ac1();              
        }
        
        
//Pregunta 4-------------------------
        if(q==4){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/24.png")));
            op1.setText("cell phon case"); 
            op2.setText("cel phone case");
            op3.setText("cell phone case");//Corecta
            ac3();
        }

//Pregunta 5-------------------------
        if(q==5){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/25.png")));
            op1.setText("tablet");//Corecta 
            op2.setText("tavlet");
            op3.setText("tablett");
            ac1();
        }
        
//Pregunta 6-------------------------
        if(q==6){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/26.png")));
            op1.setText("tavlet case"); 
            op2.setText("tablet case");//Corecta
            op3.setText("tablet cais"); 
            ac1();
        }        
        
//Pregunta 7-------------------------
        if(q==7){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/27.png")));
            op1.setText("cell phon protektor"); 
            op2.setText("cell phone protector");//Corecta
            op3.setText("cel phone protector");
            ac2();
        }        
        
//Pregunta 8-------------------------
        if(q==8){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/28.png")));
            op1.setText("travel adapter");//Corecta
            op2.setText("trabel adaptter"); 
            op3.setText("travel adpterr");
            ac1();
        }        
        
//Pregunta 9-------------------------
        if(q==9){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/29.png")));
            op1.setText("car adapter");//Corecta
            op2.setText("car adapterr");
            op3.setText("kar adaptter"); 
            ac1();
        }
        
//Pregunta 10-------------------------
        if(q==10){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/30.png")));
            op1.setText("micro sd"); //Corecta
            op2.setText("mikro sd");
            op3.setText("mickro sd"); 
            ac3();      
    }
}
public void i_dulceria(){
       
        //Pregunta 1-------------------------        
        if(q==1){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/31.png")));
            op1.setText("lolli pops");///Corecta
            op2.setText("loli pops");
            op3.setText("lolly pops"); 
            ac1();
        }
        
//Pregunta 2-------------------------
        if(q==2){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/32.png")));
            op1.setText("bobble gum"); 
            op2.setText("bubble gum");//Corecta
            op3.setText("buble gum");
            ac2();
        }
            
//Pregunta 3-------------------------
        if(q==3){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/33.png")));
            op1.setText("gummies");//Corecta 
            op2.setText("gummis");  
            op3.setText("gommies");
            ac1();              
        }
        
        
//Pregunta 4-------------------------
        if(q==4){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/34.png")));
            op1.setText("jely"); 
            op2.setText("jelli");
            op3.setText("jelly");//Corecta
            ac3();
        }

//Pregunta 5-------------------------
        if(q==5){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/35.png")));
            op1.setText("chocolate");//Corecta 
            op2.setText("chocoleit");
            op3.setText("shocolate");
            ac1();
        }
        
//Pregunta 6-------------------------
        if(q==6){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/36.png")));
            op1.setText("cokies"); 
            op2.setText("cookies");//Corecta
            op3.setText("cookes"); 
            ac1();
        }        
        
//Pregunta 7-------------------------
        if(q==7){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/37.png")));
            op1.setText("chewing gom machine"); 
            op2.setText("chewing gum machine");//Corecta
            op3.setText("chewing gum machin");
            ac2();
        }        
        
//Pregunta 8-------------------------
        if(q==8){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/38.png")));
            op1.setText("marzipan");//Corecta
            op2.setText("marcipan"); 
            op3.setText("marsipan");
            ac1();
        }        
        
//Pregunta 9-------------------------
        if(q==9){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/39.png")));
            op1.setText("pills");//Corecta
            op2.setText("pils");
            op3.setText("pells"); 
            ac1();
        }
        
//Pregunta 10-------------------------
        if(q==10){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/40.png")));
            op1.setText("sign"); //Corecta
            op2.setText("sing");
            op3.setText("siign"); 
            ac3();      
    }
}
public void i_bano(){
       
        //Pregunta 1-------------------------        
        if(q==1){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/41.png")));
            op1.setText("mirror");///Corecta
            op2.setText("miror");
            op3.setText("mirorr"); 
            ac1();
        }
        
//Pregunta 2-------------------------
        if(q==2){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/42.png")));
            op1.setText("toilet papper"); 
            op2.setText("toilet paper");//Corecta
            op3.setText("toillet paper");
            ac2();
        }
            
//Pregunta 3-------------------------
        if(q==3){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/43.png")));
            op1.setText("washbasin");//Corecta 
            op2.setText("washvasin");  
            op3.setText("washbacin");
            ac1();              
        }
        
        
//Pregunta 4-------------------------
        if(q==4){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/44.png")));
            op1.setText("cubycle"); 
            op2.setText("cuvicle");
            op3.setText("cubicle");//Corecta
            ac3();
        }

//Pregunta 5-------------------------
        if(q==5){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/45.png")));
            op1.setText("top");//Corecta 
            op2.setText("ttop");
            op3.setText("toop");
            ac1();
        }
        
//Pregunta 6-------------------------
        if(q==6){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/46.png")));
            op1.setText("toile"); 
            op2.setText("toilet");//Corecta
            op3.setText("toillet"); 
            ac1();
        }        
        
//Pregunta 7-------------------------
        if(q==7){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/47.png")));
            op1.setText("plunjer"); 
            op2.setText("plunger");//Corecta
            op3.setText("plonger");
            ac2();
        }        
        
//Pregunta 8-------------------------
        if(q==8){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/48.png")));
            op1.setText("drain");//Corecta
            op2.setText("drein"); 
            op3.setText("drayn");
            ac1();
        }        
        
//Pregunta 9-------------------------
        if(q==9){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/49.png")));
            op1.setText("handle");//Corecta
            op2.setText("jandle");
            op3.setText("handlle"); 
            ac1();
        }
        
//Pregunta 10-------------------------
        if(q==10){
            preg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/leo/50.png")));
            op1.setText("tube"); //Corecta
            op2.setText("tuve");
            op3.setText("tubbe"); 
            ac3();      
    }
}
//Aqui se escoejen las preguntas segun lo que se eligio en el modulo anterior;    
    
    public void pregunta_selec(){
        switch (eje2) {

            //Rebeca
            case 0:
                imagen_bebe();    break;
            
            case 1:
                imagen_banco();    break;
            //Rebeca
            case 2:
                imagen_belleza();          break;    
            
            case 3:
                i_libreria();    break;
                            
            case 4:
                imagen_cafeteria();    break;

            case 5:
                i_dulceria();    break;
                
            case 6:
                i_casino();    break;
                
            case 7:
                imagen_cine();         break;    
            
            case 8:
                imagen_ropa();         break;    
                
            case 9:
                imagen_computo();  break;    
            
            case 10:
                imagen_electronicos();  break;    
                
            case 11:
                imagen_comidafast();  break;    
            //Rebeca
            case 12:
                imagen_joyeria();          break;
            //Rebeca
            case 13:
                imagen_optica();           break;
            //Rebeca
            case 14:
                imagen_estacionamiento();  break;
                
            case 15:
                imagen_mascotas();  break;    
            
            case 16:
                imagen_restaurante();  break;    
                
            case 17:
                imagen_deportes();  break;    

            case 19:
                imagen_juguetes(); break;  
                
            case 20:
                imagen_videojuegos(); break;
            
            case 21:
                i_bano(); break;    
                
            default: JOptionPane.showMessageDialog(null,"No se encontraron las preguntas;"); break;
        }
        
/*        
        switch (eje2) {
                
            case 4:
            imagen_cafeteria();    break;
                
                
                
                
            default: JOptionPane.showMessageDialog(null,"No se encontraron las preguntas con imagen;"); break;
        }
*/
        
    }
    
/*        Estos son los numeros para el "swich"
0  Baby Shop  -----
1  Bank  -----
2  Beauty   ----
3  Book Shop
4  Cafetery -----
5  Candy Shop
6  Casino
7  Cinema  -----
8  Clothes Store   -.----
9  Computer Store  ------
10 Electronic  -----
11 Fast Food ----
12 Jewrly ----
13 Optic ----
14 Parking lot  ---
15 Pets -----
16 Restaurant
17 Sports -----
18 Telephone
19 Toy Shop  -----
20 Videogame Shop ----
21 WC
*/   
    
    /**
     * @param args the command line arguments
     */
public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new I_Cuestionario().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bot_in;
    private javax.swing.JButton bMinimizar;
    private javax.swing.JButton bSalir;
    private javax.swing.JButton bot1;
    private javax.swing.JLabel cor1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lBarra;
    private javax.swing.JCheckBox op1;
    private javax.swing.JCheckBox op2;
    private javax.swing.JCheckBox op3;
    private javax.swing.ButtonGroup op_Cafeteria;
    private javax.swing.JLabel preg;
    private javax.swing.JLabel score_a;
    private javax.swing.JLabel score_e;
    // End of variables declaration//GEN-END:variables
}
