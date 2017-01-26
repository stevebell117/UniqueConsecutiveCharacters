import java.io.IOException;

public class Main {
	
	public static void main(String[] args) throws IOException {
		int totalRuns = 5;
		long totalRunTime = 0;
		
		for(int j = 0; j < totalRuns; j++){
					
			String characterStringToParse = "aabcccddeeggffhhhh";
			String finalString = "";
			
			long startTime = System.nanoTime();
			long startTimeMilli = System.currentTimeMillis();
			
			for(int i = 0; i < (characterStringToParse.length() - 1); i++){
				if(characterStringToParse.charAt(i) != characterStringToParse.charAt(i+1)){
					finalString += characterStringToParse.charAt(i);
				}
			}
			
			if(characterStringToParse.charAt(characterStringToParse.length() - 1) != finalString.charAt(finalString.length() - 1)){
				finalString += characterStringToParse.charAt(characterStringToParse.length() - 1);
			}
			
			long stopTime = System.nanoTime();
			long stopTimeMilli = System.currentTimeMillis();
			
			totalRunTime += (stopTime - startTime);
	
			System.out.println("Total run-time in Nanoseconds = " + ((stopTime - startTime)));
			System.out.println("Total run-time in Microseconds = " + ((stopTime - startTime) / (double)(100)));
			System.out.println("Total run-time in Milliseconds (from nano) = " + ((stopTime - startTime) / (double)(10000)));
			System.out.println("Total run-time in Milliseconds (from milli) = " + ((stopTimeMilli - startTimeMilli)));
			
			System.out.println(finalString);

		}
		
		System.out.println("Average run time using this method: " + (totalRunTime / totalRuns));
		//System.in.read();
	}
}
