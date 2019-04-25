package main.java.io.mosip.ivv.core.structures;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Persona {
    private String id = "";
    private String groupName = "";
    private String personaClass = "";
    private ArrayList<Person> persons = new ArrayList<>();
    public void addPerson(Person pr){
        persons.add(pr);
    }
}
