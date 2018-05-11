

public class PairsOfArray {

	public static void  main(String[] args) {
		 int array[]= {2,3,4,6,7,8,9,10};
		 int sum=7;
		for (int i = 0; i < array.length; i++) {
            int first= array[i];
            for (int j = i + 1; j < array.length; j++) {
                int second= array[j];

                if ((first + second) == sum) {
                    System.out.println( first +" , "+second);
                   // System.out.println(second);
            
                }	
}

}
	}}