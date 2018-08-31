/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg6_brauliocalix;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class AdminUsuarios {

    private ArrayList<Usuarios> listaUsuarios = new ArrayList();
    private File archivo = null;

    public AdminUsuarios(String path) {
        archivo = new File(path);
    }

    public ArrayList<Usuarios> getListaPersonas() {
        return listaUsuarios;
    }

    public void setListaPersonas(ArrayList<Usuarios> listaPersonas) {
        this.listaUsuarios = listaPersonas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override

    public String toString() {
        return "lista Usuarios=" + listaUsuarios;
    }

    public void setPersona(Usuarios p) {
        this.listaUsuarios.add(p);
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Usuarios t : listaUsuarios) {
                bw.write(t.getNombre() + ";");
                bw.write(t.getContraseña() + ";");
                bw.write(t.getCuenta() + ";");
                
            }
            bw.flush();
        } catch (Exception e) {
            System.out.println("nambe");
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listaUsuarios = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    String Nombre,Cuenta,Contra;
                    Nombre = sc.next();
                    Cuenta = sc.next();
                    Contra= sc.next();
                    listaUsuarios.add(new Usuarios(Nombre, Cuenta, Contra));                 
                }
            } catch (Exception e) {
            } finally {
                sc.close();
            }
        }
    }
}
