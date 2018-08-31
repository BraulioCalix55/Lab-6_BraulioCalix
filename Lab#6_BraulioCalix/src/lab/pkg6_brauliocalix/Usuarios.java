/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg6_brauliocalix;

/**
 *
 * @author User
 */
public class Usuarios {

    private String nombre;
    private String cuenta;
    private String contraseña;

    public Usuarios(String nombre, String cuenta, String contraseña) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "nombre=" + nombre + ", cuenta=" + cuenta + ", contrase\u00f1a=" + contraseña + '}';
    }
    

}
