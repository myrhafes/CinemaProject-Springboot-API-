package com.cinema.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name="t1", types = { com.cinema.entities.Ticket.class })
public interface TicketProjection {
	
	public Long getId();
	public String getNomClient();
	public double gPrix();
	public Integer getCodePayement();
	public boolean getReservee();
	public Place getPlace();
}
