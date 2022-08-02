public class Main {

    public static void main(String[] args) {

        int[] myArray = generateRandomArray();


        int sum = 0;
        for (int spendingDay : myArray) {
            sum += spendingDay;
        }
        System.out.printf("Сумма трат за месяц %s рублей", sum);
        System.out.println();

        int min = myArray[0];
        int max = myArray[0];
        for (int i = 1; i < myArray.length; i++) {
            if (min < myArray[i]) {
                min = myArray[i];
            } else if (max < myArray[i]) ;
            max = myArray[i];
        }
        System.out.printf("Минимальная сумма за день составила %s рубдей. " +
                "Ммаксимальная сумма за день составила %s рубдей. ", min, max);
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
