package com.example.Maize.Repository;

import com.example.Maize.Entity.Event;
import com.example.Maize.dto.EventDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.annotation.Id;

@Repository
public interface EventRepository extends JpaRepository<Event,Long> {

}
