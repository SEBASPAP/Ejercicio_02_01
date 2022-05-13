/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author paulp
 */
public class Asignatura {
    private String nombre;
    private String ciclo;
    private int nHoras;
    private int nDocentes;
    private int codigo;

    public Asignatura(String nombre, String ciclo, int nHoras, int nDocentes, int codigo) {
        this.nombre = nombre;
        this.ciclo = ciclo;
        this.nHoras = nHoras;
        this.nDocentes = nDocentes;
        this.codigo = codigo;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public int getnHoras() {
        return nHoras;
    }

    public void setnHoras(int nHoras) {
        this.nHoras = nHoras;
    }

    public int getnDocentes() {
        return nDocentes;
    }

    public void setnDocentes(int nDocentes) {
        this.nDocentes = nDocentes;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Asignatura{" + "nombre=" + nombre + ", ciclo=" + ciclo + ", nHoras=" + nHoras + ", nDocentes=" + nDocentes + ", codigo=" + codigo + '}';
    }
    
    public String DiasEnHorario(){
        return "Martes y Jueves";
    }
    
    public String CronogramaalDia(){
        return "Solo en la tarde";
    }
}
