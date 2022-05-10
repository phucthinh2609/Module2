import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<String> list = new Stack<>();
        System.out.println(list.isEmpty());
        list.push("Thinh");
        list.push("Phu");
        list.push("Tai");
        System.out.println(list.isEmpty());
        System.out.println("Stack before pop: "+list);
        System.out.println(list.pop());
        System.out.println("Stack after pop: "+list);


    }
}
