import java.util.Arrays;

public class ArrayPractise {

	public static void main(String[] args) {
		int Arr[][] = {{ 10, 30, 35, 52, 75 }};
		int Arr1[][] = {{10,20,3,4,5,6}};
		int ele = 30;
		int ele1 = 10;
		// Converting elements into list
		//System.out.println(Arrays.sort(Arr));
		//System.out.println(Arrays.binarySearch(Arr,1,3, ele));
		//System.out.println("The Integer Array as a List = "+ Arrays.asList(Arr));
		//System.out.println(Integer.compare(ele, ele1));
		
		//System.out.println(Arrays.toString(Arrays.copyOf(Arr, 6)));
		System.out.println(Arrays.deepEquals(Arr, Arr1));
		}
		}
	


