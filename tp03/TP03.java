/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp03;

import java.util.Scanner;
/**
 *
 * Nomes: Alexandre Zampieri, Caio Andrade
 * TRABALHO PRÁTICO 03: Construir a classe Hora, conforme especificação
   a baixo, este exercício comporá a avaliação final, portanto será obrigatória sua
   elaboração para a prova final.
 */
public class TP03 {
static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */

    //Feito por Alexandre Zampieri Salles / Caio Andrade
    public static void main(String[] args) {
        
        System.out.println("Escreva a hora (0-23): ");
        int h = sc.nextInt();
        
        System.out.println("Escreva os minutos (0-23): ");
        int m = sc.nextInt();
        
        System.out.println("Escreva os segundos (0-59): ");
        int s = sc.nextInt();
        
        Hora horario = new Hora(h,m,s);

        System.out.println("hora no formato: hh:mm:ss " + horario.getHora1());
        
        System.out.println("hora no formato: hh:mm:ss (AM/PM) " + horario.getHora2());
        
        System.out.println("Quantidade de segundos "+ horario.getSegundos());
        
        
    }
    
}

