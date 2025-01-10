import java.util.Arrays;

public class LongToOrderArray {

    public static long[] splitOrdering(long input) {
        String strInput = Long.toString(input);

        return Arrays
                .stream(strInput.split(""))
                .mapToLong(Long::parseLong)
                .sorted()
                .toArray();
    }

    public static void main(String[] args) {
        // Exercício 1
        // Entrada: Um número long
        // Saída: Array ordenado dos números

        long input = 9501919519468L;

        String output = Arrays.toString(splitOrdering(input));

        System.out.println(output);
    }
}