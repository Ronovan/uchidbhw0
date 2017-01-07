package uchidb;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author aelmore
 */
public class HW0Runner implements Containers<Integer, String> {

	private static HW0Runner containers = new HW0Runner();
	private Map<String, Integer> localMap;
	
	/* 
	 * A private Constructor prevents any other
	 * class from instantiating.
	*/
	private HW0Runner() { }
	
	// Create a set that stores the array of Integer objects.
	public Set<Integer> initSet(Integer[] tArray) {
		Set<Integer> set = new HashSet<Integer>();
		for(int i = 0; i < tArray.length; i++) {
			set.add(tArray[i]);
		}
		return set;
	}
	
	// Create a list that stores the array of Integer objects.
	public List<Integer> initList(Integer[] tArray) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < tArray.length; i++) {
			list.add(tArray[i]);
		}
		return list;
	}
	
	// Create an empty map that will use type String as keys, and Integer as values.
	public Map<String, Integer> initEmptyMap() {
		return new HashMap<String, Integer>();
	}
	
	// Store the map in a local field variable -- often called a setter.
	public void storeMap(Map<String, Integer> mapToStoreInClass) {
		localMap = mapToStoreInClass;
	}
	
	// Add a key value to store map with a boolean indicating whether to overwrite existing value.
	public boolean addToMap(String key, Integer value, boolean overwriteExistingKey) {
		if (!overwriteExistingKey) {
			if (localMap.putIfAbsent(key, value) == null) {
				return true;
			}
			return false;
		}
		localMap.put(key, value);
		return true;
	}
	
	// Get a value based on a key.
	public Integer getValueFromMap(String key) {
		return localMap.get(key);
	}
	
	// An overloaded function to get value from map but with a default value
	// if the key is not present.
	public Integer getValueFromMap(String key, Integer defaultValue) {
		return localMap.getOrDefault(key, defaultValue);
	}
	   
	// This class is a factory for a singleton containers class.
	// https://www.tutorialspoint.com/java/java_using_singleton.htm
	public static Containers<Integer, String> getContainers() {
		return containers;
	}
	
	
	public static void main(String[] args){
		
	}
}
