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
    private String Actores;
    private String director;
    private String compania;
    private String Idiorigi;
    private String dobla;
    private String Subtitulo;

    public Peliculas() {
    }

    public Peliculas(String Nombre, String Tiempo, String Categoria, String Actores, String director, String compania, String Idiorigi, String dobla, String Subtitulo) {
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

    public String getActores() {
        return Actores;
    }

    public void setActores(String Actores) {
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

    public String getDobla() {
        return dobla;
    }

    public void setDobla(String dobla) {
        this.dobla = dobla;
    }

    public String getSubtitulo() {
        return Subtitulo;
    }

    public void setSubtitulo(String Subtitulo) {
        this.Subtitulo = Subtitulo;
    }

    @Override
    public String toString() {
        return "Peliculas{" + "Nombre=" + Nombre + ", Tiempo=" + Tiempo + ", Categoria=" + Categoria + ", Actores=" + Actores + ", director=" + director + ", compania=" + compania + ", Idiorigi=" + Idiorigi + ", dobla=" + dobla + ", Subtitulo=" + Subtitulo + '}';
    }

    
   
}
