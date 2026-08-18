class MinStack {
    private int data[];
    private int min[];
    private int top;
    private static final int DEFAULT_CAPACITY = 10000;

    public MinStack() {
        data = new int[DEFAULT_CAPACITY];
        min = new int[DEFAULT_CAPACITY];
        top = 0;
    }
    
    public void push(int value) {
        if(top == data.length){
            resize();
        }
        data[top] = value;
        if(top == 0){
            min[top] = value;
        }else{
            min[top] = Math.min(value,min[top-1]);
        }
        top++;
    }
    
    public void pop() {
        if(top>0){
        top--;
        }
    }
    
    public int top() {
        return data[top-1];
    }
    
    public int getMin() {
        return min[top-1];
    }
    private void resize(){
        int newLength = data.length*2;
        data = Arrays.copyOf(data, newLength);
        min = Arrays.copyOf(min, newLength);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */