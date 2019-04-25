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
    public static class Step
    {
        private String name = ""; // needs to be passed
        private String variant = "DEFAULT"; // default
        private ArrayList<Assert> asserts;
        private ArrayList<Error> errors;
        private int AssertionPolicy = 0; // default
        private boolean FailExpected = false; //default
        private ArrayList<String> parameters;
        private ArrayList<Integer> index;

        public static class Error{
            public ErrorPolicy type;
            public ArrayList<ErrorPolicy> parameters = new ArrayList<>();
        }

        public static class Assert{
            public main.java.io.mosip.ivv.core.policies.AssertionPolicy type;
            public ArrayList<AssertionPolicy> parameters = new ArrayList<>();
        }

        public Step(){

        }

        public Step(String name, String variant, ArrayList<Assert> asserts, ArrayList<Error> errors, ArrayList<String> parameters, ArrayList<Integer> index)
        {
            this.name = name;
            this.variant = variant;
            this.asserts = asserts;
            this.errors = errors;
            this.parameters = parameters;
            this.index = index;
        }
    }

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
