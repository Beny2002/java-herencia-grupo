import java.util.ArrayList;
import java.util.List;

public class Desarrollador extends Empleado {

    private String nivel; 
    private List<String> tecnologias;
    private double horasExtra;

    public Desarrollador(String dni, String nombre, int edad, double salarioBase,
                         int antiguedadAnios, String nivel) {

        super(dni, nombre, edad, salarioBase, antiguedadAnios);
        this.nivel = nivel;
        this.tecnologias = new ArrayList<>();
        this.horasExtra = 0;
    }

   
    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public List<String> getTecnologias() {
        return tecnologias;
    }

    public void addTecnologia(String tecnologia) {
        tecnologias.add(tecnologia);
    }

    public double getHorasExtra() {
        return horasExtra;
    }

   
    public void registrarHoraExtra(double horas) {
        if (horas > 0) {
            this.horasExtra += horas;
        }
    }


    @Override
    public double calcularSalario() {
        double salario = super.calcularSalario();

        // Plus por nivel
        switch (nivel.toUpperCase()) {
            case "MID":
                salario *= 1.15;
                break;
            case "SENIOR":
                salario *= 1.30;
                break;
            case "JUNIOR":
            default:
                
                break;
        }

        
        salario += horasExtra * 20;

        return salario;
    }
}
