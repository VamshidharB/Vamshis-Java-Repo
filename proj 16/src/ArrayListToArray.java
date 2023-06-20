import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArray {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("!");

        // Convert ArrayList to Array
        String[] stringArray = stringList.toArray(new String[0]);

        // Print the converted array
        System.out.println("Array elements:");
        System.out.println(Arrays.toString(stringArray));
    }
}
