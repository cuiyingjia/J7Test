public class Child extends Parent{

    @Override
    public int getLocalCode (){
        return 0;
    }

    public Child(){count++;}

    public static void main(String[] args) {
        System.out.println("Count = " +getCount());
        Child obj = new Child();
        System.out.println("Count = "+ getCount());
    }

}
