public class Vowels {

  public static int getCount(String str) {
    
    int amountVowels = 0;
    
    //if (switch) the string has a vowel, for each vowel add 1 to count.
    
    
    for(int i = 0; i < str.length(); i++){
      
      char letter = str.charAt(i);
      
      switch (letter){
          
          case 'a': amountVowels++;
          break;
          case 'e': amountVowels++;
          break;
          case 'i': amountVowels++;
          break;
          case 'o': amountVowels++;
          break;
          case 'u': amountVowels++;
          break;
          
          default: System.out.println("No vowel, found: "+ letter);
          break;
          
      }//End switch
      
    }//end for
    
    
    return amountVowels;
  }

}

