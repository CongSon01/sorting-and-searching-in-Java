package Algorithm;

/**
 * @author HP
 *
 */
public class SortList {
	public static void main(String[] args) {
		Student[] c = new Student[4];
		c[0] = new Student("1", "A", "A");
		c[1] = new Student("2", "B", "B");
		c[2] = new Student("4", "D", "D");
		c[3] = new Student("3", "C", "C");

		Student tager = new Student("4", "D", "D");
		SortingAndSearching.SelectSort(c, c.length, 0);
		for (Comparable player : c)
			System.out.println(player);   
		System.out.println(SortingAndSearching.BinarySearch(c, 0, c.length, tager));
//		System.out.println("insertion Sort");

//
//		System.out.println("Bubble Sort");
//		Sort.insertionSort(c);
//		for (Comparable player : c) {
//			System.out.println(player);
//		}
//
//		System.out.println("Quick Sort");
//		Sort.quickSort(c, 0, 3);
//		for (Comparable player : c) {
//			System.out.println(player);
//		}
//
//		System.out.println("Merger Sort");
//		Sort.mergeSort(c, 0, 3);
//		for (Comparable player : c) {
//			System.out.println(player);
//		}
	}
}
