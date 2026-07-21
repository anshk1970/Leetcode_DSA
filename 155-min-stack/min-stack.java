class MinStack {   // O(1)
    Stack<Long> st;
    long min;
    public MinStack() {
        st = new Stack<>();
        min = Long.MAX_VALUE;
        
    }
    
    public void push(int val) {
        long value = (long)val;
       if(st.size()==0) min = value;

       if(value>=min) st.push(value);
       else{  //stack m fake value dalo
           st.push(value+ (value-min));
           min = value;
       }
    }
    
    public void pop() {
       if(st.peek() < min) { // min rollback kro
          min = min +(min-st.peek());
       }
       st.pop();
      
    }
    
    public int top() {
        long a = st.peek();
        if(a < min) { // min rollback kro
           return (int)min;
        }
        else return (int)a;
    }
    
    public int getMin() {
        return (int)min;
    }
}




//normal

// class MinStack {
//     Stack<Integer> st;
//     Stack<Integer> minSt;


//     public MinStack() {
//         st = new Stack<>();
//         minSt = new Stack<>();
        
//     }
    
//     public void push(int val) {
//         st.push(val);
//         if(minSt.size()==0 || val<minSt.peek()) minSt.push(val);
//         else minSt.push(minSt.peek());
//     }
    
//     public void pop() {
//         st.pop();
//         minSt.pop();
//     }
    
//     public int top() {
//         return st.peek();
//     }
    
//     public int getMin() {
//         return minSt.peek();
//     }
// }

