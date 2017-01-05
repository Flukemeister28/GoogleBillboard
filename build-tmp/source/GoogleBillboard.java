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
public final static String eLong = "2.71828182845904523536028747135266249775724709369995957496696762772407663035354759457138217852516642742746639193200305992181741359662904357290033429526059563073813232862794349076323382988075319525101901157383418793070215408914993488416750924476146066808226480016847741185374234544243710753907774499206955170276183860626133138458300075204493382656029760673711320070932870912744374704723069697720931014169283681902551510865746377211125238978442505695369677078544996996794686445490598793163688923009879312773617821542499922957635148220826989519366803318252886939849646510582093923982948879332036250944311730123819706841614039701983767932068328237646480429531180232878250981945581530175671736133206981125099618188159304169035159888851934580727386673858942287922849989208680582574927961048419844436346324496848756023362482704197862320900216099023530436994184914631409343173814364054625315209618369088870701676839642437814059271456354906130310720851038375051011574770417189861068739696552126715468895703503540212340784981933432106817012100562788023519303322474501585390473041995777709350366041699732972508868769664035557071622684471625607988265178713419512466520103059212366771943252786753985589448969709640975459185695638023637016211204774272283648961342251644507818244235294863637214174023889344124796357437026375529444833799801612549227850925778256209262264832627793338656648162772516401910590049164499828931505660472580277863186415519565324425869829469593080191529872117255634754639644791014590409058629849679128740687050489585867174798546677575732056812884592054133405392200011378630094556068816674001698420558040336379537645203040243225661352783695117788386387443966253224985065499588623428189970773327617178392803494650143455889707194258639877275471096295374152111513683506275260232648472870392076431005958411661205452970302364725492966693811513732275364509888903136020572481765851180630364428123149655070475102544650117272115551948668508003685322818315219600373562527944951582841882947876108526398139559900673764829224437528718462457803619298197139914756448826260390338144182326251509748279877799643730899703888677822713836057729788241256119071766394650706330452795466185509666618566470971134447401607046262156807174818778443714369882185596709591025968620023537185887485696522000503117343920732113908032936344797273559552773490717837934216370120500545132638354400018632399149070547977805669785335804896690629511943247309958765523681285904138324116072260299833053537087613893963917795745401613722361878936526053815584158718692553860616477983402543512843961294603529133259427949043372990857315802909586313826832914771163963370924003168945863606064584592512699465572483918656420975268508230754425459937691704197778008536273094171016343490769642372229435236612557250881477922315197477806056967253801718077636034624592787784658506560507808442115296975218908740196609066518035165017925046195013665854366327125496399085491442000145747608193022120660243300964127048943903971771951806990869986066365832322787093765022601492910115171776359446020232493002804018677239102880978666056511832600436885088171572386698422422010249505518816948032210025154264946398128736776589276881635983124778865201411741109136011649950766290779436460058519419985601626479076153210387275571269925182756879893027617611461625493564959037980458381823233686120162437365698467037858533052758333379399075216606923805336988795651372855938834998947074161815501253970646481719467083481972144888987906765037959036696724949925452790337296361626589760394985767413973594410237443297093554779826296145914429364514286171585873397467918975712119561873857836447584484235555810500256114923915188930994634284139360803830916628188115037152849670597416256282360921680751501777253874025642534708790891372917228286115159156837252416307722544063378759310598267609442032619242853170187817729602354130606721360460003896";
public void setup()  
{            
	 String testNums = e.substring(2,12);
     double dNum = Double.parseDouble(testNums);
     String test49 = eLong.substring(101,111);
     String numInds = test49.substring(1,2);
     int deNum = parseInt(numInds);
	 noLoop();
     
}  

int deNum;
public void draw()  
{   
	for (int i = 2; i < e.length() - 10; i++){
		String testNums = e.substring(i, i+10);
	double dNum = Double.parseDouble(testNums);
	if ( isPrime(dNum) == true)
		System.out.println("The first prime is: " + testNums);}


	System.out.println("How many digits did I get e accurate to? This many: " + eLong.length());


	for (int i = 101; i < eLong.length()-10; i++){
		String test49 = eLong.substring(i,i+10);
			for (int j = 0; j < test49.length(); j++){
				String numInds = test49.substring(j,j+1);
				deNum = parseInt(numInds);
			}
	
	if (is49(test49) == true)
			System.out.println("The next number summing to 49 is: " + test49);
	}

}  
public boolean isPrime(double dNum)  
{   
    for (int i = 2; i <= Math.sqrt(dNum); i++){
    	if (dNum % i == 0)
    		return false;}
   return true;
    
} 
public boolean is49(String test49)
{
	int sum49 = 0;
	for (int i = 0; i < eLong.length(); i++)
		
	sum49 = sum49 + deNum;
	if (sum49 == 49){return true;}
	return false;
		
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
