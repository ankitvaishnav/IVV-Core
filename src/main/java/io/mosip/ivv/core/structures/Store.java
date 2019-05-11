package main.java.io.mosip.ivv.core.structures;

import org.springframework.context.ApplicationContext;

import java.util.HashMap;

public class Store {
    public HashMap<String, String> globals;
    public HashMap<String, String> configs;
    public Scenario.Data personaData;
    public HashMap<String, String> httpData;
    public ApplicationContext regApplicationContext;
}
