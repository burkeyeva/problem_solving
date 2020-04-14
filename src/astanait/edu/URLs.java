package astanait.edu;
import edu.duke.*;
public class URLs {

	public static void main(String[] args) {
		URLResource file = new  URLResource("http://www.dukelearntoprogram.com/course2/data/manylinks.html");
	   	for (String item : file.words()) {
	       	   String itemLower = item.toLowerCase();
	       	   int pos = itemLower.indexOf("youtube.com");
	       	   if (pos != -1) {
	       		   int start_pos = item.indexOf("\"");
	       		   int end_pos = item.indexOf("\"", start_pos+1);
	       		   System.out.println(item.substring(start_pos+1, end_pos));
	               }
	   	}

	}

}
