package Algorithm;


 public class SortingAndSearching{

    public static <T extends Comparable<T>> void quickSort 
                                     (T[] data, int min, int max) {
       if (min >= max)
          return;
      
       int indexOfPartition = findPartition(data, min, max);
 

       quickSort(data, min, indexOfPartition - 1);
 
       quickSort(data, indexOfPartition + 1, max);
    }
 
 
    private static <T extends Comparable<T>> int findPartition
                                       (T[] data, int min, int max)  {
 
 
       T pivotElement = data[min];
 
       int first = min+1;
       int last = max;
    
       while (first <= last) {
          while (first <= last && data[first].compareTo(pivotElement) <=0 )
             first++;
 
          while (last >= first && data[last].compareTo(pivotElement) > 0)
             last--;
 
         
          if (first < last) {
             T temp = data[first];
             data[first] = data[last];
             data[last] = temp;
          }
       }
 
     
       T temp = data[min];
       data[min] = data[last];
       data[last] = temp;
          
       return last;
    }
 
 

    public static <T extends Comparable<T>> void mergeSort 
                                           (T[] data, int min, int max)  {

       if (min>=max)
          return; 
       int mid = (min + max) / 2;
       
       mergeSort(data, min, mid); 
       mergeSort(data, mid + 1, max); 
       merge(data, min, mid, max);
    }
 
    
    @SuppressWarnings("unchecked")
    public static <T extends Comparable<T>> void merge
                 (T[] data, int min, int mid, int max)  {
 
        T[] temp = (T[])(new Comparable[data.length]);
        int i1 = min;
        int i2 = mid+1;
        int current = 0;
       
        while (i1 <= mid && i2 <= max)  
            if (data[i1].compareTo(data[i2]) <= 0)
               temp[current++] = data[i1++];
            else
               temp[current++] = data[i2++];
        while (i1 <= mid)
            temp[current++] = data[i1++];
        while (i2 <= max)
            temp[current++] = data[i2++];
 
        
        for (int i = 0; i < max - min + 1; i++)
            data[min + i] = (T)temp[i];
    }
 
 
   
    public static <T extends Comparable<T>> void bubbleSort (T[] data) {
 
       for (int i = 0; i <= data.length - 1; i++) {
          for (int j = 0; j <= data.length - i - 1; j++) {
             if (data[j].compareTo(data[j+1]) > 0){
               
                T temp = data[j];
                data[j] = data[j + 1];
                data[j + 1] = temp;
             }
          }
       }
    }
 
  
     public static <T extends Comparable <T>>  boolean linearSearch 
                                (T[] data, T target) {
       int i = 0;
       while (i <= data.length) {
          if (data[i].compareTo(target) == 0) 
            return true;
          i++;
       }
       return false;
    }
 
    
    public static <T extends Comparable<T>>  boolean
                         binarySearch (T[] data, int min, int max, T target) {  
 
        if (min > max)
        return false;
 
        int midIndex = (min + max) / 2;  
  
        if (data[midIndex].compareTo(target) == 0)
       return true;
 
        if (data[midIndex].compareTo(target) > 0) {
          
           return binarySearch(data, min, midIndex - 1, target);
        }
    
         return binarySearch(data, midIndex + 1, max, target);
 
    }
    
 
     
    public static <T extends Comparable<T>> void selectionSort (T[] data)  {
       
       for (int index = 0; index < data.length-1; index++) {
       int min = index;
           for (int scan = index+1; scan < data.length; scan++)
             if (data[scan].compareTo(data[min])<0)
                 min = scan;
 
         
          T temp = data[min];
          data[min] = data[index];
          data[index] = temp;
       }
    }
 

    public static <T extends Comparable<T>> void
                                          insertionSort (T[] data)  {
       for (int i = 1; i < data.length; i++) {
          T key = data[i];
          int j = i;
        
          while (j > 0 && data[j-1].compareTo(key) > 0)  {
             data[j] = data[j-1];
             j--;
            
          }
          data[j] = key;
       }
    }
    
    
//    Giua ki
    public static <T extends Comparable<T>> int IndexMin(T []A, int i, int n) {
   	 if (i == n) 
            return i; 
        int k = IndexMin(A, i + 1, n); 
        if(A[i].compareTo(A[k]) < 0) return i;
        else return k; 
   }
   public static <T extends Comparable<T>>void SelectSort(T []a, int n, int index) {
   	if (index < n) {
           
        int k = IndexMin(a, index, n-1); 
       
        if (k != index){ 
           T temp = a[k]; 
           a[k] = a[index]; 
           a[index] = temp; 
        } 
        SelectSort(a, n, index + 1); 
   	}
   }
    
    public static <T extends Comparable<T>> int BinarySearch(T []A, int l, int r,T x) {
		int mid = l + (r - l) / 2;
		if (l <= r && l< A.length) {
			if (A[mid].compareTo(x) ==0) {
				return mid;
			}
			if (A[mid].compareTo(x)>0) {
				return BinarySearch(A, l, mid - 1, x);
			}
			return BinarySearch(A, mid+1, r,x);
		}
		return 0;
	}
    
 }
 