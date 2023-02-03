/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.updaterentalmotor;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Tantowi
 */
public class PolimorphAgtKel extends GetterNSetter implements AbstractRentalMotor{
    
    @Override
    public void container(){
        // Frame ini sudah diatur di Detail Implementasi
    }
    
    @Override
    public void component(){
        JLabel judul = new JLabel("ANGGOTA KELOMPOK 3");
        judul.setBounds(180, 400, 500, 30);
        getForm().add(judul);
        
        JLabel norafika = new JLabel("0005   NORAFIKA PUJI ASTUTI");
        norafika.setBounds(30, 450, 500, 30);
        getForm().add(norafika);
        
        JLabel anita = new JLabel("0008   ANITA PUTRI");
        anita.setBounds(30, 480, 500, 30);
        getForm().add(anita);
        
        JLabel tantowi = new JLabel("0010   MOCH. TANTOWI RAHMADIJAYA");
        tantowi.setBounds(30, 510, 500, 30);
        getForm().add(tantowi);
        
        JLabel bintang = new JLabel("0035   NUGROHO GUSTI BINTANG FAJAR : 21104410035");
        bintang.setBounds(30, 540, 500, 30);
        getForm().add(bintang);
        
        JLabel kelas = new JLabel("TEKNIK INFORMATIKA 3-A");
        kelas.setBounds(170, 600, 500, 30);
        getForm().add(kelas);
    }
    
}
