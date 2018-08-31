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
public class AdminPelis {
     private ArrayList<Peliculas> listaPelis = new ArrayList();
    private File archivo = null;

    public AdminPelis(String path) {
        archivo = new File(path);
    }

    public ArrayList<Peliculas> getListaPelis() {
        return listaPelis;
    }

    public void setListaPersonas(ArrayList<Peliculas> listaPelis) {
        this.listaPelis = listaPelis;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override

    public String toString() {
        return "lista peliculas=" + listaPelis;
    }

    public void setpeli(Peliculas p) {
        this.listaPelis.add(p);
    }
/*
    Nombre , tiempo de duración en minutos , 
    categoría(Suspenso  , Terror , Acción , Románticas , Ciencia Ficción  , Animación  ,Fantasía) 
    , Actores principales  , Director  , 
    que compañía la produce , idioma original , 
    si tiene doblaje , si tiene subtítulos al español.
     */
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);
            for (Peliculas t : listaPelis) {
                bw.write(t.getNombre()+ ";");
                bw.write(t.getTiempo()+ ";");
                bw.write(t.getCategoria()+ ";");
                bw.write(t.getActores()+";");
                bw.write(t.getDirector()+";");
                bw.write(t.getCompania()+";");
                bw.write(t.getIdiorigi()+";");
                bw.write(t.getDobla()+";");
                bw.write(t.getSubtitulo()+";");
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
        listaPelis = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    String Nombre,tiempo,cate,actor,direc,compa,idiorigi,doblaje,subti;
                    Nombre = sc.next();
                    tiempo=sc.next();
                    cate=sc.next();
                    actor=sc.next();
                    direc=sc.next();
                    compa=sc.next();
                    idiorigi=sc.next();
                    doblaje=sc.next();
                    subti=sc.next();
                    
                    listaPelis.add(new Peliculas(Nombre, tiempo, cate, actor, direc, compa, idiorigi, doblaje, subti));                 
                }
            } catch (Exception e) {
            } finally {
                sc.close();
            }
        }
    }
    
}
