import java.time.LocalDate;

public class Customer {
    private String  customer_name;
    private int arrive_times;
    int arrive_date;
    private LocalDate arrival_Date;
    private double pay;

    public Customer(String customer_name, int arrive_times,  LocalDate arrival_Date, double pay) {
        this.customer_name = customer_name;
        this.arrive_times = arrive_times;
        this.arrive_date = arrive_date;
        this.arrival_Date = arrival_Date;
        this.pay = pay;
    }
    public String toString() {
        return "客户{" +
                "名字='" + customer_name + '\'' +
                ", 次数=" + arrive_times +
                ", 时间=" + arrive_date +
                ", 消费=" + pay +
                '}';
    }
    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public int getArrive_times() {
        return arrive_times;
    }

    public void setArrive_times(int arrive_times) {
        this.arrive_times = arrive_times;
    }

    public int getArrive_date() {
        return arrive_date;
    }

    public void setArrive_date(int arrive_date) {
        this.arrive_date = arrive_date;
    }

    public LocalDate getArrival_Date() {
        return arrival_Date;
    }

    public void setArrival_Date(LocalDate arrival_Date) {
        this.arrival_Date = arrival_Date;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }
}
