abstract class KompaniaPaguan implements BilanciTotal
{  private String emri;
   private String mbiemri;
   private int paga;
   boolean iBrendshem;
    
 abstract double KalkuloPagenFinale();
    
   public String getEmri()
   {return emri;}

  public void setEmri(String emri)
  {if(emri !=null)
    this.emri=emri;
     else System.out.println("kjo fushe nuk guxon te jete e zbrazet");}
    
    
   public String getMbiemri()
    {return mbiemri;} 

  public void setMbiemri(String mbiemri)
   {if(mbiemri != null)
      this.mbiemri=mbiemri;
      else System.out.println("kjo fushe nuk guxon te jete e zbrazet");}
      
   public int getPaga()
   {return paga;}
   
   public void setPaga(int paga)
   {if(paga>=0)
     this.paga=paga;}   
   public double BilanciAktual()
   { 
   return bilanci;}
   public double BilanciIMbetur( )
    {
 	  return bilanci -paga;
 	  }
   
  public String TregoShtetesine()
     {
        return "";
           }

}