package pl.imiajd.grzes;

public class ArrayUtil {
    public static <T extends Comparable<? super T>> boolean isSorted(T[] array){
        T previous = array[0];
        int n = array.length;
        for(int i=1;i<n;i++){
            T current = array[i];
            if(previous.compareTo(current) > 0) return false;
            previous = current;
        }
        return true;
    }

    public static<T extends Comparable<? super T>> int binSearch(T[] array, T x){
        for(int i=0;i<array.length;i++){
            if(array[i] == x) return i;
        }
        return -1;
    }

    public static<T extends Comparable<? super T>> void selectionSort(T[] array){
        for(int i=0;i<array.length-1;i++){
            int min = i;
            for(int j=i+1;j<array.length;j++){
                if(array[min].compareTo(array[j]) > 0) min = j;
            }
            T temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
    }

    public static<T extends Comparable<? super T>> void mergeSort(T[] array){
        if(array.length<2) return;
        

    }
}
