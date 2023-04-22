public class DescuentoFijo implements Descuento {
    private double valorDescuento;

    public DescuentoFijo(double valorDescuento) {
        this.valorDescuento = valorDescuento;
    }

    @Override
    public double calcularDescuento(double precioTotal) {
        return precioTotal - valorDescuento;
    }


}
