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
public class Series {
/*
    Nombre, tiempo de duración en minutos por capítulos, 
    categorías(tiene libertad para poner las categorías que quiera) , 
    actores principales , numero de temporadas , productora , 
    idioma original , si tiene doblaje  y si tiene subtítulos al español.
    */    
    private String nombre;
    private String Tiempo;
    private String categoria;
    private String actores;
    private String temps;
    private String productora;
    private String idiomaorigi;
    private String doblaje;
    private String subtitulo;

    public Series() {
    }

    public Series(String nombre, String Tiempo, String categoria, String actores, String temps, String productora, String idiomaorigi, String doblaje, String subtitulo) {
        this.nombre = nombre;
        this.Tiempo = Tiempo;
        this.categoria = categoria;
        this.actores = actores;
        this.temps = temps;
        this.productora = productora;
        this.idiomaorigi = idiomaorigi;
        this.doblaje = doblaje;
        this.subtitulo = subtitulo;
    }

    public String getActores() {
        return actores;
    }

    public void setActores(String actores) {
        this.actores = actores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTiempo() {
        return Tiempo;
    }

    public void setTiempo(String Tiempo) {
        this.Tiempo = Tiempo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

   

    public String getTemps() {
        return temps;
    }

    public void setTemps(String temps) {
        this.temps = temps;
    }

    public String getProductora() {
        return productora;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }

    public String getIdiomaorigi() {
        return idiomaorigi;
    }

    public void setIdiomaorigi(String idiomaorigi) {
        this.idiomaorigi = idiomaorigi;
    }

    public String getDoblaje() {
        return doblaje;
    }

    public void setDoblaje(String doblaje) {
        this.doblaje = doblaje;
    }

    public String getSubtitulo() {
        return subtitulo;
    }

    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }

    @Override
    public String toString() {
        return "Series{" + "nombre=" + nombre + ", Tiempo=" + Tiempo + ", categoria=" + categoria + ", actores=" + actores + ", temps=" + temps + ", productora=" + productora + ", idiomaorigi=" + idiomaorigi + ", doblaje=" + doblaje + ", subtitulo=" + subtitulo + '}';
    }

    
    }
