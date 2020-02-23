import java.util.ArrayList;
import java.util.List;

public class ArrayHelper {
    List reverse(List beforeReverseList) {
        List result = new ArrayList();

        while(!beforeReverseList.isEmpty()) {
            result.add(0, beforeReverseList.get(0));

            beforeReverseList = beforeReverseList.subList(1, beforeReverseList.size());
        }

        return result;
    }

    int[] reverse(int[] array) {
        int middle = array.length / 2;

        for(int i = 0; i < middle; i++) {
            int tempValue = array[i];
            array[i] = array[array.length -(i+1)];
            array[array.length - (i+1)] = tempValue;
        }

        return array;
    }
}
