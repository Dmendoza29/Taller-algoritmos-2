/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author ING_Dmendoza29
 */
public class Marca_Vehiculos extends Metodos {
    public String marcaVehiculos;

    public Marca_Vehiculos(String marcaVehiculos, String nombres, String apellido, String marca_auto, int ID, int telefono) {
        super(nombres, apellido, marca_auto, ID, telefono);
        this.marcaVehiculos = marcaVehiculos;
    }
    
}
