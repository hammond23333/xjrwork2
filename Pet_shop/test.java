import java.time.LocalDate;
import java.util.ArrayList;

public class test {


    public static void main(String[] args) {



        Tudog dog1 = new Tudog("dog1",2,"man",true);
        Tudog dog2 = new Tudog("dog2",2,"man",false);
        Tudog dog3 = new Tudog("dog3",4,"woman",true);
        Tudog dog4= new Tudog("dog4",4,"woman",true);
        Tudog dog5= new Tudog("dog5",4,"woman",true);


        Cat cat=new Cat();

        Cat cat1=new Cat("cat1",2,"man");
        Cat cat2=new Cat("cat2",2,"woman");

        Rabbit rabbit1=new Rabbit("rabbit1",2,"man",100);



        Customer customer1 = new Customer("1",0, LocalDate.now(),0);
        Customer customer2 = new Customer("2",0, LocalDate.now(),0);
        Customer customer3 = new Customer("3",0, LocalDate.now(),0);

        MyAnimalShop myAnimalShop = new MyAnimalShop();
        myAnimalShop.setAnimalArrayList(new ArrayList<Animal>());
        myAnimalShop.setCustomerArrayList(new ArrayList<Customer>());

        myAnimalShop.setMoney(500);
        try{
            myAnimalShop.buyAnimal(dog1);
            myAnimalShop.buyAnimal(dog2);
            myAnimalShop.buyAnimal(dog3);
            myAnimalShop.buyAnimal(dog4);
            myAnimalShop.buyAnimal(dog5);

        } catch (InsufficientBalanceException e) {
            e.printStackTrace();
        }

        System.out.println(myAnimalShop.getAnimalArrayList());

        System.out.println("提示：招待客人");
        try{
            myAnimalShop.serve_custom(customer1);
            myAnimalShop.serve_custom(customer2);
            myAnimalShop.serve_custom(customer3);

        } catch (AnimalNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(myAnimalShop.getAnimalArrayList());

        myAnimalShop.close();

    }
}
