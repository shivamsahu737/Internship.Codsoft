import java.util.Scanner;

public class GradeCalculater {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
        while(true){
        System.out.print("Enter the total number of subjects:");
            int sub = in.nextInt();
            int[] arr = new int[sub];
            System.out.println("Enter the subject's marks(out of 100):");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextInt();
            }
            int total = total(arr);
            float avg = avg(total, sub);
            char grade = grade(avg);
            System.out.println("Total marks:" + total);
            System.out.println("Average percentage:" + avg);
            System.out.println("Grade:" + grade);
            System.out.println();
            System.out.println("Calculate again(enter 1)");
            System.out.println("Exit(enter 2)");
            int input = in.nextInt();
            if(input == 1){
                continue;
            }
            else
            break;
        }
        }
    }

    static int total(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    static float avg(int total, int sub) {
        float avg = ((float)total)/sub;
        return avg;
    }
    
    static char grade(float avg){
        if(avg > 80)
        return 'A';
        else if(avg > 70)
        return 'B';
        else if(avg > 60)
        return 'C';
        else if(avg > 50)
        return 'D';
        else if(avg > 40)
        return 'E';
        else
        return 'F';
    }

   

    
}
