package examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromTextFile {

	public static void main(String[] args) throws FileNotFoundException {
		String inputFileName;
		Scanner in=new Scanner(System.in);
		System.out.println("What is the file name: ");
		inputFileName=in.nextLine();
		Scanner inFile=null;
		double total=0;
		int count=0;
		
		try{
			inFile=new Scanner(new File(inputFileName));
			while(inFile.hasNextDouble()){
				total=inFile.nextDouble();
				count++;
			}
			System.out.println("The average is: "+ (total/count));
			System.out.println();
			
		}catch(FileNotFoundException file){
			file.printStackTrace();
		}finally{
			try{
				inFile.close();
			}catch(NullPointerException e){
				System.out.println("Null Pointer Exception has occurred");
			}
		}
	in.close();
	}
	

}
