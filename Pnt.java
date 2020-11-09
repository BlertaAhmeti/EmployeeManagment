public class Pnt extends KompaniaPaguan implements BilanciTotal
{   

 public double KalkuloPagenFinale()
 { double p=getPaga();
   return p=p-(getPaga()*0.18);
    }

 String TregoShtetesine(boolean sh)
  {if(sh==true || iBrendshem==true)  
     {return "vendore";}
     
   else
   { return "te huaj"; } 
    } 

    public double BilanciAktual()
    {return (int)bilanci;}
    
    public double BilanciIMbetur()
    {return (BilanciAktual()-getPaga());}
    
    int nr;
  //metoda qe percakton departamentin ku punoni
 public void TregoDepartamentin()
  { 
    if(nr>1 && nr<=6)
    {System.out.println("Ju punoni ne departamentin e IT-se");
               }
   else if(nr>=7 && nr<=11)
    {System.out.println("Ju punnoni ne departamentin e Ekonomise");} 
    else if(nr>=12 && nr<=15)
      System.out.println("Ju punoni ne departamentin e dizajit grafik");   
      
      else System.out.println("Kujdes , ne kemi vetem 3 departamente , gjithesej 15 zyre");   } 

}
