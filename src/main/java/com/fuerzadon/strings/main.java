package com.fuerzadon.strings;

import java.util.stream.Collectors;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//isBlank: Este nuevo método retorna un valor booleano según si el string contiene solo espacios en blanco y si está vacío.
		System.out.println(" ".isBlank());
		String s = "Hi world";
		System.out.println(s.isBlank());
		String s1 = "";
		System.out.println(s1.isBlank());
		System.out.println();
		
		// lines(): Este metodo devolvera un array de strings ‘spliteando’ el texto por lineas.
		String str = "Hi\nWord\nHi\nUniverse";
		System.out.println(str);
		System.out.println(str.lines().collect(Collectors.toList()));
		System.out.println();
		
		// strip(), stripLeading(), stripTrailing() Remueve los caracteres en blanco. A diferencia del viejo trim(), 
		//este nuevo método strip si tiene en cuenta los caracteres Unicode.
		String hello = " HELLO ";
		System.out.println("SAY" + hello.strip() + "PLEASE");
		System.out.println("SAY" + hello.stripLeading() + "PLEASE");
		System.out.println("SAY" + hello.stripTrailing() + "PLEASE");
		System.out.println("SAY" + hello.trim() + "PLEASE");
		System.out.println();
		
		
		//Character.isWhitespace(c) nos permite saber si un carácter es considerado un blanco.
		// es un método incorporado en java que determina si el carácter especificado (punto de código Unicode) es un espacio en blanco según Java
		Character c = '\u2000';
		String stringWithUnicode = c  + "abc" + c;
		System.out.println("Contain unicode " + Character.isWhitespace(c));
		System.out.println("Trim test " + (stringWithUnicode == stringWithUnicode.trim()));
		System.out.println("Strip test " + ("abc" == stringWithUnicode.strip()));
		System.out.println();
		
		// repeat() example
		String rep = "HI".repeat(2);
		System.out.println(rep);
		System.out.println();
		
		
	
	}
}
