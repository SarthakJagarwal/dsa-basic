import java.util.Stack ;

public class stack{
    public static void main(String[] args){

        Stack<String> stack = new Stack<String>() ; 

      //  System.out.println(stack.empty() ) ; 

      stack.push("sarthak") ;
      stack.push("kunal") ;
      stack.push("shivansh") ; 
      stack.push("aman") ; 

      String sar =   stack.pop() ; 
      System.out.println(stack);
      System.out.println(sar);
      System.out.println(stack.peek()) ; 
      System.out.println(stack.isEmpty());
      System.out.println(stack.size());
      System.out.println(stack.search("sarthak"));
      System.out.println(stack.search("asfdafA"));
    }
}