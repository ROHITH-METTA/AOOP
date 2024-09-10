package Com.filterintegers;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Filterint {
	public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(900, 122, 294, 402, 287, 139);

        List<Integer> result = integerList.stream()
                .filter(n -> n % 2 == 0) 
                .map(n -> n * 2)  
                .collect(Collectors.toList()); 

        System.out.println("Doubled even numbers: " + result);
    }
}
