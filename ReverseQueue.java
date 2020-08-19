import java.util.*;
public class ReverseQueue {
	static Queue<Integer> queue;
	static Queue<Integer> reverseQueue(Queue<Integer> Q)  //reverse using recursion
	{ 
	    if (Q.isEmpty()) 
	        return Q; 
	   
	    int data = Q.peek(); 
	    Q.remove();
	    Q = reverseQueue(Q); 
	    Q.add(data); 
	          
	    return Q; 
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		queue=new LinkedList<Integer>();
		int n=sc.nextInt();
		while(n!=-1)
		{
			
            queue.add(n); 
            n=sc.nextInt();
		}
		queue = reverseQueue(queue); 
		while (!queue.isEmpty())  
        { 
            System.out.print(queue.peek() + " "); 
            queue.remove(); 
        } 
     sc.close();
	}

}
