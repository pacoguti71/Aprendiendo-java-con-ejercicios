package principal;

import java.util.Scanner;

/**
 * Escribe un programa que genere la nómina (bien desglosada) de un empleado
 * según las siguientes condiciones: Se pregunta el cargo del empleado (1 -
 * Prog. junior, 2 - Prog. senior, 3 – Jefe de proyecto), los días que ha estado
 * de viaje visitando clientes durante el mes y su estado civil (1 - Soltero, 2
 * - Casado). El sueldo base según el cargo es de 950, 1200 y 1600 euros según
 * si se trata de un prog. junior, un prog. senior o un jefe de proyecto
 * respectivamente. Por cada día de viaje visitando clientes se pagan 30 euros
 * extra en concepto de dietas. Al sueldo neto hay que restarle el IRPF, que
 * será de un 25% en caso de estar soltero y un 20% en caso de estar casado.
 *
 */

public class S04Ejercicio24 {

    public static void main(String[] args) {
        final double SUELDO_BASE_junior = 950;
        final double SUELDO_BASE_senior = 1200;
        final double SUELDO_BASE_jefe = 1600;
        final double DIETA = 30;
        final double IRPF_soltero = 25 / 100.0;
        final double IRPF_casado = 20 / 100.0;

        int cargoEmpleado;
        int diasVisita;
        int estadoCivil;

        double sueldoBase = 0;
        double dietas;
        double sueldoBruto;
        double retencionIRPF;
        int tipoRetencionIRPF;
        double sueldoNeto;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el cargo del empleado: \n"
                + "(1 - Programador junior\n"
                + " 2 - Programador senior\n"
                + " 3 - Jefe de proyecto)\n");
        cargoEmpleado = teclado.nextInt();
        System.out.print("¿Cuántos días ha estado de viaje visitando clientes? ");
        diasVisita = teclado.nextInt();
        System.out.print("Introduce su estado civil: \n"
                + "(1 - Soltero\n"
                + " 2 - Casado)\n");
        estadoCivil = teclado.nextInt();

        switch (cargoEmpleado) {
            case 1:
                sueldoBase = SUELDO_BASE_junior;
                break;
            case 2:
                sueldoBase = SUELDO_BASE_senior;
                break;
            case 3:
                sueldoBase = SUELDO_BASE_jefe;
                break;
            default:
                break;
        }

        dietas = diasVisita * DIETA;
        sueldoBruto = sueldoBase + dietas;
        retencionIRPF = sueldoBruto * (estadoCivil == 1 ? IRPF_soltero : IRPF_casado);
        tipoRetencionIRPF = (int) ((estadoCivil == 1 ? IRPF_soltero : IRPF_casado) * 100);
        sueldoNeto = sueldoBruto - retencionIRPF;

        String linea = "-".repeat(35);
        System.out.println("-" + linea + "-");
        System.out.printf("| %-25s %6.2f |%n", "Sueldo base", sueldoBase);
        System.out.printf("| %-25s %7.2f |%n", "Dietas (" + diasVisita + " viajes)", dietas);
        System.out.println("|" + linea + "|");
        System.out.printf("| %-25s %6.2f |%n", "Sueldo bruto", sueldoBruto);
        System.out.printf("| %-25s %7.2f |%n", "Retención IRPF (" + tipoRetencionIRPF + "%)", retencionIRPF);
        System.out.println("|" + linea + "|");
        System.out.printf("| %-25s %6.2f |%n", "Sueldo neto", sueldoNeto);
        System.out.println("-" + linea + "-");
    } // Fin main

} // Fin class
