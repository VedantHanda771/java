public class que {
    private listNode front;
    private listNode rear;
    private int length;

    // constructor
    public que(){
        this.front = null;
        this.rear = null;
        this.length =  0;
    }

    private class listNode{
        private int data;
        private listNode next;

    public listNode(int data){

        this.data=data;
        this.next = next;
    }

    }

    public int length(){
        return length;
    }

    public boolean isEmpty(){
        return length ==0;
    }

    public void enque(int data){
        listNode temp = new listNode(data);
        if(isEmpty()){
            front=temp;
        } else {
            rear.next=temp;
        }
        rear=temp;
        length++;
    }

    public void print(){
        if(isEmpty()){
            return;
        }

        listNode current = front;
        while(current != null){
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] agrs){
        que que =new que();
        que.enque(10);
        que.enque(20);
        que.enque(30);

        que.print();
    }
    
}
