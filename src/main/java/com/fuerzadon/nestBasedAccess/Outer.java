package com.fuerzadon.nestBasedAccess;

public class Outer {
	
	public void outerPublic(){
		
	}
	
	private void outerPrivate() {
		
	}
	
	class Inner {
		
		public void innerPublic() {
			outerPrivate();
		}
		
	}
}
