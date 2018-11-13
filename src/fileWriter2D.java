import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class fileWriter2D {
	private File output;
	public fileWriter2D(String [][] input) {	
		try {
			output = new File("output.txt");
			StringBuilder builder = new StringBuilder();
			for(int i = 0; i < 5; i++)//for each row
			{
				for(int j = 0; j < input.length; j++)//for each column
				{
					builder.append(input[i][j]+" ");//append to the output string
				}
				builder.append("\n");//append new line at the end of the row
			}	
			BufferedWriter writer = new BufferedWriter(new FileWriter(output));
			writer.write(builder.toString());//save the string representation of the board
			writer.close();
		}
		catch(Exception e ) {
		
		}
	}
	
	public File getFile() {
		return output;
	}	
}
