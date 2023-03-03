package JavaRevision;

public class AverageOfArray {
    public static void main(String[] args) {
        double salary[] = {23500.0, 25080.0, 28760.0, 22340.0, 19890.0};
        double sum = 0;
        for (int i =0; i < salary.length; i++){
            sum += salary[i];

        }
        double average =  sum / salary.length;
        System.out.println("The Average Salary of the Employee is :"+average);

    }
}
