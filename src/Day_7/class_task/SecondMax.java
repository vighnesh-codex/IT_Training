package Day_7.class_task;

public class SecondMax {

   public static void main(String args[]){
    int arr []  = {1,2,3,4,5};
    int max =0;
    int secondMax =0;

    for (int i=0; i<arr.length; i++){

        if(arr[i]>max){
            secondMax=max;
            max=arr[i];}
            else if(arr[i] > secondMax && arr[i]!=max){
                secondMax = arr[i];
            }
            }
        System.out.println("Second Largest ="+ secondMax);
    }
   }