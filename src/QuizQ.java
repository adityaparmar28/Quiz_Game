import java.util.Scanner;

class Quiz
{
    Scanner sc=new Scanner(System.in);
    int ch; //choice for subject

    void display()
    {

        boolean chh=false; //for invalid choice loop

        while(!chh)
        {
            System.out.println("------QUIZ SUBJECT LIST------");
            System.out.println("1. JAVA");
            System.out.println("2. GK");
            System.out.println("3. Software Engineering");
            System.out.println("4. Mathematics");
            System.out.println("5. Physics");
            System.out.println("6. Exit");
            System.out.println("-----------------------------");
            System.out.print("Enter Your Choice: ");
            ch = sc.nextInt();

            switch (ch)
            {
                case 1:
                {
                    QJava();
                    System.out.println("Java Quiz Completed....");
                    //chh=true;
                    break;
                }

                case 2:
                {
                    QGK();
                    System.out.println("GK Quiz is Completed....");
                    //chh=true;
                    break;
                }

                case 3:
                {
                    QSE();
                    System.out.println("Software Engineering Quiz Completed....");
                    //chh=true;
                    break;
                }

                case 4:
                {
                    QMaths();
                    System.out.println("Maths Quiz Completed....");
                    //chh=true;
                    break;
                }

                case 5:
                {
                    QPhy();
                    System.out.println("Physics Quiz Completed....");
                    //chh=true;
                    break;
                }

                case 6:
                {
                    Marking m=new Marking();
                    //m.Calculate();
                    System.out.println("Quiz Exiting.....");
                    return;
                }

                default:
                {
                    System.out.println("Enter valid Quiz Option...");
                    break;
                }
            }
        }
    }

    void QJava()
    {
        Questions Q1=new Questions
                (
                        "1. Entry point of JAVA is...",
                        new String[]{"A.start()","B.run()","C.main()","D.int()"},
                        'C'
                );

        Questions Q2=new Questions
                (
                        "2.Which key Word is used to inherit a class in JAVA???",
                        new String[]{"A.implement","B.inherits","C.extend","D.super"},
                        'C'
                );

        Questions Q3=new Questions
                (
                        "3.Which of this isn't JAVA future???",
                        new String[]{"A.Object Oriented","B.Portable","C.Use of Poiner","D.Secure"},
                        'C'
                );

        Questions Q4=new Questions
                (
                        "4.Which Data is used to Store Decimal value???",
                        new String[]{"A.int","B.float","C.char","D.boolean"},
                        'B'
                );

        Questions Q5=new Questions
                (
                        "5.Which Symbol is used to end a statement in JAVA???",
                        new String[]{"A.:","B..","C.;","D.,"},
                        'C'
                );

    }
    void QGK()
    {
        Questions Q6=new Questions
                (
                        "1.Who is known as the Father of the Indian Constitute???",
                        new String[]{"A. Mahatma Gandhi","B. Jawaharlal Nehru","C. Dr.B.R.Ambedkar","D. Sardar Patel"},
                        'C'
                );

        Questions Q7=new Questions
                (
                        "2.Which is the largest planet of our Solar System???",
                        new String[]{"A. Earth","B. Mars","C. Jupitar","D. Saturn"},
                        'C'
                );

        Questions Q8=new Questions
                (
                        "Who was the First President of India???",
                        new String[]{"A. Rajendra Prasad","B. Jawaharlal Nehru","C. Dr. A.P.J. Abdul Kalam","D. Sardar Patel"},
                        'A'
                );

        Questions Q9=new Questions
                (
                        "4. Which Country is known as the Land of the Rising Sun???",
                        new String[]{"A. China","B. Thailand","C. Japan","D. India"},
                        'C'
                );

        Questions Q10=new Questions
                (
                        "5. How many continents are there in the world???",
                        new String[]{"A. 5","B. 6","C. 7","D. 8"},
                        'C'
                );
    }

    void QSE()
    {
        Questions Q11=new Questions
                (
                        "1. Which of the following is not a Software Quility attributes???",
                        new String[]{"A. Reliability","B. Usability","C. Scalability","D. Compilatiton"},
                        'D'
                );
        Questions Q12=new Questions
                (
                        "2.Which testing techniques check the internal logic of the program???",
                        new String[]{"A. Black Box Testing","B. Unit Testing","C. White Box Testing","D. Acceptence Testing"},
                        'C'
                );
        Questions Q13=new Questions
                (
                        "3. Which SDLC model is also kknown as the Linear Sequenctial Model???",
                        new String[]{"A. Spiral Model","B. Waterfall Model","C. Agile Model","D. V- Model"},
                        'B'
                );
        Questions Q14=new Questions
                (
                        "4. Which of the following is the first phase of the Software Devlopment Life Cycle(SDLC)???",
                        new String[]{"A. Design","B. Coding","C. Requirement Analysis","D. Testing"},
                        'C'
                );
        Questions Q15=new Questions
                (
                        "5. What does SRS stand for in Software Engineering???",
                        new String[]{"A. Software Requirement Specification","B. System Resource Software","C. Software Result Sheet","D. System Recuirement Solution"},
                        'A'
                );
    }

    void QMaths()
    {
        Questions Q16=new Questions
                (
                        "1. What is the value of 15^2 - 5^2???",
                        new String[]{"A. 200","B. 225","C. 250","D. 275"},
                        'A'
                );
        Questions Q17=new Questions
                (
                        "2. If x + 5 = 12, What was the value of X???",
                        new String[]{"A. 5","B. 7","C. 12","D. 17"},
                        'B'
                );
        Questions Q18=new Questions
                (
                        "3. What is the LCM of 6 and 8???",
                        new String[]{"A. 12","B. 18","C. 24","D. 48"},
                        'C'
                );
        Questions Q19=new Questions
                (
                        "4. What is the area of a circle with radious 7cm???",
                        new String[]{"A. 44 cm^2","B. 154 cm^2","C. 308 cm^2","D. 98 cm^2"},
                        'B'
                );
        Questions Q20=new Questions
                (
                        "5. If a triangle has sides 3 cm, 4 cm, and 5 cm, it's a....",
                        new String[]{"A. Equilateral Triangle","B. Isosceles Triangle","C. Right-angled Triangle","D. Scalene Triangle"},
                        'C'
                );
    }

    void QPhy()
    {
        Questions Q21=new Questions
                (
                        "1. What is the SI unit of Force???",
                        new String[]{"A. Joule","B. Newton","C. Pascal","D. Watt"},
                        'B'
                );
        Questions Q22=new Questions
                (
                        "2. Which of the following is a scalar quantity???",
                        new String[]{"A. Velocity","B. Acceleration","C. Force","D. Speed"},
                        'D'
                );
        Questions Q23=new Questions
                (
                        "3. Which law states that for every action there is an equal and opposite reaction???",
                        new String[]{"A. Newton's First law","B. Newton's Second law","C. Newton's Third law","D. Law of Gravitation"},
                        'C'
                );
        Questions Q24=new Questions
                (
                        "4. What is the SI unit of electric current???",
                        new String[]{"A. Volt","B. Ampere","C. Ohm","D. Coulomb"},
                        'B'
                );
        Questions Q25=new Questions
                (
                        "5. Which device converts electrical energy into mechanical energy???",
                        new String[]{"A. Generator","B. Transformer","C. Electric Motor","D. Battery"},
                        'C'
                );
    }
}