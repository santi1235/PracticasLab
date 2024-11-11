package laboratorio7;

class Empleado {
    private String nombre;
    private String ID;
    private double salarioBase;

    public Empleado(String nombre, String ID, double salarioBase) {
        this.nombre = nombre;
        this.ID = ID;
        this.salarioBase = salarioBase;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setID(String ID) {
        this.ID = ID;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public String getID() {
        return ID;
    }

    public double calcularSalario() {
        return salarioBase;
    }

    public String getInfo() {
        return String.format("El empleado: %s \nCon ID: %s \nTiene el salario: %.2f", getNombre(), getID(), calcularSalario());
    }
}

class EmpleadoTiempoCompleto extends Empleado {
    public EmpleadoTiempoCompleto(Empleado empleado) {
        super(empleado.getNombre(), empleado.getID(), empleado.calcularSalario());
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() * 1.1;
    }

    @Override
    public String getInfo() {
        return String.format("El empleado: %s \nCon ID: %s \nSalario calculado (Tiempo Completo): %.2f\n", getNombre(), getID(), calcularSalario());
    }
}

class EmpleadoMedioTiempo extends Empleado {
    public EmpleadoMedioTiempo(Empleado empleado) {
        super(empleado.getNombre(), empleado.getID(), empleado.calcularSalario());
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() * 0.5;
    }

    @Override
    public String getInfo() {
        return String.format("El empleado: %s \nCon ID: %s \nSalario calculado (Medio Tiempo): %.2f\n", getNombre(), getID(), calcularSalario());
    }
}

class EmpleadoPorHoras extends Empleado {
    private int horasTrabajadas;

    public EmpleadoPorHoras(Empleado empleado, int horasTrabajadas) {
        super(empleado.getNombre(), empleado.getID(), empleado.calcularSalario());
        this.horasTrabajadas = horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() * getHorasTrabajadas();
    }

    @Override
    public String getInfo() {
        return String.format("El empleado: %s \nCon ID: %s \nSalario calculado (Por Horas): %.2f\n", getNombre(), getID(), calcularSalario());
    }
}

public class Herencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Manuel", "34F24N51", 1500.0);
        EmpleadoTiempoCompleto ETC = new EmpleadoTiempoCompleto(empleado1);

        Empleado empleado2 = new Empleado("Jose", "1F4N6B8A", 1500.0);
        EmpleadoMedioTiempo EMT = new EmpleadoMedioTiempo(empleado2);

        Empleado empleado3 = new Empleado("Marcelo", "S1M3K4L1", 200.0);
        EmpleadoPorHoras EPH = new EmpleadoPorHoras(empleado3, 8);

        Empleado[] listaEmpleados = {ETC, EMT, EPH};

        for (Empleado empleado : listaEmpleados) {
            System.out.println(empleado.getInfo());
        }
    }
}