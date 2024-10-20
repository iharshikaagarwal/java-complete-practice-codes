

public class stackWithLinkedlist {
    static class Node{
        int data;
        Node next ;
        public Node(int data){
            this.data=data;
            this.next= null;
        }
    }
    static class stack{
        public Node head = null;
        public  Boolean isEmpty(){
            return head==null;
        }
        public void push(int data){
            Node newnode = new Node(data);
            if (isEmpty()){
                head=newnode;
            }else {newnode.next=head;
            head=newnode;}
        }
        public int pop (){
            if (isEmpty()){
                return -1;
            }
            int top = head.data;
            head=head.next;
            return top;

        }
        public int peek (){
            if (isEmpty()){
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[]args){
        stack s = new stack();
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }


    }
}
