package com.company;

public class TelefonoFijo extends Telefono {

    public TelefonoFijo() {

        super();
    }

    public TelefonoFijo(String numero, String codArea, String codPais) {

        super(numero, codArea, codPais);
    }

    @Override
    public void llamar() {

        System.out.println("Llamando al Fijo");
    }
}
