#include "prototipos2.h"
#include <stdio.h>
#include <stdlib.h>

void create_queue(Squeue *sque)
{
    sque->tail = -1;
    sque->head = 0;
}

int next_index(int index)
{
    return (index + 1) % SIZE;
}

int is_full_queue(Squeue sque)
{
    return (next_index(sque.tail) == sque.head && sque.tail != -1);
}

int is_empty_queue(Squeue sque)
{
    return (sque.tail == -1);
}

void enqueue(Squeue *sque, int e)
{
    if (is_full_queue(*sque))
    {
        printf("Error de overflow\n");
    }
    else
    {
        sque->tail = next_index(sque->tail);
        sque->array[sque->tail] = e;
    }
}

int dequeue(Squeue *sque)
{
    int e;
    if (is_empty_queue(*sque))
    {
        e = -1; // Usamos -1 para indicar error, ya que los números de entrada son >= 0
        printf("Error de Underflow\n");
        return e;
    }
    else
    {
        e = sque->array[sque->head];
        if (sque->head == sque->tail)
        {
            sque->head = 0;
            sque->tail = -1;
        }
        else
        {
            sque->head = next_index(sque->head);
        }
        return e;
    }
}

void print_queue(Squeue sque)
{
    int e;
    Squeue sq1;
    create_queue(&sq1);

    if (is_empty_queue(sque))
    {
        printf("Error de underflow\n");
    }
    else
    {
        printf("Cola: ");
        while (!is_empty_queue(sque))
        {
            e = dequeue(&sque);
            enqueue(&sq1, e);

            if (is_empty_queue(sque))
            {
                printf("%d", e);
            }
            else
            {
                printf("%d <-- ", e);
            }
        }
        printf("\n");
        while (!is_empty_queue(sq1))
        {
            e = dequeue(&sq1);
            enqueue(&sque, e);
        }
    }
}

void create_stack(sstack *s)
{
    s->top = -1;
}

int is_full_stack(sstack s)
{
    return (s.top == SIZE - 1);
}

int is_empty_stack(sstack s)
{
    return (s.top == -1);
}

void push(sstack *s, int e)
{
    if (is_full_stack(*s))
    {
        printf("Error de overflow\n");
    }
    else
    {
        s->top++;
        s->sarray[s->top] = e;
    }
}

int pop(sstack *s)
{
    if (is_empty_stack(*s))
    {
        printf("Error de underflow\n");
        return -1; // Usamos -1 para indicar error
    }
    int e = s->sarray[s->top];
    s->top--;
    return e;
}

void print_stack(sstack s)
{
    if (is_empty_stack(s))
    {
        printf("Error: Stack is empty\n");
    }
    else
    {
        printf("Pila: ");
        int i;
        for (i = s.top; i >= 0; i--)
        {
            printf("%d --> ", s.sarray[i]);
        }
        printf("NULL\n");
    }
}