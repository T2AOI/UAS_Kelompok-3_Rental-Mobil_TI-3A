/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.updaterentalmotor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Tantowi
 */
public class DetailImplementasi extends GetterNSetter implements AbstractRentalMotor{

//    JFrame form = new JFrame("APLIKASI RENTAL MOTOR");
    
    @Override
    public void container(){
         // ============ Bagian Wadah / Container =============

//        // Judul dan instansiasi
//        new JFrame("APLIKASI RENTAL MOTOR");

        // Ukuran form
        getForm().setSize(500, 700);
       
        // X untuk close program
        getForm().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Lokasi di tengah
        getForm().setLocationRelativeTo(null);
        
        // Aktifkan ubah ukuran setiap komponen
        getForm().setLayout(null);
        
        // Form ditampilkan dan dijalankan (pindah ke main)
        // getForm().setVisible(true);
    }

    @Override
    public void component(){
        // =================== Bagian Component ===================== 
                
        JLabel labeljudul = new JLabel("RENTAL MOTOR");
        labeljudul.setBounds(190, 30, 200, 30);
        getForm().add(labeljudul);
                
        // No Transaksi
        JLabel notransaksi = new JLabel("No. Transaksi");
        notransaksi.setBounds(30, 80, 200, 30);
        getForm().add(notransaksi);
        // TextField
        JTextField txtnotransaksi = new JTextField();
        txtnotransaksi.setBounds(230, 85, 200, 20);
        getForm().add(txtnotransaksi);
        
        // Nama Penyewa
        JLabel namapenyewa = new JLabel("Nama Penyewa");
        namapenyewa.setBounds(30, 110, 200, 30);
        getForm().add(namapenyewa);
        // TextField
        JTextField txtnamapenyewa = new JTextField();
        txtnamapenyewa.setBounds(230, 115, 200, 20);
        getForm().add(txtnamapenyewa);
        
        // Alamat Penyewa
        JLabel alamat = new JLabel("Alamat Penyewa");
        alamat.setBounds(30, 140, 200, 30);
        getForm().add(alamat);
        // TextField
        JTextField txtalamat = new JTextField();
        txtalamat.setBounds(230, 145, 200, 20);
        getForm().add(txtalamat);
        
        // No KK Penyewa
        JLabel nokk = new JLabel("No KK Penyewa");
        nokk.setBounds(30, 170, 200, 30);
        getForm().add(nokk);
        // TextField
        JTextField txtnokk = new JTextField();
        txtnokk.setBounds(230, 175, 200, 20);
        getForm().add(txtnokk);
        
        // Nama HP Penyewa
        JLabel nohp = new JLabel("No HP Penyewa");
        nohp.setBounds(30, 200, 200, 30);
        getForm().add(nohp);
        // TextField
        JTextField txtnohp = new JTextField();
        txtnohp.setBounds(230, 205, 200, 20);
        getForm().add(txtnohp);
        
        // Merk Motor yang dipinjam
        JLabel merkmotorsewa = new JLabel("Merk Motor Sewa");
        merkmotorsewa.setBounds(30, 230, 200, 30);
        getForm().add(merkmotorsewa);
        // ComboBox
        String motor[] = {
            "YAMAHA MIO GT","YAMAHA MIO M3 125 CC","YAMAHA XRIDE 125 CC","YAMAHA LEXI 125 CC",
            "HONDA BEAT","HONDA SCOOPY","HONDA VARIO","HONDA PCX",
            "KAWASAKI W 175 CC","KAWASAKI NINJA 250 CC"
        };
        JComboBox txtmerkmotorsewa = new JComboBox(motor);
        txtmerkmotorsewa.setBounds(230, 235, 200, 20);
        getForm().add(txtmerkmotorsewa);
        
        // Harga Sewa
        JLabel hargasewa = new JLabel("Harga Sewa");
        hargasewa.setBounds(30, 260, 200, 30);
        getForm().add(hargasewa);
        // TextField
        JTextField txthargasewa = new JTextField();
        txthargasewa.setBounds(230, 265, 200, 20);
        getForm().add(txthargasewa);
        
        // Sewa Berapa Hari
        JLabel sewahari = new JLabel("Sewa Berapa Hari");
        sewahari.setBounds(30, 290, 200, 30);
        getForm().add(sewahari);
        // TextField
        JTextField txtsewahari = new JTextField();
        txtsewahari.setBounds(230, 295, 200, 20);
        getForm().add(txtsewahari);
                
        // Total Bayar
        JLabel totalbayar = new JLabel("Total Bayar");
        totalbayar.setBounds(30, 320, 150, 30);
        getForm().add(totalbayar);
        // TextField
        JTextField txttotalbayar = new JTextField();
        txttotalbayar.setBounds(230, 325, 150, 20);
        getForm().add(txttotalbayar);
        txttotalbayar.setEditable(false);
        
        // Hitung
        JButton btnhitung = new JButton("Hitung");
        btnhitung.setBounds(230, 350, 150, 20);
        getForm().add(btnhitung);
        
        btnhitung.addActionListener(
        new ActionListener() {
        @Override
            public void actionPerformed(ActionEvent e) {
                int hargasewa = Integer.parseInt(txthargasewa.getText());
                int sewahari = Integer.parseInt(txtsewahari.getText());
                int hasil = hargasewa * sewahari;
                txttotalbayar.setText(String.valueOf(hasil));
            }
        });
        
        //Reset
        JButton btnreset = new JButton("Reset");
        btnreset.setBounds(30, 350, 150, 20);
        getForm().add(btnreset);
        btnreset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtnotransaksi.setText("");
                txtnamapenyewa.setText("");
                txtalamat.setText("");
                txtnokk.setText("");
                txtnohp.setText("");
                txthargasewa.setText("");
                txtsewahari.setText("");
                txttotalbayar.setText("");
            }
        });

    }  
    
}
