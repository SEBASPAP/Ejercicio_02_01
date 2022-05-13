/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package vista;

import Controlador.CarreraControl;
import Modelo.Asignatura;
import Modelo.Carrera;

/**
 *
 * @author paulp
 */
public class Ejercicio_02_01 {

    public static void main(String[] args) {
        
        var carreraControl = new CarreraControl();
        carreraControl.crear(10, "Ingenieria Electronica", "Ingenieri@ en Electronica", "Ing.Eduardo Pinos", "UPS","Calculo", "Tercero", 180, 6, 32546);
        carreraControl.crear(20, "Ingenieria Mecanica", "Ingenieri@ Mecanic@", "Ing.Ana Villa","UPS", "Matematica Aplicada", "Cuarto", 260, 5, 45394);
        carreraControl.crear(30, "Computacion", "Ingenieri@ en Computacion", "Ing.Julio Montesdeoca","UPS", "POO", "Tercero", 120, 4, 25461);
        carreraControl.crear(40, "Educacion Fisica", "Licenciado ", "Lcdo.Wilian Alvarez","UPS", "Pesas 1", "Segundo", 80, 1, 87325);
        System.out.println("Listado Inicial");
        for (Carrera b: carreraControl.listar())
            System.out.println(b.toString());
        
        carreraControl.eliminar(20);
        System.out.println("Listado Eliminando el codigo 20");
        for (Carrera b: carreraControl.listar())
            System.out.println(b.toString());
        var nuevaAsignatura = new Asignatura("Ecuaciones","Segundo",180,4,35648);
        var nuevaCarrera = new Carrera(10,"Ingenieria Ambiental","Ingenier@ Ambiental","Ing. Pablo Cevallos","UPS",nuevaAsignatura);
        carreraControl.modificar(10, nuevaCarrera); 
        
        System.out.println("Listado Modificando el codigo 10"); 
        for (Carrera b: carreraControl.listar())
            System.out.println(b.toString());
    }
}
