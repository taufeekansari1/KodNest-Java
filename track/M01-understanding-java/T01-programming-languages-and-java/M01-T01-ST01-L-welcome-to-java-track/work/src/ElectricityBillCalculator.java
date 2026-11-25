public class ElectricityBillCalculator {
    public static void main(String[] args) {

        String customerName = "Rahul";
        int unitsConsumed = 350;

        double electricityBill = 0;
        double surcharge = 0;
        double totalBill = 0;

        if (unitsConsumed <= 0) {
            System.out.println("Invalid Units");
        } else if (unitsConsumed <= 100) {
            electricityBill = unitsConsumed * 2;
        } else if (unitsConsumed <= 200) {
            electricityBill = unitsConsumed * 3;
        } else if (unitsConsumed <= 300) {
            electricityBill = unitsConsumed * 5;
        } else {
            electricityBill = unitsConsumed * 7;
        }

        if (unitsConsumed > 0) {
            if (electricityBill > 1000) {
                surcharge = electricityBill * 0.05;
            } else {
                surcharge = 0;
            }

            totalBill = electricityBill + surcharge;

            System.out.println("Customer Name: " + customerName);
            System.out.println("Units Consumed: " + unitsConsumed);
            System.out.println("Electricity Bill: " + electricityBill);
            System.out.println("Surcharge: " + surcharge);
            System.out.println("Total Bill: " + totalBill);
        }
    }
}