import java.util.Scanner;

public class Alcancia {
    public static void main(String[] args) {
        int cantidad;
        int monedas20 = 0;
        int monedas50 = 0;
        int monedas100 = 0;
        int monedas200 = 0;
        int monedas500 = 0;
        int totalMonedas;
        int totalDinero;
        int opciones;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Alcancia");
            System.out.println("Opciones disponibles: ");
            System.out.println("1. Agregar una moneda");
            System.out.println("2. Averiguar la cantidad de monedas");
            System.out.println("3. Total del dinero");
            System.out.println("4. Romper alcancia");
            System.out.println("5. Salir de la alcancia");
            System.out.println("Ingresa una opcion: ");
            opciones = scanner.nextInt();
            if (opciones <= 5 && opciones > 0) {
                switch (opciones) {
                    case 1:
                        System.out.println("Ingrese la denominacion de moneda que desea agregar: ");
                        cantidad = scanner.nextInt();
                        if (cantidad == 20) {
                            monedas20++;
                            System.out.println("agregado");
                        } else if (cantidad == 50) {
                            monedas50++;
                            System.out.println("agregado");
                        } else if (cantidad == 100) {
                            monedas100++;
                            System.out.println("agregado");
                        } else if (cantidad == 200) {
                            monedas200++;
                            System.out.println("agregado");
                        } else if (cantidad == 500) {
                            monedas500++;
                            System.out.println("agregado");
                        } else {
                            System.out.println("no es valido");
                        }
                        System.out.println();
                        break;
                    case 2:
                        System.out.println("Cantidad de monedas: ");
                        System.out.println("Monedas de 20: " + monedas20);
                        System.out.println("Monedas de 50: " + monedas50);
                        System.out.println("Monedas de 100: " + monedas100);
                        System.out.println("Monedas de 200: " + monedas200);
                        System.out.println("Monedas de 500: " + monedas500);
                        totalMonedas = (monedas20 + monedas50 + monedas100 + monedas200 + monedas500);
                        System.out.println("Total de monedas: " + totalMonedas);
                        System.out.println();
                        break;
                    case 3:
                        totalDinero = ((monedas20*20)+(monedas50*50)+(monedas100*100)+(monedas200*200)+(monedas500*500));
                        System.out.println("Total de dinero ahorrado:" + totalDinero);
                        System.out.println();
                        break;
                    case 4:
                        monedas20 = 0;
                        monedas50 = 0;
                        monedas100 = 0;
                        monedas200 = 0;
                        monedas500 = 0;
                        System.out.println("La alcancia esta vacia");
                        System.out.println();
                        break;
                    case 5:
                        System.out.println("Haz salido de la alcancia");
                        break;
                }
            }else {
                System.out.println("Ingresa un número valido");
                System.out.println();
            }
        }while (opciones!=5);
    }
}