package cn.jz.helloWorld.bean;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * 依赖注入，注入内部bean
 * 
 * @author 冀州
 * @date 2018年4月13日
 */
public class TextEditor {
	
	@Autowired
	private SpellChecker spellChecker;

	private String name;
	
	public void spellChecker() {
		spellChecker.checkerSpelling();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void setSpellChecker(SpellChecker spellChecker) {
		System.out.println("注入 SpellChecker");
		this.spellChecker = spellChecker;
	}
}
