import java.util.*;
public class CheckBalance
{
  public static void main (String[]args)
  {
    String str;
    Scanner sc = new Scanner (System.in);
      str = sc.nextLine ();
    int open = 0;
    for (int i = 0; i < str.length (); i++)
      {
	if (str.charAt (i) == '(')
	  open++;
	else if (str.charAt (i) == ')')
	  open--;
	if (open == -1)
	  {
	    System.out.print ("unbalanced");
	    return;
	  }
      }
    if (open == 0)
      System.out.print ("balanced");
    else
      System.out.print ("unbalanced");
  }
}
