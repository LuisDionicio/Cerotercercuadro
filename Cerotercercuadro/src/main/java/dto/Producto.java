package dto;

public class Producto {

private int codiprod;
private String nombprod;
private double precprod;
private double stocprod;

    public Producto(int codiprod, String nombprod, double precprod, double stocprod) {
        this.codiprod = codiprod;
        this.nombprod = nombprod;
        this.precprod = precprod;
        this.stocprod = stocprod;
    }

    public int getCodiprod() {
        return codiprod;
    }

    public void setCodiprod(int codiprod) {
        this.codiprod = codiprod;
    }

    public String getNombprod() {
        return nombprod;
    }

    public void setNombprod(String nombprod) {
        this.nombprod = nombprod;
    }

    public double getPrecprod() {
        return precprod;
    }

    public void setPrecprod(double precprod) {
        this.precprod = precprod;
    }

    public double getStocprod() {
        return stocprod;
    }

    public void setStocprod(double stocprod) {
        this.stocprod = stocprod;
    }


    
}