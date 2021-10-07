/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DB.DBConnection;
import static GUI.Login.conn;
import java.awt.Image;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.filechooser.FileNameExtensionFilter;
/**
 *
 * @author Aan Furqan
 */
public class UploadData extends javax.swing.JFrame {

    static Connection conn;
    static Statement st;
    static String sql;
    PreparedStatement ps;
    String s;
    public static String nama,telepon;
    public static int id;
    
    /**
     * Creates new form UploadData
     */
    public UploadData(String nama, String telepon, int id) {
        this.nama = nama;
        this.telepon = telepon;
        this.id = id;
        
        conn = new DBConnection().setConnection();
        initComponents();
        setLocationRelativeTo(this);
        setSize(800,600);
        setLocation(200,100);

        setResizable(false);
        System.out.println(id);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        cbTipeMobil = new javax.swing.JComboBox<>();
        lbTipeMobil = new javax.swing.JLabel();
        lbMerek = new javax.swing.JLabel();
        lbModel = new javax.swing.JLabel();
        lbVarian = new javax.swing.JLabel();
        lbTahun = new javax.swing.JLabel();
        cbTahun = new javax.swing.JComboBox<>();
        lbWarna = new javax.swing.JLabel();
        cbWarna = new javax.swing.JComboBox<>();
        tfModel = new javax.swing.JTextField();
        tfMerk = new javax.swing.JTextField();
        tfVarian = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbKapasitasMesin = new javax.swing.JLabel();
        tbtn_5 = new javax.swing.JToggleButton();
        tbtn_4 = new javax.swing.JToggleButton();
        tbtn_2 = new javax.swing.JToggleButton();
        tbtn_3 = new javax.swing.JToggleButton();
        tbtn_1 = new javax.swing.JToggleButton();
        lbTransmisi = new javax.swing.JLabel();
        tbtn_manual = new javax.swing.JToggleButton();
        tbtn_auto = new javax.swing.JToggleButton();
        lbPenumpang = new javax.swing.JLabel();
        lbKilometer = new javax.swing.JLabel();
        tfKilometer = new javax.swing.JTextField();
        lbDesc = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtareaDesc = new javax.swing.JTextArea();
        cbPenumpang = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lbJudulMobil = new javax.swing.JLabel();
        lbHarga = new javax.swing.JLabel();
        tfJudulMobil = new javax.swing.JTextField();
        tfHarga = new javax.swing.JTextField();
        lbGambar = new javax.swing.JLabel();
        lb_pic = new javax.swing.JLabel();
        btn_browse = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(200, 217, 237));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        cbTipeMobil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bekas ", "Baru", " " }));

        lbTipeMobil.setText("Tipe Mobil");

        lbMerek.setText("Merek");

        lbModel.setText("Model");

        lbVarian.setText("Varian");

        lbTahun.setText("Tahun");

        cbTahun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", " " }));

        lbWarna.setText("Warna");

        cbWarna.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hitam", "Putih", "Merah", "Orange", "Abu abu" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbTipeMobil, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbMerek, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbModel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbVarian, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTahun, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbWarna, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbTahun, javax.swing.GroupLayout.Alignment.LEADING, 0, 200, Short.MAX_VALUE)
                            .addComponent(cbTipeMobil, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbWarna, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfModel))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(tfMerk)
                    .addComponent(tfVarian))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTipeMobil)
                .addGap(9, 9, 9)
                .addComponent(cbTipeMobil, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbMerek)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfMerk, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbModel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfModel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbVarian)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfVarian, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(lbTahun)
                .addGap(9, 9, 9)
                .addComponent(cbTahun, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbWarna)
                .addGap(9, 9, 9)
                .addComponent(cbWarna, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("INPUT DATA");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        lbKapasitasMesin.setText("Kapasitas Mesin");

        tbtn_5.setText(">3000 cc");
        tbtn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtn_5ActionPerformed(evt);
            }
        });

        tbtn_4.setText("2000 - 3000 cc");
        tbtn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtn_4ActionPerformed(evt);
            }
        });

        tbtn_2.setText(" 1000 - 1500 cc");
        tbtn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtn_2ActionPerformed(evt);
            }
        });

        tbtn_3.setText("1500 - 2000 cc");
        tbtn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtn_3ActionPerformed(evt);
            }
        });

        tbtn_1.setText("< 1000 cc");
        tbtn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtn_1ActionPerformed(evt);
            }
        });

        lbTransmisi.setText("Transmisi");

        tbtn_manual.setText("Manual");
        tbtn_manual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtn_manualActionPerformed(evt);
            }
        });

        tbtn_auto.setText("Automatic");
        tbtn_auto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtn_autoActionPerformed(evt);
            }
        });

        lbPenumpang.setText("Penumpang");

        lbKilometer.setText("Kilometer");

        lbDesc.setText("Deskripsi Produk");

        txtareaDesc.setColumns(20);
        txtareaDesc.setRows(5);
        jScrollPane1.setViewportView(txtareaDesc);

        cbPenumpang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5 seat", "7 seat" }));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("KM");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tbtn_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(cbPenumpang, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(tbtn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tbtn_4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(tbtn_1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbtn_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lbKapasitasMesin)
                    .addComponent(lbTransmisi)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(tbtn_manual)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbtn_auto))
                    .addComponent(lbPenumpang)
                    .addComponent(lbKilometer)
                    .addComponent(lbDesc)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(tfKilometer, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbKapasitasMesin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbtn_1)
                    .addComponent(tbtn_2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbtn_3)
                    .addComponent(tbtn_4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbtn_5)
                .addGap(12, 12, 12)
                .addComponent(lbTransmisi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbtn_manual)
                    .addComponent(tbtn_auto))
                .addGap(18, 18, 18)
                .addComponent(lbPenumpang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbPenumpang, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbKilometer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfKilometer, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbDesc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        lbJudulMobil.setText("Judul");

        lbHarga.setText("Harga");

        lbGambar.setText("Gambar");

        lb_pic.setBackground(new java.awt.Color(204, 204, 204));

        btn_browse.setText("Browse");
        btn_browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_browseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfHarga)
                    .addComponent(tfJudulMobil)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbHarga)
                            .addComponent(lbJudulMobil)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(lbGambar)
                                .addGap(18, 18, 18)
                                .addComponent(btn_browse)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lb_pic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbJudulMobil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfJudulMobil, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbHarga)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbGambar)
                    .addComponent(btn_browse))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_pic, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSimpan.setText("SIMPAN");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addComponent(btnSimpan))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSimpan)
                            .addComponent(btnBack))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        
        String tipe_mobil = cbTipeMobil.getSelectedItem().toString();
        String merk = tfMerk.getText();
        String model = tfModel.getText();
        String varian = tfVarian.getText();
        String tahun = cbTahun.getSelectedItem().toString();
        String warna = cbWarna.getSelectedItem().toString();
        
        String pilihanMesin = "";
        if (tbtn_1.isSelected())  {
            pilihanMesin = tbtn_1.getText();
        }
        else if (tbtn_2.isSelected())  {
            pilihanMesin = tbtn_2.getText();
        }
        else if (tbtn_2.isSelected())  {
            pilihanMesin = tbtn_2.getText();
        }
        else if (tbtn_3.isSelected())  {
            pilihanMesin = tbtn_3.getText();
        }
        else if (tbtn_4.isSelected())  {
            pilihanMesin = tbtn_4.getText();
        }
        else if (tbtn_5.isSelected())  {
            pilihanMesin = tbtn_5.getText();
        }
        else {
            JOptionPane.showMessageDialog(null, "Silahkan Pilih Kapasitas Mesin",
                    "informasi",JOptionPane.INFORMATION_MESSAGE);
        }
        
        String kapasitas_mesin = pilihanMesin;
        
        String pilihanTransmisi = "";
        if (tbtn_manual.isSelected())  {
            pilihanTransmisi = tbtn_manual.getText();
        }
        else if (tbtn_auto.isSelected())  {
            pilihanTransmisi = tbtn_auto.getText();
        }
        else{
            JOptionPane.showMessageDialog(null, "Silahkan Pilih Transmisi",
                    "informasi",JOptionPane.INFORMATION_MESSAGE);
        }
        
        String transmisi = pilihanTransmisi;
        
        
        
        String kapasitas = cbPenumpang.getSelectedItem().toString();
        int kilometer = Integer.parseInt(tfKilometer.getText());
        String deskripsi = txtareaDesc.getText();
        String judul = tfJudulMobil.getText();
        long harga = Long.parseLong(tfHarga.getText());
        
        Calendar cals = Calendar.getInstance();
        SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd");
        Date tanggal = new Date();
        String tglPost = formater.format(tanggal);

        
        
        try {
             sql = "INSERT INTO datamobil VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
             ps = conn.prepareStatement(sql);
             InputStream is = new FileInputStream(new File(s));
             ps.setInt(1,0);
             ps.setInt(2, id);
             ps.setString(3, tglPost);
             ps.setString(4, tipe_mobil);
             ps.setString(5, merk);
             ps.setString(6, model);
             ps.setString(7, varian);
             ps.setString(8, tahun);
             ps.setString(9, warna);
             ps.setString(10, kapasitas_mesin);
             ps.setString(11, transmisi);
             ps.setString(12, kapasitas);
             ps.setInt(13, kilometer);
             ps.setString(14, deskripsi);
             ps.setString(15, judul);
             ps.setLong(16, harga);
             ps.setBlob(17, is);
            
            int rt = ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data berasih ditambahkan!!",
                    "informasi",JOptionPane.INFORMATION_MESSAGE);
            
            MainMenu mm = new MainMenu(nama, telepon, id);
            mm.setVisible(true);
            this.dispose();
            
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
            JOptionPane.showMessageDialog(null, "Periksa Kembali Data Yang Di Input",
                    "informasi",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void tbtn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtn_1ActionPerformed
        if (tbtn_1.isSelected())  {
           tbtn_2.setSelected(false);
           tbtn_3.setSelected(false);
           tbtn_4.setSelected(false);
           tbtn_5.setSelected(false);

        }
        else{
           tbtn_1.setSelected(false);
           tbtn_2.setSelected(false);
           tbtn_3.setSelected(false);
           tbtn_4.setSelected(false);
           tbtn_5.setSelected(false);
        }
            
        
    }//GEN-LAST:event_tbtn_1ActionPerformed

    private void tbtn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtn_2ActionPerformed
        if (tbtn_2.isSelected())  {
           tbtn_1.setSelected(false);
           tbtn_3.setSelected(false);
           tbtn_4.setSelected(false);
           tbtn_5.setSelected(false);

        }
        else{
           tbtn_1.setSelected(false);
           tbtn_2.setSelected(false);
           tbtn_3.setSelected(false);
           tbtn_4.setSelected(false);
           tbtn_5.setSelected(false);
        }
    }//GEN-LAST:event_tbtn_2ActionPerformed

    private void tbtn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtn_3ActionPerformed
        if (tbtn_3.isSelected())  {
           tbtn_2.setSelected(false);
           tbtn_1.setSelected(false);
           tbtn_4.setSelected(false);
           tbtn_5.setSelected(false);

        }
        else{
           tbtn_1.setSelected(false);
           tbtn_2.setSelected(false);
           tbtn_3.setSelected(false);
           tbtn_4.setSelected(false);
           tbtn_5.setSelected(false);
        }
    }//GEN-LAST:event_tbtn_3ActionPerformed

    private void tbtn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtn_4ActionPerformed
        if (tbtn_4.isSelected())  {
           tbtn_2.setSelected(false);
           tbtn_3.setSelected(false);
           tbtn_1.setSelected(false);
           tbtn_5.setSelected(false);

        }
        else{
           tbtn_1.setSelected(false);
           tbtn_2.setSelected(false);
           tbtn_3.setSelected(false);
           tbtn_4.setSelected(false);
           tbtn_5.setSelected(false);
        }
    }//GEN-LAST:event_tbtn_4ActionPerformed

    private void tbtn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtn_5ActionPerformed
        if (tbtn_5.isSelected())  {
           tbtn_2.setSelected(false);
           tbtn_3.setSelected(false);
           tbtn_4.setSelected(false);
           tbtn_1.setSelected(false);
        }
        else{
           tbtn_1.setSelected(false);
           tbtn_2.setSelected(false);
           tbtn_3.setSelected(false);
           tbtn_4.setSelected(false);
           tbtn_5.setSelected(false);
        }
    }//GEN-LAST:event_tbtn_5ActionPerformed

    private void tbtn_manualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtn_manualActionPerformed
        if(tbtn_manual.isSelected()){
            tbtn_auto.setSelected(false);
        }
        else{
            tbtn_auto.setSelected(false);
            tbtn_manual.setSelected(false);
        }
    }//GEN-LAST:event_tbtn_manualActionPerformed

    private void tbtn_autoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtn_autoActionPerformed
        if(tbtn_auto.isSelected()){
            tbtn_manual.setSelected(false);
        }
        else{
            tbtn_auto.setSelected(false);
            tbtn_manual.setSelected(false);
        }
    }//GEN-LAST:event_tbtn_autoActionPerformed

    private void btn_browseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_browseActionPerformed
         JFileChooser fileChooser = new JFileChooser();
         fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
         FileNameExtensionFilter filter = new FileNameExtensionFilter("*.IMAGE", "jpg","gif","png");
         fileChooser.addChoosableFileFilter(filter);
         int result = fileChooser.showSaveDialog(null);
         if(result == JFileChooser.APPROVE_OPTION){
             File selectedFile = fileChooser.getSelectedFile();
             String path = selectedFile.getAbsolutePath();
             lb_pic.setIcon(ResizeImage(path));
             s = path;
              }
         else if(result == JFileChooser.CANCEL_OPTION){
             System.out.println("No Data");
         }
    }//GEN-LAST:event_btn_browseActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        MainMenu mm = new MainMenu(nama, telepon, id);
        mm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(UploadData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UploadData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UploadData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UploadData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UploadData(nama, telepon, id).setVisible(true);
            }
        });
    }

    public ImageIcon ResizeImage(String imgPath){
        ImageIcon MyImage = new ImageIcon(imgPath);
        Image img = MyImage.getImage();
        Image newImage = img.getScaledInstance(lb_pic.getWidth(), lb_pic.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImage);
        return image;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btn_browse;
    private javax.swing.JComboBox<String> cbPenumpang;
    private javax.swing.JComboBox<String> cbTahun;
    private javax.swing.JComboBox<String> cbTipeMobil;
    private javax.swing.JComboBox<String> cbWarna;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbDesc;
    private javax.swing.JLabel lbGambar;
    private javax.swing.JLabel lbHarga;
    private javax.swing.JLabel lbJudulMobil;
    private javax.swing.JLabel lbKapasitasMesin;
    private javax.swing.JLabel lbKilometer;
    private javax.swing.JLabel lbMerek;
    private javax.swing.JLabel lbModel;
    private javax.swing.JLabel lbPenumpang;
    private javax.swing.JLabel lbTahun;
    private javax.swing.JLabel lbTipeMobil;
    private javax.swing.JLabel lbTransmisi;
    private javax.swing.JLabel lbVarian;
    private javax.swing.JLabel lbWarna;
    private javax.swing.JLabel lb_pic;
    private javax.swing.JToggleButton tbtn_1;
    private javax.swing.JToggleButton tbtn_2;
    private javax.swing.JToggleButton tbtn_3;
    private javax.swing.JToggleButton tbtn_4;
    private javax.swing.JToggleButton tbtn_5;
    private javax.swing.JToggleButton tbtn_auto;
    private javax.swing.JToggleButton tbtn_manual;
    private javax.swing.JTextField tfHarga;
    private javax.swing.JTextField tfJudulMobil;
    private javax.swing.JTextField tfKilometer;
    private javax.swing.JTextField tfMerk;
    private javax.swing.JTextField tfModel;
    private javax.swing.JTextField tfVarian;
    private javax.swing.JTextArea txtareaDesc;
    // End of variables declaration//GEN-END:variables
}