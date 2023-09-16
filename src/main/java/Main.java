import java.util.Scanner;

public class Main {

    public static void main (String[] args){


    }

    public String scTexto(){

        Scanner sc = new Scanner(System.in);

        String texto = sc.nextLine();

        return texto;
    }

    public double scNumero(){

        Scanner sc = new Scanner(System.in);

        do {

            double num = sc.nextDouble();

            if (num<=0){

                System.out.println("DATO INVALIDO!");
            }
        }while (num<=0);

        return num;
    }



}
