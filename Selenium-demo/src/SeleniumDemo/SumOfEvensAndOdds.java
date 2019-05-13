package SeleniumDemo;
import java.util.Arrays;


public class SumOfEvensAndOdds {
  
  //Function 
  public int getSumOfEvensAndOdds(int[] input) {
    // Student code begins here
// int x[] = new int[5];
    int x[] = new int[5];
    int sumE = 0;
    int sumO = 0;
    for(int i = 0; i < 5; i++)
        {
            if(input[i] % 2 == 0)
            {
                sumE = sumE + input[i];
            }
            else
            {
                sumO = sumO + input[i];
            }
        }
        System.out.println("Sum of Even Numbers:"+sumE);
        System.out.println("Sum of Odd Numbers:"+sumO);
        //return sumE;
        //return sumO;
    //return input;
        //return 0;
        
    
    // Student code ends here
  }

  public void printSumOfEvensAndOdds(int[] input) {
    System.out.println(Arrays.toString(getSumOfEvensAndOdds(input)));
  }

  public static void main(String[] args) {

    try {
      int[] input = new int[args.length];
      for (int i = 0; i < input.length; i++) {
        input[i] = Integer.parseInt(args[i]);
      }

      SumOfEvensAndOdds obj = new SumOfEvensAndOdds();
      obj.printSumOfEvensAndOdds(input);
    } catch (NumberFormatException e) {
      System.out.println("Only numbers are allowed.");
    }

  }
}

