package com.ejemplo.Kyosuke;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double peso, estatura, BMI;
        System.out.println("Digite su peso en Kgs: ");
        peso = teclado.nextDouble();
        System.out.println("Digite su estatura en metros: ");
        estatura = teclado.nextDouble();
        BMI = peso / (estatura * estatura);
        if (BMI < 18.5){
            System.out.println("Su BMI es: "+BMI+" y eres flaquito");
        }
        else if (18.5 <= BMI && BMI < 25.0){
            System.out.println("Su BMI es: "+BMI+" y eres de peso normal");
        }
        else if (25.0 <= BMI && BMI < 30.0){
            System.out.println("Su BMI es: "+BMI+" y eres gordito");
        }
        else if (30.0 <= BMI){
            System.out.println("Su BMI es: "+BMI+" y eres obeso");
        }
    }
}