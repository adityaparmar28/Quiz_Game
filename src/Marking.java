/*
 * Copyright 2026 MR. ADITYA PARMAR
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

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