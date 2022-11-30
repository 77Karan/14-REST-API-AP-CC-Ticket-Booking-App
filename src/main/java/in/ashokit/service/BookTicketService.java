package in.ashokit.service;

import org.springframework.stereotype.Service;

import in.ashokit.request.bind.Passenger;
import in.ashokit.response.bind.Ticket;

@Service
public class BookTicketService 
{
	public Ticket bookTicket(Passenger passanger)
	{
		System.out.println(passanger);
		Ticket t1 = new Ticket();
		t1.setPnr("23456");
		t1.setPrize("2300");
		t1.setStatus("booked");
		return t1;
	}

}
