/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

import java.util.Objects;

/**
 *
 * @author ING_Dmendoza29
 */
public class Marca_Vehiculo extends Metodos {
    private String marca;

    public Marca_Vehiculo(String marca, String nombres, String apellido, int ID, int telefono) {
        super(nombres, apellido, ID, telefono);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Marca_Vehiculo other = (Marca_Vehiculo) obj;
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Marca_Vehiculo{" + "marca=" + marca + '}';
    }

    @Override
    public void setTelefono(int telefono) {
        super.setTelefono(telefono); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getTelefono() {
        return super.getTelefono(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setID(int ID) {
        super.setID(ID); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getID() {
        return super.getID(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setApellido(String apellido) {
        super.setApellido(apellido); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getApellido() {
        return super.getApellido(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNombres(String nombres) {
        super.setNombres(nombres); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNombres() {
        return super.getNombres(); //To change body of generated methods, choose Tools | Templates.
    } 
}
