package org.example;

import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Tienda tienda = inicializar();
        Tienda(tienda);
    }

    public static Tienda inicializar() {
        Tienda tienda = new Tienda("Anibal Pinto 2828", "Notebooks, tablets y computadores");

        // Agregar dispositivos
        Dispositivo notebook = new Notebook("HP", "16GB", "1 TB", "Intel i3", "A3", "2019", "350000", "2 unidades", "98", "1366x768", "Teclado 60%, Sin teclado númerico", "2600mAh");
        Dispositivo tablet = new Tablet("ASUS", "8GB", "50GB", "Snapdragon X", "X3", "2020", "650000", "1 unidad", "99", "1280x720");
        Pantalla pantalla = new Pantalla("HP", "230");
        Dispositivo computador = new Computador("ASUS", "16GB", "2 TB", "Intel i7", "G89", "2021", "980000", "3 unidades", "87", "NVIDIA 1660Super", "450W Certificación 80PLUS Bronze", "Gabinete ATX", pantalla);

        tienda.agregarDispositivo(notebook);
        tienda.agregarDispositivo(tablet);
        tienda.agregarDispositivo(computador);

        // Agregar cliente
        Cliente cliente = new Cliente("Diego", "Poveda", "d.poveda01@ufromail.cl", "989988", "Casado", "Lautaro", tienda);
        tienda.agregarCliente(cliente);

        return tienda;
    }

    public static void Tienda(Tienda tienda) {
        String emailCliente = "d.poveda01@ufromail.cl";
        Cliente clienteEncontrado = tienda.buscarCliente(emailCliente);
        if (clienteEncontrado != null) {
            System.out.println("Cliente encontrado: " + clienteEncontrado.getNombre());
        } else {
            System.out.println("Cliente no encontrado.");
        }

        String idDispositivo = "98";
        String informacionDispositivo = tienda.buscarDispositivo(idDispositivo);
        System.out.println(informacionDispositivo);

        String marca = "ASUS";
        List<Dispositivo> dispositivosPorMarca = tienda.buscarDispositivoPorMarca(marca);
        System.out.println("Dispositivos encontrados por marca " + marca + ":");
        for (Dispositivo dispositivo : dispositivosPorMarca) {
            System.out.println(dispositivo.getModelo());
        }

        String modelo = "A3";
        String tipo = "Notebook";
        List<Dispositivo> dispositivosPorModeloYTipo = tienda.buscarDispositivosPorModeloYTipo(modelo, tipo);
        System.out.println("Dispositivos encontrados por modelo " + modelo + " y tipo " + tipo + ":");
        for (Dispositivo dispositivo : dispositivosPorModeloYTipo) {
            System.out.println(dispositivo.getModelo());
        }
    }
}
