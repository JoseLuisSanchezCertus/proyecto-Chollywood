package com.chollywood.chollywood.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chollywood.chollywood.model.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}