package stack;


public class Stack <T extends Object>{

    private Node<T> top;
    public Stack()
    {

        top = null;
    }

    private class Node<T>{
    
        //Next nod in the linked list if null, then end of list
        Node next;
        //data element of the node
        T data;
        
        public void push(T newItem){
            Node<T> new_node = new Node(newItem, top);
            top = new_node;
        }
        
        public T peek()
        {
            if (isEmpty()){
                return null;
            }
            return top.getData();
        }
        
        public T pop()
        {
            T value = peek();
        }
        
        //Constructor for id we want to specify a particular node for
        //the node to point to
        public Node(T dataValue, Node nextNode){
            next = nextNode;
            data = dataValue;
        }
        
        //retuen the data in the node
        public T getData(){
            return data;
        }
        
        //returns the next node, if any
        public Node getNext(){
            return next;
        }
        
        
    }//End of Node Class
    
    public static void main(String[] args) {

    }//End Main
    
}//End Class Stack
