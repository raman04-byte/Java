    #include <stdio.h>
    #include <conio.h>
    #include <stdlib.h>
    // #include <iostream>
    struct stack
    {
        int size;
        int top;
        int *arr;
    };

    int isEmpty(struct stack *ptr)
    {
        if (ptr->top == -1)
        {
            printf("This is empty");
            return 1;
        }
        else
        {
            printf("This");
            return 0;
        }
    }
    int isFull(struct stack *ptr)
    {
        if (ptr->top == ptr->size - 1)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

    int main()
    {
        struct stack *s;
        s->size = 80;
        s->top = -1;
        s->arr = (int *)malloc(s->size * sizeof(int));
        // Checking the stack is emppty or not
        if (isEmpty(s))
        {
            printf("The stack is empty");
        }
        else
        {
            printf("The stack is not empty");
        }
        
        
        return 0;
    }