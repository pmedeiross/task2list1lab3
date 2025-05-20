package listalab3ex12;

import java.util.Scanner;

public class ListaLab3ex12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a temperatura em Farenheit: ");
        int farenheit = scanner.nextInt();
        
        int celsius = ( 5 * (farenheit - 32)) / 9;
        
        System.out.println("A temperatura em Celsius eh:  " + celsius);
    }
}
