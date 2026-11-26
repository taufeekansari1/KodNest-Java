public class SwitchStatement1 {
    public static void main(String[] args) {
        int marks = 1;
        if (marks >= 91 && marks <= 100) {
            System.out.println("Grade A");
        } else if (marks >= 81 && marks <= 90) {
            System.out.println("Grade B");
        } else if (marks >= 61 && marks <= 800) {
            System.out.println("Grade C");
        } else if (marks >= 35 && marks <= 60) {
            System.out.println("Grade D");
        } else {
            System.out.println("You are Great ...... leave India");
        }
    }

}
