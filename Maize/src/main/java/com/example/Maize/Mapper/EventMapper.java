package com.example.Maize.Mapper;

import com.example.Maize.Entity.Event;
import com.example.Maize.dto.EventDto;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class EventMapper {

    public  static EventDto mapToEventDto(Event event)
    {

        return new EventDto(
                event.getId(),
                event.getTitle(),
                event.getDescription(),
                event.getEventType(),
                event.getDate(),
                event.getTime(),
                event.getCount_guest(),
                event.getPrice_ticket(),
                event.getImageUrl(),
                event.getOption()

        );
    }


    public  static Event mapToEvent(EventDto event)
    {

        return new Event(
                event.getId(),
                event.getTitle(),
                event.getDescription(),
                event.getEventType(),
                event.getDate(),
                event.getTime(),
                event.getCount_guest(),
                event.getPrice_ticket(),
                event.getImageUrl(),
                event.getOption()

        );
    }
}
