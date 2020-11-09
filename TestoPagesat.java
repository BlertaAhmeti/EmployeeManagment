import java.util.*;
import java.io.*;
public class TestoPagesat
{
	public static void main(String[]args) {
	

  
    String zgjedh;
    System.out.print("a jeni pnt apo std :");
    File file = new File("Projekti.txt");
     Scanner input=new Scanner(System.in);
       zgjedh=input.nextLine();
       
       switch(zgjedh) 
       
  	 {
  	 case("pnt"):
  	        KompaniaPaguan pnt=new Pnt();
  	        System.out.print("Emri: ");
  	        pnt.setEmri(input.next());
  	        Pnt p=new Pnt();
  	        System.out.print("Mbiemri: ");
  	        pnt.setMbiemri(input.next());
  	        
  	    System.out.println("A jeni punntor i brendshem shtypni true per ta aprovuar, /n shtypni false per ta mohuar");
  	       p.iBrendshem=input.nextBoolean();
  	          
  	          System.out.println("Ju kenni shtetesi:"+p.TregoShtetesine(false));  
  	          
  	          
  	          System.out.println("zyrja ku punoni ka nr:");
  	           p.nr=input.nextInt();
  	           p.TregoDepartamentin();
  	           
  	       System.out.println("a jeni punetor :1}me orar te plote. 2)orar gjysem(partTime)");
  	         int x;
  	         x=input.nextInt();
  	      switch(x)
  	      { case(1):
  	         System.out.println("Paga e juaj eshte : ");
  	          pnt.setPaga(input.nextInt());
  	     
  	     System.out.println("Paga finnale pas zbatimit te tatimit:"+pnt.KalkuloPagenFinale());
  	     System.out.println("Bilanci aktual i kompanise:"+pnt.BilanciAktual());
  	     System.out.println("Bilanci i mbetur i kompanise:"+pnt.BilanciIMbetur());
  	     
  	     
  	          break;
  	      case(2):
  	         System.out.println("sa ore keni punuar kete  muaj");  
  	         PartTime pt=new PartTime();
  	         pt.setOrePune(input.nextInt());
  	        
  	        System.out.println("Paga e juaj per kete jave:"+pt.KalkuloPagenFinale(10.0));
  	           break; }
  	           
  	    break;
  	 
  	    case("std"):
  	   
  	          KompaniaPaguan std=new Std();
  	         Scanner in=new Scanner(System.in);
  	      
  	         System.out.println("Emri: ");
  	         std.setEmri(in.next());
  	          
  	           System.out.println("Mbiemri: ");
  	        std.setMbiemri(in.next());
  	        
  	         Std obj2=new Std();
  	        
  	        
  	        System.out.println("Emri fk:");
  	        obj2.setEmri_fk(in.next());
  	        
  	        System.out.println("Nota mesatare: ");
  	        obj2.setNota_mesatare(Double.parseDouble(in.next()));
  	        
  	            
  	        System.out.println("A jeni student i brendshem shtypni true per ta aprovuar, shtypni false per ta mohuar");
  	       
  	    		obj2.iBrendshem=input.nextBoolean();
  	          
  	          System.out.println("Ju kenni shtetesi:"+obj2.TregoShtetesine(false)); 

  	       
  	        System.out.println("Paga e juaj eshte : ");
  	        std.setPaga(in.nextInt());  
  	       
  	        
  	     
  	     System.out.println("Paga finale pas aplikimit te tatimit dhe bonusit:"+std.KalkuloPagenFinale());
  	       System.out.println("Bilanci aktual i kompanise:"+std.BilanciAktual());
  	     System.out.println("Bilanci i mbetur i kompanise:"+std.BilanciIMbetur());
  	     

  	      break; 
  
  	    
   
	 }
  	 try {
   		 PrintWriter print = new PrintWriter(file);
   		 print.println("Te dhenat jan te ruajtura ne Projekti.txt ");
   		 print.println("kujdes cdo keperdorim denohet me Ligj!!!!");
   		 
   	 print.close();
    }
    catch(IOException e )
    {
      System.out.println("Verejte Ka Ndodhur nje Gabim !!!!!: " + e);
    
    }
			      	      
      	 
      
  		
  		 
  	
   
  
    
     
}
}


    
 


 
   
 
   
     
 