package model;


public class Producto {
    private int idProducto;
    private String nameProducto;
    private int categoriaProducto;
    private int cantDispoProducto;
    private int valorCompraProducto;
    private int valorVentaProducto;

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNameProducto() {
        return nameProducto;
    }

    public void setNameProducto(String nameProducto) {
        this.nameProducto = nameProducto;
    }

    public int getCategoriaProducto() {
        return categoriaProducto;
    }

    public void setCategoriaProducto(int categoriaProducto) {
        this.categoriaProducto = categoriaProducto;
    }

    public int getCantDispoProducto() {
        return cantDispoProducto;
    }

    public void setCantDispoProducto(int cantDispoProducto) {
        this.cantDispoProducto = cantDispoProducto;
    }

    public int getValorCompraProducto() {
        return valorCompraProducto;
    }

    public void setValorCompraProducto(int valorCompraProducto) {
        this.valorCompraProducto = valorCompraProducto;
    }

    public int getValorVentaProducto() {
        return valorVentaProducto;
    }

    public void setValorVentaProducto(int valorVentaProducto) {
        this.valorVentaProducto = valorVentaProducto;
    }  
    
}
