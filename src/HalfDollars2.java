public class HalfDollars2 {

    public static void main(String[] args) {

        int[] denver = {1_700_000, 4_600_000, 2_100_000};
        int[] philadelphia = new int[denver.length];
        int[] total = new int[denver.length];
        int[] rok = {2012, 2013, 2014};
        int suma = 0;

        philadelphia[0] = 1_800_000;
        philadelphia[1] = 5_000_000;
        philadelphia[2] = 2_500_000;


        for (int i = 0; i < denver.length; i++) {
            total[i] = denver[i] + philadelphia[i];
            System.out.println("W roku " + rok[i] + " wartośc dolarówek z denver: " + denver[i] + " dolarówek z philly: " + philadelphia[i] + " wyniosła: " + total[i]);
        }
        for (int i = 0; i < total.length; i++) {
            suma = total[i] + suma;
        }


        System.out.println("średnia z lat wynosi " + (suma / total.length));
        System.out.format("%,d", suma/ total.length);


    }
}
