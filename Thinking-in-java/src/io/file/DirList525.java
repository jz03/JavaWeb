package io.file;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

public class DirList525 {

	public static void main(String[] args){
		File path = new File("D:\\thinking in Java_code\\io");
		String[] list;
		if(args.length == 0)
			list = path.list();
		else
			list = path.list(new DirFilter(args[0]));
		Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
		for(String dirItem : list)
			System.out.println(dirItem);
	}
}
class DirFilter implements FilenameFilter{
	private Pattern pattern;
	public DirFilter(String regex){
		pattern = Pattern.compile(regex);
	}
	public boolean accept(File dir, String name){
		return pattern.matcher(name).matches();
	}
}
