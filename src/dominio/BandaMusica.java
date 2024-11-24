package dominio;

import java.util.ArrayList;

public class BandaMusica {
    private String nombre;
    private ArrayList<Actuacion> actuaciones;


    //Constructores
    public BandaMusica() {
        nombre = "";
        actuaciones = new ArrayList<Actuacion>();
    }
    public BandaMusica(String nombre) {
        this.nombre = nombre;
        actuaciones = new ArrayList<Actuacion>();
    }


    //Getters y Setters
    public String getNombre() {return nombre;}
    public BandaMusica setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }
    public ArrayList<Actuacion> getActuaciones() {return actuaciones;}
    public BandaMusica setActuaciones(ArrayList<Actuacion> actuaciones) {
        this.actuaciones = actuaciones;
        return this;
    }


    //Trabajo con Actuación
    public BandaMusica annadirActuacion(Actuacion actuacion) {
        actuaciones.add(actuacion);
        return this;
    }


    //Métodos de BandaMusica
    public String toString() {
        StringBuilder sb = new StringBuilder(nombre.toUpperCase()).append('\n');
        if (actuaciones.isEmpty()) {
            sb.append("No hay actuaciones actualmente.");
        }
        else {
            for (Actuacion actuacion : actuaciones) {
                sb.append('\n').append(actuacion);
            }
        }
        return sb.toString();
    }
}