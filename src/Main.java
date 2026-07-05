import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        //>>>Variable
        char RegCan; //Registered candidate status

        //>>>Candidate Object Creation...

        CandidateD a=new CandidateD();

        //>>>Candident signin & SignUp Choice....

        System.out.print("Are You Registered Candidate or Not??? (Yes/No): ");
        RegCan=sc.next().charAt(0);

        if(RegCan=='Y' | RegCan=='y')
        {
            a.userLogin();
            if(a.status==true)
            {
                return;
            }
            else
            {
                System.out.println("Couldn't find Candidate Account..!!");
                System.out.println("Register First....");
                a.userSignUp();
                a.userLogin();
                return;
            }
        }

        else if(RegCan=='N' | RegCan=='n')
        {
            a.userSignUp();
            a.assign();
            a.userLogin();
            //new Marking().Calculate();

            if(a.status==true)
            {
                return;
            }
        }
    }
}