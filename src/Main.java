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