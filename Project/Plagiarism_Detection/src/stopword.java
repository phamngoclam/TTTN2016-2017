import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
public class stopword {
	
	
	public static String remove(){
	String[] stopWrds={"the", "of", "a", "an", "and", "in", "to", "is", "was", 
			"it", "for", "with", "he", "be", "on", "i", "that", "by", "as", "you",
			"are", "not", "his", "this", "from", "but", "has", "which", "she", "they",
			"or", "were", "we", "their", "been", "has", "have", "will", "would",
			"her", "n't", "there", "can", "all", "as", "if", "who", "what", "said"};
	String content="";
	try{
		Scanner flip1=new Scanner(new File("Data/source_data/source-document00007.txt"));
		//FileOutputStream out=new FileOutputStream("Data/result/output.txt");
		
		while(flip1.hasNext()){
			int flag=1;
			String s1=flip1.next();
			s1=s1.toLowerCase();
			for(int i=0; i<stopWrds.length; i++){
				if(s1.equals(stopWrds[i])){
				flag=0;
				}
			}
			if(flag==0){
				if(content=="") content=content+s1;
				else{
					content=content+" ";
					content=content+s1;
				}
				
			}
		}
		//System.out.print(content);
	}
	catch(Exception e){
		System.err.println("Can't read file!!!");
	}
	return content;
	
	}
}
