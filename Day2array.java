package day3;
import java.util.Arrays;
public class Day2array {
public static void main (String[]args) {
	
	
	String company = "software";
	char[] companys = company.toCharArray();
;
	System.out.println(companys[0]+"   " +companys[1]+"  "+companys[2]+"   "+companys[3]+"  "+companys[4]+"   "+companys[5]+"   "+
companys[6]);
	System.out.println(Arrays.toString(companys));
	
	
	
	String x = "software";
	String []y =x.split("w");
	System.out.println(y[0]+"   "+y[1]);
	
	String a = "hello,world,fortune";
	String []b = a.split(",");
	System.out.println(b[0]+"  "+b[1]+"  "+b[2]);
	
	
	String c= "(a-2),(b-2),(c+2)";//split
	String []d = c.split(",");
	System.out.println(d[0]+"  "+d[1]+"  "+d[2]);
	
	
	
	
	String name= "sive";
	name="raj";
	System.out.println(name);//replace
	
	
	String ren = new String ("apple");
	String ren1 = new String ("apple");//boolean examples
;
	boolean zen = ren==ren1;
	System.out.println(zen);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

	
	
	
	
	
	
	
}
