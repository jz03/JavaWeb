package String.regex;

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
		System.out.println(Arrays.toString(args));
		Pattern p = Pattern.compile(args[1]);
		Matcher m = p.matcher("");
		int index = 0;
		for(String line : new TextFile(args[0])){
			m.reset(line);
			while(m.find()){
				System.out.println(index++ +": "+m.group()+": "+m.start()+m.end());
			}
		}
	}

}