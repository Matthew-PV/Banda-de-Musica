package dominio;

public class Director extends Musico {


    //Constructores
    public Director() {super("","");}
    public Director(String nombre) {super(nombre,"");}


    //Métodos de Director
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString()).append("director");
        return sb.toString();
    }
}