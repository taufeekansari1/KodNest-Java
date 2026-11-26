public class TernaryOperatorProblem8 {

    public static void main(String[] args) {
        int marks = 85;

        String grade = (marks >= 90) ? "Grade A" : (marks >= 75) ? "Grade B" : "Grade C";
        System.out.println(grade);
    }
}
