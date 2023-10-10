package Phase01;

public class LinkedListADT <T> implements comparable<T>{
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
		 Node<T> tmp;
		 
		 if(isEmpty()) {
			 current = head = new Node<T> (val);
			 return false;
			 
		 }else {
			 tmp = current.next;
			 current.next = new Node<T> (val);
			 current = current.next;
			 current.next = tmp;
			 return true;
		 } 

	 }
	 
	 
	  public boolean searching(T val) {
	   if (head == null)  
	        return false;  
	          
	    Node<T> pointer  = head;  
	      while ((pointer != null ) && (pointer.getData()== val))  
	    	  pointer = pointer.getNext();  
	      if ((pointer != null) && (pointer.getData()== val)) {  
	            current = pointer;  
	            return true;  
	        }  
	        return false; 
	  }
	  public T remove (T val) { 
		  return val;
	  }
	  public void printInformation() {
		  Node <T>  pointer = head;  
          while (pointer != null){  
              System.out.print(pointer.data + "");  
              pointer = pointer.next;  
          }  
          System.out.println("");  
      }
	  
}