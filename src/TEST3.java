public class TEST3 {
    public static void main(String[] args) {
        Long l = new Long(1234);
        Long l1 = l;
        if(l==l1)
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
        l++;
        if(l==l1)
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
    }
}
