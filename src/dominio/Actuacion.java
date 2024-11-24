package dominio;
import java.time.LocalDate;
import java.util.ArrayList;

public class Actuacion {
    private LocalDate fecha;
    private ArrayList<Musico> musicos;


    //Constructores
    public Actuacion() {
        musicos = new ArrayList<>();}
    public Actuacion(LocalDate fecha) {
        this.fecha = fecha;
        musicos = new ArrayList<>();
    }


    //Getters y Setters
    public LocalDate getFecha() {return fecha;}
    public void setFecha(LocalDate fecha) {this.fecha = fecha;}
    public ArrayList<Musico> getMusicos() {return musicos;}
    public void setMusicos(ArrayList<Musico> musicos) {this.musicos = musicos;}


    //Trabajo con Musico
    public void annadirParticipante(Musico musico) {musicos.add(musico);}


    //Métodos de Actuación
    public String toString() {
        StringBuilder sb = new StringBuilder("Fecha de actuación: ").append(fecha).append('\n');
        if (musicos.isEmpty()) {
            sb.append("Sin participantes.\n");
        }
        else {
            for (Musico musico : musicos) {
                sb.append(musico).append('\n');
            }
        }
        return sb.toString();
    }
}