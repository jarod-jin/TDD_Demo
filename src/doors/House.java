package doors;

import java.util.*;
import java.util.stream.IntStream;

public class House {

    private List<Door> doors;


    public House(int num){
        doors = new ArrayList<Door>();
        for(int i=1;i<num+1;i++ ){
            doors.add(new Door(i));
        }
    }


    public void passDoors(int i) {
        IntStream.range(0,i).forEach(index->{
            doors.stream().filter(door->door.getNumber()%(index+1)==0).forEach(Door::passDoor
            );
        });
    }

    public Map getDoorsStatus() {
        return new HashMap<String,List>(){{
            put("OPENING",getDoorsNumByStatus(true));
            put("CLOSING",getDoorsNumByStatus(false));
        }};
    }

    private List<Integer> getDoorsNumByStatus(boolean status) {
        return new ArrayList<Integer>(){{
            doors.stream().filter(door->door.getStatus()==status).forEach(door ->
                add(door.getNumber())
            );
        }};
    }
}
