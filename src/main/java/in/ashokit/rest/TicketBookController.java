package in.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.request.bind.Passenger;
import in.ashokit.response.bind.Ticket;
import in.ashokit.service.BookTicketService;

@RestController
public class TicketBookController
{
	@Autowired
	private BookTicketService service;
	
	@PostMapping(
			value= "/bookTicket",
			consumes = {"application/xml","application/json"},
			produces = {"application/xml","application/json"}
			)
	public ResponseEntity<Ticket> getTicket(@RequestBody Passenger passanger)
	{
		Ticket t1 = service.bookTicket(passanger);
		
		return new ResponseEntity<Ticket>(t1,HttpStatus.CREATED);
	}

}
