public class Empleado extends Persona {
    protected double salarioBase;
    protected int antiguedadAnios;

    // Creo el constructor con sus argumentos y los ininicalizo 
    public Empleado(String dni, String nombre, int edad, double salarioBase, int antiguedadAnios) {
        super(dni, nombre, edad);
        this.salarioBase = salarioBase;
        this.antiguedadAnios = antiguedadAnios;
    }

    // Método para calcular el salario
    public double calcularSalario() {
        // salario base + bono por antigüedad 100 * año 
        return salarioBase + (antiguedadAnios * 100);
    }

    // Método toString sobrescrito
    @Override
    public String toString() {
        return "Empleado{" +
                "dni='" + getDni() + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", salarioBase=" + salarioBase +
                ", antiguedadAnios=" + antiguedadAnios +
                ", salarioCalculado=" + calcularSalario() +
                '}';
    }
}