/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 7ekmaz
 */
public class Course extends Schedule implements Comparable<Course> {
    private int code;
    private float price;
    static float [] course_price;/*SOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOS*/
    

    
    static int num_students_math=0;       
    static int num_students_philosophy=0;
    static int num_students_logic_design=0;
    static int num_students_embedded_systems=0;
    static int num_students_advanced_programming=0;
    static int num_students_computer_organization=0;
    static int num_students_computer_architecture=0;
            
    /*
    1--->Math
    2--->Philosophy
    3--->LogicDesign
    4--->EmbeddedSystems
    5--->AdvancedProgramming
    6--->ComputerOrganization
    7--->ComputerArchitecture
    */
    
    
    Course(){}
    
    
    Course(int code)
    {
        this.code=code;
        switch(code)
        {
            case 1:num_students_math++;                     break;
            case 2:num_students_philosophy++;               break;
            case 3:num_students_logic_design++;             break;
            case 4:num_students_embedded_systems++;         break;
            case 5:num_students_advanced_programming++;     break;
            case 6:num_students_computer_organization++;    break;
            case 7:num_students_computer_architecture++;    break;  
        }
    }
    
    
    public void    SetCoursePrice(float price,int code)    {course_price[code-1]=this.price;}
    public float   GetCoursePrice(int code)               {return course_price[code-1];}
    
    public int     GetCourseCode()                    {return this.code;}
    
    
    public void info()
    {
         switch(code)
        {
            case 1:
                System.out.println("Course Name: Math" + "Course Code: 1" + "Course Price: " + price);
                GetSchedule(code);
                break;
            case 2:
                System.out.println("Course Name: philosophy" + "Course Code: 2" + "Course Price: " + price); 
                GetSchedule(code);
                break;
           case 3:
                System.out.println("Course Name: logic_design" + "Course Code: 3" + "Course Price: " + price); 
                GetSchedule(code);
                break;     
            case 4:
                System.out.println("Course Name: embedded_systems" + "Course Code: 4" + "Course Price: " + price);
                GetSchedule(code);
                break;
            case 5:
                System.out.println("Course Name: advanced_programming" + "Course Code: 5" + "Course Price: " + price); 
                GetSchedule(code);
                break;
            case 6:
                System.out.println("Course Name: computer_organization" + "Course Code: 6" + "Course Price: " + price); 
                GetSchedule(code);
                break;
            case 7:
                System.out.println("Course Name: computer_architecture" + "Course Code: 6" + "Course Price: " + price); 
                GetSchedule(code);
                break;    
                
        }
    } 

    
    @Override
   
    public int compareTo(Course c) {
        if (code > c.code)
        return 1;
        else if (code < c.code)
        return -1;
        else
        return 0;
    }
    
}
