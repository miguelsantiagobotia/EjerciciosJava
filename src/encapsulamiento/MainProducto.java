package encapsulamiento;

public class MainProducto {
    public static void main(String[] args) {
        Producto p = new Producto("p-001", "rtx 3070TI", 180000, 180);
        System.out.println("Producto" + p.getCodigo());
        System.out.println("Producto" + p.getNombre());
        System.out.println("Producto" + p.getPrecio());
        System.out.println("Producto" + p.getstock());
        p.vender(100);
        p.vender(100); //debe fallar
        p.reabastecer(20);
        System.out.println("Stock final: " + p.getstock());
        // Descuento del 15%
        p.aplicarDescuento(15);

        // Prueba con un porcentaje inválido
        p.aplicarDescuento(150);

        // Verificar si hay stock
        if (p.hayStock()) {
            System.out.println("Hay stock disponible: " + p.getstock() + " unidades.");
        } else {
            System.out.println("Producto agotado.");
        }

        // Vender todo y volver a verificar
        p.vender(20);
        System.out.println("¿Hay stock? " + (p.hayStock() ? "Si" : "No"));
    }



}
