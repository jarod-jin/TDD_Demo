package leapyears;

public class CheckCondition {

    private final boolean match;

    private final String result;


    public CheckCondition(boolean match, String result) {
        this.match = match;
        this.result =  result;
    }

    public boolean isMatch() {
        return match;
    }

    public String getResult() {
        return result;
    }
}
