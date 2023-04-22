import java.util.ArrayList;
import java.util.List;

public class carritoclase4 {
    private List<productoclase4> productos;

    public carritoclase4() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(productoclase4 producto) {
        productos.add(producto);
    }

    public double calcularTotal() {
        double total = 0;
        for (productoclase4 producto : productos) {
            total += producto.getPrecioUnitario();
        }
        return total;
    }
}