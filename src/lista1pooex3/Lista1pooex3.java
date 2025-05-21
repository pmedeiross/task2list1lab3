package lista1pooex3;

import java.util.Scanner;

class Idade {
    int anos;
    int meses;
    int dias;
    
    public Idade(int anos, int meses, int dias) {
    this.anos = anos;
    this.meses = meses;
    this.dias = dias;
    }
    
    public int CalcularIdadeEmDias(){
    return(anos * 365) + (meses * 30) + dias;
    }
}

public class Lista1pooex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.println("Digite os anos: ");
        int anos = scanner.nextInt();

        System.out.println("Digite os meses: ");
        int meses = scanner.nextInt();

        System.out.println("Digite os dias");
        int dias = scanner.nextInt();

        Idade idade = new Idade(anos, meses, dias);
        int TotalDias = idade.CalcularIdadeEmDias();
        System.out.println("A idade em dias eh: " + TotalDias);

        scanner.close();
    }
    
}
