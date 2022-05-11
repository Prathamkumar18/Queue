
public class main {
    public static void main(String args[]){
        Queue q=new Queue(5);
        
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.display();
        q.pop();
        q.display();
        q.push(5);
        q.display();
        
    }
}
