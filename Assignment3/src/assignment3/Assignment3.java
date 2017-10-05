package assignment3;

import java.util.Arrays;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
public class Assignment3 {
    public static void main(String[] args) {
       
        String text = "John.Davidson/05051988/Belgrade Michael.Barton/01011968/Krakov Ivan.Perkinson/23051986/Moscow";
        String[] str = text.split("[./ ]");
      
        List<Person> person = new ArrayList<Person>();
        for (int i=0; i<str.length;i+=4){
           String ime=str[i];
           String prezime=str[i+1];
           String datumRodjenja=str[i+2];
           String mestoRodjenja=str[i+3];
           
           DateTimeFormatter dtf = DateTimeFormatter.ofPattern("ddMMyyyy");
           LocalDate datum = LocalDate.parse(datumRodjenja, dtf);
           Person prs=new Person(ime, prezime, datum, mestoRodjenja);
        person.add(prs);
        }
        for (Person p: person){
            System.out.println(p); 
            }
    }
}
    

