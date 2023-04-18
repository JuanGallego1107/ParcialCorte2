package Problema1;

public class Problema1Main {
    public static void main(String[] args) {
        EnumTransporte transporte = EnumTransporte.BUS;
        System.out.println("Capacidad: "+transporte.getCapacidad()+"\nTipo de motor: "+transporte.getTipoMotor()+"\n"+transporte.mostrarDescrpcion());
        EnumTransporte transporte1 = EnumTransporte.TREN;
        System.out.println("Capacidad: "+transporte1.getCapacidad()+"\nTipo de motor: "+transporte1.getTipoMotor()+"\n"+transporte1.mostrarDescrpcion());
        EnumTransporte transporte2 = EnumTransporte.BARCO;
        System.out.println("Capacidad: "+transporte2.getCapacidad()+"\nTipo de motor: "+transporte2.getTipoMotor()+"\n"+transporte2.mostrarDescrpcion());
        EnumTransporte transporte3 = EnumTransporte.AVION;
        System.out.println("Capacidad: "+transporte3.getCapacidad()+"\nTipo de motor: "+transporte3.getTipoMotor()+"\n"+transporte3.mostrarDescrpcion());
        EnumTransporte transporte4 = EnumTransporte.MOTO;
        System.out.println("Capacidad: "+transporte4.getCapacidad()+"\nTipo de motor: "+transporte4.getTipoMotor()+"\n"+transporte4.mostrarDescrpcion());
    }
}
