/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.Cliente;
import  ec.edu.intsuperior.modelo.Persona;
/**
 *
 * @author Windows 10
 */
public class Aplicacion {
    public static void main(String[] args) {
        Cliente c1=new Cliente();
        Persona p1=new Persona();
        
        c1.setTelefono("0988673604");
        p1.setNombre("luis");
        p1.setEdad(23);
        
        System.out.println(p1.toString());
        System.out.println(c1.toString());
        
        
        
        
        
        
    }
}
