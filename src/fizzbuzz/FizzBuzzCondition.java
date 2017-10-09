package fizzbuzz;

public class FizzBuzzCondition {

    private final boolean condi;

    private final String result;


    public FizzBuzzCondition(boolean condi, String result) {
        this.condi = condi;
        this.result = result;
    }

    public boolean isCondi() {
        return condi;
    }

    public String getResult() {
        return result;
    }
}
