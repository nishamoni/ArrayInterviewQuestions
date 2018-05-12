import java.lang.reflect.Array;
import java.util.Arrays;

public class RepEle {

	public static void main(String[] args) {
		int a[]={0,1,1,3,4,6,8,4,3};
		Arrays.sort(a);
		for(int i=1;i<a.length;i++){
			if(a[i]==a[i+1]){
				System.out.println(a[i]);
			}
		}

	}

}
