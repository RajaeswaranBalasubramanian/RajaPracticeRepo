package JavaProject1;

public class ReverseClass {

	public static void main(String[] args) {
	
		        String input = "welocme to Java World";

		        // Split the string into words
		        String[] words = input.split(" ");

		        // Reverse the words
		        StringBuilder result = new StringBuilder();
		        for (int i = words.length - 1; i >= 0; i--) {
		            result.append(words[i]).append(" ");
		        }

		        // Print result (trim to remove last space)
		        System.out.println(result.toString().trim());
		    }
		}

