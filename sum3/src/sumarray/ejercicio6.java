package sumarray;

public class ejercicio6 {
    int size; 
    int top1, top2; 
    int arr[];
    
    public ejercicio6(int n) {
    	arr = new int[n];
        size = n; 
        top1 = -1; 
        top2 = size; 
    }
    
    public void push1(int x) 
    { 
        if (top1 < top2 - 1) { 
            top1++; 
            arr[top1] = x; 
        } 
        else { 
            System.out.println("Stack Overflow"); 
            System.exit(1); 
        } 
    } 
    void push2(int x) 
    { 
        // There is at least one empty space for 
        // new element 
        if (top1 < top2 - 1) { 
            top2--; 
            arr[top2] = x; 
        } 
        else { 
            System.out.println("Stack Overflow"); 
            System.exit(1); 
        } 
    }
    
    int pop1() 
    { 
        if (top1 >= 0) { 
            int x = arr[top1]; 
            top1--; 
            return x; 
        } 
        else { 
            System.out.println("Stack Underflow"); 
            System.exit(1); 
        } 
        return 0; 
    } 
    int pop2() 
    { 
        if (top2 < size) { 
            int x = arr[top2]; 
            top2++; 
            return x; 
        } 
        else { 
            System.out.println("Stack Underflow"); 
            System.exit(1); 
        } 
        return 0; 
    } 
  
	public static void main(String[] args) {
		ejercicio6 ts = new ejercicio6(5); 
        ts.push1(3); 
        ts.push2(10); 
        ts.push2(17); 
        ts.push1(11); 
        ts.push2(7); 
        System.out.println("Popped element from"
                           + " stack1 is " + ts.pop1()); 
        ts.push2(60); 
        System.out.println("Popped element from"
                           + " stack2 is " + ts.pop2()); 
	}

}
