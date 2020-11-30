public class Parent {
    public int getLocalCode(){
        int i = 0;
        return i;
    }

    protected static int count =0;
    public Parent(){
        count++;
    }
    static int getCount(){
        return count;
    }
}
