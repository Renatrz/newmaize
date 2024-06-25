package com.example.Maize.Mapper;

import com.example.Maize.Entity.Event;
import com.example.Maize.Entity.Ticket;
import com.example.Maize.dto.EventDto;
import com.example.Maize.dto.TicketDto;

public class TicketMapper {
    public  static TicketDto mapToTicketDto(Ticket ticket)
    {

        return new TicketDto(
                ticket.getId(),
                ticket.getOwnerName(),
                ticket.getOwnerSurname(),
                ticket.getEmail(),
                ticket.getCount_Ticket(),
                ticket.getAmount(),
                ticket.getPayment_method(),
                ticket.isPayment_success()
        );
    }


    public  static Ticket mapToTicket(TicketDto ticket)
    {

        return new Ticket(
                ticket.getId(),
                ticket.getOwnerName(),
                ticket.getOwnerSurname(),
                ticket.getEmail(),
                ticket.getCount_Ticket(),
                ticket.getAmount(),
                ticket.getPayment_method(),
                ticket.isPayment_success()
        );
    }
}
