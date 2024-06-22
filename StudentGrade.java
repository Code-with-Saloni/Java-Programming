import java.util.Scanner;
public class StudentGrade
{
    public static void main(String[] args) 
    {
        int n, total = 0;
        float avgper;
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of subject of the student:");
        n = sc.nextInt();
        int marks[] = new int[n];
        System.out.println("Enter marks out of 100:");
        for(int i = 0; i < n; i++)
        {
            marks[i] = sc.nextInt();
            total = total + marks[i];
        }
        avgper = total / n;
        System.out.println("Sum is "+total);
        System.out.println("Average Percentage is "+avgper+" %");
        System.out.print("The student Grade is ");
        if(avgper>=80)
        {
            System.out.print("A");
        }
        else if(avgper>70)
        {
           System.out.print("B");
        } 
        else if(avgper>60)
        {
            System.out.print("C");
        }
        else
        {
            System.out.print("D");
        }
}
}