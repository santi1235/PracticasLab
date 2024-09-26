#include <stdio.h>
#include <stdlib.h>

int main()
{
    int array[] = {1, 0, 2, -2, 11, 7, 9, 8};
    int target = 9;
    int suma = 0;

    int tamano = sizeof(array) / sizeof(array[0]);

    for (int i = 0; i < tamano; i++)
    {
        for (int j = i + 1; j < tamano; j++)
        {
            suma = array[i] + array[j];
            if (suma == target)
            {
                printf("Los indices  de los elementos que sumados dan %d son: indice (%d), valor (%d) y indice(%d), valor (%d)\n", target, i, array[i], j, array[j]);
            }
        }
    }
    if (suma != target)
    {
        printf("No hay mas elementos que cumplan la condicion.");
    }
    return 0;
}