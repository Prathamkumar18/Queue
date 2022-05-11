public class Queue {
    int q[];
    int size;
    int top;
    Queue(int size){
        this.size=size;
        top=-1;
        q=new int[size];
    }
    
    void push(int value){
        if(top==size-1){
            System.out.println("queue is full");
        }
        else{
            q[++top]=value;
        }
    }
    
    void display(){
       if(top==-1){
            System.out.println("Queue is empty");
        }
        else{
            for(int i=0;i<=top;i++){
                System.out.print(q[i]+"->");
            }
            System.out.println();
        }
    }
    
    void pop(){
        if(top==-1){
            System.out.println("empty");
        }
        else{
            //for removing the elem shift the array towards left by 1 posn, and dec. top
            //but it will take o(N) time complexity. therefore we will use circular queue.
        for(int i=1;i<=top;i++){
            q[i-1]=q[i];
        }
        top--;
        }
    }
    
}
