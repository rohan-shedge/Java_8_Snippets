package looping;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ForEachConsumer {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Rohan", "Mugdha", "pradnya");
		Stream<String> stream = Stream.of("Rohan", "vivek", "nikhil");
		
        Consumer<String> con = (s) -> {
        	System.out.print(s + " => ");
        	StringBuilder sb = new StringBuilder();
        	for (char c: s.toCharArray()) {
        		String hex = Integer.toHexString(c);
        		sb.append(hex);
        	}
        	System.out.println(sb);
        	
        };
        
        list.forEach(con);
        System.out.println("");
        stream.forEach(con);
		
		
		
	}
}
