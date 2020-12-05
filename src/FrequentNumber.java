public class FrequentNumber {

    public static void main(String[] args) {

        int[] arr = {4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3,5,6,5,5,5,5,5,5,5,5,5,5,5,5,11,12,12,12,12,12,12,12,12};
        int[] counters = new int[99999999]; // 10, bo tyle mamy cyfr

        //  0 0 0 0 0 0 0 0 0 0
        //  0 3 2 2 4 0 0 0 0 1  - ilość elementów
        //  0 1 2 3 4 5 6 7 8 9

        for (int i = 0; i < arr.length; i++) {
            counters [arr [i]] ++;

        }
        /*for (int n: counters) {
            System.out.print( n + " ");*/
        int mostFrequent = 0;
        for (int i = 0; i < counters.length ; i++) {
            if (counters[i] > counters[mostFrequent]) {
                mostFrequent = i;
            }
        }

        System.out.println("Najczęsciej występujacą w tablicy jest:" + mostFrequent);
        System.out.println("wystąpiła :" + counters[mostFrequent]);



    }
}
