public class Main {
    public static void main(String[] args) {
        InchCalculator inchCalculator = new InchCalculator();
        TablePrinter printer = new TablePrinter();
        printer.printTable(inchCalculator.calculate(1, 20));
    }
}
