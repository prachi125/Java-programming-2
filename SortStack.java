import java.util.*; 
public class SortStack {
	
	public static Stack<Integer> sortstack(Stack<Integer> input){ 

		Stack<Integer> tempStack = new Stack<Integer>(); 
        while(!input.isEmpty()) 
          { 

            int tmp = input.pop(); 
            while(!tempStack.isEmpty() && tempStack.peek()> tmp) 
                    input.push(tempStack.pop()); 
            tempStack.push(tmp); 
           } 
         return tempStack; 
     } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Stack<Integer> S1 = new Stack<Integer>(); 
		int n=sc.nextInt();
		while(n!=-1)
		{
            S1.add(n); 
            n=sc.nextInt();
		}
        Stack<Integer> tempStack=sortstack(S1); 
        while (!tempStack.empty()) 
        { 
            System.out.print(tempStack.pop()+" "); 
        }  
        sc.close();
    } 
}

