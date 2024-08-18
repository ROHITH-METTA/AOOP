package com.auction;

public class StandardAuction extends AuctionTemplate {
    private Auction auction;

    public StandardAuction(Auction auction) {
        this.auction = auction;
    }

    @Override
    protected void notifyParticipants() {
        System.out.println("Notifying participants for standard auction...");
    }

    @Override
    protected void startAuction() {
        auction.startAuction();
    }

    @Override
    protected void performAuction() {
        System.out.println("Performing standard auction steps...");
    }

    @Override
    protected void endAuction() {
        auction.endAuction();
    }
}
