package String.regex;

import java.io.File;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import String.util.TextFile;

public class JGrep308 {

	public static void main(String[] args) {
		if(args.length < 2){
			System.out.println("错误：重新输入参数");
			System.exit(0);
		}
		File file = new File(args[0]);
		File[] files = null;
		if(file.isDirectory())
			files = file.listFiles();
		else
			files = new File[]{new File(args[0])};
		
		System.out.println(Arrays.toString(args));
		Pattern p = Pattern.compile(args[1]);
		Matcher m = p.matcher("");
		int index = 0;
		for(File f : files){
			System.out.println("--"+f.getName()+"--");
			for(String line:new TextFile(f.getAbsolutePath())){
				m.reset(line);
				while(m.find()){
					System.out.println(index++ +": "+m.group()+": "+m.start()+m.end());
				}
			}
			
		}
	}

}