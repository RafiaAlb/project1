import java.util.Arrays;

public class Anagram {



	public static void main(String[] args)
{ String word1 = "owns"; 
String word2 = "snow"; 
boolean areAnagrams = checkAnagram(word1, word2);
if (areAnagrams) 
{ System.out.println(word1 + " is an anagram of " + word2 ); }
else 
{ System.out.println(word1 + " and " + word2 + " are not anagrams."); 

} 
}
public static boolean checkAnagram(String word1, String word2)
{ 
 word1 = word1.toLowerCase(); word2 = word2.toLowerCase(); 
 word1 = word1.replaceAll("\\s", ""); word2 = word2.replaceAll("\\s", "");
 char[] charArray1 = word1.toCharArray();
 char[] charArray2 = word2.toCharArray();
 Arrays.sort(charArray1); Arrays.sort(charArray2); 

 return Arrays.equals(charArray1, charArray2); } 
}
