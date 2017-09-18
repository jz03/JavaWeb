package io.tool;

import java.io.File;

public class DirectoryDemo530 {

	public static void main(String[] args){
		PPrint529.pprint(Directory528.walk(".").dirs);
		for(File file :Directory528.local(".","T.*\\.java"))
			System.out.println(file);
		System.out.println("-----------------------------");
		for(File file:Directory528.walk(".","T.*\\.java"))
			System.out.println(file);
		System.out.println("=============================");
		for(File file:Directory528.walk(".",".*[Zz].*\\.class"))
			System.out.println(file);
	}
}
