package app;

import data.Persistencia;
import java.util.InvalidPropertiesFormatException;
import views.NuevoVehiculo;

public class Program {
    public static void main(String[] args) throws IllegalArgumentException, InvalidPropertiesFormatException {
        Persistencia.inicializar();
        NuevoVehiculo nv = new NuevoVehiculo();
        nv.setVisible(true);
    }
}
