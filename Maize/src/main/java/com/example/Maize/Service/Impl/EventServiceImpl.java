package com.example.Maize.Service.Impl;

import com.example.Maize.Entity.Event;
import com.example.Maize.Exception.ResourceNotFoundException;
import com.example.Maize.Mapper.EventMapper;
import com.example.Maize.Repository.EventRepository;
import com.example.Maize.Service.EventService;
import com.example.Maize.dto.EventDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class EventServiceImpl implements EventService {
    private EventRepository eventRepository;
    @Override
    public EventDto CreateEvent(EventDto eventDto) {
        Event event = EventMapper.mapToEvent(eventDto);
        return EventMapper.mapToEventDto(eventRepository.save(event));
    }

    @Override
    public EventDto getEventById(Long eventid) {

        return EventMapper.mapToEventDto(eventRepository.findById(eventid).orElseThrow());
    }

    @Override
    public List<EventDto> GetAllEvent() {
        List<Event> event = eventRepository.findAll();
        return event.stream().map((events) -> EventMapper.mapToEventDto(events)).collect(Collectors.toList());
    }

    @Override
    public EventDto UpdateEvent(Long eventId, EventDto updateEvent) {
        Event event = eventRepository.findById(eventId).orElseThrow();
        event.setTitle(updateEvent.getTitle());
        event.setDescription(updateEvent.getDescription());
        event.setCount_guest(updateEvent.getCount_guest());
        event.setImageUrl(updateEvent.getImageUrl());
        event.setPrice_ticket(updateEvent.getPrice_ticket());
        event.setDate(updateEvent.getDate());
        event.setTime(updateEvent.getTime());
        event.setEventType(updateEvent.getEventType());
        event.setOption(updateEvent.getOption());

        Event updateEventObj = eventRepository.save(event);

        return EventMapper.mapToEventDto(updateEventObj);
    }

    @Override
    public void DeleteEvent(Long eventId) {
        Event event = eventRepository.findById(eventId).orElseThrow();
        eventRepository.deleteById(eventId);
    }
}
