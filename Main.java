package com.grupo.empleados;

import java.util.ArrayList;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            mostrarMenuPrincipal();
            opcion = leerEntero("Selecciona una opción: ");

            switch (opcion) {
                case 1 -> menuContratacion();
                case 2 -> menuFichaje();
                case 3 -> menuNominas();
                case 4 -> menuProyectos();
                case 5 -> menuInformes();
                case 6 -> System.out.println("Saliendo del sistema...");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 6);
    }


    private static void mostrarMenuPrincipal() {
        System.out.println("""
                === SISTEMA DE GESTIÓN Y FICHAJE ===
                1. CONTRATACIÓN
                2. FICHAJE
                3. NÓMINAS
                4. PROYECTOS (Solo desarrolladores)
                5. INFORMES
                6. SALIR
                """);
    }

    private static void menuContratacion() {
        int opcion;
        do {
            System.out.println("""
                    --- CONTRATACIÓN ---
                    1. Contratar empleado
                    2. Asignar a departamento
                    3. Ver contratos activos
                    0. Volver
                    """);

            opcion = leerEntero("Opción: ");

            switch (opcion) {
                case 1 -> System.out.println("Contratando empleado... (TODO)");
                case 2 -> System.out.println("Asignando a departamento... (TODO)");
                case 3 -> System.out.println("Mostrando contratos activos... (TODO)");
                case 0 -> {}
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
    }

    private static void menuFichaje() {
        int opcion;
        do {
            System.out.println("""
                    --- FICHAJE ---
                    1. Registrar entrada
                    2. Registrar salida
                    3. Consultar mis fichajes
                    4. Reporte mensual de horas
                    0. Volver
                    """);

            opcion = leerEntero("Opción: ");

            switch (opcion) {
                case 1 -> System.out.println("Entrada registrada... (TODO)");
                case 2 -> System.out.println("Salida registrada... (TODO)");
                case 3 -> System.out.println("Consultando fichajes... (TODO)");
                case 4 -> System.out.println("Reporte mensual... (TODO)");
                case 0 -> {}
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
    }

    private static void menuNominas() {
        int opcion;
        do {
            System.out.println("""
                    --- NÓMINAS ---
                    1. Calcular salario empleado
                    2. Calcular nómina total
                    3. Ver historial de pagos
                    0. Volver
                    """);

            opcion = leerEntero("Opción: ");

            switch (opcion) {
                case 1 -> System.out.println("Calculando salario... (TODO)");
                case 2 -> System.out.println("Calculando nómina total... (TODO)");
                case 3 -> System.out.println("Mostrando historial de pagos... (TODO)");
                case 0 -> {}
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
    }

    private static void menuProyectos() {
        int opcion;
        do {
            System.out.println("""
                    --- PROYECTOS ---
                    1. Asignar a proyecto
                    2. Registrar horas proyecto
                    3. Ver productividad
                    0. Volver
                    """);

            opcion = leerEntero("Opción: ");

            switch (opcion) {
                case 1 -> System.out.println("Asignando proyecto... (TODO)");
                case 2 -> System.out.println("Registrando horas... (TODO)");
                case 3 -> System.out.println("Mostrando productividad... (TODO)");
                case 0 -> {}
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
    }

    private static void menuInformes() {
        int opcion;
        do {
            System.out.println("""
                    --- INFORMES ---
                    1. Empleados por departamento
                    2. Asistencia mensual
                    3. Horas extra aprobadas
                    4. Proyectos activos
                    0. Volver
                    """);

            opcion = leerEntero("Opción: ");

            switch (opcion) {
                case 1 -> System.out.println("Informe de empleados... (TODO)");
                case 2 -> System.out.println("Asistencia mensual... (TODO)");
                case 3 -> System.out.println("Horas extra aprobadas... (TODO)");
                case 4 -> System.out.println("Proyectos activos... (TODO)");
                case 0 -> {}
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
    }

    // ================= UTILIDADES =================

    private static int leerEntero(String mensaje) {
        System.out.print(mensaje);
        while (!scanner.hasNextInt()) {
            System.out.print("Introduce un número válido: ");
            scanner.next();
        }
        int valor = scanner.nextInt();
        scanner.nextLine();
        return valor;
    }
}
