public class Venta {
    private String Vendedor;
    private String Cliente;
    private String vehiculoComprado;

    public Venta(String Vendedor, String Cliente, String vehiculoComprado){
        this.Vendedor = Vendedor;
        this.Cliente = Cliente;
        this.vehiculoComprado = vehiculoComprado;
    }
    public String getVendedor(){
        return Vendedor;
    }
    public void setVendedor(String Vendedor){
        this.Vendedor = Vendedor;
    }
    public String getCliente(){
        return Cliente;
    }
    public void setCliente(String Cliente){
        this.Cliente = Cliente;
    }
    public String getVehiculoComprado(){
        return vehiculoComprado;
    }
    public void setVehiculoComprado(String vehiculoComprado){
        this.vehiculoComprado = vehiculoComprado;
    }
}
