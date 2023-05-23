package utils;

import java.util.Random;

public class GeneratorRandom {

    public Integer[] generateRandomIntArray(Random r, int size) {
        return r.ints(size).boxed().toArray(Integer[]::new);
    }

    public  String[] generateRandomStringArray(Random r, int size) {
        String[] array = new String[size];
        for (int i = 0; i < size; i++) {
            array[i] = generateRandomString(r, 10);
        }
        return array;
    }

    private String generateRandomString(Random random, int length) {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            char randomChar = (char) (random.nextInt(26) + 'a');
            sb.append(randomChar);
        }
        return sb.toString();
    }
}
