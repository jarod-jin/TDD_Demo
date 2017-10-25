package fizzbuzz;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class FizzBuzz {

    private int step;

    private StringBuilder stringBuilder = new StringBuilder();

    public FizzBuzz(int _step) {
        step = _step;
    }

    public String printFizzBuzz() {
        IntStream.range(1,step+1).forEach(num->{
            getResultFromCondition(num);
        });
        return stringBuilder.toString();
    }

    private void getResultFromCondition(int num) {
        new ArrayList<FizzBuzzCondition>(){{
            add(new FizzBuzzCondition((num%3==0),"Fizz"));
            add(new FizzBuzzCondition((num%5==0), "Buzz"));
            add(new FizzBuzzCondition((num%3!=0 && num%5!=0), String.valueOf(num)));
            add(new FizzBuzzCondition((num < step), "\n"));
        }}.stream().filter(FizzBuzzCondition::isCondi).forEach(condition->stringBuilder.append(condition.getResult()));
    }
}
