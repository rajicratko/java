package assignment3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person
{
    public String ime;
    public String prezime;
    public LocalDate datumRodjenja;
    public String mestoRodjenja;
    
    public Person (String ime, String prezime, LocalDate datumRodjenja, String mestoRodjenja){
    this.ime = ime;
    this.prezime = prezime;
    this.datumRodjenja= datumRodjenja;
    this.mestoRodjenja= mestoRodjenja;
    }
   @Override
        public String toString(){
            DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd.MMM yyyy");
        String datumRodjenja = this.datumRodjenja.format(fmt);
        return "ime: "+this.ime+" prezime: "+this.prezime+
               " datum rodjenja: "+datumRodjenja+" mesto Rodjenja: "+this.mestoRodjenja;
        }
}

    
    
    


