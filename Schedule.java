/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 7ekmaz
 */
public class Schedule  {
    
    private String day;
    private String hour;
    
    public static String[][]course_schedule;
    
    public void SetSchedule(String day,String hour,int code)
    {
        course_schedule[code][0]=day;
        course_schedule[code][1]=hour;
        
    }
    
    
    public void GetSchedule (int code)
    {
        
        System.out.println("The Day of the Course is on "+course_schedule[code-1][0]+"and at  "+course_schedule[code-1][1]);
        
    }
    
    
    
}
