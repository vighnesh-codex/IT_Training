package Day_6.class_task;

public class Schedule {


    public static void main(String[] args) {



        int daysCompleted =0;
for(int month =1;month <=12;month++)


       // {  if (month == 2){break;}
            for (int week = 1; week <= 4; week++) { //one month loop


if (month ==2){continue;}

                for (int day = 1; day <= 7; day++) { // one week loop



                    System.out.println(  "month "+ month+" week" + week + " day " + day +  "days completed :"+ ++daysCompleted);
                    System.out.println(" come to college " +
                            "  study and go home   ");



                }


            }

        }





    }

