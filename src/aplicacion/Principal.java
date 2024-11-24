package aplicacion;
import dominio.*;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Principal {
    public static void main(String[] args){
        BandaMusica bd = new BandaMusica("Banda de Música de CEU Montepríncipe");
        Actuacion act1 = new Actuacion(LocalDate.of(2024, 11, 24));
        bd.annadirActuacion(act1);
        Director dir = new Director("Matthew Puente-Villegas Michavila");
        act1.annadirParticipante(dir);
        MusicoSocio msc1 = new MusicoSocio("Armin van Buuren", "productor", 1);
        act1.annadirParticipante(msc1);
        MusicoRefuerzo msr1 = new MusicoRefuerzo("Sultán de Brunei", "triangulo", new BigDecimal(60000));
        act1.annadirParticipante(msr1);
        Actuacion act2 = new Actuacion(LocalDate.of(2024, 12, 16));
        bd.annadirActuacion(act2);
        MusicoRefuerzo msr2 = new MusicoRefuerzo("Kung Fu Panda", "cimbales", new BigDecimal(2));
        act2.annadirParticipante(dir);
        act2.annadirParticipante(msc1);
        act2.annadirParticipante(msr2);
        System.out.println(bd);
    }
}