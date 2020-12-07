public class FrequentNumberVer2 {

    public static void main(String[] args) {

        int[] array = {4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3};

        int counterOne = 0;
        int counterTwo = 0;
        int counterThree = 0;
        int counterFour = 0;
        int counterFive = 0;
        int counterSix = 0;
        int counterSeven = 0;
        int counterEight = 0;
        int counterNine = 0;
        int counterZero = 0;


        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                counterOne = counterOne + 1;
            } else if (array[i] == 2) {
                counterTwo = counterTwo + 1;
            } else if (array[i] == 3) {
                counterThree = counterThree + 1;
            } else if (array[i] == 4) {
                counterFour = counterFour + 1;
            } else if (array[i] == 5) {
                counterFive = counterFive + 1;
            } else if (array[i] == 6) {
                counterSix = counterSix + 1;
            } else if (array[i] == 7) {
                counterSeven = counterSeven + 1;
            } else if (array[i] == 8) {
                counterEight = counterEight + 1;
            } else if (array[i] == 9) {
                counterNine = counterNine + 1;
            } else if (array[i] == 0) {
                counterZero = counterZero + 1;
            }
        }
        int[] counters = {counterOne, counterTwo, counterThree, counterFour, counterFive, counterSix, counterSeven, counterEight, counterNine, counterZero};
        int mostFrequent = 0;

        for (int j = 0; j < counters.length; j++) {
            if (counters[j] > counters[mostFrequent]) {
                mostFrequent = j;
            }
        }
        System.out.print("Podane cyfry: ");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%3s",array[i]);

        }
        System.out.println(" ");

        System.out.println("Tablica występowania cyfr: 1  2  3  4  5  6  7  8  9  0");
        System.out.print(" -----------------------: ");
        for (int i = 0; i < counters.length; i++) {

            System.out.printf("%3s", counters [i]+ " ");
        }

        System.out.println("\n najczęściej występuje : " + (mostFrequent + 1) );


    }
}
