import java.util.Scanner; 

class Area_Perimetro
{
    public static void main(String[] args)
    {
        try(Scanner myObj = new Scanner(System.in))
        {
            double lado1, apotema, radio, lado2, Area, Perimetro;
            int Option;

            do {
                System.out.println("0.- Area y perimetro de cuadrado");
                System.out.println("1.- Area y perimetro de pentagono");
                System.out.println("2.- Area y perimetro de circulo");
                System.out.println("3.- Area y perimetro de triangulo");
                System.out.println("4.- Area y perimetro de rectangulo");
                System.out.println("5.- Exit");

                System.out.println("Ingresa una opcion: ");
                Option = myObj.nextInt();

                switch(Option)
                {
                    case 0 ->
                    {
                        System.out.println("Ingresa el valor en metros del lado del cuadrado:");
                        lado1 = myObj.nextDouble();

                        Area = lado1*lado1*10000; //Multiplicar por 10,000 para la conversion de metros cuadrados a centimetros cuadrados
                        Perimetro = 4*lado1*100; //Multiplicar por 100 para la conversion de metros a centimetros

                        System.out.println("El area del cuadrado es: " + Area + " cm^2");
                        System.out.println("El perimetro del cuadrado es: " + Perimetro + " cm");
                    }
                    case 1 ->
                    {
                        System.out.println("Ingresa el valor en metros del lado del pentagono:");
                        lado1 = myObj.nextDouble();
                        System.out.println("Ingresa el valor en metros del apotema del pentagono:");
                        apotema = myObj.nextDouble();

                        Area = (((5*lado1)*apotema)/2)*10000;
                        Perimetro = 5*lado1*100;

                        System.out.println("El area del pentagono es: " + Area + " cm^2");
                        System.out.println("El perimetro del pentagono es: " + Perimetro + " cm");
                    }
                    case 2 ->
                    {
                        System.out.println("Ingresa el valor en metros del radio del circulo:");
                        radio = myObj.nextDouble();

                        Area = (Math.PI * (radio * radio))*10000;
                        Perimetro = Math.PI * (2 * radio)*100;

                        System.out.println("El area del circulo es: " + Area + " cm^2");
                        System.out.println("El perimetro del circulo es: " + Perimetro + " cm");
                    }
                    case 3 ->
                    {
                        System.out.println("Ingresa el valor en metros del lado del triangulo equilatero:");
                        lado1 = myObj.nextDouble();

                        Area = (lado1*lado1*(Math.sqrt(3))/4)*10000;
                        Perimetro = 3*lado1*100;

                        System.out.println("El area del triangulo es: " + Area + " cm^2");
                        System.out.println("El perimetro del triangulo es: " + Perimetro + " cm");
                    }
                    case 4 -> 
                    {
                        System.out.println("Ingresa el valor en metros del lado pequeno del rectangulo:");
                        lado1 = myObj.nextDouble();
                        System.out.println("Ingresa el valor en metros del lado grande del rectangulo:");
                        lado2 = myObj.nextDouble();

                        Area = lado1*lado2*10000;
                        Perimetro = ((2*lado1)+(2*lado2))*100;

                        System.out.println("El area del cuadrado es: " + Area + " cm^2");
                        System.out.println("El perimetro del cuadrado es: " + Perimetro + " cm");
                    }
                    case 5 -> 
                    {
                        System.out.println("Saliendo del programa");
                        System.exit(0);
                    }
                    default -> System.out.println("Escoge una opcion dentro de lo requerido");
                }
            } while (Option <= 5);
        }
    }
}