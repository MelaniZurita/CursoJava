public class Arraysystrings {
    public class ejercicioUnoa {
        public static int contarlugardeletraenString() {
            String palabra = "oso";
            char unaLetra = 'o';
            int cantidadApariciones = 0;
            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(i) == unaLetra) {
                    cantidadApariciones++;
                }
            }
            return cantidadApariciones;
        }
    }
    public class ejercicioUnob {
        public static class OrdenadorNumeros {

            public int[] ordenarNumeros(int num1, int num2, int num3, String orden) {
                int[] numeros = {num1, num2, num3};

                if (orden.equals("ascendente")) {
                    for (int i = 0; i < numeros.length - 1; i++) {
                        for (int j = i + 1; j < numeros.length; j++) {
                            if (numeros[i] > numeros[j]) {
                                int temp = numeros[i];
                                numeros[i] = numeros[j];
                                numeros[j] = temp;
                            }
                        }
                    }
                } else if (orden.equals("descendente")) {
                    for (int i = 0; i < numeros.length - 1; i++) {
                        for (int j = i + 1; j < numeros.length; j++) {
                            if (numeros[i] < numeros[j]) {
                                int temp = numeros[i];
                                numeros[i] = numeros[j];
                                numeros[j] = temp;
                            }
                        }
                    }
                }

                return numeros;
            }
        }
    }
    public static class ejercicioUnoc {
        public int sumarNumerosMayoresQueX(int[] numeros, int x) {
            int suma = 0;

            for (int num : numeros) {
                if (num > x) {
                    suma += num;
                }
            }

            return suma;
        }

    }

    public class ejercicioDos {
        public static String cifrado(String mensaje) {
            String alfabeto = "abcdefghijklmnopqrstuvwxyz ";
            int desplazamiento = 2;
            String mensajeCifrado = "";

            for (int i = 0; i < mensaje.length(); i++) {
                char letra = mensaje.charAt(i);
                int posicion = alfabeto.indexOf(letra);
                int nuevaPosicion = (posicion + desplazamiento) % alfabeto.length();
                char nuevaLetra = alfabeto.charAt(nuevaPosicion);
                mensajeCifrado += nuevaLetra;
            }

            return mensajeCifrado;
        }

    }


}
