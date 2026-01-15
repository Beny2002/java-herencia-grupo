
public class Desarrollador extends Empleado {
    private String lenguajePrincipal;

    public Desarrollador(String dni, String nombre, int edad, double salarioBase, int antiguedadAnios, String lenguajePrincipal) {
        super(dni, nombre, edad, salarioBase, antiguedadAnios);
        this.lenguajePrincipal = lenguajePrincipal;
    }

    public String getLenguajePrincipal() {
        return lenguajePrincipal;
    }

    public void setLenguajePrincipal(String lenguaje) {
        this.lenguajePrincipal = lenguaje;
    }

    @Override
    public double calcularSalario() {
        // Bonus por ser desarrollador +10% al salario calculado del empleado
        return super.calcularSalario() * 1.10;
    }
}
