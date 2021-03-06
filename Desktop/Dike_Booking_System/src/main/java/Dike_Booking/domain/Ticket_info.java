package Dike_Booking.domain;

/**
 * Created by student on 2015/04/18.
 */
public class Ticket_info {

    private int tick_num;
    private String event_date;
    private String status;

    private Ticket_info()
    {

    }

    public int getTick_num()
    {
        return tick_num;
    }

    public String getEvent_date()
    {
        return event_date;
    }

    public String getStatus()
    {
        return status;
    }
    public Ticket_info (Builder builder){

        tick_num=builder.tick_num;
        event_date=builder.event_date;
        status=builder. status;



    }
    public static class Builder{
        private int tick_num;
        private String event_date;
        private String status;

        public Builder(int tick_num)
        {
            this.tick_num=tick_num;

        }
        public Builder event_date(String value)
        {
            this.event_date=value;
            return this;
        }

        public Builder status(String value)
        {
            this.status=value;
            return this;
        }


        public  Ticket_info build()
        {
            return new  Ticket_info(this);
        }

    }
    @Override
    public String toString()
    {
        return String.format(" ticknum:" + tick_num +"date : "+ event_date);
    }

}
