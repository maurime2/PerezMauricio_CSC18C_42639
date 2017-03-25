public class BagDemo {

    public static void main(String[] args) {
        Bag<String> bag_of_strings = new Bag(5);
        
        bag_of_strings.add("Hello");
        bag_of_strings.add("World!");
        bag_of_strings.add("Structures1");
        bag_of_strings.add("Data");
        bag_of_strings.add("Structures2");
        bag_of_strings.remove("Structures1");
        
		bag_of_strings.sort();
		
        System.out.println("Size of bag_of_strings=" + bag_of_strings.getSize() );
        System.out.println("Contents of bag_of_strings:");
        Object[] a = bag_of_strings.toArray();
        for(int i=0;i<a.length;i++) {
            System.out.printf("a[%d]=%s\n",i,a[i]);
        }

		Bag<float> bag_of_floats = new Bag(500);
        
		// fill the bag of floats with some floating point values
        for(int i=0;i<500;i++)
		{
			if ( i%3 == 0 ) bag_of_floats.add( i*2.375 );
			else if ( i%3 == 1 ) bag_of_floats.add ( -i*1.875 );
			else blag_of_floats.add( (i%500) / 1.4142 ); 
		}
        
		bag_of_floats.sort();
		
        System.out.println("Size of bag_of_floats=" + bag_of_floats.getSize() );
        System.out.println("Contents of bag_of_floats:");
        Object[] a = bag_of_floats.toArray();
        for(int i=0;i<a.length;i++) {
            System.out.printf("a[%d]=%s\n",i,a[i]);
        }
    }
    
}
