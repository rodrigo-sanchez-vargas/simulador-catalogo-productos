public class Main {
    public static void main(String[] args) {
        int[] codigos = {105, 202, 305, 321, 505};
        double[] precios = {35.00, 78.90, 24.50, 50.00, 39.90};

        CatalogoProductos catalogoProductos = new CatalogoProductos(codigos, precios);
        System.out.println("Conteo total de productos: " + catalogoProductos.cantidadProductos());
        System.out.println("Precio del producto codigo 202: $" + catalogoProductos.consultarPrecio(202) + " USD.");
        System.out.println("¿Existe el producto con código 105?: " + catalogoProductos.existeProducto(105));
        System.out.println("Prueba consulta de precio de un producto inexistente (974): " + catalogoProductos.consultarPrecio(974));
        System.out.println("¿Existe el producto con código 777?: " + catalogoProductos.existeProducto(777));
    }        
}
