/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;

import dominio.Cubo;

/**
 *
 * @author loren
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cubo Cubo1 = new Cubo(7, 4, 10);
        System.out.println("El volumen del cubo es: "+Cubo1.calcularVolumen(Cubo1.getAlto(), Cubo1.getAncho(), Cubo1.getProfundo()));
    }
    
}
