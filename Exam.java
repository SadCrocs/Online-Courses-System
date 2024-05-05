/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 7ekmaz
 */
class Exam {
    private String code;
    private TimeSlot ts;
    private int num;
    public Exam (String c, TimeSlot t,  int n) {
        this.code=c;
        this.ts=t;
        this.num=n;
    }
    public void print() {
        System.out.println("Code:"+this.code);
        System.out.println("TimeSlot:");
        this.ts.print();
        System.out.println("Number of students:"+this.num);
    }


    private boolean hasConflictWith(Exam e) {
        if(this.code==e.code)                    return false;
        if(this.ts.getDay()!=e.ts.getDay())      return false;   
        if(this.ts.getMonth()!=e.ts.getMonth())  return false;
        if(this.ts.getSlot()!=e.ts.getSlot())    return false;

    return true;
    }




    
}
