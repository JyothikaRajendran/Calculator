import java.util.Scanner;

public class Calculator
{
    //validation of integer input
    private static int getValidInt(Scanner scan)
    {
        while(!scan.hasNextInt())
        {
            System.out.println("Invalid!. Enter the valid Number");
            scan.next();
        }
        return scan.nextInt();
    }

    //validation of double input
    private static double getValidDouble(Scanner scan)
    {
        while(!scan.hasNextDouble())
        {
            System.out.println("Invalid!. Enter the valid Number");
            scan.next();
        }
        return scan.nextDouble();
    }

    
    public static void main(String[] args)
    {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        CalculatorConsoleApp calculation = new CalculatorConsoleApp();

        while (true)
        { 
            // Menu
            System.out.println("==============================");
            System.out.println("        CALCULATOR MENU       ");
            System.out.println("==============================");
            System.out.println("1. Add");
            System.out.println("2. Substract");
            System.out.println("3. Multiply");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Power");
            System.out.println("7. SquareRoot");
            System.out.println("8. Logarithm");
            System.out.println("9. Sine");
            System.out.println("10. Cosine");
            System.out.println("11. Tangent");
            System.out.println("12. Absolute");
            System.out.println("13. Factorial");
            System.out.println("14. Exit");
            System.out.println("==============================");
            
            System.out.println("Enter the correct option to perform the operation:");          
            
            int value;

            while (true) {
                value = getValidInt(scan);

                if (value >= 1 && value <= 14)
                {
                break;   // valid option → exit loop
                } 
                else
                {
                    System.out.println("Enter a valid option between 1-14");
                }
            }
 

            //Exit Choice
            if(value == 14)
            {
                System.out.println("Exiting....");
                break;
            }

            double X, Y;

            // Basic functions
            if(value >= 1 && value <=6)
            {
                System.out.println("Enter the value of X and Y");

                X = getValidDouble(scan);
                Y = getValidDouble(scan);
                
                switch (value)
                {
                    case 1 -> System.out.println(X+ " + " +Y+ " = " +calculation.add(X,Y));
                    case 2 -> System.out.println(X+ " - " +Y+ " = " +calculation.substract(X, Y));
                    case 3 -> System.out.println(X+ " * " +Y+ " = " +calculation.multiply(X, Y));
                    case 4 -> System.out.println(X+ " / " +Y+ " = " +calculation.division(X, Y));
                    case 5 -> System.out.println(X+ " % " +Y+ " = " +calculation.modulus(X, Y));
                    case 6 -> System.out.println(X+ " ^ " +Y+ " = " +calculation.power(X, Y)); 
                }
            }
            
            // Scientific functions
            else if(value >= 7 && value <=12)
            {
                System.out.print("Enter the value of X: ");

                do
                {
                    System.out.print("Enter the value of X: ");
                    X = getValidDouble(scan);

                    if(value == 7 && X < 0)
                        System.out.println("Invalid! Number must be >= 0."); // sqrt
                    else if(value == 8 && X <= 0)
                        System.out.println("Invalid! Number must be > 0."); // log
                    else
                        break; // valid
                } while(true);
                
                switch (value)
                {
                    case 7 -> System.out.println("√" +X+ " = " +calculation.squareRoot(X));
                    case 8 -> System.out.println("log(" +X+ ") = " +calculation.logarithm(X));
                    case 9 -> System.out.println("sin(" +X+ ") = " +calculation.sine(X));
                    case 10 -> System.out.println("cos(" +X+ ") = " +calculation.cosine(X));
                    case 11 -> System.out.println("tan(" +X+ ") = " +calculation.tangent(X));
                    case 12 -> System.out.println("|" +X+ "| = " +calculation.absoluteValue(X));
                }
            }

            //Factorial 
            else if(value == 13)
            {
                System.out.print("Enter an integer value:");
                int n = getValidInt(scan);

                System.out.println(n+ "! = " +calculation.factorial(n));
            }


            System.out.println("Do You want to Continue? (Y/N)");
            char choice = scan.next().charAt(0);

            if(choice != 'Y' && choice != 'y')
                break;
            System.out.println("------------------------------");

        }

    }
}
