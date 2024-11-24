package dominio;

public class Musico {
    private String nombre, instrumento;


    //Constructores
    public Musico() {
        nombre = "";
        instrumento = "";
    }
    public Musico(String nombre) {this.nombre = nombre;}
    public Musico(String nombre, String instrumento) {
        this.nombre = nombre;
        this.instrumento = instrumento;
    }


    //Getters y Setters
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public String getInstrumento() {return instrumento;}
    public void setInstrumento(String instrumento) {this.instrumento = instrumento;}


    //Métodos de Musico
    public String toString() {
        StringBuilder sb = new StringBuilder(nombre).append(", ").append(instrumento);
        return sb.toString();
    }
}