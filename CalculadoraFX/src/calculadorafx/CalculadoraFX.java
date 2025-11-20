/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadorafx;

import java.util.Scanner;




public class CalculadoraFX {

    public static void main(String[] args) {
    Scanner keyboard=new Scanner(System.in);
    System.out.println("Ingrese el primer numero:");
    int numb1=keyboard.nextInt();
    System.out.println("Ingrese el segundo numero:");
    int numb2=keyboard.nextInt();
    System.out.println("Elija la operacion a realizar: 1-Suma 2-Resta 3-Multiplicacion 4-Division");
    int operation=keyboard.nextInt();
    if(operation==1){
        int suma=numb1+numb2;
        System.out.println("El resultado de la suma es: "+suma);
    } else if (operation==2) {
        int resta=numb1-numb2;
        System.out.println("El resultado de la resta es: "+resta);
    } else if (operation==3) {
        int multiplicacion=numb1*numb2;
        System.out.println("El resultado de la multiplicacion es: "+multiplicacion);
    } else if (operation==4) {
        if(numb2!=0){
            int division=numb1/numb2;
            System.out.println("El resultado de la division es: "+division);
        } else {
            System.out.println("Error: Division por cero no permitida.");
        }
    } else {
        System.out.println("Operacion no valida.");
    }
}

}
