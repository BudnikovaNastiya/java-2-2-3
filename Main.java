public class Main {
    private static long creditAmount;
    private static long creditTerm;
    private static double rate;

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        long oneYear = (long) service.calculate(creditAmount = 1000000, creditTerm = 1, rate = 9.99);
        System.out.println(oneYear);

        long twoYear = (long) service.calculate(creditAmount = 1000000, creditTerm = 2, rate = 9.99);
        System.out.println(twoYear);

        long threeYear = (long) service.calculate(creditAmount = 1000000, creditTerm = 3, rate = 9.99);
        System.out.println(threeYear);
    }

}
