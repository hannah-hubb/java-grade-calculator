import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        
        System.out.println("Enter student name:");
        String name = input.nextLine();

        
        System.out.println("Enter marks for subject 1:");
        double sub1 = input.nextDouble();

        System.out.println("Enter marks for subject 2:");
        double sub2 = input.nextDouble();

        System.out.println("Enter marks for subject 3:");
        double sub3 = input.nextDouble();

        
        double avg = (sub1 + sub2 + sub3) / 3;

        char grade;

        // grading system
        if (avg >= 90) {
            grade = 'A';
        } 
        else if (avg >= 75) {
            grade = 'B';
        } 
        else if (avg >= 60) {
            grade = 'C';
        } 
        else if (avg >= 50) {
            grade = 'D';
        } 
        else {
            grade = 'F';
        }

     
        System.out.println("----- Result -----");
        System.out.println("Name: " + name);
        System.out.println("Average: " + avg);
        System.out.println("Grade: " + grade);

        input.close();
    }
}
