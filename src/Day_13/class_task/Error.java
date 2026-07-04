package Day_13.class_tast;
class Error{
    public static void main (String [] args){
        try{
            int a=10;
            int b=5;
            int c=5;
            int x =a/(b+c);
            System.out.println("x="+x);
            int y=a/(b-c);
            System.out.println("y="+y);
        }catch(Exception e){
            System.out.print("Denominator cannot be zero");
        }
    }
}