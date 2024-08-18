package com.auction;

public abstract class AuctionTemplate {
    public final void conductAuction() {
        notifyParticipants();
        startAuction();
        performAuction();
        endAuction();
    }

    protected abstract void notifyParticipants();
    protected abstract void startAuction();
    protected abstract void performAuction();
    protected abstract void endAuction();
}
