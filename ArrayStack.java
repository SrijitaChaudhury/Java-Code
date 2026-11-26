class ArrayStack {
    int stack[];
    int top;
    public ArrayStack() {
        stack=new int[1000];
        top=-1;
    }

    public void push(int x) {
        if(top==stack.length-1)
        {
        System.out.println("Stack Overflow!");
        return;
        }
        stack[++top]=x;
       
    }

    public int pop() {
      if(top==-1)
      {
        System.out.println("Stack Underflow!");
        return 0;
      }
      return stack[top--];
    }

    public int top() {
        if(isEmpty())
        {
            System.out.println("Stack is empty");
            return 0;
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return (top==-1);
    }
}
