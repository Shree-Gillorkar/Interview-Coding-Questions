/*Word is key
One programming language has the following keywords that cannot be used as identifiers:



break, case, continue, default, defer, else, for, func, goto, if, map, range, return, struct, type, var

Write a program to find if the given word is a keyword or not



Example-1

Input

defer

Expected Output

defer is a keyword



Example-2

Input

While

Expected Output

while is not a keyword


Case 1:
Input (stdin)
defer

Output (stdout)
defer is a keyword

Case 2:
Input (stdin)
while

Output (stdout)
while is not a keyword
*/

import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);
    HashSet<String> keywords = new HashSet<String>();
    keywords.add("break");
    keywords.add("case");
    keywords.add("continue");
    keywords.add("default");
    keywords.add("defer");
    keywords.add("else");
    keywords.add("for");
    keywords.add("func");
    keywords.add("goto");
    keywords.add("if");
    keywords.add("map");
    keywords.add("goto");
    keywords.add("if");
    keywords.add("map");
    keywords.add("range");
    keywords.add("return");
    keywords.add("struct");
    keywords.add("type");
    keywords.add("var");
    String word = input.nextLine();
    boolean  existance = keywords.contains(word);
    if(existance){
          System.out.println(word + " is a keyword");
    }else{
        System.out.println(word+" is not a keyword");
    }
  }
}
