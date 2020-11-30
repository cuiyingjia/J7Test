public class ElementComparable implements Comparable{
    int id;
    ElementComparable (int id){
        this.id = id;
    }
    public int compareTo(Object obj){
        ElementComparable e = (ElementComparable)obj;
        return this.id - e.id;
    }
    public String toString(){
        return "" + this.id;
    }
}
