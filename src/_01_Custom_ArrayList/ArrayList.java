package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	
	public ArrayList() {
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		
		return null;
	}
	
	public void add(String string) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(string);

		
	}
	
	public void insert(int loc, int val) throws IndexOutOfBoundsException {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.insert(loc, val);
	}
	
	public void set(int loc, int val) throws IndexOutOfBoundsException {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.set(loc, val);
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.remove(loc);
	}
	
	public boolean contains(int val) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.contains(val);
		return false;
	}
}