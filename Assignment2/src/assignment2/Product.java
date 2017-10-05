
package assignment2;
public abstract class Product{ 

String ime;
int barCode;
double cena;
final double porez=1.2;
Product(String ime, int barCode, double cena){
this.ime=ime;
this.barCode=barCode;
this.cena=cena;

}

final public double osnovnaCena(){
cena=cena*porez;
    return cena;
}
@Override
public String toString()
    {
        return "naziv: "+ime+ ", bar-code: " + barCode + ", cena: " +cena;
    } 

}
