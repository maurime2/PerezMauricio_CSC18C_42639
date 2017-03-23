public final class Bag<T> implements BagInterface<T> {
    private T[] bag_items;
    private int num_items;
    
    public Bag() {
        bag_items = (T[])new Object[10]; // default 10 item bag
        this.num_items=0;
    }
    
    public Bag(int startSize)
    {
        bag_items = (T[])new Object[startSize];
        this.num_items=0;
    }
    
    // return the current size of the bag, or the number of elements in the bag
    public int getSize(){
        return this.num_items;
    }
    
    // returns true if bag is empty or false if bag is not empty
    public boolean isEmpty() {
        return this.num_items == 0;
    }
    
    // returns true if bag is empty or false if bag is not empty
    public boolean isFull() {
        return this.num_items == this.bag_items.length;
    }
    
    // add item to bag, returns true if successful, false if not
    public boolean add(T item) {
        if ( this.isFull() ) return false; // cannot add more items
        bag_items[num_items++] = item;
        return true;
    }
    
    // returns true if item is removed from bag
    public boolean remove(T item) {
        if ( this.isEmpty() ) return false;         //o(1)
        for(int i=0;i<this.num_items;i++)           //o(n)
        {
            if ( this.bag_items[i]==item )          //o(n)
            {
                for(int j=i+1;j<this.num_items;j++)     //o(n)
                    this.bag_items[j-1]=this.bag_items[j];  //o(n)
                this.num_items--;
                return true;                    //n(1)
            }
        }
        return false;                       //o(1)
    }
    
    // clear the bag of all items
    public void clear()
    {
        this.num_items=0; // just reset numberOfEntries to zero and overwrite old data when we add new data
    }
    
    // returns true if item found in bag
    public boolean contains(T item) {
        for(int i=0;i<this.num_items;i++) if ( bag_items[i]==item ) return true;
        return false;
    }
    
    public T[] toArray() {
        T[] arr = (T[])new Object[this.num_items];
        for(int i=0;i<this.num_items;i++) arr[i]=this.bag_items[i];
        return arr;
    }            
}
