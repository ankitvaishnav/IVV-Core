package main.java.io.mosip.ivv.core.base;

import main.java.io.mosip.ivv.core.structures.Scenario;
import main.java.io.mosip.ivv.core.structures.Store;

public interface StepInterface {
    void setState(Store s);
    void run(Scenario.Step step);
}
