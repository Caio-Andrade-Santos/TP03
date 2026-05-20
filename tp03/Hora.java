/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//<editor-fold defaultstate="collapsed" desc="comment">
package tp03;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 *
 * Nomes: Alexandre Zampieri, Caio Andrade
 * TRABALHO PRÁTICO 03: Construir a classe Hora, conforme especificação
 * a baixo, este exercício comporá a avaliação final, portanto será obrigatória sua
 * elaboração para a prova final.
 */

//Feito por Alexandre Zampieri Salles / Caio Andrade


public class Hora {

    static Scanner sc = new Scanner(System.in);
    private int hora = 12;
    private int min = 12;
    private int seg = 12;

    /*
    O construtor Hora(int h, int m, int s) deverá receber os valores de hora, minuto e
    segundos e com eles inicializa as propriedades da classe;
    */
    public Hora(int hora, int min, int seg) {
        
        // Encapsulamento, Validação da atribuição das variaveis dentro dos setters
        setHor(hora);
        setMin(min);
        setSeg(seg);
    }
    
    /*
    • O construtor Hora() deve permitir ao usuário digitar os valores de hora, minuto e
    segundos e com eles inicializar os atributos da classe. Os valores digitados deverão ser
    consistidos e só aceitos se válidos, caso contrário, exigir ao usuário redigitar;
    */
    public Hora() 
    {
          int h, m, s;

        do {
            System.out.print("Digite a hora (0-23): ");
            h = sc.nextInt();
        } while (h < 0 || h > 23);

        do {
            System.out.print("Digite os minutos (0-59): ");
            m = sc.nextInt();
        } while (m < 0 || m > 59);

        do {
            System.out.print("Digite os segundos (0-59): ");
            s = sc.nextInt();
        } while (s < 0 || s > 59);

        hora = h;
        min = m;
        seg = s;
    }

    /*
    • Os métodos setHor(int h), setMin(int m) e setSeg(int s) devem receber um valor e
    atribuí-lo ao respectivo atributo;
    
    Os métodos setHor(), setMin() e setSeg() devem permitir que o usuário digite um
    valor e atribuí-lo ao respectivo atributo. Os valores digitados deverão ser consistidos e
    só aceitos se válidos, caso contrário, exigir ao usuário redigitar;
    */
    public void setHor(int h) {
        try {   
            while (h > 23) {
                System.out.println("Digite uma hora valida");
                h = sc.nextInt();
            }
            hora = h;
        } catch (InputMismatchException e) {

            System.out.println("Erro: digite apenas números!");
        }
    }

    public void setMin(int m) {
        while (m > 60) {
            System.out.println("Digite minutos validos");
            m = sc.nextInt();
        }
        min = m;
    }

    public void setSeg(int s) {
        while (s > 60) {
            System.out.println("Digite segundos validos");
            s = sc.nextInt();
        }
        seg = s;
    }

    /*
    Os métodos getHor(), getMin() e getSeg() devem devolver as respectivas
    propriedades;
    */
    public int getHor() {
        return hora;
    }

    public int getMin() {
        return min;
    }

    public int getSeg() {
        return seg;
    }
    
    
    /*
    O método getHora1() deve nos devolver a hora no formato: hh:mm:ss;
    */
    public String getHora1() {
        
        // atribuindo valores as variaveis, a partir do objeto estanciado
        int h = getHor();
        int m = getMin();
        int s = getSeg();
        
        // transnformando para String
        String h1 = Integer.toString(h);
        String m1 = Integer.toString(m);
        String s1 = Integer.toString(s);

        String auxH = h1;
        String auxM = m1;
        String auxS = s1;
        
        // Adicionando 0 a esquerda do numero caso seja menor que 10 
        if (h < 10) {

            String h0 = h1.substring(0, 0) + "0" + h1.substring(0);
            auxH = h0;

        }

        if (m < 10) {
            String m0 = m1.substring(0, 0) + "0" + m1.substring(0);
            auxM = m0;
        }

        if (s < 10) {

            String s0 = s1.substring(0, 0) + "0" + s1.substring(0);
            auxS = s0;

        }
        
        String horaCompleta = auxH + ":" + auxM + ":" + auxS;
        return horaCompleta;
    }

    public String getHora2() {
        // atribuindo valor a partir do objeto estanciado, e criação do auxiliar para utilizar em PM/AM
        int h = getHor();
        int aux = h - 12;

        // Reutilizando o metodo getHora1 para pegar ela completa 
        String hc = getHora1();
        //Verificação se é PM
        if (h > 12) {
            // guarda o valor estanciado de h
            String h1 = Integer.toString(h);
            h = aux;
            // guarda o novo valor estanciado em h no formato de String
            String h2 = Integer.toString(h);
            // utilizando a função replace para substituir o valor estanciado em h para PM/AM
            String novaHora = hc.replace(h1, h2);
            novaHora += " PM";
            return novaHora;
          // Caso seja meio-dia/ meia-noite
        } else if (aux == 0) {
            String h1 = Integer.toString(h);
            h = 12;
            String h2 = Integer.toString(h);
            String novaHora = hc.replace(h1, h2);
            novaHora += " PM";
            return novaHora;
            
        } else if (h == 12) {
            String h1 = Integer.toString(h);
            h = 12;
            String h2 = Integer.toString(h);
            String novaHora = hc.replace(h1, h2);
            novaHora += " AM";
            return novaHora;
           // caso seja antes de 12:00
        } else {
            String novaHora = hc;
            novaHora += " AM";
            return novaHora;
        }
    }

    /* • O método getSegundos() deve nos devolver a quantidade de segundos expressa na
    hora em questão, (exemplo: 01:00:01 = 3601 segundos) .
    */
    public int getSegundos() {
        int h = getHor();
        int m = getMin();
        int s = getSeg();

        int soma = ((h * 3600) + (m * 60) + s);

        return soma;

    }
}
