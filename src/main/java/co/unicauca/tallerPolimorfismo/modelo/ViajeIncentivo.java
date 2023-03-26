package co.unicauca.tallerPolimorfismo.modelo;
import java.util.Date;
public class ViajeIncentivo extends Viaje{
    private String empresa;
    public ViajeIncentivo(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada, String empresa){
        super(origen, destino, costo, fechaSalida, fechaLlegada);
        this.empresa = empresa;
    }
    public void setEmpresa(String empresa){
        this.empresa = empresa;
    }
    public String getEmpresa(){
        return empresa;
    }
    @Override
    public String descripcion() {
        return "Viaje incentivo que te envia la empresa"+ empresa;
    }
    @Override
    public String cualquierMetodo2(){
        return "Metodo implementado en la clase hija de viaje de incentivo";
    }
}
