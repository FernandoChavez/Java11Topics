package com.fuerzadon.nestBasedAccess2;

public class Main {
	
	private void miMetodoPrivado() {
		System.out.println("Lllamada al metodo privado de la clase Main");
	}
	
	class MainAnidado{
		public void mensaje() {
			miMetodoPrivado();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main main = new Main();
		Main.MainAnidado mainAnidado = main.new MainAnidado();
		mainAnidado.mensaje();
		
	}

}
