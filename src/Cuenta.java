public class Cuenta {
    String titular;
    double cantidad;

    public Cuenta (String titular){
        this.titular = titular;
    }

    public Cuenta(String titular, double cantidad){
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "titular='" + titular + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }

    public void ingresar(double cantidad){
        if (cantidad > 0){
            this.cantidad = this.cantidad + cantidad;
        }
    }

    public void retirar(double cantidad){
        this.cantidad = this.cantidad - cantidad;
        if( this.cantidad < 0){
            this.cantidad = 0;
        }

    }
}
