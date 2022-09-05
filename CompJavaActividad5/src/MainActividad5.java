public class MainActividad5 {
    static int x = 5, y= 10;

    public static void main(String[] args)
    {
        System.out.println("X = " + x);
        System.out.println("Y = " + y);
        System.out.println("Suma = " + x + " + " + y + " = " + (x+y));
        System.out.println("Resta 1 = " + x + " - " + y + " = " +  (x-y));
        System.out.println("Resta 2 = " + y + " - " + x + " = " +  (y-x));
        System.out.println("Multiplicación = " + x + " * " + y + " = " + (x*y));
        System.out.println("División 1 = " + x + " / " + y + " = " + (x/y));
        System.out.println("División 2 = " + y + " / " + x + " = " + (y/x));
        System.out.println("Módulo 1 = " + x + " % " + y + " = " + (x%y));
        System.out.println("Módulo 2 = " + y + " % " + x + " = " + (y%x));
    }
}