/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.weimont.cafeteriawmj_s3.model_dto;

/**
 *
 * @author montespierreg
 */
public class ItemModel {
    private int idDet_Venta;
    private int idArticulo;
    private int cant;
    private int precio;
    private double Unit;
    private double importe;
    
    public ItemModel(){
        
    }

    public ItemModel(int idDet_Venta, int idArticulo, int cant, int precio, double Unit, double importe) {
        this.idDet_Venta = idDet_Venta;
        this.idArticulo = idArticulo;
        this.cant = cant;
        this.precio = precio;
        this.Unit = Unit;
        this.importe = importe;
    }

    public int getIdDet_Venta() {
        return idDet_Venta;
    }

    public void setIdDet_Venta(int idDet_Venta) {
        this.idDet_Venta = idDet_Venta;
    }

    public int getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public double getUnit() {
        return Unit;
    }

    public void setUnit(double Unit) {
        this.Unit = Unit;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
    
    
}
