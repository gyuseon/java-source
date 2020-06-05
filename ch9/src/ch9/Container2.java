package ch9;

public class Container2<K,V> {
	private K key;
	private V value;
	
	void set(K key, V value) {
		
		this.key = key;
		this.value = value;
	}
	 K getKey() {
		return key;
	}
	
	 V getValue() {
		return value;
	}
	
	
	
	

}
