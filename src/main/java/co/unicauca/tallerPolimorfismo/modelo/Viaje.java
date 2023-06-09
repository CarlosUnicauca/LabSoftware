package co.unicauca.tallerPolimorfismo.modelo;
import java.util.Date;
public abstract class Viaje {
    private String origen;
    private String destino;
    private int costo;
    private Date fechaSalida;
    private Date fechaLlegada;
    public Viaje(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada){
        this.origen = origen;
        this.destino = destino;
        this.costo = costo;
        this.fechaSalida = fechaSalida;
        this.fechaLlegada = fechaLlegada;
    }
    public String getOrigen() {
        return origen;
    }
    public void setOrigen(String origen) {
        this.origen = origen;
    }
    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }
    public int getCosto() {
        return costo;
    }
    public void setCosto(int costo) {
        this.costo = costo;
    }
    public Date getFechaSalida() {
        return fechaSalida;
    }
    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
    public Date getFechaLlegada() {
        return fechaLlegada;
    }
    public void setFechaLlegada(Date fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }
    public abstract String descripcion();
    public String cualquierMetodo(){
        return "Cualquier metodo implementado en la clase base";
    }
    public String cualquierMetodo2(){
        return "Cualquier metodo2 implementado en la clase base";
    }
}
