public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.8, weight = 90.4;
        double bmi = service.calculate(height, weight);

        System.out.println(bmi);


    }
}