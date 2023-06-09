package co.unicauca.tallerPolimorfismo.modelo;
import java.util.Date;
public class ViajeFamiliar extends Viaje{
    private int familia;
    public ViajeFamiliar(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada, int familia){
        super(origen, destino, costo, fechaSalida, fechaLlegada);
        this.familia = familia;
    }
    public void setFamilia(int familia){
        this.familia = familia;
    }
    public int getFamilia(){
        return familia;
    }
    @Override
    public String descripcion() {
        return "Viaje para disfrutar con toda tu familia";
    }
    @Override
    public String cualquierMetodo2(){
        return "Metodo implementado en la clase hija viaje familiar";
    }
}
