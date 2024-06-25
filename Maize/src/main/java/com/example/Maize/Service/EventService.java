package com.example.Maize.Service;

import com.example.Maize.dto.EventDto;

import java.util.List;

public interface EventService
{
    EventDto CreateEvent(EventDto eventDto);
    EventDto getEventById(Long eventid);
    List<EventDto> GetAllEvent();
    EventDto UpdateEvent(Long eventId,EventDto updateEvent);
    void DeleteEvent(Long eventId);
}
