package doors;

public class Door {

    private int number;

    private boolean status;


    public boolean getStatus(){
        return status;
    }

    public int getNumber(){
        return number;
    }

    public Door(int index){
        number = index;
        status = false;
    }

    public void passDoor() {
        status = !status;
    }
}
