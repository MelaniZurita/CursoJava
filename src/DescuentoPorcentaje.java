public class DescuentoPorcentaje implements Descuento {
    private double porcentajeDescuento;

    public DescuentoPorcentaje(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public double calcularDescuento(double precioTotal) {
        return precioTotal * (1 - porcentajeDescuento / 100);
    }
}

