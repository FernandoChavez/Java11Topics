package com.fuerzadon.nestBasedAccess;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class mainJava11 {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, InvocationTargetException {
		// TODO Auto-generated method stub
		
		Outer ob = new Outer();
		//      Method method = ob.getClass().getDeclaredMethod("outerPrivate");
		//      method.invoke(ob);

		// new in J11 
		Method method = ob.getClass().getNestHost().getDeclaredMethod("outerPrivate");
		method.invoke(ob);
	}

}
