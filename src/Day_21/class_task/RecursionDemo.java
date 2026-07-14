package Day_21.class_task;

public class RecursionDemo {
    public static void main(String[] args) {
        int num = 5;
        fun(num);
    }

    public static void fun(int a){
        if(a==0){
            return;
        }
        System.out.println(a--);
        fun(a);
    }
}
