package strings;

import java.util.Scanner;
import java.util.Stack;


public class matchParanthese
{	
public static void main(String[] args)
{

Scanner sc = new Scanner(System.in);
String phrase = sc.nextLine();

int res = isBalancedParantheses(phrase);
System.out.println(res);

}

private static int isBalancedParantheses(String phrase) {
// TODO Auto-generated method stub
Stack<Character> st = new Stack<Character>();

char c;
for(int i=0;i<phrase.length();i++)
{
c = phrase.charAt(i);
if(c=='(')
st.push(c);
else if(c==')')
{
if(st.isEmpty())
return 0;
else
st.pop();
}

}
if(st.isEmpty())
return 1;
else return 0;
}

}