package Com.Lambda_Sorting;
import java.util.Arrays;
import java.util.List;
public class Sorting_in_descending {
	public static void main(String[] args) {
        List<String> stringList = Arrays.asList("kumar", "PLV", "gsai", "dilip", "sri");

        stringList.sort((s1, s2) -> s2.compareTo(s1));

        System.out.println("Sorted List (Descending Order): " + stringList);
    }
}
