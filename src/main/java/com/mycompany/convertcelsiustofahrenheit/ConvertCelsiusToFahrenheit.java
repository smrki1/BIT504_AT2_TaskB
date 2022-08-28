/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.convertcelsiustofahrenheit;
import java.util.Scanner;
/**
 *
 * @author smrki
 */
public class ConvertCelsiusToFahrenheit {
    System.out.println("Once upon a time...");   //Adding a required change for a new branch of this repository
    System.out.println("There was a little hobbit...");   //Adding a second required change for a new branch of this repository


    public static void main(String[] args) {
        System.out.println("Hello how are you?");
        System.out.println("Today we will convert your C to F so you can see how hot it is today!");
        System.out.println("Please tell me the temperature in Celsius");
        
        Scanner scanner = new Scanner(System.in);
        
        //final double conversionRate = 
        // (c*1.8) + 32
        double tempCelsius = scanner.nextDouble();
        
        try {
            double x = tempCelsius;
        }
        catch(Exception Type1) {
            System.out.println("Please enter a valid number");
        }
        
        double tempFahrenheit = (tempCelsius * 1.8) + 32;
        System.out.println("Todays temerature in F is: " + tempFahrenheit );
    }
}
