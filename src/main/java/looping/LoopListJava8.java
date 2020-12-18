package looping;
import java.util.*;
public class LoopListJava8 {
    
public static void main(String[] args) {
		 List<String> list = new ArrayList<>();
	      list.add("A");
	      list.add("B");
	      list.add("C");
	      list.add("D");
	      list.add("E");
	      
	      //Method References
	      list.forEach(System.out::println);
	
    }
}
