import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class PalindromeChecker {
public void tester()
{
  //String lines[] = loadStrings("palindromes.txt");
  String[] lines = new String[6]; 
    try{
        File myFile = new File("palindromes.txt");
        Scanner myReader = new Scanner(myFile);
        int counter = 0;
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            lines[counter] = data;
            counter++;
        }
        myReader.close();
    }
    catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }
  System.out.println("there are " + lines.length + " lines");
  for (int i=0; i < lines.length; i++) 
  {
    if(palindrome(lines[i])==true)
    {
      System.out.println(lines[i] + " IS a palindrome.");
    }
    else
    {
      System.out.println(lines[i] + " is NOT a palindrome.");
    }
  }
}
public boolean palindrome(String word)
{
 word = noSpecial(word);
 if(word.length() > 1){
  String um = "";
  String er = "";
  for(int i = word.length()-1; i >= word.length()/2; i--){
    er = word.substring(i, i+1);
    um = um+er;
  }
if(um.equals(word.substring(0,word.length()/2+1))){
  return true;
}
return false;
}
return true;
}
public String noSpaceAndLowerCase(String str){
  String fling = "";
  for(int i = 0; i < str.length(); i++){
    if(str.substring(i,i+1).equals(" ")){
    }
    else
    fling += str.substring(i,i+1);
  }
  fling = fling.toLowerCase();
  return fling;
}
public String noSpecial(String str){
  str = noSpaceAndLowerCase(str);
   String sting = "";
  for(int i = 0; i < str.length(); i++){
    if(Character.isLetter(str.charAt(i)) == true){
      sting += str.substring(i,i+1);
    }
  }
  return sting;
}
public String reverse(String str)
{
   String sNew = new String();
  String er = "";
  for(int i = str.length()-1; i >= 0; i--){
    er = str.substring(i, i+1);
    sNew = sNew+er;
  }
    return sNew;
}
}
