
public class MissingElement {
	//this program for find missing value in array
	
	public static void main(String []args){
	int[] a={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,20};
	int i,missingval;
	for(i=1;i<a.length;i++){

	if((a[i]-a[i-1])!=1){//finding different between current element and previous element.
	missingval=a[i-1];
	System.out.println(" Missing element is : "+missingval);

	}
}}
}