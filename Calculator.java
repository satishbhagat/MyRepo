import java.lang.*;
import java.util.*;

public class Calculator
{
    private int solution;
    private int x;
    private int y;
    private char operators;

    public Calculator()
    {
        solution = 0;
        Scanner operators = new Scanner(System.in);
        Scanner operands = new Scanner(System.in);
    }

    public int addition(int x, int y)
    {
       return x + y;
    }
    public int subtraction(int x, int y)
    {
       return x - y;
    }
    public int multiplication(int x, int y)
    {    
       return x * y;
    }
    public int division(int x, int y)
    {
       solution = x / y;
       return solution;
    }
    public void main (String[] args)
    {
      System.out.println("What operation? ('+', '-', '*', '/')"); 

      System.out.println("Insert 2 numbers to be subtracted");
       System.out.println("operand 1: ");
       x = operands;
       System.out.println("operand 2: ");
       y = operands.next();
      switch(operators)
      {
          case('+'):
            addition(operands);
            operands.next();
            break;
          case('-'):
            subtraction(operands);
            operands.next();
            break;
          case('*'):
            multiplication(operands);
            operands.next();
            break;
          case('/'):
            division(operands);
            operands.next();
            break;
       }
  }
}