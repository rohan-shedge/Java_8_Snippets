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
	      list.add(null);
	      
	      //Method References
	      list.forEach(System.out::println);
	      
	      System.out.println("-----------------");
	      
	      //Print only Non null Element
	      list.stream()
	          .filter(Objects::nonNull)
	          .forEach(System.out::println);
	      
	
    }
}
