/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg6_brauliocalix;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author User
 */
public class Necfilcs extends javax.swing.JFrame {

    /**
     * Creates new form Necfilcs
     */
    public Necfilcs() {
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

        menu1 = new javax.swing.JDialog();
        creapeli = new javax.swing.JButton();
        creaserie = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_nec = new javax.swing.JTree();
        agregar = new javax.swing.JButton();
        creacionpeli = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        nombrepeli = new javax.swing.JTextField();
        pelidura = new javax.swing.JTextField();
        actorpeli = new javax.swing.JTextField();
        directorpeli = new javax.swing.JTextField();
        companiapeli = new javax.swing.JTextField();
        cbtipo = new javax.swing.JComboBox<>();
        creapelis = new javax.swing.JButton();
        doblajepeli = new javax.swing.JComboBox<>();
        subspeli = new javax.swing.JComboBox<>();
        idiomapeli = new javax.swing.JTextField();
        creacionserie = new javax.swing.JDialog();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        nomserie = new javax.swing.JTextField();
        seriedura = new javax.swing.JTextField();
        cb_serie = new javax.swing.JComboBox<>();
        actorserie = new javax.swing.JTextField();
        canttemp = new javax.swing.JTextField();
        productoraserie = new javax.swing.JTextField();
        idiomaori = new javax.swing.JTextField();
        crear_serie = new javax.swing.JButton();
        cb_doblaje = new javax.swing.JComboBox<>();
        cb_subs = new javax.swing.JComboBox<>();
        login = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombrelog = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();

        creapeli.setText("crear pelicula");
        creapeli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                creapeliMouseClicked(evt);
            }
        });

        creaserie.setText("crear serie");
        creaserie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                creaserieMouseClicked(evt);
            }
        });

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("necflis");
        jt_nec.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(jt_nec);

        agregar.setText("agregar al arbol");
        agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout menu1Layout = new javax.swing.GroupLayout(menu1.getContentPane());
        menu1.getContentPane().setLayout(menu1Layout);
        menu1Layout.setHorizontalGroup(
            menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(agregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(creaserie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(creapeli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(95, 95, 95)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );
        menu1Layout.setVerticalGroup(
            menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(menu1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(creapeli)
                .addGap(84, 84, 84)
                .addComponent(creaserie)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(agregar)
                .addGap(39, 39, 39))
        );

        jLabel3.setText("nombre");

        jLabel4.setText("tiempo de duracion");

        jLabel5.setText("categoria");

        jLabel6.setText("actor principal");

        jLabel7.setText("director");

        jLabel8.setText("idioma de origen");

        jLabel9.setText("compania");

        jLabel10.setText("subtitulos");

        jLabel11.setText("doblaje");

        cbtipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "suspenso", "terror", "accion", "romantica", "ciancia ficcion", "animacion", "fantasia", " " }));

        creapelis.setText("crear pelicula");
        creapelis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                creapelisMouseClicked(evt);
            }
        });

        doblajepeli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "si", "no" }));

        subspeli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "si", "no" }));

        javax.swing.GroupLayout creacionpeliLayout = new javax.swing.GroupLayout(creacionpeli.getContentPane());
        creacionpeli.getContentPane().setLayout(creacionpeliLayout);
        creacionpeliLayout.setHorizontalGroup(
            creacionpeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(creacionpeliLayout.createSequentialGroup()
                .addGroup(creacionpeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(creacionpeliLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(creacionpeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(creacionpeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(creacionpeliLayout.createSequentialGroup()
                                    .addGroup(creacionpeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel6))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(creacionpeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(actorpeli, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(directorpeli, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(creacionpeliLayout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(172, 172, 172)
                                    .addComponent(nombrepeli, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(creacionpeliLayout.createSequentialGroup()
                                    .addGroup(creacionpeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(creacionpeliLayout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, creacionpeliLayout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addGap(163, 163, 163)))
                                    .addGroup(creacionpeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(pelidura, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                                        .addComponent(cbtipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(creacionpeliLayout.createSequentialGroup()
                                    .addGroup(creacionpeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(creacionpeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(creacionpeliLayout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, creacionpeliLayout.createSequentialGroup()
                                                .addComponent(jLabel11)
                                                .addGap(174, 174, 174)))
                                        .addGroup(creacionpeliLayout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addGap(120, 120, 120)))
                                    .addGroup(creacionpeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(companiapeli, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(creacionpeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(doblajepeli, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(subspeli, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(idiomapeli, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel10)))
                    .addGroup(creacionpeliLayout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(creapelis)))
                .addContainerGap(266, Short.MAX_VALUE))
        );
        creacionpeliLayout.setVerticalGroup(
            creacionpeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(creacionpeliLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(creacionpeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nombrepeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(creacionpeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(pelidura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(creacionpeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbtipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(creacionpeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(creacionpeliLayout.createSequentialGroup()
                        .addGroup(creacionpeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(actorpeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(47, 47, 47)
                        .addComponent(jLabel7))
                    .addComponent(directorpeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(creacionpeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(companiapeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(creacionpeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(idiomapeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(creacionpeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(doblajepeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(creacionpeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(subspeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(creapelis)
                .addGap(29, 29, 29))
        );

        jLabel12.setText("nombre");

        jLabel13.setText("duracion por capitulo");

        jLabel14.setText("categoria");

        jLabel15.setText("actor");

        jLabel16.setText("cantidad de temporadas");

        jLabel17.setText("productora");

        jLabel18.setText("idioma Original");

        jLabel19.setText("doblaje");

        jLabel20.setText("subtitulos");

        cb_serie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "novelas", "ciencia ficcion", "terror", "caricaturas", "naturaleza" }));

        crear_serie.setText("crear serie");
        crear_serie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crear_serieMouseClicked(evt);
            }
        });

        cb_doblaje.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "si", "no" }));

        cb_subs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "si", "no" }));

        javax.swing.GroupLayout creacionserieLayout = new javax.swing.GroupLayout(creacionserie.getContentPane());
        creacionserie.getContentPane().setLayout(creacionserieLayout);
        creacionserieLayout.setHorizontalGroup(
            creacionserieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(creacionserieLayout.createSequentialGroup()
                .addGroup(creacionserieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(creacionserieLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(creacionserieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(creacionserieLayout.createSequentialGroup()
                                .addGroup(creacionserieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel20))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(creacionserieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cb_doblaje, 0, 106, Short.MAX_VALUE)
                                    .addComponent(cb_subs, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(idiomaori, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, creacionserieLayout.createSequentialGroup()
                                .addGroup(creacionserieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addGroup(creacionserieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel17))
                                .addGap(76, 76, 76)
                                .addGroup(creacionserieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(productoraserie)
                                    .addComponent(cb_serie, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(seriedura)
                                    .addComponent(nomserie)
                                    .addComponent(actorserie)
                                    .addComponent(canttemp)))))
                    .addGroup(creacionserieLayout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(crear_serie)))
                .addContainerGap(247, Short.MAX_VALUE))
        );
        creacionserieLayout.setVerticalGroup(
            creacionserieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(creacionserieLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(creacionserieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(nomserie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(creacionserieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(seriedura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(creacionserieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(cb_serie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(creacionserieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(actorserie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(creacionserieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(canttemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(creacionserieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(productoraserie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(creacionserieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(idiomaori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(creacionserieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(cb_doblaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(creacionserieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(cb_subs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(crear_serie)
                .addGap(46, 46, 46))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        login.setText("log in");
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
        });

        jLabel1.setText("contrasena");

        jLabel2.setText("nombre");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                    .addComponent(nombrelog, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(login)))
                .addContainerGap(291, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(58, 58, 58)
                    .addComponent(jLabel2)
                    .addContainerGap(548, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(nombrelog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addComponent(login)
                .addGap(101, 101, 101))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(115, 115, 115)
                    .addComponent(jLabel2)
                    .addContainerGap(302, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
        Scanner lea = new Scanner(System.in);
        File archivo = new File("./Usuarios.txt");
        try {
            lea = new Scanner(archivo);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Necfilcs.class.getName()).log(Level.SEVERE, null, ex);
        }
        String Nombre = nombrelog.getText();
        String Contra = this.jPasswordField1.getText();
        boolean f = false;
        lea.useDelimiter(";");
        while (lea.hasNext()) {
            String t1, t2, t3;
            t1 = lea.next();
            t2 = lea.next();
            t3 = lea.next();

            if (t1.equals(Nombre) && t2.equals(Contra)) {
                f = true;
                break;
            }
        }
        if (f == true) {
            JOptionPane.showMessageDialog(this, "bienvenido " + Nombre);
        }
        nombrelog.setText("");
        jPasswordField1.setText("");
        menu1.setModal(true);
        menu1.pack();
        menu1.setVisible(true);
    }//GEN-LAST:event_loginMouseClicked

    private void creapeliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_creapeliMouseClicked
        creacionpeli.setModal(true);
        creacionpeli.pack();
        creacionpeli.setVisible(true);
    }//GEN-LAST:event_creapeliMouseClicked

    private void creaserieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_creaserieMouseClicked
        creacionserie.setModal(true);
        creacionserie.pack();
        creacionserie.setVisible(true);
    }//GEN-LAST:event_creaserieMouseClicked

    private void agregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarMouseClicked
        DefaultTreeModel modeloARBOL = (DefaultTreeModel) jt_nec.getModel();
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) modeloARBOL.getRoot();
        //obtenera la persona a guardar
        DefaultListModel modeloLISTA = (DefaultListModel) jt_nec.getModel();

        String nombre;
        String descrip;
        String funcion;
        //nombre = ((Peliculas) peli
        //descrip = ((Peliculas) modeloLISTA.get(jl_aseo.getSelectedIndex())).getDescrip();
        //funcion = ((Peliculas) modeloLISTA.get(jl_aseo.getSelectedIndex())).getFuncion();
        int centinela = -1;
        //que hace el for
        for (int i = 0; i < raiz.getChildCount(); i++) {
            // if (raiz.getChildAt(i).toString().equals(nombre)) {
            //      DefaultMutableTreeNode p = new DefaultMutableTreeNode(new Peliculas(nombre, descrip, funcion));
            // ((DefaultMutableTreeNode) raiz.getChildAt(i)).add(p);
            centinela = 1;
        }
        //}
        if (centinela == -1) {
            //DefaultMutableTreeNode n = new DefaultMutableTreeNode(funcion);
            //DefaultMutableTreeNode p = new DefaultMutableTreeNode(new Peliculas(nombre, descrip, funcion));

            // n.add(p);
            //raiz.add(n);
        }
        modeloARBOL.reload();

    }//GEN-LAST:event_agregarMouseClicked

    private void creapelisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_creapelisMouseClicked
        String Nombre = nombrepeli.getText();
        String Tiempo = pelidura.getText();
        String Categoria = (String) cbtipo.getSelectedItem();
        String Actores = actorpeli.getText();
        String director = directorpeli.getText();
        String compania = companiapeli.getText();
        String Idiorigi = idiomapeli.getText();
        String dobla = (String) doblajepeli.getSelectedItem();
        String Subtitulo = (String) subspeli.getSelectedItem();
        peli.add(new Peliculas(Nombre, Tiempo, Categoria, Actores, director, compania, Idiorigi, dobla, Subtitulo));
        nombrepeli.setText("");
        pelidura.setText("");
        actorpeli.setText("");
        directorpeli.setText("");
        companiapeli.setText("");
        idiomapeli.setText("");
    }//GEN-LAST:event_creapelisMouseClicked

    private void crear_serieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crear_serieMouseClicked
        String nombre = nomserie.getText();
        String Tiempo = seriedura.getText();
        String categoria = (String) cb_serie.getSelectedItem();
        String actores = actorserie.getText();
        String temps = canttemp.getText();
        String productora = productoraserie.getText();
        String idiomaorigi = idiomaori.getText();
        String doblaje = (String) cb_serie.getSelectedItem();
        String subtitulo = (String) cb_subs.getSelectedItem();
        series.add(new Series(nombre, Tiempo, categoria, actores, temps, productora, idiomaorigi, doblaje, subtitulo));
        nomserie.setText("");
        seriedura.setText("");
        actorserie.setText("");
        canttemp.setText("");
        productoraserie.setText("");
        idiomaori.setText("");
        System.out.println("");
        System.out.println("");
    }//GEN-LAST:event_crear_serieMouseClicked

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
            java.util.logging.Logger.getLogger(Necfilcs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Necfilcs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Necfilcs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Necfilcs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Necfilcs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField actorpeli;
    private javax.swing.JTextField actorserie;
    private javax.swing.JButton agregar;
    private javax.swing.JTextField canttemp;
    private javax.swing.JComboBox<String> cb_doblaje;
    private javax.swing.JComboBox<String> cb_serie;
    private javax.swing.JComboBox<String> cb_subs;
    private javax.swing.JComboBox<String> cbtipo;
    private javax.swing.JTextField companiapeli;
    private javax.swing.JDialog creacionpeli;
    private javax.swing.JDialog creacionserie;
    private javax.swing.JButton creapeli;
    private javax.swing.JButton creapelis;
    private javax.swing.JButton crear_serie;
    private javax.swing.JButton creaserie;
    private javax.swing.JTextField directorpeli;
    private javax.swing.JComboBox<String> doblajepeli;
    private javax.swing.JTextField idiomaori;
    private javax.swing.JTextField idiomapeli;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jt_nec;
    private javax.swing.JButton login;
    private javax.swing.JDialog menu1;
    private javax.swing.JTextField nombrelog;
    private javax.swing.JTextField nombrepeli;
    private javax.swing.JTextField nomserie;
    private javax.swing.JTextField pelidura;
    private javax.swing.JTextField productoraserie;
    private javax.swing.JTextField seriedura;
    private javax.swing.JComboBox<String> subspeli;
    // End of variables declaration//GEN-END:variables
ArrayList<Peliculas> peli = new ArrayList();
    ArrayList<Series> series = new ArrayList();
}
