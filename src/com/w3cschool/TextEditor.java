package com.w3cschool;

import com.sun.org.apache.bcel.internal.generic.RETURN;

public class TextEditor {
    private String message1;
    private SpellChecker spellChecker;

    public  void  setSpellChecker(SpellChecker spellChecker){
        System.out.println("Inside setSpellChecker");
        this.spellChecker = spellChecker;
    }
//    public TextEditor(SpellChecker spellChecker){
//        System.out.println(this.spellChecker);
//        System.out.println("Inside TextEditor constructor.");
//        this.spellChecker = spellChecker;
//    }
    public void setMessage1(String message)
    {
        this.message1 = message;
    }
    public void getMessage1()
    {
        System.out.println("Wor Message:"+message1);
    }
    public SpellChecker getSpellChecker(){
        return spellChecker;
    }
    public void spellCheck(){
        spellChecker.checkSpelling();
    }
}
