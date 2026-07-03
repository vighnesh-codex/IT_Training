package Day_10.class_task;

public class StaticVariable {
    public static void main(String [] args){
        AiDsStudent s1 = new AiDsStudent();
        AiDsStudent s2 = new AiDsStudent();
        s1.name =" riswath";
        s2.name =" vishnu";
        s1.id =1;
        s2.id =2;
        s1.doHackathon();

    }
}


class AiDsStudent{ 
    String name ;
    int id;
    static  String dept =" Ai Ds" ;
    public static void readDeptName(){
        System.out.print(dept);
    }
    public  void doHackathon(){
        System.out.print("Doing hackathon ");
        System.out.print(id);
        System.out.print( name);
        System.out.print( dept);
    }
}
