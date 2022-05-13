/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Asignatura;
import Modelo.Carrera;
import Servicio.CarreraServicio;
import java.util.List;

/**
 *
 * @author paulp
 */
public class CarreraControl {
    
    public CarreraServicio carreraServicio = new CarreraServicio();
    
    public Carrera crear(int c,String N, String T, String D, String U,String nA, String cA, int nHA, int nDA, int coA){
        var asignatura = new Asignatura(nA,cA,nHA,nDA,coA);
        var carrera = new Carrera(c,N,T,D,U,asignatura);
        this.carreraServicio.crear(carrera);
        return carrera;
    }
    
    public Carrera eliminar(int c) {
        return this.carreraServicio.eliminar(c);
    }
    
    public Carrera modificar(int c, Carrera b) {
        return this.carreraServicio.modificar(c,b);
    }
    
    public List<Carrera> listar()
    {
        return this.carreraServicio.listar();
    }
}
