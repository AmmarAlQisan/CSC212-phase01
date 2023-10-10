package Phase01;

public class LinkedListADT <T>{
	 private Node<T> head;  
	 private Node<T> current;  
	 public int size;  
	      
	 public LinkedListADT() {  
	      size = 0;  
	      head = current = null;  
     }  
	public boolean isEmpty () {  
	      return head == null;  
	 }  
	 public boolean last () {  
	       return current.next == null;  
	 }  
	 public boolean full () {  
	        return false;  
	 }  
	 public void findFirst () {  
	         current = head;  
	 }  
	 public void findNext () {  
	         current = current.next;  
	 }  
	 public T retrieve () {  
	         return current.data;  
	 }  
	 public void update (T val) {  
	         current.data = val;  
	 }  
	 public boolean insertionSort(T val) {
		 return false;

	 }
	  public boolean searching(T val) {
		  return false;
	  }
	  public T remove (T val) { 
		  return val;
	  }
	  public void printInformation() {
		  
	  }
}
