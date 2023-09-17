import java.util.Scanner;

public class Main {

    public static void main (String[] args){



        System.out.println(calcularPromedio(scNumero(), scNumero(), scNumero()));


    }

    public String scTexto(){

        Scanner sc = new Scanner(System.in);

        String texto = sc.nextLine();

        return texto;
    }

    public static double scNumero(){

        Scanner sc = new Scanner(System.in);

        double num;

        do {

            num = sc.nextDouble();

            if (num<=0){

                System.out.println("DATO INVALIDO!");
            }
        }while (num<=0);

        return num;
    }

    public double calcularImc(double peso, double estatura){

        double imc= peso/(estatura*estatura);

        return imc;
    }

    public static double calcularPromedio(double n1, double n2, double n3){

        double sum = n1+n2+n3;
        double promedio= sum/3;

        return promedio;
    }





}
