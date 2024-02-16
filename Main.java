package IPC_Tarea2;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Bienvenido a la Calcudora");
            System.out.println("Ingrese una opcion: ");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. División");
            System.out.println("5. Salir");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println( "Sumar:");
                    suma();
                    break;
                case 2:
                    System.out.println( "Resta");
                    resta();
                    break;
                case 3:
                    System.out.println( "Multiplicación");
                    multiplicacion();
                    break;
                case 4:
                    System.out.println( "Multiplicación");
                    division();
                    break;
                case 5:
                    System.out.println( "Saliendo....");
                    scanner.close();
                    return;
                default:
                    break;
            }

        }

    }

    public static void suma() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        float num1 = scanner.nextFloat();
        System.out.println("Ingrese el segundo número");
        float num2 = scanner.nextFloat();
        float resultado = num1+num2;
        System.out.println("La suma de: " +num1+" y "+num2+" es: "+resultado);
    }
    public static void resta() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        float num1 = scanner.nextFloat();
        System.out.println("Ingrese el segundo número");
        float num2 = scanner.nextFloat();
        float resultado = num1-num2;
        System.out.println("La resta de: " +num1+" y "+num2+" es: "+resultado);
    }
    public static void multiplicacion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        float num1 = scanner.nextFloat();
        System.out.println("Ingrese el segundo número");
        float num2 = scanner.nextFloat();
        float resultado = num1*num2;
        System.out.println("La multiplicación de: " +num1+" y "+num2+" es: "+resultado);
    }
    public static void division() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        float num1 = scanner.nextFloat();
        System.out.println("Ingrese el segundo número");
        float num2 = scanner.nextFloat();
        if (num2==0) {
            System.out.println("No es posible dividir entre cero, ya que da un resultado indefinido");
        } else {
            float resultado = num1 / num2;
            System.out.println("La división de: " + num1 + " y " + num2 + " es: " + resultado);
        }
    }
}
