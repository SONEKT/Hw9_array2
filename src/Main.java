public class Main {
    public static void main(String[] args) {

        task1();

        task2();

        task3();

        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача1");

        int[] arr = generateRandomArray();

        var sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task2() {
        System.out.println("Задача2");

        int[] arr = generateRandomArray();

        var max = Integer.MIN_VALUE;
        var min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
            if (min > arr[i])
                min = arr[i];
        }

        System.out.println("Минимальная сумма трат за день составила " + min + "  рублей. Максимальная сумма трат за день составила " + max + "рублей");
    }

    public static void task3() {
        System.out.println("Задача3");

        int[] arr = generateRandomArray();

        var sum = 0.;
        var days = 0.;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            days++;
        }

        var average = sum / days;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");
    }

    public static void task4() {
        System.out.println("Задача4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length-1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}


