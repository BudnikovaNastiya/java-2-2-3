public class CreditPaymentService {
    public double calculate (long creditAmount, long creditTerm, double rate) {
        double months = creditTerm * 12;
        double interestRate = rate / months / 100;
        double power = Math.pow((1 + interestRate),months);
        double мonthlyРayment1 = creditAmount * (interestRate + (interestRate / (power - 1)));
        return мonthlyРayment1;
    }
}