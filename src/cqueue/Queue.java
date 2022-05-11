package cqueue;
public class Queue {
    int cq[];
    int r,f;
    int c=0;
    int size;
    Queue(int size){
        this.size=size;
        r=-1;
        f=0;
        cq=new int[size];
    }
    void insert(int value){
        if(c==size){
            System.out.println("full");
        }
        else{
            r=(r+1)%size;
            cq[r]=value;
            c++;
        }
    }
    void delete(){
        if(c==0){
            System.out.println("empty");
        }
        else{
            f=(f+1)%size;
            c--;
        }
    }
    void display(){
        if(c==0){
            System.out.println("empty");
        }
        else{
            for(int i=f;i!=r;i=(i+1)%size){
                System.out.print(cq[i]+"->");
            }
            System.out.print(cq[r]);
            System.out.println();
        }
    }
}
