public interface DoubleLinkedListInterface<T> {
	/* Function to check if list is empty */
    public boolean isEmpty();

    /* Function to get size of list */
    public int getSize();

		/* Function to insert element before head */
		public void insertFront(T item);
					
    /* Function to insert element at next node that is null */
    public void insertAtNext(T item);

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