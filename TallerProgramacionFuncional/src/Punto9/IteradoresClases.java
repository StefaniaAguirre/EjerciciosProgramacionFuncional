package Punto9;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class IteradoresClases {

    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Juan", "Maria", "Pedro", "Ana", "Luis", "Maria", "Carlos", "Daniela", "Camila", "Daniel", "Juliana", "Diana");

        imprimirNombresFiltrados(nombres, "Maria" );
    }

    public static List<String> filtrarNombres(List<String> nombres, String parametro){
       return  nombres.stream().filter(nombre -> nombre.equals(parametro)).collect(Collectors.toList());
    }

    public static void imprimirNombresFiltrados(List<String> nombres, String parametro){
        Optional.ofNullable(filtrarNombres(nombres, parametro))
                .ifPresent(lista -> lista.forEach(System.out::println));
    }

}
