package paczka;
import java.util.ArrayList;
import java.util.List;

public class RasaLista //klasa tworząca listę
	{

    public List RasaList(RasaTyp type)
    	{

        List rasa = new ArrayList(); //stworzenie listy, poniżej warunki sprawdzające nasz wybór odnośnie zwierzęcia

        if(type.equals(RasaTyp.KURA))
        	{
        	rasa.add("Minorka"); //dodanie elementów do listy jeśli wybierzemy kurę
        	rasa.add("Ankona");
        	rasa.add("Domowa");
        	rasa.add("Sułtan");
        	rasa.add("Serema");
        	rasa.add("Sumatra");
        	rasa.add("Nankin");
        	rasa.add("Orloff");
        	}
        
        else if(type.equals(RasaTyp.PIES))
        	{
        	rasa.add("Owczarek Niemiecki");
        	rasa.add("Pudel");
        	rasa.add("Labrador");
        	rasa.add("Jamnik");
        	rasa.add("Rottweiler");
        	rasa.add("Bokser");
        	rasa.add("Maltańczyk");
        	rasa.add("Doberman");
        	}
        
        else if(type.equals(RasaTyp.KOT))
        	{
        	rasa.add("Syjamsk");
        	rasa.add("Sfinks Doński");
        	rasa.add("Bengalski");
        	rasa.add("Abisyński");
        	rasa.add("Perski");
        	rasa.add("Syberyjski");
        	rasa.add("Szkocki Zwisłouchy");
        	rasa.add("Orientalny Krótkowłosy");
        	}
        
        else if(type.equals(RasaTyp.OWCA))
        	{
        	rasa.add("Leine");
        	rasa.add("Kamieniecka");
        	rasa.add("Ile de france");
        	rasa.add("Owca Fryzyjska");
        	rasa.add("Dorset Horn");
        	rasa.add("Czarnogłówka");
        	rasa.add("Corriedale");
        	rasa.add("Białogłowa Owca Mięsna");
        	}
        return rasa;  //zwrócenie wyniku listy
    }
}