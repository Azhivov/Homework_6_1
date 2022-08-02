public class Main {

    public static void main(String[] args) {

        int[] myArray = generateRandomArray();


        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }
        System.out.printf("—умма трат за мес€ц %s рублей", sum);
    }

        public static int[] generateRandomArray() {
            java.util.Random random = new java.util.Random();
            int[] arr = new int[30];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(100_000) + 100_000;
            }
            return arr;
         }
}
