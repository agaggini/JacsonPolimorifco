package com.company;

public class TelefonoCelular extends Telefono {

    private boolean usaWhatsapp;

    public TelefonoCelular() {

        super();
    }

    public TelefonoCelular(String numero, String codArea, String codPais, boolean usaWhatsapp) {
        super(numero, codArea, codPais);
        this.usaWhatsapp = usaWhatsapp;
    }

    @Override
    public void llamar() {

        System.out.println("Llamando al Celular");
    }

    public boolean isUsaWhatsapp() {
        return usaWhatsapp;
    }

    public void setUsaWhatsapp(boolean usaWhatsapp) {
        this.usaWhatsapp = usaWhatsapp;
    }
}
