public class PartTime extends Pnt
{ private int orePune;
  double pagaPerOre;
  
  public int getOrePune()
  {return orePune;}
  
  public void setOrePune(int orePune)
  {
	  if(orePune>=1 && orePune<=20)
		  
     this.orePune=orePune;
     
     else 
     System.out.println("ju keni dhen me shum se 20 ore ne jave!!");
       }
     
     public double getPagaPerOre()
     {return pagaPerOre;}
         
     //overload
    public double KalkuloPagenFinale(double pagaPerOre)
   {return (orePune*pagaPerOre);}

}