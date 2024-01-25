
public class singletonClass {

	private singletonClass() {
		
	}
	private static singletonClass sc;
	public static  singletonClass getInstance() {
		if(sc==null) {
			sc= new singletonClass();
		}	
			return sc;
		
		
	}
	
	

}
