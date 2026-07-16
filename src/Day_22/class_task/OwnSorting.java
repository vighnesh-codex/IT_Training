package Day_22.class_task;
 
public class OwnSorting {
    public static void main(String[] args) {
        int [] arr={3,1,2,56,3,223456,321435};
        Sort(arr);
        //.
        
    }

    public static void Sort(int [] a){
        int b =a.length;
        int temp;
        for (int i =0;i<b;i++){
            for (int j =i;j<b;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                    for(int k =0;k<b;k++){
                        System.out.print(a[k]+" ");
                    }System.out.println();
                }
            }
        }
        
    }
}
