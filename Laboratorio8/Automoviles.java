package laboratorio8;

abstract class Vehiculo {
    protected String Marca;
    protected String Modelo;
    protected int Año;

    public Vehiculo(String Marca, String Modelo, int Año){
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Año = Año;
    }

    public void setMarca(String n_Marca) {
        this.Marca = n_Marca;
    }

    public String getMarca() {
        return Marca;
    }

    public void setModelo(String n_Modelo) {
        this.Modelo = n_Modelo;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setAño(int n_Año) {
        this.Año = n_Año;
    }

    public int getAño() {
        return Año;
    }

    public abstract String encender();
    public abstract String apagar();
    public abstract String describir();
}

class Auto extends Vehiculo {

    public Auto(String Marca, String Modelo, int Año){
        super(Marca, Modelo, Año);
    }

    @Override
    public String encender(){
        return "El auto esta encendido";
    }

    @Override
    public String apagar(){
        return  "El auto esta apagado";
    }

    @Override
    public String describir(){
        return "Este es un auto de marca: " + Marca + ", modelo: " + Modelo + ", del año: " + Año;
    }
}

class Motocicleta extends Vehiculo {

    public Motocicleta(String Marca, String Modelo, int Año){
        super(Marca, Modelo, Año);
    }

    @Override
    public String encender(){
        return "La motocicleta esta encendido";
    }

    @Override
    public String apagar(){
        return  "La motocicleta esta apagado";
    }

    @Override
    public String describir(){
        return "Esta es una motocicleta de marca: " + Marca + ", modelo: " + Modelo + ", del año: " + Año;
    }
}

class Camion extends Vehiculo {

    public Camion(String Marca, String Modelo, int Año){
        super(Marca, Modelo, Año);
    }

    @Override
    public String encender(){
        return "El camion esta encendido";
    }

    @Override
    public String apagar(){
        return  "El camion esta apagado";
    }

    @Override
    public String describir(){
        return "Este es un camion de marca: " + Marca + ", modelo: " + Modelo + ", del año: " + Año;
    }
}

public class Automoviles{
    public static void main(String[] args) {
        Auto Auto1 = new Auto("Kya", "Ria", 2024);
        Motocicleta Moto1 = new Motocicleta("Yamaha", "Ténéré 700 Rally", 2024);
        Camion Camion1 = new Camion("Isuzu", "ELF 100", 2024);

        Vehiculo[] Automoviles = {Auto1,Moto1,Camion1};

        for (Vehiculo Automovil : Automoviles) {
            System.out.println(Automovil.describir());
        }
    }
}