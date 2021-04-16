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
public class ItemDetVenta {
    private int idDet_Venta;
    private int idVenta;
    private int idArticulo;
    private int cant;
    private int precioUnit;
    private double importe;

    public ItemDetVenta(int idDet_Venta, int idVenta, int idArticulo, int cant, int precioUnit, double importe) {
        this.idDet_Venta = idDet_Venta;
        this.idVenta = idVenta;
        this.idArticulo = idArticulo;
        this.cant = cant;
        this.precioUnit = precioUnit;
        this.importe = importe;
    }

    public int getIdDet_Venta() {
        return idDet_Venta;
    }

    public void setIdDet_Venta(int idDet_Venta) {
        this.idDet_Venta = idDet_Venta;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
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

    public int getPrecioUnit() {
        return precioUnit;
    }

    public void setPrecioUnit(int precioUnit) {
        this.precioUnit = precioUnit;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
    
    
}
