package main.java.io.mosip.ivv.core.structures;

import java.util.ArrayList;
import java.util.List;

public class Persona {
    public String group_name = "";
    public String persona_class = "";
    public ArrayList<Person> persons = new ArrayList<>();
    public void addPerson(Person pr){
        persons.add(pr);
    }
}
