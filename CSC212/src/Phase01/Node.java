package Phase01;

public class Node <T>{
	public T data;  
	public Node<T> next; 

	public Node () {  
	        data = null;  
	        next = null;  
    }  
	public Node (T val) {  
	        data = val;  
	        next = null;  
	}  
	public void setData(T Data) {  
	        data = Data;  
	}  
	public T getData() {  
	        return data;  
	}  
	public void setNext(Node<T> Next) {  
	        next = Next;  
	}  
	public Node<T> getNext() {  
	        return next;  
	   }
	}

