package com.revature.apselection.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.apselection.model.Event;

@Repository
public interface APSelectionRepo extends JpaRepository<Event, String>{

}
