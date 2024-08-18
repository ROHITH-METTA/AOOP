package com.auction;

public class ReserveAuction extends AuctionTemplate {
    private Auction auction;

    public ReserveAuction(Auction auction) {
        this.auction = auction;
    }

    @Override
    protected void notifyParticipants() {
        System.out.println("Notifying participants for reserve auction...");
    }

    @Override
    protected void startAuction() {
        auction.startAuction();
    }

    @Override
    protected void performAuction() {
        System.out.println("Performing reserve auction steps...");
    }

    @Override
    protected void endAuction() {
        auction.endAuction();
    }
}
