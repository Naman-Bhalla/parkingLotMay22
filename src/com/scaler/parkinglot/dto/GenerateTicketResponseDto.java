package com.scaler.parkinglot.dto;

import com.scaler.parkinglot.models.Ticket;

public class GenerateTicketResponseDto {
    private Ticket ticket;

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
