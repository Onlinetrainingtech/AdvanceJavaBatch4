package com.xyz;

public class TextEditor 
{
     private SpellChecker spellChecker;
     
     public TextEditor(SpellChecker spellchecker)
     {
    	 System.out.println("Inside texteditor method constructor");
    	 this.spellChecker=spellchecker;
     }
     public void spellCheck()
     {
    	 spellChecker.checkSpelling();
     }
}
