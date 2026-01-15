
public class Manager extends Empleado {
    protected int personasACargo;

    public Manager(String dni, String nombre, int edad, double salarioBase, int antiguedadAnios, int personasACargo) {
        super(dni, nombre, edad, salarioBase, antiguedadAnios);
        this.personasACargo = personasACargo;
    }

    public int getPersonasACargo() {
        return personasACargo;
    }

    public void setPersonasACargo(int personas) {
        this.personasACargo = personas;
    }

    @Override
    public double calcularSalario() {
        // Bonus por personas a cargo: +2% por cada persona
        return super.calcularSalario() + (salarioBase * 0.02 * personasACargo);
    }
}
