package facci.yandrizambrano.practica_sugat;

import com.orm.SugarRecord;

public class Alumno extends SugarRecord<Alumno> {
    String Apellido;
    String Nombre;
    String Cedula;

    public Alumno(String s, String toString, String string) {
    }

    public Alumno(String Apellido, String Nombre){
        this.Apellido=Apellido;
        this.Nombre= Nombre;
        this.Cedula=Cedula;

    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String cedula) {
        Cedula = cedula;
    }








}

