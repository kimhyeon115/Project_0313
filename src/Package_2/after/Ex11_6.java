package Package_2.after;
import java.util.*;

class Ex11_6 {
	public static void main(String[] args) {
		int[]	   arr   = {0,1,2,3,4};
//		int[][]	arr2D = {{11,12,13}, {21,22,23}};
		int[][] arr2D = new int[3][3];
		arr2D[0][0] = 11;
		arr2D[0][1] = 12;
		arr2D[0][2] = 13;
		arr2D[1][0] = 21;
		arr2D[1][1] = 22;
		arr2D[1][2] = 23;
		

		System.out.println("arr="+Arrays.toString(arr));
		System.out.println("arr2D="+Arrays.deepToString(arr2D));

		int[] arr2 = Arrays.copyOf(arr, arr.length);
		int[] arr3 = Arrays.copyOf(arr, 3);          
		int[] arr4 = Arrays.copyOf(arr, 7);          
		int[] arr5 = Arrays.copyOfRange(arr, 2, 4);  		//index 2번 부터 index 4번 이전 까지
		int[] arr6 = Arrays.copyOfRange(arr, 0, 7);  

		System.out.println("arr2="+Arrays.toString(arr2));
		System.out.println("arr3="+Arrays.toString(arr3));
		System.out.println("arr4="+Arrays.toString(arr4));
		System.out.println("arr5="+Arrays.toString(arr5));
		System.out.println("arr6="+Arrays.toString(arr6));
		
		int[] arr7 =  new int[5];
		Arrays.fill(arr7, 9);  // arr=[9,9,9,9,9]
		System.out.println("arr7="+Arrays.toString(arr7));

		Arrays.setAll(arr7, i -> (int)(Math.random()*6)+1);
		System.out.println("arr7="+Arrays.toString(arr7));
		
//		for(int x=0; x<arr7.length; x++) {
//			int i = arr7[x];
//		}

		for(int i : arr7) {		//향상된 for arr7에서 순서대로 꺼내서 i에 넣으면서 실행
			char[] graph = new char[i];
			Arrays.fill(graph, '*');
			System.out.println(new String(graph)+i);
			//String(문자열)을 char[](배열)로 => String -> Char[]
			//Char[](배열) => String(문자열) => String(Char[])
			//String(graph)은 graph 배열을 문자열로 바꾼것
		}

		String[][] str2D  = new String[][]{{"aaa","bbb"},{"AAA","BBB"}};
		String[][] str2D2 = new String[][]{{"aaa","bbb"},{"AAA","BBB"}};

		System.out.println(Arrays.equals(str2D, str2D2));     // false
		System.out.println(Arrays.deepEquals(str2D, str2D2)); // true

		char[] chArr = { 'A', 'D', 'C', 'B', 'E' };

		System.out.println("chArr="+Arrays.toString(chArr));
		System.out.println("index of B ="+Arrays.binarySearch(chArr, 'B'));		//정렬이 되어 있어야 함
		System.out.println("= After sorting =");
		Arrays.sort(chArr);														//정렬
		System.out.println("chArr="+Arrays.toString(chArr));
		System.out.println("index of B ="+Arrays.binarySearch(chArr, 'B'));
	}
}