import java.util.Scanner;

class Marking
{
    Scanner sc=new Scanner(System.in);

    int CorQue=Questions.CorQue;
    int AtpQ=Questions.AtpQ; 		//Attempted Que
    static int TotalQ=5;   	//Total Que
    double TOMarks;    	//Obtained Marks
    int TMark; 		//Total Marks
    double PR; 			//Percentage as per Obtained Marks

    //
    void Calculate()
    {
        TMark=AtpQ*2;
        TOMarks=(CorQue*2)-((AtpQ-CorQue)*1);
        PR=(TOMarks*100)/TMark;

        if(PR<0)
        {
            PR=0;
        }

        ResultD();
    }

    //
    void ResultD()
    {
        System.out.println("-----------------------------");
        System.out.println("-----| QUIZ RESULT |-----");
        System.out.println("Candidates Attempted Questions: "+AtpQ);
        System.out.println("Candidate Correct Answer: "+CorQue);
        System.out.println("Candidate Attempted Wrong Answer: "+(AtpQ-CorQue));
        System.out.println("Obtained Marks/Percentage: "+PR+"% Out of 100PR.");
    }

    Marking() 			//Marking constructor for all sub. result...
    {
        //>>>Calc method calling for Result....
        Calculate();
    }

}