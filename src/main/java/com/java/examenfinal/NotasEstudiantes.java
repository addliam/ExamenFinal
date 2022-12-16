/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.examenfinal;

import java.util.Scanner;

/**
 *
 * @author codeli4m
 */
public class NotasEstudiantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);        
        int[] notas = { 11,12,18,20,14,8,18,16 };
        String[] estudiantes = { "Pablo", "Lucas", "Daniel", "Diego", "Alejandro", "Martin", "Mateo", "Denis" };
        System.out.println("-------- CONSULTA NOTA ESTUDIANTES --------");
        for (int j=0; j<estudiantes.length;j++) {
            System.out.print(estudiantes[j]);
            if (j != estudiantes.length - 1){
                System.out.print( ", ");
            }
        }
        System.out.println("");
        System.out.println("Escriba x para salir\n");
        while (true) {            
            System.out.print("Nombre de estudiante: ");
            
            String alumno = scan.nextLine();

            if (alumno.equalsIgnoreCase("x")){
                System.exit(0);
            }
            
            int nota = -1;
            for (int i=0; i < estudiantes.length ; i++){
                if (estudiantes[i].equalsIgnoreCase(alumno)){
                    nota = notas[i];
                }
            }        
            if (nota == -1){
                System.out.println("No se encontro el alumno: "+alumno);
            }
            else{
            System.out.println("La nota de "+alumno+" es: "+nota);                            
            }
        }

    }    
}
