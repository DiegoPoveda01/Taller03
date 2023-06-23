package org.example;

public class Principal {
    public static void main(String[] args) {
        inicializar();
    }

    public static void inicializar() {
        Tienda tienda = new Tienda("Anibal Pinto 2828", "Notebooks, tablets y computadores");
       Dispositivo notebook = new Notebook("HP", "16GB", "1 TB", "Intel i3", "A3", "2019", "350000", "2 unidades", "98", "1366x768", "Teclado 60%, Sin teclado númerico", "2600mAh");
       Dispositivo tablet = new Tablet("ASUS", "8GB", "50GB", "Snapdragon X", "X3", "2020", "650000", "1 unidad", "99", "1280x720");
       Pantalla pantalla = new Pantalla("HP", "230");
       Dispositivo computador = new Computador("ASUS", "16GB", "2 TB", "Intel i7", "G89", "2021", "980000", "3 unidades", "87", "NVIDIA 1660Super", "450W Certificación 80PLUS Bronze", "Gabinete ATX", pantalla);
       Cliente cliente = new Cliente("Diego", "Poveda", "d.poveda01@ufromail.cl", "989988", "Casado", "Lautaro", tienda);

        }
    }
