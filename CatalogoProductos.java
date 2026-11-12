public class CatalogoProductos {
    private int[] codigos;
    private double[] precios;
    
    public CatalogoProductos(int[] codigos, double[] precios) {
        this.codigos = codigos;
        this.precios = precios;
    }

    public double consultarPrecio(int codigo) {
        if (this.codigos == null || this.codigos.length == 0) {
            return - 1;
        }
        int inicio = 0;
        int fin = this.codigos.length - 1;

        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;
            if (this.codigos[medio] == codigo) {
                return this.precios[medio];
            } else if (this.codigos[medio] < codigo) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        return - 1; 
    }

    public boolean existeProducto(int codigo) {
        double buscador = consultarPrecio(codigo);
        if (buscador != - 1) {
            return true;
        } else {
            return false;
        }
    }

    public int cantidadProductos() {
        if (this.codigos == null || this.codigos.length == 0) {
            return 0;
        }
        return this.codigos.length;
    }
}