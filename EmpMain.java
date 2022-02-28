package com;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpMain {

    public static void main(String[] args) {

        Emplll E1 = new Emplll("Vamsi","Banka",25,343400);
        Emplll E2 = new Emplll("Rohith","Banka",22,354020);
        Emplll E3 = new Emplll("Manu","Pathrudu",22,365700);
        Emplll E4 = new Emplll("Tanu","Pathrudu",20,370800);
        Emplll E5 = new Emplll("Likitha","Malarouthu",19,380070);

        ArrayList<Emplll> employeelist = new ArrayList<>();

        employeelist.add(E1);
        employeelist.add(E2);
        employeelist.add(E3);
        employeelist.add(E4);
        employeelist.add(E5);
        EmpMain em=new EmpMain();

        em.employeedetails(employeelist);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter lastname of employee:");
        String lastname= sc.nextLine();
        em.empdetailsbylastname(employeelist,lastname);
        em.maxsalary(employeelist);
        em.avgagee(employeelist);


        }
        public void employeedetails(ArrayList<Emplll> employeelist){
            for (Emplll e : employeelist){
                System.out.println("First Name : " + e.firstname + " , Last Name : "+ e.lastname + " , Age : "+e.age+" , Salary : " + e.salary);
            }
        }
        public void empdetailsbylastname(ArrayList<Emplll> employeelist,String lastname){
        for(Emplll f: employeelist){
            if(lastname.equals(f.lastname)){
                System.out.println("Details of employee:"+"First Name : " + f.firstname + " , Last Name : "+ f.lastname + " , Age : "+f.age+" , Salary : " + f.salary);
            }
        }
        }
        public void maxsalary(ArrayList<Emplll> employeelist){
        double max=0;
        String mname="";
        for(Emplll s:employeelist){
            if(s.salary>max){
                max=s.salary;
                mname=s.firstname;
            }
        }
            System.out.println("Maximum salary of employees "+max+ " "+mname);
        }
        public void avgagee(ArrayList<Emplll> employeelist){
        int agee=0;
        int count=0;
        int old=0;

        String oname="";
        for(Emplll g:employeelist){
            agee=agee+g.age;
            count++;
            if(g.age>old){
                old=g.age;
                oname=g.firstname;
            }
        }
            System.out.println("Average age of employees: "+(agee/count));
            System.out.println("oldest employee: "+old+" "+ oname);
            int young=(agee/count);
            String yname="";
        for(Emplll h:employeelist){
            if(h.age<young){
                young=h.age;
                yname=h.firstname;
            }
        }
            System.out.println("Youngest employee: "+yname+" "+young);

        }


    }

