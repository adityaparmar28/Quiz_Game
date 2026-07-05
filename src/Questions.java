import java.util.Scanner;

class Questions
{
    String Question;    //Questions of Subject
    String[] options;   //Options Array of Que.
    char CorrectAns; 	//Question's Correct Answer.
    char ans; 			//Input answer
    static int AtpQ=0; 			//Initial Attempted Questions
    static int CorQue=0; 	//initial Correct Answer

    Scanner sc=new Scanner(System.in);

    //>>>Questions Constructor & Display....
    Questions(String Q, String[] MCQ, char CAns)
    {
        this.Question=Q;
        this.options=MCQ;
        this.CorrectAns=CAns;
        QuestionD();
    }

    void QuestionD() //Question Display....
    {
        System.out.println(Question);
        for(String option:options)
        {
            System.out.println(option);
        }
        System.out.print("Enter Answer: ");
        ans=sc.next().charAt(0);
        AtpQ++;
        AnsCheck();
    }

    //>>>Answer Checking....
    void AnsCheck()
    {
        if(CorrectAns==ans)
        {
            CorQue++;
        }
        else
        {
            return;
        }
    }
}