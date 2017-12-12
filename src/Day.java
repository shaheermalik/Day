// Author Shaheer Malik


// create the class day

public class Day {

    public String [] dayOfWeek={"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

    //attribute for day

    private int day;





     //This is the default constructor



    public Day(){

        day=0;

    }







     // The day Constructor w/ 1 parameter



    public Day(int day){

        this.day = day;

    }






    //Parameter for day method



    public void setDay(int day){

        this.day = day;

    }





//     *return method for get day





    public String getDay(){

        return dayOfWeek[this.day];

    }





     //return method for next day





    public String nextDay(){

        return dayOfWeek[(this.day+1)%7];

    }



// return for previous day


    public String previousDay(){

        if ((this.day-1)%7==-1){

            return dayOfWeek[6];

        } else{

            return dayOfWeek[(this.day-1)%7];

        }

    }

    // return for added day

    public String addDay(int day){

        return dayOfWeek[(this.day+day)%7];

    }

    public String toString(){

        return ("The day is "+dayOfWeek[this.day]);

    }

}