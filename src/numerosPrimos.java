import java.util.Scanner;

public class numerosPrimos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numeroUsuario = 0;


        System.out.println("Bienvenido/a");
        System.out.println("Digite un número entre el rango 5 al 300");
        numeroUsuario = scanner.nextInt();

        if (numeroUsuario > 5 & numeroUsuario < 300) {

        } else {
            System.out.println("Digitó un numero fuera del rango");
        }

        boolean primo= true;

        for (int i= 2; i<numeroUsuario; i++){
            if (numeroUsuario % i==0) {
                primo = false;
                break;
            }
        }
        if(primo) {
            System.out.println("Si es un numero primo");
        } else{
            System.out.println("No es un numero primo");
        }
    }
}
