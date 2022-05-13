/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author paulp
 */
public class Carrera {
    private int codigo;
    private String nombre;
    private String titulo;
    private String docente;
    private String universidad;
    private Asignatura unAsignatura;

    public Carrera(int codigo, String nombre, String titulo, String docente, String universidad, Asignatura unAsignatura) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.titulo = titulo;
        this.docente = docente;
        this.universidad = universidad;
        this.unAsignatura = unAsignatura;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public Asignatura getUnAsignatura() {
        return unAsignatura;
    }

    public void setUnAsignatura(Asignatura unAsignatura) {
        this.unAsignatura = unAsignatura;
    }

    @Override
    public String toString() {
        return "Carrera{" + "codigo=" + codigo + ", nombre=" + nombre + ", titulo=" + titulo + ", docente=" + docente + ", universidad=" + universidad + ", unAsignatura=" + unAsignatura + '}';
    }
 
    public boolean incluyeMatematicas(){
        return true;
    }
    public boolean incluyeHorasComunitarias(){
        return true;
    }
}
