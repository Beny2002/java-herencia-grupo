public class Manager extends Empleado {

    protected int personasACargo;
    protected String titulo; 
    protected double presupuestoGestionado;
    protected int reunionesSemanales;

    public Manager(String dni, String nombre, int edad, double salarioBase,
                   int antiguedadAnios, int personasACargo, String titulo,
                   double presupuestoGestionado, int reunionesSemanales) {

        super(dni, nombre, edad, salarioBase, antiguedadAnios);
        this.personasACargo = personasACargo;
        this.titulo = titulo;
        this.presupuestoGestionado = presupuestoGestionado;
        this.reunionesSemanales = reunionesSemanales;
    }

    
    public int getPersonasACargo() {
        return personasACargo;
    }

    public void setPersonasACargo(int personasACargo) {
        this.personasACargo = personasACargo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPresupuestoGestionado() {
        return presupuestoGestionado;
    }

    public void setPresupuestoGestionado(double presupuestoGestionado) {
        this.presupuestoGestionado = presupuestoGestionado;
    }

    public int getReunionesSemanales() {
        return reunionesSemanales;
    }

    public void setReunionesSemanales(int reunionesSemanales) {
        this.reunionesSemanales = reunionesSemanales;
    }

    @Override
    public double calcularSalario() {
        double salario = super.calcularSalario();

        
        salario += personasACargo * 250;

        
        salario += presupuestoGestionado * 0.002;

        return salario;
    }

    
    public void aprobarHorasExtra(String idDesarrollador, double horas) {
        System.out.println("Horas extra aprobadas: " + horas +
                " horas para el desarrollador con ID " + idDesarrollador);
    }
}
