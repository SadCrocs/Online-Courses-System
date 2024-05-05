/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 7ekmaz
 */
abstract public class Member {
    
    private String name;
    private String email;
    private int id;
    
    Member(String name,String email,int id)
    {
        this.name=name;
        this.email=email;
        this.id=id;/////////////////////////////////////////////////////////////ُException Handling
    }
    
    
    public String GetName()              {return this.name;}
    public void SetName(String name)     {this.name=name;}
    
    public String GetEmail()             {return this.email;}
    public void SetEmail(String email)   {this.email=email;}
 
    public int GetID()                   {return this.id;}
    public void SetID(int id)            {this.id=id;}
               
}
