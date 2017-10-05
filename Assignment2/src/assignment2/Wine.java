
package assignment2;
public class Wine extends Product {
   double zapremina;
   public Wine(String ime,int barCode,double cena,double zapremina){
       super(ime,barCode,cena);
       this.zapremina=zapremina;
//   this.ime=ime;
//   this.barCode=barCode;
//   this.cena=cena;
//   this.zapremina=zapremina;
      }
  
   public double cenaVina(){
       final double porez1=1.1;
        double cena1=this.osnovnaCena()*porez1;
            return cena1;
        }
   @Override
   public String toString(){
       return "Naziv: "+this.ime+", bar-code: "+this.barCode+", cena: "+this.cenaVina()+", Zapremina: "+this.zapremina+"lit.";        
   }
   
}


    
   
   
