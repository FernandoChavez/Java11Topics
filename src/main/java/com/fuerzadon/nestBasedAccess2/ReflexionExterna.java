package com.fuerzadon.nestBasedAccess2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflexionExterna {
	
	private void miMetodoPrivado() {
       System.out.println("Llamada al metodo privado de la clase Main");
    }
      
    class MainAnidado{
       public void mensaje() {
         miMetodoPrivado();
       }
    }
    
   
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, InvocationTargetException {
		// TODO Auto-generated method stub
		Main miMain = new Main();
		Method method = miMain.getClass().getDeclaredMethod("miMetodoPrivado");
		method.invoke(miMain);
	}

}
