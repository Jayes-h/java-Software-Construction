interface IntStack {
    void push(int item);
    int pop();
}

class FixedStack implements IntStack {

    private int stck[];
    private int tos;
    FixedStack(int size) {
        stck = new int[size];
        tos = -1;
    }
    public void pushA(int item) {
        if (tos == stck.length-1)
            System.out.println("Stack is full.");
        else stck[++tos] = item;
    }
    public int pop() {
        if (tos < 0) {
            System.out.println("Stack undeflow");
            return 0;
        }
        else return stck[tos--];
    }
}

class demo {
    public static void main(String args[]) {
        FixedStack mystack1 = new FixedStack(5);
        FixedStack mystack2 = new FixedStack(8);
        for (int i=0; i < 5; i++) mystack1.push(i);
        for (int i=0; i < 8; i++) mystack2.push(i);
        System.out.println("Stack in mystack1: ");
        for (int i=0; i < 5; i++)
            System.out.println(mystack1.pop());
        System.out.println("Stack in mystack2: ");
        for (int i=0; i < 8; i++)
            System.out.println(mystack2.pop());
    }
}