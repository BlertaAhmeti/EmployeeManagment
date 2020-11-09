public class Std extends KompaniaPaguan implements BilanciTotal
{ private String emri_fk;
  private double nota_mesatare;

  
  public String getEmri_fk()
    {return emri_fk;}
    
  public void setEmri_fk(String emri_fk) 
  {if(emri_fk != null)
    this.emri_fk=emri_fk;}
    
  public double getNota_mesatare()
    {return nota_mesatare;}
    
   public void setNota_mesatare(double nota_mesatare)
    {if(nota_mesatare>=6.0 && nota_mesatare<=10.0)
       this.nota_mesatare=nota_mesatare;} 

  public double KalkuloPagenFinale()
   {double paga1=getPaga();
   return paga1=paga1-(getPaga()*0.18)+10;
   }
 


 String TregoShtetesine(boolean sh)
  {if(sh==true || iBrendshem==true)  
     {return "vendore";}
     
   else
   { return "i huaj"; } }}
    

//public double BilanciAktual()
//  { 
//  return bilanci;}
//  public double BilanciIMbetur( )
//   {
//	  return bilanci-getPaga();
//	  }
//}