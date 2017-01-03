import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class GoogleBillboard extends PApplet {

public int firstDigit;
public double firstPrime;
public final static String e = "2.718281828459045235360287471352662497757247093699959574966967627724076630353547594571382178525166427427466391932003059";  
public void setup()  
{            
     String testNums = e.substring(firstDigit,firstDigit+10);
     double dNum = Double.parseDouble(testNums);
     isPrime(dNum);
     if (isPrime(dNum) == true)
		firstPrime = dNum;
     System.out.println(firstPrime);

     
}  
public void draw()  
{   
	for (int i = 3; i < e.length() - 10; i++)
		firstDigit = i;
	
}  
public boolean isPrime(double dNum)  
{   
    for (int i = 2; i <= Math.sqrt(dNum); i++){
    	if (dNum % i == 0)
    		return false;}
   return true;
    
} 
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "GoogleBillboard" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
