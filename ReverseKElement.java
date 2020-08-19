import java.util.*;
public class ReverseKElement {
	static Queue<Integer> queue;
	static void reverseKElements(int k) 
    { 
        if (queue.isEmpty() == true|| k > queue.size()) 
            return; 
        if (k <= 0) 
            return; 
  
        Stack<Integer> stack = new Stack<Integer>(); 
        for (int i = 0; i < k; i++) { 
            stack.push(queue.peek()); 
            queue.remove(); 
        } 
        while (!stack.empty()) { 
            queue.add(stack.peek()); 
            stack.pop(); 
        } 
        for (int i = 0; i < queue.size() - k; i++) { 
            queue.add(queue.peek()); 
            queue.remove(); 
        } 
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
		int k=sc.nextInt();
		reverseKElements(k);
		while (!queue.isEmpty())  
        { 
            System.out.print(queue.peek() + " "); 
            queue.remove(); 
        } 
     sc.close();
		
	}

}
