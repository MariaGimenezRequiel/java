package u4.tareas;

import java.util.Scanner;

public class Tareadniv2 {

    private static final char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    public static void main(String[] args) {
        boolean valido = true;
        Scanner sc = new Scanner(System.in);
        String dni;

        // Diseñanos la entrada de valores con control de errores
        do {
            System.out.print("Ingrese un DNI: ");
            dni = sc.nextLine().trim().toUpperCase();

            if (dni.matches("[0-9]{8}[A-Z]")) {
                int numerodni = Integer.parseInt(dni.substring(0, 8));
                char letra = dni.charAt(8);
                int posicion = numerodni % 23;
                if (letras[posicion] == letra) {
                    System.out.println("DNI válido");
                    valido = true;
                } else {
                    System.err.println("DNI inválido");
                    valido=false;
                }
            } else {
                System.err.println("Formato de DNI inválido. Por favor ingrese un formato válido.");
                valido=false;
            }
        } while (!valido);
    }
}

				