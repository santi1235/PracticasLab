class Empleado:
    def __init__(self, nombre, ID, salarioBase) -> None:
        self._nombre = nombre
        self._ID = ID
        self._salarioBase = salarioBase
        pass

    def setNombre(self, n_nombre):
        self._nombre = n_nombre

    def setID(self, n_ID):
        self._ID = n_ID

    def setSalarioBase(self, n_salarioBase):
        self._salarioBase = n_salarioBase

    def getNombre(self):
        return self._nombre

    def getID(self):
        return self._ID

    def calcularSalario(self):
        return self._salarioBase
    
    def getInfo(self):
        return f"El empleado: {self.getNombre()} \nCon ID: {self.getID()} \nTiene el salario: {self.calcularSalario():.2f}"
    
class EmpleadoTiempoCompleto(Empleado):
    def __init__(self, empleado) -> None:
        super().__init__(empleado.getNombre(), empleado.getID(), empleado.calcularSalario())

    def calcularSalario(self):
        return super().calcularSalario()*1.1
    
    def getInfo(self):
        return f"El empleado: {self.getNombre()} \nCon ID: {self.getID()} \nSalario calculado (Tiempo Completo): {self.calcularSalario():.2f}\n"
    
class EmpleadoMedioTiempo(Empleado):
    def __init__(self, empleado) -> None:
        super().__init__(empleado.getNombre(), empleado.getID(), empleado.calcularSalario())

    def calcularSalario(self):
        return super().calcularSalario()*.5
    
    def getInfo(self):
        return f"El empleado: {self.getNombre()} \nCon ID: {self.getID()} \nSalario calculado (Medio Tiempo): {self.calcularSalario():.2f}\n"
    
class EmpleadoPorHoras(Empleado):
    def __init__(self, empleado, horasTrabajadas) -> None:
        super().__init__(empleado.getNombre(), empleado.getID(), empleado.calcularSalario())
        self._horasTrabajadas = horasTrabajadas

    def setHorasTrabajadas(self, n_horasTrabajadas):
        self._horasTrabajadas = n_horasTrabajadas

    def getHorasTrabajadas(self):
        return self._horasTrabajadas

    def calcularSalario(self):
        return super().calcularSalario()*self.getHorasTrabajadas()
    
    def getInfo(self):
        return f"El empleado: {self.getNombre()} \nCon ID: {self.getID()} \nSalario calculado (Por Horas): {self.calcularSalario():.2f}\n"
    

if __name__ == '__main__':
    empleado1 = Empleado("Manuel", "34F24N51", 1500.0)
    ETC = EmpleadoTiempoCompleto(empleado1)

    empleado2 = Empleado("Jose", "1F4N6B8A", 1500.0)
    EMT = EmpleadoMedioTiempo(empleado2)

    empleado3 = Empleado("Marcelo", "S1M3K4L1", 200.0)
    EPH = EmpleadoPorHoras(empleado3,8)

    lista_empleados = [ETC, EMT, EPH]

    for empleado in lista_empleados:
        print(empleado.getInfo())