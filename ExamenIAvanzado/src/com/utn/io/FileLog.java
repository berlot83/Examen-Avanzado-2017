package com.utn.io;

import java.io.File;
import java.io.FileWriter;
import java.io.Serializable;

public class FileLog implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 208438101929954252L;
	
	static public void saveLog(String report, String nombre) {
		try {
			/* Local del proyecto */
			File fileLocal = new File(nombre+".txt");
			FileWriter fileWriterLocal = new FileWriter(fileLocal, true);
			fileWriterLocal.write(report);
			fileWriterLocal.flush();
			fileWriterLocal.close(); 
			
			/* Path indicado en examen */
			File file = new File("c:/manaos/"+nombre+".txt");
			FileWriter fileWriter = new FileWriter(file, true);
			fileWriter.write(report);
			fileWriter.flush();
			fileWriter.close();
			
		} catch (Exception error) {
			System.out.println("explotó : "+ error.getMessage());
		}
	}
}
