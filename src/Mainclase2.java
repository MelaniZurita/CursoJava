import java.util.Arrays;

public class Mainclase2 {
    public static void main(String[] args) {
        System.out.println("____________");
    //arrays y strings
        String mensaje = "ahola que tal";
        String mensajeCifrado = Arraysystrings.ejercicioDos.cifrado(mensaje);
        System.out.println(mensajeCifrado);

        System.out.println("Hello world!");

        Arraysystrings.ejercicioUnob.OrdenadorNumeros ordenador = new Arraysystrings.ejercicioUnob.OrdenadorNumeros();
        int[] numerosOrdenados = ordenador.ordenarNumeros(3, 1, 2, "ascendente");
        System.out.println(Arrays.toString(numerosOrdenados));

        int cantidad = Arraysystrings.ejercicioUnoa.contarlugardeletraenString();
        System.out.println(cantidad);

        Arraysystrings.ejercicioUnoc calculadora = new Arraysystrings.ejercicioUnoc();
        int[] numeros = {1, 2, 3, 4, 5};
        int x = 2;
        int suma = calculadora.sumarNumerosMayoresQueX(numeros, x);
        System.out.println(suma);
    //fin ejercicios arraysystrings
        System.out.println("Good by world!");
    }
}