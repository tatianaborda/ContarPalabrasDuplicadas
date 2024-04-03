import java.util.*;

public class Main {
    public static void main(String[] args) {
        String palabras = "hola como estas hola todo bien ? que se cuenta hola probando uno dos tres probando uno ";

    //creo una lista para poder recorrerla
        List<String> listaPalabras = Arrays.asList(palabras.split(" ")); //metodo split para dividir el string en substrings
        Map<String, Integer> ocurrencias = new HashMap<>();//creo un hashMap que sirva para mapear la cantidad de veces que aparece la palabra

        for (String palabra : listaPalabras) { //recorro la lista de palabras
            if (ocurrencias.containsKey(palabra)) { //Verifico si la palabra ya está en el map, incremento el valor
                ocurrencias.put(palabra, ocurrencias.get(palabra) + 1);
            } else {
                ocurrencias.put(palabra, 1); // sino, le asigno valor 1
            }
        }

        // Filtro el hashmap para obtener solo las palabras duplicadas
        for (Map.Entry<String, Integer> entry : ocurrencias.entrySet()) {
            if (entry.getValue() > 1) { //si el valor asociado a la palabra es mayor a 1, imprimo la palabra con la cantidad de veces que se repite
                System.out.println(entry);
            }
        }
    }

    }
