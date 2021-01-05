package Lavadora_Serie_uno;

import java.util.Scanner;
import lfunciones.GeekLavadora;

public class SerieUno {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("ropa blanca o de color?: ");
        System.out.println("press 1 blanca 2 color");
        int tropa = read.nextInt();
        
        System.out.println("cuantos kilos de ropa: ");
        int kilos = read.nextInt();
        GeekLavadora kate = new GeekLavadora(kilos, tropa);
        kate.setTipoRo(2);
        System.out.println("tipo de ropa es: "+kate.getTipoRo());
        kate.CicloFinalizado();
    }
}
