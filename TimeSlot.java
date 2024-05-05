/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 7ekmaz
 */
public class TimeSlot {
    private int day;
    private int month;
    private int slot;
    public TimeSlot(int d, int m, int s){
        this.day=d;
        this.month=m;
        this.slot=s;
    }
    public void print() {
        System.out.println("Day:"+this.day);
        System.out.println("Month:"+this.month);
        System.out.println("Slot Number:"+this.slot);
        }
        public int getDay() {return this.day;}
        public int getMonth() {return this.month;}
        public int getSlot() {return this.slot;}
}

