import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GestorFichajes {

    private Map<String, List<Fichaje>> fichajes;

    public GestorFichajes() {
        fichajes = new HashMap<>();
    }

    public void registrarEntrada(String idEmpleado) {
        Fichaje f = new Fichaje(
                String.valueOf(System.currentTimeMillis()),
                idEmpleado,
                LocalDateTime.now(),
                "ENTRADA"
        );

        if (!fichajes.containsKey(idEmpleado)) {
            fichajes.put(idEmpleado, new ArrayList<>());
        }
        fichajes.get(idEmpleado).add(f);
    }

    public void registrarSalida(String idEmpleado) {
        Fichaje f = new Fichaje(
                String.valueOf(System.currentTimeMillis()),
                idEmpleado,
                LocalDateTime.now(),
                "SALIDA"
        );

        if (!fichajes.containsKey(idEmpleado)) {
            fichajes.put(idEmpleado, new ArrayList<>());
        }
        fichajes.get(idEmpleado).add(f);
    }

    public List<Fichaje> obtenerFichajesDelDia(String idEmpleado, LocalDate fecha) {
        List<Fichaje> resultado = new ArrayList<>();

        if (fichajes.containsKey(idEmpleado)) {
            for (Fichaje f : fichajes.get(idEmpleado)) {
                if (f.getFechaHora().toLocalDate().equals(fecha)) {
                    resultado.add(f);
                }
            }
        }
        return resultado;
    }

    public double calcularHorasMensuales(String idEmpleado, int mes, int anio) {
        double horas = 0;
        LocalDateTime entrada = null;

        if (fichajes.containsKey(idEmpleado)) {
            for (Fichaje f : fichajes.get(idEmpleado)) {

                if (f.getTipo().equals("ENTRADA")) {
                    entrada = f.getFechaHora();
                }

                if (f.getTipo().equals("SALIDA") && entrada != null) {
                    if (entrada.getMonthValue() == mes && entrada.getYear() == anio) {
                        horas += Duration.between(entrada, f.getFechaHora()).toMinutes() / 60.0;
                    }
                    entrada = null;
                }
            }
        }
        return horas;
    }

    public String generarReporteAsistencia(String idEmpleado) {
        String texto = "Reporte de asistencia del empleado " + idEmpleado + "\n";
