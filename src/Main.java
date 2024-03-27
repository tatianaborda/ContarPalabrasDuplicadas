import java.util.*;

public class Main {
    public static void main(String[] args) {
        String palabras = "hola como estas hola todo bien ? que se cuenta hola probando uno dos tres probando uno ";
        
    //creo una lista para poder recorrerla
        List<String> listaPalabras = Arrays.asList(palabras.split(" ")); //metodo split para dividir el string en substrings
        Set<String> setTemporal = new HashSet<>(); // creo un conjunto temporal usando hashset que no permite valores dulicados
        List<String> palabrasDuplicadas = new ArrayList<>(); //esta lista vacía se llenará de los duplicados luego de recorrer la lista de palabras

        for (String palabra : listaPalabras) { //recorro la lista y pregunto si encuentra duplicados
            if (!setTemporal.add(palabra)) { //si ya no puede agregar al set quiere decir que está duplicada
                palabrasDuplicadas.add(palabra); //lo agrego a la lista palabrasDuplicadas
            }
        }

        Map<String, Integer> ocurrencias = new HashMap<>(); //creo un hashMap que sirva para mapear la cantidad de veces que aparece la palabra

        for(String palabra : palabrasDuplicadas ){ //recorro la lista de palabras duplicadas
            ocurrencias.put(palabra, Collections.frequency(listaPalabras, palabra)); //uso el metodo put para establecer la palabra como key y la frecuencia u ocurrencia como el valor
        }

        System.out.println(ocurrencias);
        }

    }
