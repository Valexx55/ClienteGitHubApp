package edu.val.clientagituhubapp;

public class Alumno {

    private int id;
    private String nombre;
    private String email;
    private int edad;
    private String creadoEn;//": "2022-02-15T20:46:45.928+00:00",
    private String fotoHashCode;//


    public Alumno ()
    {

    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCreadoEn() {
        return creadoEn;
    }

    public void setCreadoEn(String creadoEn) {
        this.creadoEn = creadoEn;
    }

    public String getFotoHashCode() {
        return fotoHashCode;
    }

    public void setFotoHashCode(String fotoHashCode) {
        this.fotoHashCode = fotoHashCode;
    }

    public Alumno(int id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    //url_foto1 https://github.com/Valexx55/DespertarApp/blob/master/app/src/main/res/drawable/emoticono_risa.png
    /*   "id": 12,
             "nombre": "RVinicius Pele",
             "apellido": "Jr O Rei",
             "email": "vini@correo.es",
             "edad": 20,
             "creadoEn": "2022-02-15T20:46:45.928+00:00",
             "fotoHashCode": null
},*/
}
