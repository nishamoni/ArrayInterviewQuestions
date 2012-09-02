public class Factorial {
    
    public static int factorial(int num) {
        if(num <= 1) {
            return 1;
        }
        
        return num * factorial(num-1);
        
        /*
        // Comment out above then uncomment this for non-recursive style 
        for( int i = num ; i > 1 ; i-- ) {
            
            num *= i-1;        
            
        }

        return num;
        */
    
    }

    public static void main(String[] args) {

        System.out.println(factorial(5)); //120

    }
}