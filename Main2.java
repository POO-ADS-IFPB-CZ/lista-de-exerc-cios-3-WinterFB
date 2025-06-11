import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double megasena[] = new double[6];
        System.out.println("Informe o 1º número: ");
        Scanner scanner = new Scanner(System.in);
        megasena[0] = scanner.nextDouble();
        int numeros=1;

        for (int i = 1; i < 6; i++){
            System.out.println("Informe o "+(i+1)+"º número: ");
            if(!checarRepetido(megasena, i, numeros)){
                megasena[i] = scanner.nextDouble();
            }
            numeros++;
        }

        Arrays.sort(megasena);
        for (int i = 0; i < 6; i++){
            System.out.println(megasena[i]);
        }

    }

    public static boolean checarRepetido(double sena[], double numInformado, int numeros){
        int repetido=0;
        for (int i = 0; i <= numeros; i++) {
            if (sena[i] == numInformado) {
                repetido++;
                System.out.println("O número está duplicado!");
            }
            if (repetido>0) return true;
        }
        return false;
    }
}
