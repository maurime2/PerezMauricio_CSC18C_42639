public class BagDemo {

    public static void main(String[] args) {
        Bag<String> bag_of_strings = new Bag(5);
        
        bag_of_strings.add("Hello");
        bag_of_strings.add("World!");
        bag_of_strings.add("Structures1");
        bag_of_strings.add("Data");
        bag_of_strings.add("Structures2");
        bag_of_strings.remove("Structures1");
        
        System.out.println("Size of bag_of_strings=" + bag_of_strings.getSize() );
        System.out.println("Contents of bag_of_strings:");
        Object[] a = bag_of_strings.toArray();
        for(int i=0;i<a.length;i++) {
            System.out.printf("a[%d]=%s\n",i,a[i]);
        }        
    }
    
}
