package group4.tcss450.uw.edu.grocerypal450.models;

import com.google.gson.Gson;

/**
 * This class is used by GSON as a model for a JSON response from the web service.
 */
public class Response {

    private String message;
    private String error_msg;
    private boolean error;
    private Object user;

    public String getMessage() {
        return message;
    }

    public String getErrorMsg() {
        return error_msg;
    }
    public boolean getError() {
        return error;
    }


}
