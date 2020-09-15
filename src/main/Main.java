package main;

import java.util.Scanner;

public class Main {

    public static void main(String [] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa la edad");
        byte edad = teclado.nextByte();

        if(edad >= 0 && edad <= 10){
            System.out.println("Es un niño");
        }else if(edad >= 11 && edad <= 14){
            System.out.println("Es un pre adolescente");
        }else if(edad >= 15 && edad <= 18){
            System.out.println("Es un adolescente");
        }else if(edad >= 19 && edad <= 25){
            System.out.println("Es un joven");
        }else if(edad >= 26 && edad <= 65){
            System.out.println("Es un adulto");
        }else if(edad > 65){
            System.out.println("Es un anciano");
        }else {
            System.out.println("Edad incorrecta");
        }

    }

}
