public class Rates {
    int[] ratesArray; 
    Ticket[] ticketsArray;

    Rates(){
        Ticket singleTicket = new Ticket("Single", 1, false, false);
        Ticket familyTicket = new Ticket("Family", 4, false, true);
        Ticket vipTicket = new Ticket("Vip", 1, true, true);
        ratesArray = new int[]{10,30,40};
        ticketsArray = new Ticket[]{singleTicket, familyTicket, vipTicket};
    }

    public int[] getRates(){
        return ratesArray;
    }

    public Ticket[] ticketsArraay(){
        return ticketsArray;
    }

    public String toString(){
        String str = "--------\n\n\nRates - \nAll rates are for a day pass: \n";
        int num = 1;
        for(int i = 0; i < ratesArray.length; i++){
            str += "\n" + num + ". " + ticketsArray[i].getTicketName() + " $" + ratesArray[i];
            num++;
        }

        return str;
    }
}
