import java.util.*;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();

        String[] names = new String[n];
        int[] marks = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            names[i] = scanner.next();
            System.out.print("Enter marks for " + names[i] + ": ");
            marks[i] = scanner.nextInt();
        }

        int total = 0, max = marks[0], min = marks[0];
        for (int mark : marks) {
            total += mark;
            if (mark > max) max = mark;
            if (mark < min) min = mark;
        }

        double average = (double) total / n;

        System.out.println("\n--- Results ---");
        System.out.println("Average marks: " + average);
        System.out.println("Highest marks: " + max);
        System.out.println("Lowest marks: " + min);
    }
}
