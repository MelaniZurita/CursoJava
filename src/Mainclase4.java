public class Mainclase4 {
    private static String calcularTotal;

    public static void main(String[] args) {
        productoclase4 jabonEnPolvo = new productoclase4("jabón en polvo", 40);
        productoclase4 esponjas = new productoclase4("esponjas", 10);
        productoclase4 chocolates = new productoclase4("chocolates", 100);

        carritoclase4 carrito = new carritoclase4();
        carrito.agregarProducto(jabonEnPolvo);
        carrito.agregarProducto(esponjas);
        carrito.agregarProducto(chocolates);

        double precio = carrito.calcularTotal();
        System.out.println("El total del carrito es: $" + carrito.calcularTotal());
        String DescuentoFijo = "20";
        System.out.println("El total con descuento es: " DescuentoFijo);
    }
}