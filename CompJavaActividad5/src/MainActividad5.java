import java.util.InputMismatchException;
import java.util.Scanner;

public class MainActividad5 {

    static int x, y;        //Variables
    static Scanner intro = new Scanner(System.in);      //Scanner que permite la entrada de datos al programa
    static boolean x_valid = false, y_valid = false;        //Booleans que comprueban el estado de las variables a asignar datos

    static Boolean x_equals0 = false, y_equals0 = false;        //Booleans que verifican si alguna de las variables es 0

    public static void main(String[] args) throws java.io.IOException       //Inicio método main
    {
        //El programa se repetirá hasta que ambas variables tengan un valor permitido
        while(!x_valid || !y_valid)
        {
            try
            {
                //Se pregunta el valor de la variable x
                if(!x_valid)
                {
                    System.out.print("Ingrese el valor del primer número (x): ");
                    x = intro.nextInt();
                    x_valid = true;
                    intro.nextLine();

                    if(x == 0)
                    {
                        x_equals0 = true;
                    }
                }

                //Se pregunta el valor de la variable y
                if(!y_valid)
                {
                    System.out.print("Ingrese el valor del segundo número (y): ");
                    y = intro.nextInt();
                    y_valid = true;
                    intro.nextLine();

                    if(y == 0)
                    {
                        y_equals0 = true;
                    }
                }

                //Se despliegan los resultados
                System.out.println("X = " + x);
                System.out.println("Y = " + y);
                System.out.println("Suma = " + x + " + " + y + " = " + (x+y));
                System.out.println("Resta 1 = " + x + " - " + y + " = " +  (x-y));
                System.out.println("Resta 2 = " + y + " - " + x + " = " +  (y-x));
                System.out.println("Multiplicación = " + x + " * " + y + " = " + (x*y));

                //Si ambas variables son 0, el resultado de las operaciones siguientes es indefinido
                if(x_equals0 && y_equals0)
                {
                    System.out.println("División 1 = " + x + " / " + y + " = Indefinido");
                    System.out.println("División 2 = " + y + " / " + x + " = Indefinido");
                    System.out.println("Módulo 1 = " + x + " % " + y + " = Indefinido");
                    System.out.println("Módulo 2 = " + y + " % " + x + " = Indefinido");
                }

                else
                {
                    //Si x es 0, algunos de los resultados quedan indefinidos
                    if (x_equals0)
                    {
                        System.out.println("División 1 = " + x + " / " + y + " = " + (x/y));
                        System.out.println("División 2 = " + y + " / " + x + " = Indefinido");
                        System.out.println("Módulo 1 = " + x + " % " + y + " = " + (x%y));
                        System.out.println("Módulo 2 = " + y + " % " + x + " = Indefinido");
                    }

                    else
                    {
                        //Si x es 0, algunos de los resultados quedan indefinidos
                        if(y_equals0)
                        {
                            System.out.println("División 1 = " + x + " / " + y + " = Indefinido");
                            System.out.println("División 2 = " + y + " / " + x + " = " + (y/x));
                            System.out.println("Módulo 1 = " + x + " % " + y + " = Indefinido");
                            System.out.println("Módulo 2 = " + y + " % " + x + " = " + (y%x));
                        }

                        //Si ninguna es 0, todas las operaciónes tienen un resultado
                        else
                        {
                            System.out.println("División 1 = " + x + " / " + y + " = " + (x/y));
                            System.out.println("División 2 = " + y + " / " + x + " = " + (y/x));
                            System.out.println("Módulo 1 = " + x + " % " + y + " = " + (x%y));
                            System.out.println("Módulo 2 = " + y + " % " + x + " = " + (y%x));
                        }
                    }
                }
            }

            //En caso de que lo ingresado no pueda registrarse como un numero entero, se manda aviso
            catch(InputMismatchException a)
            {
                System.out.print("El valor ingresado no puede ser convertido a una variable de tipo entero\n\nPresione ENTER para continuar . . .");
                System.in.read();
                System.out.println("\n");
                intro.nextLine();
            }
        }
    }
}