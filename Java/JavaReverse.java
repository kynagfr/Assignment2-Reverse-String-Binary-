import java.io.*;
import java.lang.*;
import java.util.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

public class JavaReverse{
	public static void main(String[] args) throws Exception {

		DataInputStream is = new DataInputStream(new FileInputStream("revIn.txt"));

		DataOutputStream os = new DataOutputStream(new FileOutputStream("binOut.bin"));

		DataInputStream is2 = new DataInputStream(new FileInputStream("binOut.bin"));

		FileWriter fw = new FileWriter("revOut.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);

		String str = null;
		String rev = null;

		try{
			while((str=is.readLine()) != null) {
			
				os.writeChars(new String (str));
			}

			while((str=is2.readLine()) != null) {

				for(int i=str.length()-1; i>=0; i--)
				{
					rev = rev + str.charAt(i);
				}
				pw.write(rev);
			}
			
		}finally {
			if(is != null){
				is.close();
			}
			if(pw != null){
				pw.close();
			}
			if(os != null){
				os.close();
			}	
		}
	}
}
