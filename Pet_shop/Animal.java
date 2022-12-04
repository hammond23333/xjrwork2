public abstract class Animal {
    public String anmail_name;
    public int anmail_age;
    public String anmail_gender;
    public double anmail_price;
    public Animal(String anmail_name, int anmail_age, String anmail_gender) {
    }
    public Animal(String anmail_name, int anmail_age, String anmail_gender, double anmail_price) {
        this.anmail_name = anmail_name;
        this.anmail_age = anmail_age;
        this.anmail_gender = anmail_gender;
        this.anmail_price = anmail_price;
    }

    protected Animal() {
    }


    @Override
    public abstract String toString() ;

}

