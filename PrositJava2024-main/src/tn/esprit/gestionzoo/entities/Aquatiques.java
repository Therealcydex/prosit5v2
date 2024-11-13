package tn.esprit.gestionzoo.entities;

public class Aquatiques extends Animal{
    String habitat;

    public Aquatiques(){

    }
    public void swim(){
        System.out.println("this aquatic animal is swimming");
    }
    public String toString(){
        //return "family:"+super.getFamily()+" name="+super.getName()+" age="+super.getAge()+" habitat"+this.habitat;
        return super.toString()+" habitat="+this.habitat;
    }

}