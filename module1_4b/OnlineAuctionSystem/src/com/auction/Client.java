package com.auction;

public class Client {
    public static void main(String[] args) {
        // Create an auction
        Auction auction = new Auction("Antique Vase");

        // Create bidders
        Bidder bidder1 = new Bidder("Alice");
        Bidder bidder2 = new Bidder("Bob");

        // Subscribe bidders to auction
        auction.subscribe(bidder1);
        auction.subscribe(bidder2);

        // Create and run a standard auction
        AuctionTemplate standardAuction = new StandardAuction(auction);
        System.out.println("Running Standard Auction:");
        standardAuction.conductAuction();

        // Create and run a reserve auction
        AuctionTemplate reserveAuction = new ReserveAuction(auction);
        System.out.println("\nRunning Reserve Auction:");
        reserveAuction.conductAuction();

        // Unsubscribe a bidder and end auction
        auction.unsubscribe(bidder1);
        auction.endAuction();
    }
}
