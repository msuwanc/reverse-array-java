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
}
