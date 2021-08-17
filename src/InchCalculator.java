public class InchCalculator {

    public double[] calculate(int min, int max) {
        double[] centiArr = new double[max + 1];
        double ONE_INCH = 2.54;
        for (int i = min; i < centiArr.length; i++) {
            centiArr[i] = ONE_INCH * i;
        }
        return centiArr;
    }
}
