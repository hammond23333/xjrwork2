import java.time.LocalDate;
import java.util.ArrayList;


public class MyAnimalShop implements AnimalShop{

    private double money;
    private ArrayList<Animal> animalArrayList;
    private ArrayList<Customer> customerArrayList;
    private Boolean isWork;

    public MyAnimalShop(double money, ArrayList<Animal> animalArrayList, ArrayList<Customer> customerArrayList, Boolean isWork) {
        this.money = money;
        this.animalArrayList = animalArrayList;
        this.customerArrayList = customerArrayList;
        this.isWork = isWork;
    }

    public MyAnimalShop() {
    }

    @Override
    public String toString() {
        return "MyAnimalShop{" +
                "money=" + money +
                ", animalArrayList=" + animalArrayList +
                ", customerArrayList=" + customerArrayList +
                ", isWork=" + isWork +
                '}';
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public ArrayList<Animal> getAnimalArrayList() {
        return animalArrayList;
    }

    public void setAnimalArrayList(ArrayList<Animal> animalArrayList) {
        this.animalArrayList = animalArrayList;
    }

    public ArrayList<Customer> getCustomerArrayList() {
        return customerArrayList;
    }

    public void setCustomerArrayList(ArrayList<Customer> customerArrayList) {
        this.customerArrayList = customerArrayList;
    }

    public Boolean getWork() {
        return isWork;
    }

    public void setWork(Boolean work) {
        isWork = work;
    }

    @Override
    public void buy_anmail(Animal animal) {

    }




    @Override
    public Boolean buyAnimal(Animal animal) {

        if(money<animal.anmail_price){
            throw new InsufficientBalanceException("余额不足");
        }else{
            money-=animal.anmail_price;
            animalArrayList.add(animal);
            return true;
        }
    }



    @Override
    public void serve_custom(Customer customer) {

        System.out.println("welcome!!!!!!!!!\n"+customer);
        customer.setArrive_times(customer.getArrive_times()+1);
        customerArrayList.add(customer);

        if(animalArrayList.isEmpty()){
            throw new AnimalNotFoundException("动物卖完了!");
        }else{
            Animal animal = animalArrayList.get(0);
            animalArrayList.remove(0);
            money+=animal.anmail_price;
            customer.setPay(customer.getPay()+animal.anmail_price);
            System.out.println("出售动物:"+animal);
        }

    }

    @Override
    public void close() {
        LocalDate closeDate = LocalDate.now();
        double profit = 0;
        for (Customer customer:
                customerArrayList) {
            if(closeDate.isEqual(customer.getArrival_Date())){
                System.out.println(customer);
                profit+=customer.getPay();
            }
        }
        System.out.println("今天的利润是："+profit);
    }
}
