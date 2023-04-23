public class CarApplication {

    // TODO: THIS EXERCISE IS FOR DEITEL CHAPTER 3 (PAGE 154: EX = 3.13)


    private String name;
    private String year;
    private double price;


    public void setName (String name){
        this.name = name;
    }
    public String getName (){
        return  name;
    }

    public void setYear (String year){
        this.year = year;
    }
    public String getYear(){
        return year;
    }

    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return price;
    }
    public static void main(String[] args){



        CarApplication BMW = new CarApplication();
        CarApplication Benz = new CarApplication();

        BMW.setName("B.M.W");
        Benz.setName("Mecerdez Benz");
        Benz.setYear("Two years old");
        BMW.setYear("One year old ");
        BMW.setPrice(2.3);
        Benz.setPrice(5.4);

        System.out.println("The car name is " + BMW.getName() + " and its " + BMW.getYear() + " Sold for " + BMW.getPrice() + " million naira only");
        System.out.println("The car name is " + Benz.getName() + "and its " + Benz.getYear() + " Sold for " + Benz.getPrice() + " million naira only");

        System.out.println(BMW.getPrice() * 5/100 + " 5% Discount applied to BMW price here");
        System.out.println(Benz.getPrice() * 7/100 + " 7% Discount applied to Mercerdez Benz price here");

    }

}
