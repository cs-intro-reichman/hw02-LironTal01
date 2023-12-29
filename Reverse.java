/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String word = args[0]; 
		int i=word.length()-1;
        String newWord ="";
        char middleWord;

		while((i>=0)){
            newWord+=word.charAt(i);
            i--;

        }
        if(word.length()%2==0){
        middleWord = word.charAt(word.length()/2-1);
        }
        else{
        middleWord = word.charAt(word.length()/2); 
        }
        System.out.println(newWord);
        System.out.println("The middle character is "+middleWord);
	}
}

