package com.company;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws ParseException {
        ArrayList<Cliente> clientes = new ArrayList<>();

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        Telefono telefono1 = new TelefonoFijo("4588754", "223", "549");
        Telefono telefono2 = new TelefonoCelular("155478598", "2234", "548", true);
        List<Telefono> telefonos = new ArrayList<Telefono>();
        telefonos.add(telefono1);
        telefonos.add(telefono2);
        Domicilio domicilio1 = new Domicilio("Calle Falsa", 123);
        Cliente cliente1 = new Cliente("Pepe", "Luis", 55, domicilio1, telefonos, df.parse("1972-01-15"));


        Telefono telefono3 = new TelefonoFijo("4588754", "223", "549");
        Telefono telefono4 = new TelefonoFijo("155478598", "2234", "548");
        List<Telefono> telefonos2 = new ArrayList<Telefono>();
        telefonos2.add(telefono3);
        telefonos2.add(telefono4);
        Domicilio domicilio2 = new Domicilio("Calle Falsa", 123);
        Cliente cliente2 = new Cliente("Pepe Dos", "Luis", 55, domicilio2, telefonos2, df.parse("1990-10-01"));


        clientes.add(cliente1);
        clientes.add(cliente2);

        String path = "C:\\Users\\DELL\\Desarrollo\\UTN\\Prog3\\Jacson_Polimorfico\\files\\";

        ObjectMapper mapper = new ObjectMapper();
        File file = new File(path + "mi_archivo.json");
        try {
            //Serializo
            mapper.writeValue(file, clientes);

            //Deserializo
            List<Cliente> myObjects = mapper.readValue(file, mapper.getTypeFactory().constructCollectionType(List.class, Cliente.class));

            for (Cliente x : myObjects) {
                System.out.println(x);
            }
        } catch (IOException e) {
            System.out.println("No se pudo leer/escribir el archivo: " + e.getMessage());
            e.printStackTrace();
        }
        finally {

        }
    }
}
