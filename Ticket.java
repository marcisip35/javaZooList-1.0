public class Ticket {
    final String ticketName;
    final int numOfTickets;
    final boolean vip;
    final boolean discount;

    Ticket(String ticketName, int numOfTickets, boolean vip, boolean discount){
        this.ticketName = ticketName;
        this.numOfTickets = numOfTickets;
        this.vip = vip;
        this.discount = discount;
    }

    public String getTicketName(){
        return ticketName;
    }

    public int getNumOfTickets(){
        return numOfTickets;
    }

    public boolean getVip(){
        return vip;
    }

    public boolean getDiscount(){
        return discount;
    }

    public String toString(){
        String str = "";
        str += "Type: " + getTicketName() + "\nTickets: " + getNumOfTickets() + "\nVip: ";
        if(getVip() == true){
            str += "yes";
        } else {
            str += "no";
        }
        
        str += "\nDiscount: ";
        if(getDiscount() == true){
            str += "yes";
        } else {
            str += "no";
        }
        
        return str;
    }
}
