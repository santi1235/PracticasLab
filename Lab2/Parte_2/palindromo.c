#include <stdio.h>
#include <stdlib.h>
#include "prototipos2.h"

int main()
{
    char arr[SIZE];
    int i = 0;
    int r = 1; // Inicializado en 1 para simplificar la lógica de la verificación
    int a, b;

    Squeue sq;
    create_queue(&sq);
    sstack pila;
    create_stack(&pila);

    printf("Introduce la secuencia de números separados por espacios (termina con un enter): \n");
    fgets(arr, SIZE, stdin);

    while (arr[i] != '\0')
    {
        if (arr[i] >= '0' && arr[i] <= '9')
        {
            int num = arr[i] - '0'; // Convertir de carácter a número
            push(&pila, num);
            enqueue(&sq, num);
        }
        else if (arr[i] == ' ' || arr[i] == '\n')
        {
            // Ignorar espacios y nueva línea
        }
        else
        {
            printf("Entrada inválida. Solo se permiten dígitos y espacios.\n");
            return 1;
        }
        i++;
    }

    while (!is_empty_queue(sq) && !is_empty_stack(pila) && r)
    {
        a = pop(&pila);
        b = dequeue(&sq);

        if (a != b)
        {
            r = 0;
        }
    }

    if (r)
    {
        printf("\nLos números son palíndromos\n");
    }
    else
    {
        printf("\nLos números NO son palíndromos\n");
    }

    return 0;
}
