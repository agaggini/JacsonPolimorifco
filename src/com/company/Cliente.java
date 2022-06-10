package com.company;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Cliente {

    private static final long serialVersionUID = 1L;

    private String nombre;
    private String apellido;
    private transient int edad;
    private Domicilio domicilio;
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date fechaNacimiento;
    private List<Telefono> telefonos;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, int edad, Domicilio domicilio, List<Telefono> telefonos, Date fn) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.domicilio = domicilio;
        this.telefonos = telefonos;
        this.fechaNacimiento = fn;
    }

    public Cliente(String nombre, String apellido, int edad, Domicilio domicilio, List<Telefono> telefonos) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.domicilio = domicilio;
        this.telefonos = telefonos;
    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public String getApellido() {

        return apellido;
    }

    public void setApellido(String apellido) {

        this.apellido = apellido;
    }

    public int getEdad() {

        return edad;
    }

    public void setEdad(int edad) {

        this.edad = edad;
    }

    public Domicilio getDomicilio() {

        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {

        this.domicilio = domicilio;
    }

    public List<Telefono> getTelefonos() {

        return telefonos;
    }

    public void setTelefonos(List<Telefono> telefonos) {

        this.telefonos = telefonos;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", domicilio=" + domicilio +
                ", telefonos=" + telefonos +
                '}';
    }

    public Date getFechaNacimiento() {

        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {

        this.fechaNacimiento = fechaNacimiento;
    }
}
