
horas = int(input("Ingrese las horas trabajadas: "))
sueldo = 100.0

def calculo_salario(horas, sueldo):
    if horas <= 40:
        pago_normal = horas*sueldo
        print(f"El pago de las {horas} horas trabajadas es: {pago_normal}")
    else:
        horas_extra = horas % 40
        sueldo_extra = sueldo*1.5
        aux = horas
        pago_extra = horas_extra*sueldo_extra
        horas = horas - horas_extra
        pago_normal = horas * sueldo
        pago_total = pago_extra + pago_normal
        print(f"El pago de las {horas} horas trabajadas es: {pago_normal}")
        print(f"El pago extra de las {horas_extra} horas trabajas es: {pago_extra}")
        print(f"El pago total de las {aux} horas trabajadas es: {pago_total}")


if __name__ == '__main__':
    calculo_salario(horas, sueldo)