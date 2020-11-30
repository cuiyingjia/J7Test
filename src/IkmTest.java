import java.util.SortedSet;
import java.util.TreeSet;

public class IkmTest {
    public static void main(String[] args) {
        SortedSet<ElementComparable> s = new TreeSet<ElementComparable>();
        s.add(new ElementComparable(15));
        s.add(new ElementComparable(10));
        s.add(new ElementComparable(25));
        s.add(new ElementComparable(10));
        System.out.println(s.first()+" "+s.size());
    }
}
