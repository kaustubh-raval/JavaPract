import java.util.EmptyStackException;

class StackG<T> {
    private int size;
    private Object[] array;
    private int top;

    public StackG(int size) {
        this.size = size;
        this.array = new Object[size];
        this.top = -1;
    }

    public void push(T element)
    {
        if(this.isFull())
        {
            throw new StackOverflowError();
        }
        else
        {
            top++;
            array[top] = element;
        }
    }

    public T pop() {
        if(this.isEmpty())
            throw new EmptyStackException();
        return (T)(this.array[top--]);
    }

    public T peek() {
        if(this.isEmpty())
            throw new EmptyStackException();
        return (T)this.array[top];
    }

    public boolean isEmpty()
    {
        return top == -1;
    }

    public boolean isFull()
    {
        return top == size;
    }
}

public class GenStack3
{
    public static void main(String[] args)
    {
        StackG<Integer> stack = new StackG<Integer>(10);
        stack.push(10);
        stack.push(20);
        stack.pop();
    }
}