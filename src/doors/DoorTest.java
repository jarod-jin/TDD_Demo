package doors;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;


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
