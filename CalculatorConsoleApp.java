import java.math.BigInteger;

public final class CalculatorConsoleApp
{

    double add(double X, double  Y)
    {
        return X + Y;
    }

    double substract(double X, double  Y)
    {
        return X - Y;
    }

    double multiply(double X, double  Y)
    {
        return X * Y;
    }

    double division(double X, double  Y)
    {
        if(Y == 0)
        {
            System.out.println("Cannot divide by zero");
            return Double.NaN;
        }
        return X/Y;
    }

    double modulus(double X, double Y)
    {
        return X % Y;
    }

    double power(double X, double Y)
    {
        return Math.pow(X, Y);
    }

    double squareRoot(double X)
    {
        return Math.sqrt(X);
    }

    double logarithm(double X)
    {
        return Math.log(X);
    }

    double  sine(double X)
    {
        return Math.sin(X);
    }

    double cosine(double X)
    {
        return Math.cos(X);
    }

    double tangent(double X)
    {
        return Math.tan(X);
    }

    double absoluteValue(double X)
    {
        return Math.abs(X);
    }

    BigInteger factorial(int X)
    {
        if(X<0){
            System.out.println("Invalid! Factorial of negative number is not possible.");
            return BigInteger.valueOf(-1);
        }
        if(X == 0 || X == 1)
        {
            return BigInteger.ONE;
        }
        BigInteger fact = BigInteger.ONE;
        while(X>1)
        {
            fact = fact.multiply(BigInteger.valueOf(X));
            X--;
        }
        return fact;
    }
}