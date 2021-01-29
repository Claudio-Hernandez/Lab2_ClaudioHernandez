/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_claudiohernandez;

/**
 *
 * @author Claudio Hernandez
 */
public class restaurantes {
     private String Franquicia;
    private String nombre ;
    private String ubicacion;
    private int cantEmpleados;
    private String parqueo;
    private String  areaDejuegos;
    private int CantidadDeMesas;
    private String especialidad;
    private String estado;
    private String nombreGerente;

   

    public restaurantes(String Franquicia, String nombre, String ubicacion, int cantEmpleados, String parqueo, String areaDejuegos, int CantidadDeMesas, String especialidad, String estado,String nombreGerente) {
        this.Franquicia = Franquicia;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.cantEmpleados = cantEmpleados;
        setParqueo(parqueo);
        setAreaDejuegos(areaDejuegos);
        this.CantidadDeMesas = CantidadDeMesas;
        this.especialidad = especialidad;
        setEstado(estado);
        this.nombreGerente = nombreGerente;
    }

    public String getFranquicia() {
        return Franquicia;
    }

    public void setFranquicia(String Franquicia) {
        this.Franquicia = Franquicia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getCantEmpleados() {
        return cantEmpleados;
    }

    public void setCantEmpleados(int cantEmpleados) {
        this.cantEmpleados = cantEmpleados;
    }

    public String getParqueo() {
        return parqueo;
    }

    public void setParqueo(String parqueo) {
        if(parqueo.equals("si")||parqueo.equals("no")){
                this.parqueo = parqueo;

        }
    }

    public String getAreaDejuegos() {
        return areaDejuegos;
    }

    public void setAreaDejuegos(String areaDejuegos) {
        if(areaDejuegos.equals("si")||areaDejuegos.equals("no")){
        this.areaDejuegos = areaDejuegos;

        }
    }

    public int getCantidadDeMesas() {
        return CantidadDeMesas;
    }

    public void setCantidadDeMesas(int CantidadDeMesas) {
        this.CantidadDeMesas = CantidadDeMesas;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        if(estado.equals("remodelacion")|| estado.equals("demolicion")|| estado.equals( "funcional")){
                this.estado = estado;

        }
    }
     public String getNombreGerente() {
        return nombreGerente;
    }

    public void setNombreGerente(String nombreGerente) {
        this.nombreGerente = nombreGerente;
    }

    @Override
    public String toString() {
        return  "Franquicia= " + Franquicia + ", nombre= " + nombre + ", ubicacion=" + ubicacion + ", cantEmpleados= " + cantEmpleados + ", parqueo= " + parqueo + ", area De juegos= " + areaDejuegos + ", Cantidad De Mesas= " + CantidadDeMesas + ", especialidad= " + especialidad + ", estado= " + estado + ",Nombre de gerente:" +  nombreGerente;
    }
}
