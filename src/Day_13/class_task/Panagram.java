package Day_13.class_task;

public class Panagram {
    public static void main(String[] args) {
        String s="the quick brown fox jumps over the lazy dog";
        int count =0;
        for (int i=0;i<s.length();i++){
            for(int j =0;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }
            }
        }
    }
}