package uchidb;


/**
 * @author aelmore
 */
public class HW0Runner {
	
	private static Containers<Integer, String> containers = ContainersImpl.getInstance();
	
	// This class is a factory for a singleton containers class.
	// https://www.tutorialspoint.com/java/java_using_singleton.htm
	public static Containers<Integer, String> getContainers() {
		return containers;
	}
	
	public static void main(String[] args){
		
	}
}
