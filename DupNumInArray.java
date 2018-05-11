import java.util.Arrays;

public class DupNumInArray {

	public static void main(String[] args) {
	
		int[] arr={1,2,3,1,1,3,5,5,6,2,8};
		//Arrays.sort(arr);
		for(int i=1;i<arr.length;i++)
		{
		if(arr[i]==arr[i-1])
		{
		System.out.println("Duplicate = " + arr[i]);
		}
		}

		}

	}


