package com.scaler.parkinglot.controllers;

import com.scaler.parkinglot.dto.GenerateTicketRequestDto;
import com.scaler.parkinglot.dto.GenerateTicketResponseDto;
import com.scaler.parkinglot.models.EntryGate;
import com.scaler.parkinglot.models.Ticket;
import com.scaler.parkinglot.models.Vehicle;
import com.scaler.parkinglot.services.TicketService;

public class TicketController {
    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public GenerateTicketResponseDto generateTicket(
            GenerateTicketRequestDto requestDto
    ) {
        Ticket ticket = ticketService.generateTicket(
                requestDto.getVehicle(), requestDto.getEntryGate()
        );

        GenerateTicketResponseDto responseDto = new GenerateTicketResponseDto();
        responseDto.setTicket(ticket);

        return responseDto;
    }
}
