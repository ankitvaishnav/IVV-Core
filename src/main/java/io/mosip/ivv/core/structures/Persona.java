package main.java.io.mosip.ivv.core.structures;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Persona {
    public String group_name = "";
    public String persona_class = "";
    public ArrayList<Person> persons = new ArrayList<>();
    public void addPerson(Person pr){
        persons.add(pr);
    }
}
