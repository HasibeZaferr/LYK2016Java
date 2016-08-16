package tr.org.linux.kamp2016.fileio;

import java.io.IOException;
import java.nio.ByteBuffer;

public class FileOperationsTest {

	public static void main(String args[]) throws IOException {

		FileOperations.createDirectory("/home/cylon/hede/");

		FileOperations.createFile("/home/cylon/hede/readme.md");

		FileOperations.writeToFile("ASDFG","/home/cylon/hede/readme.md");

		FileOperations.readFile("/home/cylon/hede/readme.md");

	}

}
