import java.util.Scanner;

public class MarkSheet{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);


         System.out.println("Enter reg number for student 1:");
         String regNumber1=scanner.nextLine();
         System.out.println("Enter name for student 1:");
         String fullName1=scanner.nextLine();
         System.out.println("Enter mark for CCS2211 for student 1:");
         int CCS2211_1=scanner.nextInt();
         System.out.println("Enter mark for CCS2212 for student 1:");
         int CCS2212_1=scanner.nextInt();
         scanner.nextLine();


        // Variables for Student 2
        System.out.println("Enter the registration number for Student 2:");
        String regNumber2 = scanner.nextLine();
        System.out.println("Enter the full name for Student 2:");
        String fullName2 = scanner.nextLine();
        System.out.println("Enter the marks for CCS 2211 for Student 2:");
        int CCS2211_2 = scanner.nextInt();
        System.out.println("Enter the marks for CCS 2212 for Student 2:");
        int CCS2212_2 = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Variables for Student 3
        System.out.println("Enter the registration number for Student 3:");
        String regNumber3 = scanner.nextLine();
        System.out.println("Enter the full name for Student 3:");
        String fullName3 = scanner.nextLine();
        System.out.println("Enter the marks for CCS 2211 for Student 3:");
        int CCS2211_3 = scanner.nextInt();
        System.out.println("Enter the marks for CCS 2212 for Student 3:");
        int CCS2212_3 = scanner.nextInt();






        System.out.println("Student score sheet");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Reg No\t\tFullName\t CCS221\t CCS2212\t ");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println(regNumber1 + "\t"+ fullName1 + "\t\t" + CCS2211_1 + "\t\t"+CCS2212_1);
        System.out.println(regNumber2+"\t"+fullName2+"\t\t"+CCS2211_2+"\t\t"+CCS2212_2);
        System.out.println(regNumber3+"\t"+fullName3+"\t\t" +CCS2211_3+"\t\t"+CCS2212_3);
    }
}