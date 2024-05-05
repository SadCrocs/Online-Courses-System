/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 7ekmaz
 */
public class Student extends Member {
    Schedule schedule ;
    int num_courses;
    int reg_courses=0;
    Course [] selected_courses;
    int [] Check={0,0,0,0,0,0,0};
    
    Student(String name,String email,int id,int n)
    {
        super (name,email,id);
        num_courses=n;
        Course [] selected_courses = new Course[3];
        /*Each Studeny has only 3 Courses*//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
    }
            
    
    /*This Function Show the allowed Courses For the Student To Select Between THEM*/
    public void ShowCourses()
    {
        System.out.println("These are the available Courses for register:");
        for(int i=0;i<7;i++)
        {
                 if(Check[i]==0 & i==0){System.out.println("Course name: Math"+"Code:1");}
            else if(Check[i]==0 & i==1){System.out.println("Course name: philosophy"+"Code:2");}
            else if(Check[i]==0 & i==2){System.out.println("Course name: LogicDesign"+"Code:3");}
            else if(Check[i]==0 & i==3){System.out.println("Course name: EmbeddedSystems"+"Code:4");}
            else if(Check[i]==0 & i==4){System.out.println("Course name: AdvancedProgramming"+"Code:5");}
            else if(Check[i]==0 & i==5){System.out.println("Course name: ComputerOrganization"+"Code:6");}
            else if(Check[i]==0 & i==6){System.out.println("Course name: ComputerArchitecture"+"Code:7");}
        }
        
        System.out.println("");
        
        
        if(num_courses==0){System.out.println("Please register in at least one Course....");}
        else
        {
            for(int i=0;i<num_courses;i++)
            {
                System.out.println("--->");
                (selected_courses[i]).info();
            }
        }
    }
    
    
    
    
    public void SelectCourse(Course selected_course)
    {
        if(num_courses>3)
        {
            System.out.println("Student Shouldn't Register into more than 3 Courses");
        }
        else{
             if(reg_courses<num_courses)
            {
            selected_courses[reg_courses]=selected_course;
            reg_courses++;
            Check[(selected_course.GetCourseCode())-1]=1;
            }
        }
    }
     
}
