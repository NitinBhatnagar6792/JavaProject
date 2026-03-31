package test.courses.in28minutes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TestFiles {

	public static void main(String[] args) throws IOException {
		//listFiles();
		//readFile();
		writeToFile();
	}
	
	public static void writeToFile() throws IOException {
		Path datafilepath = Paths.get("./resources/data-out.txt");
		List<String> items = List.of("First Line", "second line", "last line");
		Files.write(datafilepath, items);
	}
	
	public static void readFile() throws IOException {
		Path datafilepath = Paths.get("./resources/data.txt");
		List<String> lines = Files.readAllLines(datafilepath);
		lines.forEach(System.out::println);
		
		System.out.println("== read files as stream of lines ==");
		Files.lines(datafilepath).forEach(System.out::println);
	}	
	
	public static void listFiles() throws IOException {
		// list all the files in the current directory
		Path currDir = Paths.get(".");
		System.out.println("Listing files in current dir");
		Files.list(currDir).forEach(System.out::println);
		
		System.out.println("Listing files in current dir and sub dirs");
		Files.walk(currDir, 2).forEach(System.out::println);
	}

}
