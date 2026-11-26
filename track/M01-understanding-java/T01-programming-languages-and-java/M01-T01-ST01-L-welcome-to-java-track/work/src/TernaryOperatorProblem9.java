public class TernaryOperatorProblem9 {
    public static void main(String[] args) {

        double price = 2500.0;

        double finalPrice = (price >= 2000) ? price - (price / 100 * 10) : price;

        System.out.println(finalPrice);

    }

}
