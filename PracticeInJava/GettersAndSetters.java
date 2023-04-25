public class GettersAndSetters {
    public static void main(String [] args) {
        GettersAndSetters SettingAndGetting = new GettersAndSetters();
        SettingAndGetting.setName("Ebube John Enyi");
        SettingAndGetting.setAge(21);
        SettingAndGetting.setHeight(6.5);

        System.out.println("My name is " + SettingAndGetting.getName());
        System.out.println("And I am " + SettingAndGetting.getAge() + " Years Old");
        System.out.println("And " + SettingAndGetting.getHeight() + " Foot Tall ");
    }
    private String name;
    private int age;
    private double height;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge (int age){
        this.age = age ;
    }
    public int getAge(){
        return age;
    }

    public void setHeight(double height){
        this.height = height;
    }
    public double getHeight(){
        return height;
    }
}

