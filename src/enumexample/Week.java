package enumexample;

public class Week {
    Day day;
    public Week(){}
    public Week(Day day){
        this.day = day;
    }

    public void whatIsMyTask(){
        switch (day){
            case Monday:
                System.out.println("Home work java design part");
                break;
            case Tuesday:
                System.out.println("Home work Codelab exercises");
                break;
            case Wednesday:
                System.out.println("Codelab continue.....");
                break;
            case Thursday:
                System.out.println("Class-1 is in session at 7 pm");
                break;
            case Friday:
                System.out.println("Continue reading Core Java book/ data structure");
                break;
            case Saturday:
                System.out.println("Start practicing git-github");
                break;
            case Sunday:
                System.out.println("Class-2 is in session at 7 pm");
                break;
            default:
                System.out.println("Not a valid day");
                break;

        }
    }
}
