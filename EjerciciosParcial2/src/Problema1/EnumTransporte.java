package Problema1;

import java.io.Closeable;
import java.io.IOException;

public enum EnumTransporte {
    BUS(19,"A Gasolina"){
        @Override
        public String mostrarDescrpcion() {
            return "Vehiculo para numeros psajeros, de servicio publico o privado.";
        }
    },
    TREN(215,"A Gas") {
        @Override
        public String mostrarDescrpcion() {
            return "Medio utilizado para movilizarse por carriles especializados y con paradas fijas. ";
        }
    },
    BARCO(25,"A Gas"){
        @Override
        public String mostrarDescrpcion() {
            return "Medio utilizado para el transporte sobre el agua , con el fin de transportar personas o mercancia. ";
        }
    },
    MOTO(2,"A Gasolina"){
        @Override
        public String mostrarDescrpcion() {
            return "Medio de transporte compuesto generalmente por 2 ruedas, especialmente usado para movilizarse en la ciudad. ";
        }
    },
    AVION(230,"A Gasolina") {
        @Override
        public String mostrarDescrpcion() {
            return "Medio utilizado para viajar por el aire de manera comoda y rapida utilizado para mover millones de personas. ";
        }
    };

    private int Capacidad;
    private String tipoMotor;
    public abstract String mostrarDescrpcion();

    EnumTransporte(int capacidad, String tipoMotor) {
        Capacidad = capacidad;
        this.tipoMotor = tipoMotor;
    }

    public int getCapacidad() {
        return Capacidad;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

}
