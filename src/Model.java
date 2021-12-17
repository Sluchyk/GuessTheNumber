import java.util.ArrayList;
import java.util.List;

class Model
{
    private  int min;
    private  int max;
private int number;
    private List<Integer> yourWay = new ArrayList<Integer>();
public void setNumber()
{
    number= (int)Math.ceil( (Math.random() * (max - min + 1) +min));
}

    public boolean checkValue (int value){
        yourWay.add(value);
        if (value == number){
            return false;
        } else if (value > number){
            max= value;
        } else {
            min = value;
        }
        return true;
    }
    public void  setBarier(int min,int max)
    {
        this.min=min;
        this.max=max;

    }
int getNumber()
{
 return  number;
}
    public int getMin() {
        return min;
    }
    public int getMax() {
        return max;
    }
    public List<Integer> getYourWay() {
        return yourWay;
    }

}