import java.util.Scanner; 

class Pago_empleado
{
    public static void main(String[] args)
    {
        try(Scanner myObj = new Scanner(System.in))
        {
            int horas, horas_extra, aux;
            double sueldo = 100.0;
            double sueldo_extra;
            double pago_normal, pago_extra, pago_total;

            System.out.println("Ingrese las horas trabajadas: ");
            horas = myObj.nextInt();
            if(horas <= 40)
            {
                pago_normal = horas*sueldo;
                System.out.println("El pago de las " + horas + " trabajadas es : " + pago_normal);
            }
            else
            {
                horas_extra = horas%40;
                sueldo_extra = sueldo*1.5;
                aux = horas;
                pago_extra = horas_extra*sueldo_extra;
                horas = horas - horas_extra;
                pago_normal = horas * sueldo;
                pago_total = pago_extra + pago_normal;
                System.out.println("El pago de las " + horas + " trabajadas es : " + pago_normal);
                System.out.println("El pago extra de las " + horas_extra + " trabajadas es : " + pago_extra);
                System.out.println("El pago total de las " + aux + " trabajadas es : " + pago_total);
            }
        }
        System.exit(0);
    }
}