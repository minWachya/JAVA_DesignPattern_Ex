package ch23;

import java.util.*;
import java.io.*;

public class InterpreterMain {
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("C:\\StudyJAVA\\program.txt"));
			String text;
			while ((text = reader.readLine()) != null) {
				System.out.println("text = \"" + text + "\"");
				Node node = new ProgramNode();
				node.parse(new Context(text));
				System.out.println("node = " + node);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
