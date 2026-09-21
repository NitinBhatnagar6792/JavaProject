package courses.in28minutes.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestFiles {

	public static void main(String[] args) throws IOException {
		Path sampleFilePath = Paths.get("./resources/sample.txt");
		String fileContent = Files.readString(sampleFilePath);
		System.out.println(fileContent);

		Path outFilePath = Paths.get("./resources/sample-out.txt");
		Files.writeString(outFilePath, "Output:"+fileContent);
	}

}
