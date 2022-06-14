package com.syntaxclass12;

public class StringClass2 {

	public static void main(String[] args) {
		String firstName="Adem";
		String lastName=" Jones";
        String fullName= firstName+lastName;// always prefer this 
        String fullName2=firstName.concat(lastName);// never use this
        // because it can lead you to nullpointer exception
        
        System.out.println(fullName);
        System.out.println(fullName2);
        String name="";// if i put space, it will not be empty
        System.out.println(name.isEmpty());
        String name2=" ";
        System.out.println(name2.isEmpty());//.isBlank var ama bende calismiyor
        // o da blank ise ici true diyor.
       
        String str=" never ";
        System.out.println(str.trim());//.trimmer will remove the spaces. 
        //but if its between like ne ver it cannot remove
      
      
      
      
      
      
      
      
	}

}
