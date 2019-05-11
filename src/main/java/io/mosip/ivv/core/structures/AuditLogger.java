package main.java.io.mosip.ivv.core.structures;

import static main.java.io.mosip.ivv.core.structures.AuditLogger.types.ERROR;

public class AuditLogger {
    public enum types {
        ERROR, WARNING, INFO
    };
    private types type;
    private String msg;
    public AuditLogger(types t, String m){
        this.type = t;
        this.msg = m;
    }
}
