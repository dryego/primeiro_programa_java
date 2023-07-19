import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Infome seu peso em KG: ");
        double peso = ler.nextDouble();

        System.out.println("Informe sua altura em metros: ");
        double altura = ler.nextDouble();

        double imc = calcularIMC(peso,altura);

        System.out.println("Seu IMC = " + imc + ", " + clacificarIMC(imc));

        ler.close();
    }
    public static double calcularIMC(double peso, double altura){
        double imc = peso / (altura * altura);
        return imc;
    }
    public static String clacificarIMC(double imc) {
        if (imc < 16.0) {
            return "Magreza grave.";
        } else if (imc < 17.0) {
            return "Magreza Moderada.";
        } else if (imc < 18.5) {
            return "Magreza Leve.";
        } else if (imc < 25.0) {
            return "Saudavel.";
        } else if (imc < 30.0) {
            return "Sobrepeso";
        } else if (imc < 35.0) {
            return "Obesidade Grau I";
        } else if (imc < 40.0) {
            return "Obesidade Grau II (severa)";
        } else {
            return "Obesidade Grau III (mórbida)";
        }
    }
}
