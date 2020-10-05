package listing6.exponentiation.back_pack;

public class StackBackPack {
    private int size;
    private Item[] stack;
    private int top = -1;

    public StackBackPack(int size) {
        this.size = size;
        stack = new Item[size];
    }

    public void put(Item item){
        stack[++top] = item;
    }

    public Item peek() {
        if (top == -1)
            return null;
        return stack[top];
    }

    public Item pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return null;
        }
        return stack[top--];
    }

}
