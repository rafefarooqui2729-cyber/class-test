// // Q14. Create a menu-driven calculator using switch-case for Addition, Subtraction, Multiplication, and Division.
// import java.util.Scanner;
// public class q14 {
//     public static void main(String[] args) {
//         int a;
//         int num1,num2;

//         Scanner sc=new Scanner(System.in);

//         System.out.println("Enter num1: ");
//         num1=sc.nextInt();
//         System.out.println("Enter num2: ");
//         num2=sc.nextInt();
//         System.out.println("========================");
//         System.out.println("1. Addition");
//         System.out.println("2. Substraction");
//         System.out.println("3. Multiplication");
//         System.out.println("4. Divison");
//         System.out.println("=========================");

//         System.out.print("Enter Which Calculation you want: ");
//         a=sc.nextInt();

//         switch (a) {
//             case 1:
//                 System.out.println("Addition of "+num1+" + "+num2+" = "+(num1+num2));
//                 break;
//             case 2:
//                 System.out.println("Substration of "+num1+" - "+num2+" = "+(num1-num2));
//                 break;
//             case 3:
//                 System.out.println("Multiplication of "+num1+" * "+num2+" = "+(num1*num2));
//                 break;
//             case 4:
//                 System.out.println("Division of "+num1+" / "+num2+" = "+(num1/num2));
//                 break;
        
//             default:
//                 System.out.println("Out of calculation");
//                 break;
//         }
//     }
// }
