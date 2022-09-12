package br.masmangan.beecrowd.bee1093.T1_MM.src.main.java;

import java.util.Scanner;


import static java.lang.Math.pow;
import static java.lang.System.out;

public class Bee1093 {

    static double gambler(int n1, int n2, int at){
        double dado;
        if(at == 3){
            return (double)n1/(double)(n1+n2);
        }else{
            dado = 1.0 - (6-at)/6.0;
            dado = (1 - dado)/dado;
            return (1.0 - pow(dado,n1))/(1.0 - pow(dado,n1+n2));
        }
    }

    public static void main(String[] args) {
        int ev1, ev2, at, d, aux;


        Scanner in = new Scanner(System.in);  // Create a Scanner object

        for(;;) {
            ev1 = in.nextInt();  // Read user input
            ev2 = in.nextInt();
            at = in.nextInt();
            d = in.nextInt();


            double p;

            if (ev1 == 0 && ev2 == 0 && at == 0 && d == 0) {
                return;
            }

            aux = ev1;
            ev1 = 0;
            while (aux > 0) {
                aux -= d;
                ev1++;
            }
            aux = ev2;
            ev2 = 0;
            while (aux > 0) {
                aux -= d;
                ev2++;
            }

            p = gambler(ev1, ev2, at);

            out.printf(String.format("%.1f\n", p * 100));
            return;//remover para rodar no beecrown
        }
    }

}
