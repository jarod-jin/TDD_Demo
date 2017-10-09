package doors;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

/**
 * 100 doors
 100 doors in a row are all initially closed. You make
 100 passes by the doors. The first time through, you
 visit every door and toggle the door (if the door is
 closed, you open it; if it is open, you close it).
 The second time you only visit every 2nd door (door
 #2, #4, #6, ...). The third time, every 3rd door
 (door #3, #6, #9, ...), etc, until you only visit
 the 100th door.

 Question: What state are the doors in after the last
 pass? Which are open, which are closed?
 [Source http://rosettacode.org]
 */

public class DoorTest {

    Map<String,List<Integer>> check = new HashMap<String,List<Integer>>();

    private House createHouseAndInitPass(int num,int pass) {
        House house = new House(num);
        house.passDoors(pass);
        return house;
    }

    private void checkPut(List<Integer> value, List<Integer> value2) {
        check.put("OPENING", value);
        check.put("CLOSING", value2);
    }

    @Test
    public void one_door_one_pass() {
        checkPut(Arrays.asList(1), new ArrayList<>());
        Assert.assertEquals(check, createHouseAndInitPass(1, 1).getDoorsStatus());
    }


    @Test
    public void two_door_one_pass(){
        checkPut(Arrays.asList(1,2), new ArrayList<>());
        Assert.assertEquals(check, createHouseAndInitPass(2, 1).getDoorsStatus());
    }


    @Test
    public void two_door_two_pass(){
        checkPut(Arrays.asList(1), Arrays.asList(2));
        Assert.assertEquals(check, createHouseAndInitPass(2,2).getDoorsStatus());
    }

    @Test
    public void four_door_four_pass(){
        checkPut(Arrays.asList(1,4), Arrays.asList(2,3));
        Assert.assertEquals(check, createHouseAndInitPass(4,4).getDoorsStatus());
    }

    @Test
    public void ten_door_ten_pass(){
        checkPut(Arrays.asList(1, 4, 9), Arrays.asList(2, 3, 5, 6, 7, 8, 10));
        Assert.assertEquals(check, createHouseAndInitPass(10,10).getDoorsStatus());
    }

    @Test
    public void hundred_door_hundred_pass(){
        Assert.assertEquals(Arrays.asList(1, 4, 9, 16, 25, 36, 49, 64, 81, 100), createHouseAndInitPass(100,100).getDoorsStatus().get("OPENING"));
    }

}
