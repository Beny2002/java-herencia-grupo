import java.time.LocalDateTime;

public class Fichaje {

    private String idFichaje;
    private String idEmpleado;
    private LocalDateTime fechaHoraEntrada;
    private LocalDateTime fechaHoraSalida;
    private TipoFichaje tipo;

    public enum TipoFichaje {
        ENTRADA, SALIDA, PAUSA
    }

    public Fichaje(String idFichaje, String idEmpleado, TipoFichaje tipo) {
        this.idFichaje = idFichaje;
        this.idEmpleado = idEmpleado;
        this.tipo = tipo;

        if (tipo == TipoFichaje.ENTRADA) {
            this.fechaHoraEntrada = LocalDateTime.now();
        } else if (tipo == TipoFichaje.SALIDA) {
            this.fechaHoraSalida = LocalDateTime.now();
        }
    }

    // Getters
    public String getIdEmpleado() {
        return idEmpleado;
    }

    public LocalDateTime getFechaHoraEntrada() {
        return fechaHoraEntrada;
    }

    public LocalDateTime getFechaHoraSalida() {
        return fechaHoraSalida;
    }

    public TipoFichaje getTipo() {
        return tipo;
    }
}
 