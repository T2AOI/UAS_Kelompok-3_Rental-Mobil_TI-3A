/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.updaterentalmotor;

/**
 *
 * @author Tantowi
 */
public class mainRentalMotor extends DetailImplementasi{
    
    public static void main(String[] args) {
        AbstractRentalMotor project = new DetailImplementasi();
        project.container();
        project.component();
        
        AbstractRentalMotor polimorph = new PolimorphAgtKel();
        polimorph.container();
        polimorph.component();
        
        GetterNSetter frame = new GetterNSetter();
        frame.getForm().setVisible(true);
    }
    
}

// object ada, di instansiasi
// class ada
// inheritance / pewarisan ada
// polimorfisme ada
// abstraction / (bentuk)abstract ada
// encapsulation / getter n setter