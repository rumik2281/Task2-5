public class TablePrinter {
    public void printTable(double[] arr) {
        double j = 1;
        System.out.print("______________________\n");
        System.out.print("| дюймы | сантиметры |\n");
        for (int i = 1; i < arr.length; i++) {
            if (j < 4) {
                System.out.printf("| %.3f |   %.3f    |\n", j, arr[i]);
                j++;
            } else if (j > 3 && j < 10) {
                System.out.printf("| %.3f |   %.2f    |\n", j, arr[i]);
                j++;
            } else {
                System.out.printf("| %.2f |   %.2f    |\n", j, arr[i]);
                j++;
            }
        }
        System.out.print("______________________\n");
    }
}
