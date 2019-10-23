/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.CycleWork;

/**
 *
 * @author user
 */
public class Program {
    public static void main(String[]args)
    {
        Customer cs = new Customer();
        
        cs.setNama_customer("andre");
        cs.getInfo();
        
        cs.setNama_customer("Dude");
        cs.getInfo();
    }
}
