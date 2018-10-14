import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List someList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        ArrayHelper arrayHelper = new ArrayHelper();

        List reversedList = arrayHelper.reverse(someList);

        for (Object element: reversedList) {
            System.out.println(element);
        }
    }
}
