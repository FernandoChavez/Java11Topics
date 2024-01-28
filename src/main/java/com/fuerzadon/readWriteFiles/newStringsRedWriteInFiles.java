package com.fuerzadon.readWriteFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class newStringsRedWriteInFiles {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//En Java 11 se agregaron estos dos métodos que nos simplificarán la lectura y escritura de texto sobre archivos: readString(Path), readString(Path, Charset),
		// writeString(Path, CharSequence, OpenOption…), writeString(Path, CharSequence, Charset, OpenOption…)
		Path path = Files.writeString(
				Files.createTempFile(
						"myfileforjava11", ".txt"),
						"This was posted on JD");
				
				
		String s = Files.readString(path);
		System.out.println(s);
	}

}
