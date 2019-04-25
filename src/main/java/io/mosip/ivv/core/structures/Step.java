package main.java.io.mosip.ivv.core.structures;

import lombok.Getter;
import lombok.Setter;
import main.java.io.mosip.ivv.core.policies.AssertionPolicy;
import main.java.io.mosip.ivv.core.policies.ErrorPolicy;

import java.util.ArrayList;

@Getter
@Setter
public class Step
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
        public ArrayList<String> parameters;
        public Error(ErrorPolicy t, ArrayList<String> p) {
            this.type = t;
            this.parameters = p;
        }
    }

    public static class Assert{
        public main.java.io.mosip.ivv.core.policies.AssertionPolicy type;
        public ArrayList<String> parameters;
        public Assert(AssertionPolicy t, ArrayList<String> p) {
            this.type = t;
            this.parameters = p;
        }
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