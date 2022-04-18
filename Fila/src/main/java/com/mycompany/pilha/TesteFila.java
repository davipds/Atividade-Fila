
package com.mycompany.pilha;

import java.util.Random;
public class TesteFila {
    public static void main(String[] args) {
        Fila p = new Fila();
        int max = 10, r, n;
        Random random = new Random();

        try {
            for (int i = 0; i < max; i++) {
                r = Math.abs(random.nextInt() % max);
                p.push(r, i);
                //System.out.println(r + " entrou na fila");
            }
            p.imprimir();
            p.pop();
            System.out.println("---------------------------------");
            p.imprimir();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
