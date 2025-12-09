import model.Reserva;
import service.SistemaReservas;

public class Main {
    public static void main(String[] args) {
        Reserva reserva01 = new Reserva(1, "Juan", "2025/12/09", 8);
        Reserva reserva02 = new Reserva(2, "Felipe", "2025/12/10", 4);

        SistemaReservas sr01 = new SistemaReservas();
        sr01.agregarReserva(reserva01);
        sr01.agregarReserva(reserva02);
        sr01.listarReservas();

        System.out.println("\nCambiamos datos de la reserva 01");
        reserva01.setCliente("Juan CAMBIADO");
        reserva01.setFecha("2025/01/19");
        reserva01.setDuracionHoras(24);

        System.out.println("\nEl total de reservas es: " + sr01.contarReservas());

        System.out.println("\nEliminamos la reserva con el id #2");
        try {
            sr01.eliminarReserva(2);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nEliminamos la reserva con el id #3");
        try {
            sr01.eliminarReserva(3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        sr01.listarReservas();
    }
}