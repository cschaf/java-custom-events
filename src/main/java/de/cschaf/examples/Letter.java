package de.cschaf.examples;

/**
 * Created by cschaf on 30.03.2015.
 */
public class Letter {
    private String headline;
    private String body;
    private String signature;

    public Letter(String headline, String body, String signature){
        this.headline = headline;
        this.body = body;
        this.signature = signature;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }
    @Override
    public String toString(){
        String result = "";
        result += this.getHeadline() + ",\n";
        result += this.getBody() +"\n\n";
        result += this.getSignature() + "\n";
        return result;
    }
}
