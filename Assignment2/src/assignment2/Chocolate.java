package assignment2;
public class Chocolate extends Product{
    int tezina;
    public Chocolate(String ime, int barCode,double cena,int tezina){
        super(ime,barCode,cena);
        this.tezina=tezina;
//          this.ime=ime;
//          this.cena=cena;
//          this.barCode=barCode;
//          this.tezina=tezina;  
           
    }
    @Override
    public String toString(){
    return super.toString()+" Tezina: "+this.tezina+" gr";
    }
}
   



