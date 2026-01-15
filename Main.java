package com.grupo.empleados;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Empleado e1 = new Empleado("111A", "Carlos", 30, 2000, 3);
        Desarrollador d1 = new Desarrollador("222B", "Ana", 28, 2200, 2, "Java");
        Manager m1 = new Manager("333C", "Laura", 40, 3000, 5, 4);

        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(e1);
        empleados.add(d1);
        empleados.add(m1);

        for (Empleado emp : empleados) {
            System.out.println("Clase real: " + emp.getClass().getSimpleName());
            System.out.println(emp.presentarse());
            System.out.println("Salario: " + emp.calcularSalario());
            System.out.println("----------------------------------");
        }
    }
}
