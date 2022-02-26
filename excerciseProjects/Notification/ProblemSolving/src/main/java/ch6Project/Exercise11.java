package ch6Project;

import java.util.Scanner;

class ConcertPromoter {
    private String nameOfTheBand ;
    private int capacityOfTheVenue ;
    private int numberOfTicketSoldByPhone;
    private int numberOfTicketSoldByVenue;
    private double priceOfTicketSoldByPhone ;
    private double priceOfTheTicketSoldByVenue ;
    private double totalSalesAmount;

    public ConcertPromoter(String nameOfTheBand,int capacity, double priceOfTicketSoldByPhone,
                           double priceOfTheTicketSoldByVenue){
        this.nameOfTheBand=nameOfTheBand;
        this.capacityOfTheVenue=capacity;
        this.priceOfTheTicketSoldByVenue=priceOfTheTicketSoldByVenue;
        this.priceOfTicketSoldByPhone=priceOfTicketSoldByPhone;
    }
    public void recordSale(double numberOfTicket, String type) {
        if (type.equalsIgnoreCase("phone")) {
            this.numberOfTicketSoldByPhone += numberOfTicket;

        } else if (type.equalsIgnoreCase("venue")) {
            this.numberOfTicketSoldByVenue += numberOfTicket;
        }
        this.totalSalesAmount = (this.priceOfTheTicketSoldByVenue * this.numberOfTicketSoldByVenue) +
                (this.priceOfTicketSoldByPhone * this.numberOfTicketSoldByPhone);
    }

    public void changePhoneSaleToVenueSale() {
        this.numberOfTicketSoldByVenue = this.numberOfTicketSoldByPhone + this.numberOfTicketSoldByVenue;
        this.numberOfTicketSoldByPhone = 0;
        this.totalSalesAmount = (this.priceOfTheTicketSoldByVenue * this.numberOfTicketSoldByVenue) +
                (this.priceOfTicketSoldByPhone * this.numberOfTicketSoldByPhone);
    }

    public int getNumberOfTicketSold() {
        return (this.numberOfTicketSoldByVenue + this.numberOfTicketSoldByPhone);
    }

    public int getNumberOfTicketRemaining() {
        return (this.capacityOfTheVenue - getNumberOfTicketSold());
    }


    public double getTotalSale() {
        return this.totalSalesAmount;
    }

    public String getNameOfTheBand() {
        return nameOfTheBand;
    }

    public void setNameOfTheBand(String nameOfTheBand) {
        this.nameOfTheBand = nameOfTheBand;
    }

    public int getCapacityOfTheVenue() {
        return capacityOfTheVenue;
    }

    public void setCapacityOfTheVenue(int capacityOfTheVenue) {
        this.capacityOfTheVenue = capacityOfTheVenue;
    }

    public int getNumberOfTicketSoldByPhone() {
        return numberOfTicketSoldByPhone;
    }

    public void setNumberOfTicketSoldByPhone(int numberOfTicketSoldByPhone) {
        this.numberOfTicketSoldByPhone = numberOfTicketSoldByPhone;
    }

    public int getNumberOfTicketSoldByVenue() {
        return numberOfTicketSoldByVenue;
    }

    public void setNumberOfTicketSoldByVenue(int numberOfTicketSoldByVenue) {
        this.numberOfTicketSoldByVenue = numberOfTicketSoldByVenue;
    }

    public double getPriceOfTicketSoldByPhone() {
        return priceOfTicketSoldByPhone;
    }

    public void setPriceOfTicketSoldByPhone(double priceOfTicketSoldByPhone) {
        this.priceOfTicketSoldByPhone = priceOfTicketSoldByPhone;
    }

    public double getPriceOfTheTicketSoldByVenue() {
        return priceOfTheTicketSoldByVenue;
    }

    public void setPriceOfTheTicketSoldByVenue(double priceOfTheTicketSoldByVenue) {
        this.priceOfTheTicketSoldByVenue = priceOfTheTicketSoldByVenue;
    }

    public double getTotalSalesAmount() {
        return totalSalesAmount;
    }

    public void setTotalSalesAmount(double totalSalesAmount) {
        this.totalSalesAmount = totalSalesAmount;
    }
}

public class Exercise11 {
    public static void main(String[] args) {
        ch6Project.ConcertPromoter concertPromoter = new ch6Project.ConcertPromoter("EXO",100,1500,1300);
        Scanner input = new Scanner(System.in);
        String ans = null;
        do {
            System.out.println("Enter number of ticket");
            int ticket = input.nextInt();
            if (ticket > concertPromoter.getNumberOfTicketRemaining()) {
                System.out.println("sry! Your ticket number is exceed our capacity .Try again!");
                break;
            }
            System.out.println("Enter ticket type phone or venue");
            String type = input.next();
            concertPromoter.recordSale(ticket, type);
            System.out.println(concertPromoter.getNameOfTheBand());
            System.out.println("Capacity of venue :" + concertPromoter.getCapacityOfTheVenue());
            System.out.println("Total sales :" + concertPromoter.getTotalSale());
            System.out.println("Remaining number of ticket " + concertPromoter.getNumberOfTicketRemaining() );
            System.out.println("Do you want to buy ? yes or no");
            ans = input.next();
        } while (ans.equalsIgnoreCase("yes"));

        System.out.println("Changing phone sale to venue sales");
        concertPromoter.changePhoneSaleToVenueSale();
        System.out.println("Capacity of venue :" + concertPromoter.getCapacityOfTheVenue());
        System.out.println("Total sales after change :" + concertPromoter.getTotalSale());
        System.out.println("NumberOfTicketSold :" + concertPromoter.getNumberOfTicketSold());
        System.out.println("NumberOfTicketRemaining :" + concertPromoter.getNumberOfTicketRemaining());

    }
}
