package assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CompareArrays {

	public List<String> verfiyArrays(String[] a, String[] b) {
		List<String> outList = new ArrayList<>();
		
		List<String> inList = new ArrayList<>(Arrays.asList(a));
		
		inList.addAll(new ArrayList<>(Arrays.asList(b)));
		
		Iterator<String> it = inList.iterator();
		while(it.hasNext()) {
			String value = it.next();
			if(outList.contains(value)) {
				outList.remove(value);
			}else {
				outList.add(value);
			}
		}	
		
		return  outList;
	}

/*	public static void main(String[] args) {
		String[] a = {"USA","Mexico","Canada","Brazil"};
		String[] b = {"USA","Canada","London"};
		CompareArrays cmp = new CompareArrays();
		List<String> outList = cmp.verfiyArrays(a,b);
		System.out.println(outList.toString());
	}
*/
}
