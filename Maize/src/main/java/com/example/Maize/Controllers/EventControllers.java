package com.example.Maize.Controllers;

import com.example.Maize.Entity.Event;
import com.example.Maize.Mapper.EventMapper;
import com.example.Maize.Service.EventService;
import com.example.Maize.dto.EventDto;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;
import com.example.Maize.dto.EventDto.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/event")
public class EventControllers {
    private EventService eventService;

    @PostMapping
    public ResponseEntity<EventDto> createEvent(@RequestBody EventDto eventDto){
        EventDto savedEvent = eventService.CreateEvent(eventDto);
        return new ResponseEntity<>(savedEvent, HttpStatus.CREATED);

    }

    @GetMapping("{id}")
    public  ResponseEntity<EventDto> getEventById(@PathVariable("id") Long  eventId)
    {
        EventDto eventdto = eventService.getEventById(eventId);
        return ResponseEntity.ok(eventdto);
    }

    @GetMapping
    public  ResponseEntity<List<EventDto>> getAllEvent(){

        return ResponseEntity.ok(eventService.GetAllEvent());
    }
    @PutMapping("{id}")
    public ResponseEntity<EventDto> UpdateEvent(@PathVariable("id") Long id,@RequestBody EventDto updateDto){
        EventDto eventDto = eventService.UpdateEvent(id,updateDto);
        return ResponseEntity.ok(eventDto);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> DeleteEvent(@PathVariable("id") Long eventId)
    {
        eventService.DeleteEvent(eventId);
        return ResponseEntity.ok("Ok");
    }
}
