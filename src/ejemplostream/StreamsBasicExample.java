package ejemplostream;

import java.util.ArrayList;
import java.util.List;

public class StreamsBasicExample {

    private List<String> lista;
    private List<String> numeros;

    /* Instancia de la clase y lleno los arreglos como atributos */
    public StreamsBasicExample() {
        lista = new ArrayList<>();
        lista.add("Scala");
        lista.add("Java");
        lista.add("Golang");
        lista.add("JavaScript");
        lista.add("C++");
        lista.add("VisualBasic");
        lista.add("Python");
        lista.add("");

        numeros = new ArrayList<>();
        numeros.add("1");
        numeros.add("3");
        numeros.add("2");
    }

    public void filtrar() {

        lista.stream().filter(x -> x.startsWith("J")).forEach(System.out::println);
        lista.stream().filter(lenguajes -> lenguajes.startsWith("J")).forEach(System.out::println);
        lista.stream().filter(lenguajes -> lenguajes.contains("l")).forEach(System.out::println);
        lista.stream().filter(lenguajes -> lenguajes.endsWith("a")).forEach(System.out::println);
    }

    public void ordenar() {
        lista.stream().sorted().forEach(System.out::println);
        lista.stream().sorted((x, y) -> x.compareTo(y)).forEach(System.out::println);
        lista.stream().sorted((x, y) -> y.compareTo(x)).forEach(System.out::println);

    }

    public void transformar() {
        lista.stream().map(String::toUpperCase).forEach(System.out::println);
        numeros.stream().mapToInt(num -> Integer.parseInt(num)).forEach(System.out::println);
        numeros.stream().map(num -> Integer.parseInt(num) + 1).forEach(System.out::println);
        numeros.stream().map(num -> Integer.parseInt(num) + num).forEach(System.out::println);
       
    }

    public void limitar() {
        lista.stream().limit(1).forEach(System.out::println);
        lista.stream().sorted((x, y) -> x.compareTo(y)).limit(1).forEach(System.out::println);
        lista.stream().filter(x -> x.startsWith("J")).limit(1).forEach(System.out::println);

    }

    public void contar() {
        long contLista = lista.stream().count();
        long contListaNumeros = numeros.stream().count();
        long contListaFiltrada = lista.stream().filter(x -> x.startsWith("J")).count();
        System.out.print("contador lista " + contLista + "contador lista numeros " + contListaNumeros + "contador lista filtrada " + contListaFiltrada);
    }

    /* Metodo main para probar las interacciones */
    public static void main(String[] args) {
        StreamsBasicExample example = new StreamsBasicExample();

        //example.filtrar();
        //example.contar();
        //example.limitar();
        //example.ordenar();
        example.transformar();
    }

}
