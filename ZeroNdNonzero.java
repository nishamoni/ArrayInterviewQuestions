import java.util.Arrays;

public class ZeroNdNonzero {

	public static void main(String[] args) {
		int a[]={5,0,1,0,0,4,3,8,2};
		int b[]=new int[10];
		int c[]=new int[10];
		Arrays.sort(a);
		for(int i=0;i<a.length;i++){
			if(a[i]!=0){
				System.out.println("Non Zero");
				System.out.println(a[i]);
				
			}else{
				System.out.println("Zero");
				System.out.println(a[i]);
			}
		}

	}
}
