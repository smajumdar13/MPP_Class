package Lesson10.Prob2;

import java.io.*;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.logging.Logger;



public class NewFileIO {
	private static final Logger LOG = Logger.getLogger(NewFileIO.class.getName());
	public final static String FILE_LOCATION = "src/Lesson10/Prob2/output.txt";
	public final static String TO_PRINT = "This is the new string to print to file.";
	
	void writeText(String filename, String text) {
		
		try(PrintWriter	writer = new PrintWriter(new FileWriter(new File(filename)))) {
		
			writer.print(text);
		} catch(IOException e) {
			LOG.warning("IOException attempting to write a file: " + e.getMessage());
			List<Throwable> supressed = Arrays.asList(e.getSuppressed());
			supressed.forEach(except->LOG.warning("Suppresed message: " + e.getMessage()));
		} 
	}
	
	public static void main(String[] args) {
		NewFileIO old = new NewFileIO();
	    old.writeText(FILE_LOCATION, TO_PRINT);
		
	}

}
