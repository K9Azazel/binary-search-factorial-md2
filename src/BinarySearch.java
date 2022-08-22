
import java.util.ArrayList;
import java.util.Collections;


public class BinarySearch{
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(3);
        arr.add(7);
        arr.add(5);
        arr.add(13);
        arr.add(2);
        Collections.sort(arr);
        System.out.println(a(arr, 5));
    }
    public static int binarySearch2(ArrayList<Integer> array, int left, int right ,int value){
        if (left <= right) {
            int mid = left + (right - 1) / 2;
            if (array.get(mid) == value) {
                return value;
            }
            if (array.get(mid) < value) {
                return binarySearch2(array, mid + 1, right, value);
            } else {
                return binarySearch2(array, left, mid - 1, value);
            }
        }
        return -1;
    }
    public static boolean a(ArrayList<Integer> array,int value){
        int left = 0;
        int right = array.size()-1;
        return binarySearch2(array, left, right, value) != -1;
    }
}
