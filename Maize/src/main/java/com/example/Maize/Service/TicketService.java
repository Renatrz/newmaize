package com.example.Maize.Service;

import com.example.Maize.dto.EventDto;
import com.example.Maize.dto.TicketDto;

import java.util.List;

public interface TicketService {
    TicketDto CreateEvent(TicketDto eventDto);
    TicketDto getEventById(Long eventid);
    List<TicketDto> GetAllEvent();
}
