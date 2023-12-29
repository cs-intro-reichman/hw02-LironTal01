import java.util.Random;
/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get two command-line arguments: an int value
 * 	that determines how many families to simulate, and an int value
 *  that serves as the seed of the random numbers generated by the program.
 *  Example usage: % java OneOfEachStats 1000 1
 */
public class OneOfEachStats {
	public static void main (String[] args) {
		// Gets the two command-line arguments
		int seed = Integer.parseInt(args[0]);
		int T = Integer.parseInt(args[1]);
		// Initailizes a random numbers generator with the given seed value
        Random generator = new Random(seed);  
	

        int g=0;
        int b=0;
        double x;
        double avg = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;

        for(int i=0; i<T; i++){
        while(b==0 || g==0){
            x = generator.nextDouble();
            if (x>0.5) {
            b = b + 1; 
        }
        else {
            g = g + 1;
        }
    }

        int sum = b + g;
        avg = avg + sum;

        if (sum == 2){
            sum2++;
        }
        else if (sum == 3){
            sum3++;
        }
        else{
            sum4++;
        }

        b=0;
        g=0;
  
      }
        avg = avg / T;
        System.out.println("Average: "+ avg + " children to get at least one of each gender.");
        System.out.println("Number of families with 2 children: " + sum2);
        System.out.println("Number of families with 3 children: " + sum3);
        System.out.println("Number of families with 4 or more children: " + sum4);
        if (sum2>sum3 && sum2>sum4) {
            System.out.println("The most common number of children is 2.");  
        }
        else if (sum3>sum2 && sum3>sum4){
            System.out.println("The most common number of children is 3."); 
        }
        else{
            System.out.println("The most common number of children is 4.");
        }
        
	}
}
