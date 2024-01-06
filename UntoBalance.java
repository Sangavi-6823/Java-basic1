import java.util.Arrays;
import java.util.Scanner;
public class UntoBalance{
    public static void main(String[] args) {
       String str;
       Scanner sc=new Scanner(System.in);
       str=sc.nextLine();
       int len=str.length();
       int open=0,close=0;
       char[] str1=new char[len];
       str1=str.toCharArray();
       for(int start=0,end=len-1;start<len;start++,end--) {
    	    if(str1[start]=='(')
    	    	open++;
    	    else if(str1[start]==')')
    	    	open--;
    	    if(open<0) {
    	    	str1[start]='*';
    	    	open=0;
    	    }
    	    if(str1[end]==')')
    	    	close++;
    	    else if(str1[end]=='(')
    	    	close--;
    	    if(close<0) {
    	    	str1[end]='*';
    	    	close=0;
    	    }
       }
      for(int i=0;i<len;i++) {
    	  if(str1[i]!='*')
    	  System.out.print(str1[i]);
      }
       
    } 
}
