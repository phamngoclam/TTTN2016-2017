import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
public class main {

	public static void main(String[] args) {
		String content=stopword.remove();
		String output="";
		
		for (String ngram : n_gram.ngrams(8, content)){
			if(output=="") output=ngram;
			else {
					output=output+"\n";
					output=output+ngram;
				}
			}
		//output la String output chua nhung ki tu xuat ra trong console
			System.out.print(output);//lenh nay xuat ra noi dung cua string output
	}
}
