import java.util.Scanner;  // Import the Scanner class

/**
 *
 * @author singh
 */
public class JavaCalculatorApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        String name = "Sameer";
        System.out.println("Hello "+name+" long time!!");
        System.out.println("Lets build a calculator!!");
        System.out.println("Choose any 1 operation!! \n 1.Addition \n 2.Subtraction \n 3.Division \n 4.Multiplication \n");
        int option = myObj.nextInt();
        System.out.println("Enter 2 nos: ");
        float num1 = myObj.nextFloat();
        float num2 = myObj.nextFloat();
        // System.out.println(option);
        double ans;
        switch(option) {
            case 1:
                ans = addition(num1, num2);
                System.out.println("Answer: "+ans);
                // code block
              break;
            case 2:
                ans = subtraction(num1, num2);
                System.out.println("Answer: "+ans);
              break;
            case 3:
                ans = division(num1, num2);
                System.out.println("Answer: "+ans);
              break;
            case 4:
                ans = multiplication(num1, num2);
                System.out.println("Answer: "+ans);
              break;
            default:
               System.out.println("Please choose from above options");
          }
        
//        float abc;
//        abc = addition(23,34);

    
    
    }
    
    static float addition(float x, float y){
        float z;
        z = x + y;
        return z;
    }
    
    static float subtraction(float x, float y){
        float z;
        z = x - y;
        return z;
    }
    
    static float multiplication(float x, float y){
        float z;
        z = x * y;
        return z;
    }
    
    static float division(float x, float y){
        float z;
        z = x / y;
        return z;
    }
    
    
    
}
