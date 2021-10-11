package com.generation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// * Solicitar al usuario 3 ángulos de un triángulo y determinar si el triángulo
        //es válido

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el primer ángulo del triángulo");
        double angulo1 = sc.nextDouble();
        sc.nextLine();
        System.out.println("Ingresa el segundo ángulo del triángulo");
        double angulo2 = sc.nextDouble();
        sc.nextLine();
        System.out.println("Ingresa el tercer ángulo del triángulo");
        double angulo3 = sc.nextDouble();
        sc.nextLine();

        double angulos=angulo1+angulo2+angulo3;

        if(angulos==180.0){
            System.out.println("Es un triángulo válido");
        }else{
            System.out.println("No es un triángulo válido");
        }
        sc.close();
    }
}


