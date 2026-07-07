package Day_6.class_task;

public class NestedLoopPractice {
    public static void main( String [] args){
    for (int outer =1;outer <=5; outer++){
        for (int inner =1 ; inner<=outer;  inner++){ 
            System.out.print(inner);
        }
        System.out.println();
    }
    }
}
