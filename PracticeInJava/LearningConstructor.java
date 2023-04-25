public class LearningConstructor{
    private String name; // TODO: THIS IS A VARIABLE NAME OF TYPE STRING
    private int year; // TODO: THIS IS A VARIABLE YEAR OF TYPE INT
    public LearningConstructor (String name, int year){ // TODO: THIS IS A CONTRUCTOR THAT I CREATED
        name = "Ebube";
        year = 23;
    }
    public static void main(String[] args){
        LearningConstructor constructor = new LearningConstructor("Ebube", 23); // TODO: THIS IS AN OBJECT THAT I CREATED
        System.out.println("I am " + constructor.name + " " + " and i am " + constructor.year + " year old");
    }
}