#include <stdio.h>
#include <ctype.h>

int mi_nuevoatoi(const char *str) {
    int resultado = 0;
    int signo = 1;

    while (isspace(*str)) {
        str++;
    }

    
    if (*str == '-' || *str == '+') {
        if (*str == '-') {
            signo = -1;
        }
        str++;
    }

   
    while (isspace(*str)) {
        str++;
    }

   
    while (isdigit(*str)) {
        resultado = resultado * 10 + (*str - '0');
        str++;
    }

    return resultado * signo; 
}

int main() {
    char cadena[100];
    printf("Introduzca la cadena que quiere que se convierta: ");
    scanf("%99[^\n]", cadena);

    int final = mi_nuevoatoi(cadena);
    printf("El número convertido es: %d\n", final);

    printf("Comprobemoslo... introduce un número por el cual se multiplicará el número convertido: ");
    int multiplicador;
    scanf("%d", &multiplicador);
    multiplicador = multiplicador * final;
    printf("El resultado es: %d\n", multiplicador);

    return 0;
}

