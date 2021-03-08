/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author Administrador
 */
public class Metodos {

    public String nombres;
    public String apellido;
    private String marca_auto;
    public int ID;
    public int telefono;

    public Metodos(String nombres, String apellido, String marca_auto, int ID, int telefono) {
        this.nombres = nombres;
        this.apellido = apellido;
        this.marca_auto = marca_auto;
        this.ID = ID;
        this.telefono = telefono;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMarca_auto() {
        return marca_auto;
    }

    public void setMarca_auto(String marca_auto) {
        this.marca_auto = marca_auto;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

}