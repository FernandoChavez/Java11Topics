package com.fuerzadon.nestBasedAccess;

import java.lang.reflect.Method;

public class mainNotJava11 {

	public static void main(String[] args) throws Exception {
		Outer ob = new Outer();
		Method method = ob.getClass().getDeclaredMethod("outerPrivate");
		method.invoke(ob);

	}

}
