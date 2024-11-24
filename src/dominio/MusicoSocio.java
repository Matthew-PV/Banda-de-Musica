package dominio;

public class MusicoSocio extends Musico {
    private int numeroSocio;


    //Constructores
    public MusicoSocio() {numeroSocio = -1;}
    public MusicoSocio(String nombre, String instrumento, int numeroSocio) {
        super(nombre, instrumento);
        this.numeroSocio = numeroSocio;
    }


    //getters y Setters
    public int getNumeroSocio() {return numeroSocio;}
    public void setNumeroSocio(int numeroSocio) {this.numeroSocio = numeroSocio;}


    //Métodos de MusicoSocio
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString()).append(", número de socio: ").append(numeroSocio);
        return sb.toString();
    }
}