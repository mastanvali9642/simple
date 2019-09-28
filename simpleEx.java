
interface length{
	public int stringLength(String name);
}


public class simpleEx {
	
	public static void main(String[] args) {
		
	
	
	length l=(name)->{return name.length();};
	
	System.out.println(l.stringLength("mohan"));
	
	
	}

}
