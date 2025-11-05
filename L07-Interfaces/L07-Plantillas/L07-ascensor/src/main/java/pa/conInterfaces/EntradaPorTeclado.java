package pa.conInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EntradaPorTeclado implements IEntradaDatos {
    private final Scanner sc;

    public EntradaPorTeclado() {
        sc = new Scanner(System.in);
    }

    @Override
    public int[] obtenerDatos() {
        List<Integer> peticiones = new ArrayList<>();

        System.out.println("Introduce pisos de destino (finaliza con 'A'):");
        while (sc.hasNext()) {
            if (sc.hasNextInt()) {
                peticiones.add(sc.nextInt());
            } else {
                String token = sc.next();
                if (token.equalsIgnoreCase("A")) break;
            }
        }

        int[] resultado = new int[peticiones.size()];
        for (int i = 0; i < peticiones.size(); i++) {
            resultado[i] = peticiones.get(i);
        }

        System.out.print("Peticiones leídas: ");
        for (int x : resultado) System.out.print(x + " ");
        System.out.println();

        return resultado;
    }
}
