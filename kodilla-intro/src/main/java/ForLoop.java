public class ForLoop {
    public static void main(String[] args) {

        int[] numbers = {2, 3, 1};

        int suma = 0;

        for (int i = 0; i < numbers.length ; i++) {
            suma = suma + numbers[i];
        }

        System.out.println(suma);
    }
}
