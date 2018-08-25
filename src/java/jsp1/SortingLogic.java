package jsp1;
import java.util.*;
public class SortingLogic implements Comparator<Customer>
{

    @Override
    public int compare(Customer t, Customer t1) 
    {
        int diff = t.id - t1.id;
        return diff;
    }
}
