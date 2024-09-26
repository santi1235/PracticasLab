import java.util.Scanner;
class Coordenadas{
    public static void main(String [] args){
        try (Scanner myObj = new Scanner(System.in)) 
        {
            int x, y;
            System.out.println("Ingrese el valor para X:");
            x = myObj.nextInt();
            System.out.println("Ingrese el valor para Y:");
            y = myObj.nextInt();
            if(x > 0 && y >0)
            {
                System.out.println("Las coordenadas ("+ x +","+ y +") se encuentran en el cuadrante 1");
            }
            else if(x > 0 && y < 0 )
            {
                System.out.println("Las coordenadas ("+ x +","+ y +") se encuentran en el cuadrante 4");
            }
            else if(x < 0 && y < 0 )
            {
                System.out.println("Las coordenadas ("+ x +","+ y +") se encuentran en el cuadrante 3");
            }
            else if(x < 0 && y > 0 )
            {
                System.out.println("Las coordenadas ("+ x +","+ y +") se encuentran en el cuadrante 2");
            }
            else
            {
                System.out.println("Las coordenadas son el origen (0,0)");
            }
        }
    }
}