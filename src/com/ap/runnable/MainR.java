package com.ap.runnable;

public class MainR {
	
	public static void main(String[] args) {
		
		new Thread(new CodeToRun()).start();
		
	}

}

class CodeToRun implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Printing from the Runnable");
		
	}
	
	
}


/*

//Also we can do this way too
 
 public class MainR {
	
	public static void main(String[] args) {
		
		new Thread(new Runnable() {
		@Override
		public void run(){
		System.out.println("Printing from teh Runnable");
		
		}
		
		}).start();
		
	}

}
 
 
 */


/**

Now go ahead use lambda expression to do tha

public class MainR {
	
	public static void main(String[] args) {
		
		new Thread(()-> System.ourt.println("Printing from the Runnable")).start();
		
	}

}


*/