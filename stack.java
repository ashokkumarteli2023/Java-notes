// https://practice.geeksforgeeks.org/problems/implement-two-stacks-in-an-array/1
        //how integer array is used in java language
import java.util.Stack;

public class stack {
    public static void main(String argu[])
    {
        Stack<String> animals=new Stack<>();
        animals.push("Bear");
        animals.push("Cat");
        animals.push("Dog");
        // System.out.println("Stack: "+animals);

        System.out.println("Top animal: "+animals.peek());
        animals.pop();
        System.out.println("Updated top animal: "+animals.peek());
    }
}
