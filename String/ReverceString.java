package String;

public class ReverceString 
{
    public static void main(String args[])
     {
      StringBuilder AA = new StringBuilder("Swapnil");
     
      for(int i=0; i<AA.length()/2; i++) // For loop initializATION
      {
        int front = i;
        int back = AA.length() - i - 1;      
  
        char frontChar = AA.charAt(front);    //Replacing caracter at front to back and back to front
        char backChar = AA.charAt(back);
  
        AA.setCharAt(front, backChar);
        AA.setCharAt(back, frontChar);
      }
  
      System.out.println(AA);
    }
 }
 