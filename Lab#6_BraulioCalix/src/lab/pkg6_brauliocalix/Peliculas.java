/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg6_brauliocalix;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Peliculas {

    /*
    Nombre , tiempo de duración en minutos , 
    categoría(Suspenso  , Terror , Acción , Románticas , Ciencia Ficción  , Animación  ,Fantasía) 
    , Actores principales  , Director  , 
    que compañía la produce , idioma original , 
    si tiene doblaje , si tiene subtítulos al español.
     */
    private String Nombre;
    private String Tiempo;
    private String Categoria;
    private ArrayList Actores;
    private String director;
    private String compania;
    private String Idiorigi;
    private boolean dobla;
    private boolean Subtitulo;

    public Peliculas() {
    }

    public Peliculas(String Nombre, String Tiempo, String Categoria, ArrayList Actores, String director, String compania, String Idiorigi, boolean dobla, boolean Subtitulo) {
        this.Nombre = Nombre;
        this.Tiempo = Tiempo;
        this.Categoria = Categoria;
        this.Actores = Actores;
        this.director = director;
        this.compania = compania;
        this.Idiorigi = Idiorigi;
        this.dobla = dobla;
        this.Subtitulo = Subtitulo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTiempo() {
        return Tiempo;
    }

    public void setTiempo(String Tiempo) {
        this.Tiempo = Tiempo;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public ArrayList getActores() {
        return Actores;
    }

    public void setActores(ArrayList Actores) {
        this.Actores = Actores;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public String getIdiorigi() {
        return Idiorigi;
    }

    public void setIdiorigi(String Idiorigi) {
        this.Idiorigi = Idiorigi;
    }

    public boolean isDobla() {
        return dobla;
    }

    public void setDobla(boolean dobla) {
        this.dobla = dobla;
    }

    public boolean isSubtitulo() {
        return Subtitulo;
    }

    public void setSubtitulo(boolean Subtitulo) {
        this.Subtitulo = Subtitulo;
    }

   
}
