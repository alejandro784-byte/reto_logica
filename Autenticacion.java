import java.util.Scanner;

public class Autenticacion {
    public static void main(String[] args) {
        final int PIN_SECRETO = 83247;
        Scanner ewar = new Scanner(System.in);
        
        System.out.print("Ingrese su PIN de acceso: ");
        int pinIngresado = ewar.nextInt();
        
        if (PIN_SECRETO==pinIngresado) { System.out.println("Bienvenido a su cuenta");
       
        }
        else { System.out.println("Su contraseña es incorrecta. intente de nuevo");

            }
            ewar.close(); 
        }
    }
