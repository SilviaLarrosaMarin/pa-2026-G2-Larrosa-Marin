package pa.conInterfaces;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class EntradaDesdeFichero implements IEntradaDatos {
    private int lineaActual;
    private String rutaFichero;
    private int numLineasFichero;

    public EntradaDesdeFichero() {
        lineaActual = 0;
        rutaFichero = "src/main/resources/peticiones-fichero.txt";
        try {
            numLineasFichero = Files.readAllLines(Paths.get(rutaFichero)).size();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public int[] obtenerDatos() {
        int[] resultado;
        List<Integer> datos = new ArrayList<>();

        if (lineaActual < numLineasFichero) {
            try {
                String linea = Files.readAllLines(Paths.get(rutaFichero)).get(lineaActual);
                datos = Pattern.compile("\\s+")
                        .splitAsStream(linea)
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());
            } catch (IOException ex) {
                ex.printStackTrace();
            }

            lineaActual++;
            resultado = new int[datos.size()];
            for (int i = 0; i < datos.size(); i++) {
                resultado[i] = datos.get(i);
            }

            System.out.print("  Peticiones leídas: [");
            for (int i = 0; i < resultado.length; i++) {
                System.out.print(" " + resultado[i]);
            }
            System.out.println(" ]");
        } else resultado = new int[0];

        return resultado;
    }
}
