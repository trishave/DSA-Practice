import java.util.Stack;

public class stack {
    public static void main(String args[])
    {
        Stack<String> animals= new Stack<>();

        animals.push("Lion");
        animals.push("Dog");
        animals.push("Cat");
        animals.push("Horse");
        animals.push("Rabbit");
        animals.push("Tiger");
        animals.push("Unicorn");

        System.out.println("Stack: " + animals);
        System.out.println(animals.peek());

        animals.pop(); 
        System.out.println("Stack: " + animals);
    }
}
