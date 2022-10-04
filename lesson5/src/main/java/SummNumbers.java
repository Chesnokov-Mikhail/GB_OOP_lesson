public class SummNumbers {

    private int num1;
    private int num2;

    public SummNumbers(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public String toString() {
        return "summ number (" +
                "num1 + " +
                "num2) = " + Integer.toString(this.num1 + this.num2);
    }

    public static void main(String[] args) {
        SummNumbers sum = new SummNumbers(23, 45);
        System.out.println(sum);
    }
}
