/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author alunodev07
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String... args) {
        Scanner tcl = new Scanner(System.in);
        //variaveis
        int ns = 10;
        int cht = 0;
        int tntvs = 0;
        //OBETER
        while (tntvs < 16) {
            System.out.println("Insira um numero: ");
            cht = tcl.nextInt();
            tntvs += 1;
            if (cht == ns) {
                System.out.println("Parabens voce acertou!");
                break;
            } else if (tntvs >= 3 & tntvs <=5) {
                System.out.println("DICA 01: Digite um numero de 1 a 1000");
            } else if (tntvs >= 8 & tntvs < 10) {
                System.out.println("DICA 02: Digite um numero de 1 a 100");
            } else if (tntvs >= 13 & tntvs <= 15) {
                System.out.printf("DICA 3: Digite um numero de 1 a 10");
            } else if(tntvs == 16){
                System.out.println("FIM!");
            }
        }
    }
}
