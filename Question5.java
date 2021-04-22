import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    int[] arr;

    //System.out.println("Enter number: ");
    int loop = in.nextInt();
    arr = new int[loop];
  
    for (int x = 0; x < loop ; x++) 
    {
      arr[x] = in.nextInt();
    }
    
    int mode = 0;
    int maxCount = 0;
    for (int i = 0; i < arr.length; i++) 
    {
      int value = arr[i];
      int count = 1;
      for (int j = 0; j < arr.length; j++) 
      {
        if (arr[j] == value) count++;
        if (count > maxCount) 
        {
          mode = value;
          maxCount = count;
        }
      }
    }
    System.out.println("The mode is " + mode);
    
  }
}
