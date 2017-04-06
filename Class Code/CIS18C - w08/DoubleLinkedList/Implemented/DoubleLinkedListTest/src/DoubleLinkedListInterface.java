public interface DoubleLinkedListInterface<T> {
	/* Function to check if list is empty */
    public boolean isEmpty();

    /* Function to get size of list */
    public int getSize();
    
    /*Function to get node at specifide index*/
    public Node <T> getNodeAt(int indexPosition);
    
    /*Function to get data at Index Position*/
    public T getDataAt(int indexPosition);
    
    /*Function to set at data Index Position*/
    public void setDataAt(T newItem, int indexPosition);
    

    /* Function to insert element before head */
    public void insertFront(T item);
					
    /* Function to insert element at next node that is null */
    public void insertBack(T item);

    /* Function to insert element at index position */
    public void insertAtPos(T item , int indexPosition);

    /* Function to delete element before head */
    public void deleteFront();
	
    /* Function to delete node at position */
    public void deleteAtPos(int indexPosition);    

    /* Function to delete element at tail */
    public void deleteBack();
	
    /* Function to display status of list */
    public void display();
}