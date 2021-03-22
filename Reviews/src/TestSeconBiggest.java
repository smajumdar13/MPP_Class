import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TestSeconBiggest {

    public static void main(String[] args) {
    	
    	
        System.out.println("Hello SecondBiggestFinderApp");
        // Tests
    	Integer[] a1 = null,
				a2 = {},
				a3 = {14},
				a4 = {1,2,3,4,5},
				a5 = {19,9,11,0,12},
				a6 = {19,9,11,0,9};
        
		List<Integer[]> arrs = Arrays.asList(a1,a2,a3,a4,a5,a6);


		arrs.forEach((a)->findSecondBiggest(a).ifPresentOrElse(
				 (r)->System.out.println("Second biggest of array, "+Arrays.toString(a)+" is: "+r)
				,()->System.out.println("Second biggest of array, "+Arrays.toString(a)+" is: "+"Not Available") ) );			
	}

    

    private static Optional<Integer> findSecondBiggest(Integer[] a) {
        if(a == null || a.length < 2)
            //throw new IllegalArgumentException("Invalid input: " + a);
            return Optional.empty();
        int biggest = a[0] > a[1] ? a[0] : a[1];
        int secondBiggest = biggest == a[0] ? a[1] : a[0];
        for(int i=2; i < a.length; i++) {
            if(a[i] > biggest) {
                // new biggest
                secondBiggest = biggest;
                biggest = a[i]; 
            } else if (a[i] > secondBiggest) {
                // new secondBiggest
                secondBiggest = a[i];
            }
        }
        return Optional.of(secondBiggest);
    }

}