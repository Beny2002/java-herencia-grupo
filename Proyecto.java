import java.util.ArrayList;
import java.util.List;

public class Proyecto {

    private String idProyecto;
    private String nombre;
    private List<String> desarrolladoresAsignados; 
    private double horasEstimadas;
    private double horasReales;
    private String estado; 

    public Proyecto(String idProyecto, String nombre, double horasEstimadas) {
        this.idProyecto = idProyecto;
        this.nombre = nombre;
        this.horasEstimadas = horasEstimadas;
        this.horasReales = 0;
        this.estado = "PLANIFICADO";
        this.desarrolladoresAsignados = new ArrayList<>();
    }

    public void asignarDesarrollador(String idDesarrollador) {
        if (!desarrolladoresAsignados.contains(idDesarrollador)) {
            desarrolladoresAsignados.add(idDesarrollador);
        }
    }

    
    public void registrarHoras(String idDesarrollador, double horas) {
        if (desarrolladoresAsignados.contains(idDesarrollador) && horas > 0) {
            horasReales += horas;
            estado = "EN_CURSO";
        }
    }

    
    public double calcularProductividad() {
        if (horasReales == 0) {
            return 0;
        }
        return (horasEstimadas / horasReales) * 100;
    }

    
    public String getEstado() {
        return estado;
    }

    public double getHorasReales() {
        return horasReales;
    }
}
