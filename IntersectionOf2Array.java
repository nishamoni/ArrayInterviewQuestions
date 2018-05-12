import java.util.Arrays;

public class IntersectionOf2Array {

	public static void main(String[] args) {
	int a[]={2,3,4,1,5,8};
	Arrays.sort(a);
	int b[]={2,4,1,3,5,7};
	Arrays.sort(b);
	for(int i=0;i<a.length;i++){
		for(int j=0;j<b.length;j++){
			if(a[i]==b[j]){
				System.out.println(a[i]);
				
			}
		}
	}

	}

}
