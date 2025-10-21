package FechaNacimiento;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class MayorEdad {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Ingrese fecha de nacimiento");
        System.out.println("Año");
        int year =sc.nextInt();
        System.out.println("Mes");
        int mes=sc.nextInt();
        System.out.println("Dia");
        int dia=sc.nextInt();
        
        LocalDate fechaNacimiento=LocalDate.of(year, mes, dia);
        
        int edad=Period.between(fechaNacimiento, LocalDate.now()).getYears();
        
        if(edad>=18){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Es menor de edad");
        }
        
        
    }

}
