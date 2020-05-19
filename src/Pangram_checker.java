import java.util.Scanner;

public class Pangram_checker {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the sentence :");
      String sentence = input.nextLine();
          boolean[] mark = new boolean[26];
          int index = 0;
          for (int i = 0; i < sentence.length(); i++) {
              if ('A' <= sentence.charAt(i) && sentence.charAt(i) <= 'Z')
                  index = sentence.charAt(i) - 'A';
              else if ('a' <= sentence.charAt(i) && sentence.charAt(i) <= 'z')
                  index = sentence.charAt(i) - 'a';
              else
                  continue;
              mark[index] = true;
          }
          //Loops for the missing letters
          for (int i = 0; i < 26; i++)
              if (mark[i] == false) {
                  String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
                  String missing = "";
                  for (int j = i; j < 26; j++) {
                      if (mark[j] == false) {
                          missing = missing + alphabet.charAt(j);
                      }
                  }
                  System.out.print("\"" + sentence + "\"" + " is not a pangram.\nThe missing letters are: "+ missing +
                          "\n"+ "The whole missing letters are : "+missing.length() );
                  break;
              } else {
                  if (i != 25)
                      continue;
                  else
                      System.out.print("\"" + sentence + "\"" + " is a pangram.  ");

              }
      }
    }