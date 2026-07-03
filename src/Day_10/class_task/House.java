package Day_10.class_task;



public class House {
    String color ="skyblue";
    String owner ;

    
    public void  openDoors(){
        System.out.print("door opened");
    }
    public static void main(String [] args){
        House sHome = new House();
        House yugaHome = new House();
        sHome.owner ="satheesh";
        yugaHome.owner ="yuga";
        yugaHome.color ="pink";
        sHome.color =yugaHome.color;
        System.out.print( " The house owner " + sHome.owner + "and the  house color is "+ sHome.color);
    }
}