public class Rabbit extends Animal{
    public Rabbit(String anmail_name, int anmail_age, String anmail_gender, double anmail_price) {
        super(anmail_name, anmail_age, anmail_gender, anmail_price);

    }

    @Override
    public String toString() {
        return "兔子{" +
                "名字='" + anmail_name + '\'' +
                ", 年龄=" + anmail_age +
                ", 性别='" + anmail_gender + '\'' +
                ", 价格=" + anmail_price +
                '}';
    }
}
