import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List someList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int[] array = {1,2,3,4,5,6,7,8,9,10};

        ArrayHelper arrayHelper = new ArrayHelper();

        List reversedList = arrayHelper.reverse(someList);
        int[] reversedArray = arrayHelper.reverse(array);

        for (Object element: reversedList) {
            System.out.println(element);
        }

        for(int element: reversedArray) {
            System.out.println(element);
        }
    }
}
