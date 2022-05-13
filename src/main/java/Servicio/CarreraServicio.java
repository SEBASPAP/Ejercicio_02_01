/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Modelo.Carrera;
import java.util.ArrayList;
import java.util.List; 
/**
 *
 * @author paulp
 */
public class CarreraServicio implements ICarreraServicio {
    
    public final List<Carrera> carreraList = new ArrayList<>();

    
    @Override
    public Carrera crear(Carrera b) {
        this.carreraList.add(b);
        return b;
    }

    
    @Override
    public Carrera modificar(int c, Carrera b) {
        this.carreraList.set(this.buscarPosicion(c), b);
        return b;
    }

    
    @Override
    public Carrera eliminar(int c) {
        var carrera = this.carreraList.get(this.buscarPosicion(c));
        this.carreraList.remove(this.buscarPosicion(c));
        return carrera;
    }


    @Override
    public List<Carrera> listar() {
        return this.carreraList;
    }

    
    @Override
    public int buscarPosicion(int c) {
        var posicion=-1;
        var i=0;
        for(var auxCarrera:this.carreraList){
            if(auxCarrera.getCodigo()==c){
                posicion =i;
                break;
            }
            i++;
        }
        return posicion;
    }
    
    
}
