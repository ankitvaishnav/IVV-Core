package main.java.io.mosip.ivv.core.structures;

import io.restassured.response.Response;

public class CallRecord {

    public String type = "HTTP";
    public String method = "";
    public String input_data = "";
    public Response response = null;
    public String status = "";
    public int statusCode;

    public CallRecord(String method, String input_data, Response response, String status) {
        this.method = method;
        this.input_data = input_data;
        this.response = response;
        this.status = status;
        this.statusCode = response.getStatusCode();
    }
}
