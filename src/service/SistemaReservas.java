package service;

import model.Reserva;

import java.util.ArrayList;

public class SistemaReservas {
    private ArrayList<Reserva> reservas = new ArrayList<>();

    public SistemaReservas() {
    }

    public SistemaReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }

    public void agregarReserva(Reserva r) {
        reservas.add(r);
        System.out.println("Reserva agregada");
    }

    public void eliminarReserva(int id) throws Exception {

        boolean eliminado = false;

        for(int i = 0; i < reservas.size(); i++) {
           if(reservas.get(i).getId() == id) {
               reservas.remove(i);
               eliminado = true;
               break;
           }
        }

        if(!eliminado)
            throw new Exception("No se ha podido eliminar la reserva");

        System.out.println("Reserva eliminada");
    }

    public void listarReservas() {
        System.out.println("\nListando reservas: ");
        for (Reserva r : reservas) {
            r.mostrarInfo();
        }
    }

    public int contarReservas() {
        return reservas.size();
    }
}
