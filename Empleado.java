import java.time.LocalDate;
import java.time.Period;

public class Empleado extends Persona {

    private String idEmpleado;
    private double salarioBase;
    private LocalDate fechaContratacion;
    private String departamento;
    private double jornadaHoraria; // horas/día
    private boolean activo;

    public Empleado(String idEmpleado,
                    String dni,
                    String nombre,
                    LocalDate fechaNacimiento,
                    String email,
                    String telefono,
                    double salarioBase,
                    LocalDate fechaContratacion,
                    String departamento,
                    double jornadaHoraria,
                    boolean activo) {

        super(dni, nombre, fechaNacimiento, email, telefono);
        this.idEmpleado = idEmpleado;
        this.salarioBase = salarioBase;
        this.fechaContratacion = fechaContratacion;
        this.departamento = departamento;
        this.jornadaHoraria = jornadaHoraria;
        this.activo = activo;
    }

    public int calcularAntiguedad() {
        return Period.between(fechaContratacion, LocalDate.now()).getYears();
    }

    
    public double calcularSalario() {
        int antiguedad = calcularAntiguedad();
        double plusAntiguedad = salarioBase * 0.03 * antiguedad;
        return salarioBase + plusAntiguedad;
    }

    // Getters básicos
    public String getIdEmpleado() {
        return idEmpleado;
    }

    public String getDepartamento() {
        return departamento;
    }

    public boolean isActivo() {
        return activo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "idEmpleado='" + idEmpleado + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", departamento='" + departamento + '\'' +
                ", antiguedad=" + calcularAntiguedad() +
                ", salario=" + calcularSalario() +
                ", activo=" + activo +
                '}';
    }
}
