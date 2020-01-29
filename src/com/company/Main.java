package com.company;

public class Main {

    public static void main(String[] args) {
        SimpleGUI app = new SimpleGUI();
        app.setVisible(true);


   Person kriss = new Person(110,"mAx");
    System.out.println(kriss.name + kriss.height);
    Person max = new Person();
    System.out.println(max.height);
    max.say("max");
        Person dim = new Person("dim");
        System.out.println(dim.name);
        dim.say("dim");

        Student fresman = new Student(66, "kk", 2);
     fresman.tell();

/*
 Comp compt = new Comp();
 compt.i7.start();
 compt.rr.start();
 compt.rr.shutdown();
*/
/*new Comp (){
   void superComp () {
       this.i7.start();
   }*/


/*Shape tr = new Square();
tr.drow();*/
}
         }

