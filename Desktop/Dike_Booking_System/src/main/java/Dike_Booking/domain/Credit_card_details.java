package Dike_Booking.domain;

/**
 * Created by student on 2015/04/18.
 */
public class Credit_card_details {
    private int card_num;
    private String cardholder;
    private String card_type;
    private String expiration_month;
    private String expiration_year;

    private Credit_card_details()
    {

    }
    public String getCardholder()
    {
        return cardholder;
    }

    public int getCard_num()
    {
        return card_num;
    }

    public String getCard_type()
    {
        return card_type;
    }

    public String getMonth()
    {
        return expiration_month;
    }
    public String getYear()
    {
        return expiration_year;
    }



    public Credit_card_details (Builder builder){

        card_num=builder.card_num;
        card_type=builder.card_type;
        expiration_month=builder.expiration_month;
        expiration_year=builder.expiration_year;
        cardholder=builder.cardholder;


    }
    public static class Builder{
        private int card_num;
        private String card_type;
        private String expiration_month;
        private String expiration_year;
        private String cardholder;

        public Builder(int card_num)
        {
            this.card_num=card_num;

        }
        public Builder card_holder(String value)
        {
            this.cardholder=value;
            return this;
        }

        public Builder card(String value)
        {
            this.card_type=value;
            return this;
        }

        public Builder month(String value)
        {
            this.expiration_month=value;
            return this;

        }

        public Builder year(String value)
        {
            this.expiration_year=value;
            return this;
        }

        public Credit_card_details build()
        {
            return new Credit_card_details (this);
        }

    }
    @Override
    public String toString()
    {
        return String.format(" cardholder:" + cardholder +"card number: "+ card_num);
    }

}
