#ifndef PROTOTIPOS2_H
#define PROTOTIPOS2_H

#define SIZE 100

typedef struct
{
    int array[SIZE];
    int tail;
    int head;
} Squeue;

void create_queue(Squeue *sque);
int next_index(int index);
int is_full_queue(Squeue sque);
int is_empty_queue(Squeue sque);
void enqueue(Squeue *sque, int e);
int dequeue(Squeue *sque);
void print_queue(Squeue sque);

typedef struct
{
    int top;
    int sarray[SIZE];
} sstack;

void create_stack(sstack *s);
int is_full_stack(sstack s);
int is_empty_stack(sstack s);
void push(sstack *s, int e);
int pop(sstack *s);
void print_stack(sstack s);

#include "funciones2.c"

#endif
