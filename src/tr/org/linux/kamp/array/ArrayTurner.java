package tr.org.linux.kamp.array;

import java.util.Arrays;

public class ArrayTurner {
	static int[] integerArray = { 4, 12, 8, 12, 5, 3, 1 };
	
	public static void main(String[] args) {
		
		

		System.out.println(Arrays.toString(integerArray));
		sortArray();
		System.out.println(Arrays.toString(integerArray));

		
	}
	public static void sortArray() {
		

	for(int i = 0 ; i < integerArray.length/2 ; i++) {/*uzunluğu ikiye bölmemizin nedeni
	arrayi tam olarak tersten yazdırabilmesi için uzunluğu ikiye bölüp ilkyarıyla ikinci
	yarının yerlerini temp aracılığıyla değiştiriyoruz eğer ki ikiye bölmeseydik tüm
	elemanlar için yer değiştircekti ki bu da tekrar aynı arrayi basmaya sebep olurdu*/
				int temp = integerArray[i];
				integerArray[i] = integerArray[integerArray.length-i-1];
				integerArray[integerArray.length-i-1] = temp; 
				
			}
		}
	}
/*public class ReverseArray {

	public static void main(String[] args) {
		int[] intArray = {28,05,2013,1917,2014,2017,1923};
		
		System.out.println("Array: " + Arrays.toString(intArray));
		
		for(int i = 0; i < intArray.length / 2; i ++) {
			int x = intArray[i];
			intArray[i] = intArray[intArray.length -i -1];
			intArray[intArray.length -i -1] = x;
		}
		
		System.out.println("Ters array: " + Arrays.toString(intArray));
	}

}*/