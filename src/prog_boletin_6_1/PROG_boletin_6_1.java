package prog_boletin_6_1;

public class PROG_boletin_6_1 {

    public static void main(String[] args) {
        Coche obj1 = new Coche();
        obj1.acelerar(50);
        System.out.println("La aceleración es: " + obj1.getVelocidad());
        obj1.frenar(10);
        System.out.println("La desaceleración es: " + obj1.getVelocidad());
    }

}
