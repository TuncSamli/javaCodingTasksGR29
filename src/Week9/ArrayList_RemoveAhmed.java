package Week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayList_RemoveAhmed {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList(
                "Ahmed", "ahmed", "aHmEd", "John", "Ercon", "Daniel", "Mustafa", "Mohammed", "Ahmed", "ahmed", "Yuliia", "Chris"
        ));
        System.out.println(removeAhmed(names));
    }

    public static List<String> removeAhmed(List<String> names) {

        Iterator<String> it = names.iterator();

        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase("ahmed")) {
                it.remove();
            }
        }
        return names;
    }


}
