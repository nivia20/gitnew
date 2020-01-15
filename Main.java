import java.util.*;

public class Main
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Scanner direction=new Scanner(System.in);
			Scanner mo=new Scanner(System.in);
		System.out.println("Enter current xcordinates");
		int x=sc.nextInt();
		System.out.println("Enter current ycordinates");
		int y=sc.nextInt();
		System.out.println("Enter current direction");
	//char d='N';
	char d=direction.next().charAt(0);
		System.out.println("Enter movements");
		//String move="LMLMLMLMM";
		String move=mo.nextLine();
		finalPosition(x,y,d,move);
		
		
		
		
		
		
	}
	static void finalPosition(int x,int y,char d,String move){
	    for(int i=0;i<move.length();i++){
	        if(x<=5 || y<=5){
	        if( d=='N'|| d=='n'){
	            if (move.charAt(i)== 'l'|| move.charAt(i)=='L')
	            {
	                d='w';
	                
	            }
	            else if (move.charAt(i)=='r'|| move.charAt(i)=='R')
	            {
	                d='E';
	                
	            }
	              else if (move.charAt(i)=='m'|| move.charAt(i)=='M')
	            {
	                y=y+1;
	                
	            }
	        }
	        else if( d=='w'|| d=='W'){
	            if (move.charAt(i)=='l'|| move.charAt(i)=='L')
	            {
	                d='S';
	                
	            }
	             else if (move.charAt(i)=='r'|| move.charAt(i)=='R')
	            {
	                d='N';
	                
	            }
	              else if (move.charAt(i)=='m'|| move.charAt(i)=='M')
	            {
	                x=x-1;
	                
	            }
	        }
	         else if( d=='s'|| d=='S'){
	            if (move.charAt(i)=='l'|| move.charAt(i)=='L')
	            {
	                d='E';
	                
	            }
	             else if (move.charAt(i)=='r'|| move.charAt(i)=='R')
	            {
	                d='W';
	                
	            }
	            else if (move.charAt(i)=='m'|| move.charAt(i)=='M')
	            {
	                y=y-1;
	                
	            }
	        }
	         else if( d=='e'|| d=='E'){
	            if (move.charAt(i)=='l'|| move.charAt(i)=='L')
	            {
	                d='N';
	                
	            }
	             else if (move.charAt(i)=='r'|| move.charAt(i)=='R')
	            {
	                d='S';
	                
	            }
	             else if (move.charAt(i)=='m'|| move.charAt(i)=='M')
	            {
	                x=x+1;
	                
	            }
	        }
	        }
	        else{
	            System.out.println("exceed out of bound");
	       }
	        
	    }
	    System.out.println("the finalposition is "+x+y+d);
	}
}
