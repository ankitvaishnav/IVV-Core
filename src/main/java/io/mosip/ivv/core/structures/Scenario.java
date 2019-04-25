package main.java.io.mosip.ivv.core.structures;

import lombok.Getter;
import lombok.Setter;
import main.java.io.mosip.ivv.core.policies.AssertionPolicy;
import main.java.io.mosip.ivv.core.policies.ErrorPolicy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Getter
@Setter
public class Scenario {
    private String id = "";
    private String name = "";
    private String description = "";
    private ArrayList<String> tags = new ArrayList();
    private String personaClass, groupName;

    @Getter
    @Setter
    public static class Data
    {
        private String personaClass,tag,groupName;
        private Persona persona;
        private Persona operator;
        private Persona supervisor;
        private Persona user;
        private HashMap<String, String> globals;
        private HashMap<String, String> configs;
    }

    private List<Step> steps = new ArrayList<Step>();
    private Data data = null;
    private boolean continueOnFailure = false; // default
    private boolean isFailureExpected = false; // default
}
