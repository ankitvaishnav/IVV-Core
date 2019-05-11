package main.java.io.mosip.ivv.core.structures;

import com.aventstack.extentreports.Status;

public class ExtentLogger {
    private Status type;
    private String msg;
    public ExtentLogger(Status t, String m){
        this.type = t;
        this.msg = m;
    }
}
