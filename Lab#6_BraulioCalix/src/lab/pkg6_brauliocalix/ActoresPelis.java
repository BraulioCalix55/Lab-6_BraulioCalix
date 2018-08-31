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
public class ActoresPelis {
    private String Nombre;

    public ActoresPelis(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public String toString() {
        return "ActoresPelis{" + "Nombre=" + Nombre + '}';
    }
    
    
}
