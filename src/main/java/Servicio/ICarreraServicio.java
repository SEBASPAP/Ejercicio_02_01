/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Servicio;

import Modelo.Carrera;
import java.util.List;

/**
 *
 * @author paulp
 */
public interface ICarreraServicio {
    
    public Carrera crear(Carrera b);
    public Carrera modificar(int c, Carrera b);
    public Carrera eliminar(int c);
    public List<Carrera> listar();
    public int buscarPosicion(int c);
}
