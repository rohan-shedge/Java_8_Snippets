package looping;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class LambdaExceptions {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Rohan ","nikhil ","Vivek ");
		Consumer<String> consumer = (s) -> printElements(s);
		list.forEach(consumer);
		
	}

	private static void printElements(String s) {
		String localPath = "abc.txt";
		try {
			if (!Files.exists(Paths.get(localPath))) {
			    Files.write(Paths.get(localPath),s.getBytes(), StandardOpenOption.CREATE);
			} else {
				Files.write(Paths.get(localPath),s.getBytes(), StandardOpenOption.APPEND);
			}
			
		}catch (Exception e) {
		    e.printStackTrace();
		}
		
	}

}
