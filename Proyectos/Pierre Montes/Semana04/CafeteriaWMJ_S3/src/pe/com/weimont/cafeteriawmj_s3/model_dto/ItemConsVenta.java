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
public class ItemConsVenta {
    private int idVenta;
    private int idEmpleado;
    private long fechaVenta;
    private long horaVenta;
    private int unidTotales;
    private double subTotal;
    private double igv;
    private double imporTotal;

    public ItemConsVenta(int idVenta, int idEmpleado, long fechaVenta, long horaVenta, int unidTotales, double subTotal, double igv, double imporTotal) {
        this.idVenta = idVenta;
        this.idEmpleado = idEmpleado;
        this.fechaVenta = fechaVenta;
        this.horaVenta = horaVenta;
        this.unidTotales = unidTotales;
        this.subTotal = subTotal;
        this.igv = igv;
        this.imporTotal = imporTotal;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public long getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(long fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public long getHoraVenta() {
        return horaVenta;
    }

    public void setHoraVenta(long horaVenta) {
        this.horaVenta = horaVenta;
    }

    public int getUnidTotales() {
        return unidTotales;
    }

    public void setUnidTotales(int unidTotales) {
        this.unidTotales = unidTotales;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getIgv() {
        return igv;
    }

    public void setIgv(float igv) {
        this.igv = igv;
    }

    public double getImporTotal() {
        return imporTotal;
    }

    public void setImporTotal(double imporTotal) {
        this.imporTotal = imporTotal;
    }
    
    
}
