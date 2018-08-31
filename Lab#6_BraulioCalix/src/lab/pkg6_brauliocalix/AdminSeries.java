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
public class AdminSeries {

    private ArrayList<Series> listaSeries = new ArrayList();
    private File archivo = null;
    
    public AdminSeries(String path) {
        archivo = new File(path);
    }
    
    public ArrayList<Series> getListaSeries() {
        return listaSeries;
    }
    
    public void setListaPersonas(ArrayList<Series> listaSeries) {
        this.listaSeries = listaSeries;
    }
    
    public File getArchivo() {
        return archivo;
    }
    
    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    @Override
    
    public String toString() {
        return "lista series=" + listaSeries;
    }
    
    public void setSerie(Series p) {
        this.listaSeries.add(p);
    }

    /*Nombre, tiempo de duración en minutos por capítulos, 
    categorías(tiene libertad para poner las categorías que quiera) , 
    actores principales , numero de temporadas , productora , 
    idioma original , si tiene doblaje  y si tiene subtítulos al español.
     */    
    public void escribirArchivo(String Nombre,String Tiempo,String Temps,String Categoria,String Productora,String Idiomaorigi
    ,String Doblaje,String Subtitulo) throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Series t : listaSeries) {
                bw.write(Nombre + ";");
                bw.write(Tiempo + ";");
                bw.write(Categoria + ";");
                bw.write(Temps + ";");
                bw.write(Productora + ";");
                bw.write(Idiomaorigi + ";");
                bw.write(Doblaje + ";");
                bw.write(Subtitulo + ";");
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
        listaSeries = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    String Nombre, tiempo, cate,Actor, temps, produc, idiorigi, doblaje, subti;
                    Nombre = sc.next();
                    tiempo = sc.next();
                    cate = sc.next();
                    Actor=sc.next();
                    temps = sc.next();
                    produc = sc.next();
                    idiorigi = sc.next();
                    doblaje = sc.next();
                    subti = sc.next();
                    listaSeries.add(new Series(Nombre, tiempo, cate, Actor, temps, produc, idiorigi, doblaje, subti));                    
                }
            } catch (Exception e) {
            } finally {
                sc.close();
            }
        }
    }
    
}
