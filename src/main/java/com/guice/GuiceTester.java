package com.guice;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import com.google.inject.AbstractModule;
import com.google.inject.BindingAnnotation;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

import static java.lang.annotation.RetentionPolicy.RUNTIME;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;


@BindingAnnotation @Target({ FIELD, PARAMETER, METHOD }) @Retention(RUNTIME)
@interface WinWord{}

interface SpellChecker {
	public void checkSpelling();
}

interface FormatChecker {
	public void checkFormatting();
}

class FormatCheckerImp implements FormatChecker {
	@Override
	public void checkFormatting() {
		System.out.println("Inside FormatChecker impl");
	}
}

class SpellCheckerimp implements SpellChecker {

	@Override
	public void checkSpelling() {
		System.out.println("Inside Spellchecker impl");
	}
}

class WinwordSpellCheckImp extends SpellCheckerimp {
	@Override
	public void checkSpelling() {
		System.out.println("Inside WinwordSpellchecker impl");
	}
}

class TextEditor {

	SpellChecker spellChecker;
	FormatChecker formatChecker;

	
	public TextEditor(SpellChecker spellChecker) {
		super();
		this.spellChecker = spellChecker;
	}
	
	@Inject
	public TextEditor(@WinWord SpellChecker spellChecker, FormatChecker formatChecker) {
		super();
		this.spellChecker = spellChecker;
		this.formatChecker = formatChecker;
	}

	public void makeSpellCheck() {
		spellChecker.checkSpelling();
	}

	public void makeFormatCheck(){
		formatChecker.checkFormatting();
	}
}

//bind module
class TextEditorModule extends AbstractModule {
	@Override
	protected void configure() {
		bind(SpellChecker.class).annotatedWith(WinWord.class).to(SpellCheckerimp.class);
		bind(SpellCheckerimp.class).to(WinwordSpellCheckImp.class);
		bind(FormatChecker.class).to(FormatCheckerImp.class);
		
	}

}

public class GuiceTester {
	public static void main(String[] args) {

		Injector injector = Guice.createInjector(new TextEditorModule());
		TextEditor editor = injector.getInstance(TextEditor.class);
		editor.makeSpellCheck();
		editor.makeFormatCheck();

	}

}
