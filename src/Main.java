import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("____________");

        String mensaje = "ahola que tal";
        String mensajeCifrado = Arrayystrings.ejercicioDos.cifrado(mensaje);
        System.out.println(mensajeCifrado);

        System.out.println("Hello world!");

        Arrayystrings.ejercicioUnob.OrdenadorNumeros ordenador = new Arrayystrings.ejercicioUnob.OrdenadorNumeros();
        int[] numerosOrdenados = ordenador.ordenarNumeros(3, 1, 2, "ascendente");
        System.out.println(Arrays.toString(numerosOrdenados));

        int cantidad = Arrayystrings.ejercicioUnoa.contarlugardeletraenString();
        System.out.println(cantidad);

        Arrayystrings.ejercicioUnoc calculadora = new Arrayystrings.ejercicioUnoc();
        int[] numeros = {1, 2, 3, 4, 5};
        int x = 2;
        int suma = calculadora.sumarNumerosMayoresQueX(numeros, x);
        System.out.println(suma);

        System.out.println("Good by world!");
    }
}