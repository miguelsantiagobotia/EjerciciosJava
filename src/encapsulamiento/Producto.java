package encapsulamiento;

public class Producto {
    private String codigo;
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String codigo,String nombre,double precio,int stock){
        this.codigo = codigo;
        this.nombre = nombre;
        setPrecio(precio);
        setStock(stock);

    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getstock() {
        return stock;
    }

    public void setPrecio(double precio) {
        if (precio>=0)this.precio = precio;
        else System.out.println("Error: ingresar precio valido");
    }

    public void setStock(int stock) {
        if(stock>=0)this.stock = stock;
        else System.out.println("stock invalido");
    }
    public void vender(int unidades){
        if(unidades<=0){
            System.out.println("cantidad invalida");
    }
    else if ( unidades >stock ){
            System.out.println("Sin stock suficiente: Stock disponible"+stock);

        }
    else {
        stock-= unidades;
            System.out.println("Venta realizada: " + unidades + " unidades.");
        }
    }
    public void reabastecer(int unidades){
        if (unidades>0){
            stock += unidades;
            System.out.println("Stock actualizado.Nuevo stock :"+stock);
        }

    }
    public void aplicarDescuento(double porcentaje) {
        if (porcentaje < 0 || porcentaje > 100) {
            System.out.println("Porcentaje invalido. Debe estar entre 0 y 100.");
        } else {
            double descuento = precio * porcentaje / 100;
            precio -= descuento;
            System.out.println("Descuento del " + porcentaje + "% aplicado. Nuevo precio: $" + precio);
        }
    }

    public boolean hayStock() {
        return stock > 0;
    }
}
