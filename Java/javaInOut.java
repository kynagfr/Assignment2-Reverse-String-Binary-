import java.io.*;
import java.lang.*;
import java.util.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

public class javaInOut{
	public static void main(String[] args) throws Exception {

		DataInputStream ois = new DataInputStream(new FileInputStream("ReverseIn.txt"));

		DataOutputStream oos = new DataOutputStream(new FileOutputStream("javaBinary.bin"));

		DataInputStream ois2 = new DataInputStream(new FileInputStream("javaBinary.bin"));

		FileWriter fw = new FileWriter("ReverseOut.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);

		String str = null;
		String reverse = null;

		try{
			while((str=ois.readLine()) != null) {
			
				oos.writeChars(new String (str));

				//String ia =(String)(ois.readLine());
				//System.out.println(ia);		
				
				
			}

			while((str=ois2.readLine()) != null) {
			

				for(int i=str.length()-1; i>=0; i--)
				{
					reverse = reverse + str.charAt(i);
				}
				pw.write(reverse);
			}
			
		}finally {
			if(ois != null){
				ois.close();
			}
			if(pw != null){
				pw.close();
			}
			if(oos != null){
				oos.close();
			}	
		}
	}
}







	

