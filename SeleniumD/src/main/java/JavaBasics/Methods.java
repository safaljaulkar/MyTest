package JavaBasics;

public class Methods {

	// void method, non static method
	public void method1() {
		System.out.println("Hii");
	}

	public void method2() {
		System.out.println("Hii Two");
	}

	//static method
	public static void method3() {
		System.out.println("hii three");
	}
	
	//method with return type
			public String method4() {
		String a=("Rahul");
		return a;
	}
	//method with parameters
			public void method5(int a, String b) {
				System.out.println(a+b);

				
			}
			
	
	public static void main(String[] args) {

		// call the method
		// create object and then call the method
		// syntax --classname object = new classname();

		// reference variable object
		Methods obj = new Methods(); // create object
		obj.method1(); // call the method
		obj.method2(); //need to create object  
		method3(); //no need to create the object
		
		//method5 obj 
		obj.method5(10, "20");
		
		
		
		
	} 
}
