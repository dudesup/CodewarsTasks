// Luhn Algorithm is used to help validate credit card numbers

import java.util.Arrays;

public class LuhnAlgorithm {
    public static void main(String[] args) {
        System.out.println(validate("4000003182343265"));

    }

    public static boolean validate(String n) {
        final boolean[] booleans = {(n.length() & 1) == 1};
        return Arrays.stream(
                n.split(""))
                .mapToInt(Integer::parseInt)
                .map(intVal -> ((booleans[0] ^= true) ? (intVal * 2 - 1) % 9 + 1 : intVal))
                .sum() % 10 == 0;
    }
}
