import java.util.Scanner;

class calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Marks in English out of 100:");
        double e = sc.nextDouble();
        System.out.print("Marks in Physics out of 100:");
        double p = sc.nextDouble();
        System.out.print("Marks in Chemistry out of 100:");
        double c = sc.nextDouble();
        System.out.print("Marks in Mathematics out of 100:");
        double m = sc.nextDouble();
        System.out.print("Marks in Java out of 100:");
        double j = sc.nextDouble();
        
        double total_marks = (e + p + c + m + j);
        double avg = (e + p + c + m + j) / 5;
        
        char grade;
        if (avg >= 90)
        {
            grade='A';
        }
        else if (avg < 90 && avg >= 80)
        {
            grade='B';
        }
        else if (avg < 80 && avg >= 70)
        {
            grade='C';
        }
        else if (avg < 70 && avg >= 60)
        {
            grade='D';
        }
        else if (avg < 60 && avg >= 50)
        {
            grade='E';
        }
        else
        {
            grade='F';
        }

        System.out.println("Total marks=" + total_marks);
        System.out.println("Average percentage=" + avg);
        System.out.println("Grade=" +grade);
    }
}