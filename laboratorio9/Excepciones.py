class DepositoInvalidoException(Exception):
    def __init__(self, mensaje):
        super().__init__(mensaje)

class RetiroInvalidoException(Exception):
    def __init__(self, mensaje):
        super().__init__(mensaje)

class FondosInsuficientesException(Exception):
    def __init__(self, mensaje):
        super().__init__(mensaje)

class CuentaBancaria:
    def __init__(self, numero_cuenta, saldo):
        self.numero_cuenta = numero_cuenta
        self.saldo = saldo

    def depositar(self, n_saldo):
        try:
            if n_saldo < 0:
                raise DepositoInvalidoException("No se puede depositar una cantidad negativa")
            self.saldo += n_saldo
            print(f"Depósito exitoso. Saldo total: {self.saldo}")
        except DepositoInvalidoException as e:
            print(f"Error: {e}")

    def retirar(self, n_saldo):
        try:
            if n_saldo < 0:
                raise RetiroInvalidoException("No se puede retirar una cantidad negativa")
            if n_saldo > self.saldo:
                raise FondosInsuficientesException("No se puede retirar una cantidad mayor a la de su saldo")
            self.saldo -= n_saldo
            print(f"Retiro exitoso. Saldo restante: {self.saldo}")
        except (RetiroInvalidoException, FondosInsuficientesException) as e:
            print(f"Error: {e}")

if __name__ == "__main__":
    cuenta = CuentaBancaria("CWXS", 500.0)

    while True:
        try:
            print("\n--- Menú ---")
            print(f"Saldo actual: ${cuenta.saldo}")
            print("1.- Depósito")
            print("2.- Retiro")
            print("3.- Salir")

            opcion = int(input("Ingresa una opción: "))

            if opcion == 1:
                monto = float(input("Ingresa el monto a depositar: "))
                cuenta.depositar(monto)

            elif opcion == 2:
                monto = float(input("Ingresa el monto a retirar: "))
                cuenta.retirar(monto)

            elif opcion == 3:
                print("Saliendo del programa...")
                break

            else:
                print("Escoge una opción dentro de lo requerido")
        except ValueError:
            print("Error: Entrada inválida. Por favor, ingresa un número.")