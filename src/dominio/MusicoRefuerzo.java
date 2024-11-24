package dominio;

import java.math.BigDecimal;

public class MusicoRefuerzo extends Musico {
    private BigDecimal dinero;


    //Constructores
    public MusicoRefuerzo() {dinero = BigDecimal.valueOf(0);}
    public MusicoRefuerzo(String nombre, String instrumento, BigDecimal dinero) {
        super(nombre, instrumento);
        this.dinero = dinero;
    }


    //Getters y Setters
    public BigDecimal getDinero() {return dinero;}
    public void setDinero(BigDecimal dinero) {this.dinero = dinero;}


    //Métodos de MusicoRefuerzo
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString()).append(", ").append(dinero.doubleValue()).append("€");
        return sb.toString();
    }
}