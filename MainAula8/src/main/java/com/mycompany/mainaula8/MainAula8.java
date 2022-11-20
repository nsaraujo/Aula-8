/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mainaula8;


/**
 *
 * @author 55649
 */
public class MainAula8 {

    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        Fila fila = new Fila();

        System.out.println("---------------------------------");
        System.out.println("----------Exercicio 1----------\n");
        System.out.println("---------------------------------");
        pilha.ex1();

        System.out.println("---------------------------------");
        System.out.println("----------Exercicio 2----------\n");
        System.out.println("---------------------------------");
        
        pilha.ex2();

        System.out.println("---------------------------------");
        System.out.println("----------Exercicio 3----------\n");
        System.out.println("---------------------------------");

        Aviao aviao1 = new Aviao("Boeing B-52", 01);
        Aviao aviao2 = new Aviao("Tupolev ANT-20", 02);
        Aviao aviao3 = new Aviao("Boeing B-29", 03);
        Aviao aviao4 = new Aviao("Raptor 25K-7", 04);
        Aviao aviao5 = new Aviao("Boeing 274", 05);
        Aviao aviao6 = new Aviao("Convair B-36", 06);
        Aviao aviao7 = new Aviao("", 07);
        Aviao aviao8 = new Aviao("Lockheed Constellation", 18);
        Aviao aviao9 = new Aviao("De Havilland Comet", 19);
        Aviao aviao10 = new Aviao("Lockheed R6V", 20);
        Aviao aviao11 = new Aviao("Boeing 307 Stratoliner", 21);

        fila.adicionar(aviao1);
        fila.adicionar(aviao2);
        fila.adicionar(aviao3);
        fila.adicionar(aviao4);
        fila.adicionar(aviao5);
        fila.adicionar(aviao6);
        fila.adicionar(aviao7);
        fila.adicionar(aviao8);
        fila.adicionar(aviao9);
        fila.adicionar(aviao10);
        
        System.out.println("A quantidade da fila de " + fila.tamnhFila() + " Aviões na fila para decolagem: \n");

        fila.libeVoo();
        fila.adicionar(aviao11);
        
        fila.ex3();

        fila.primeiroFila(fila.filaAviao.get(0));

        System.out.println("\nO primeiro aviao na fila é o: " + ((Aviao) aviao2).nomeAviao + " , código "
                + ((Aviao) aviao1).idAviao + "\n");

        System.out.println("---------------------------------");
        System.out.println("----------Exercicio-4----------\n");
        System.out.println("---------------------------------");

        fila.ex4();

        System.out.println("---------------------------------");
        System.out.println("----------Exercicio-5----------\n");
        System.out.println("---------------------------------");

        fila.ex5();

        System.out.println("---------------------------------");
        System.out.println("\n---------Exercicio 6---------\n");
        System.out.println("---------------------------------");

        fila.ex6();
        System.out.println("---------------------------------");
        System.out.println("\n---------Exercicio-7---------\n");
        System.out.println("---------------------------------");

        fila.ex7();

        System.out.println("---------------------------------");
        System.out.println("\n---------Exercicio-8---------\n");
        System.out.println("---------------------------------");

        fila.ex8();
    }
}
