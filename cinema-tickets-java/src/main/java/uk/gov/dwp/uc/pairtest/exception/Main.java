package uk.gov.dwp.uc.pairtest.exception;

import uk.gov.dwp.uc.pairtest.TicketServiceImpl;
import uk.gov.dwp.uc.pairtest.domain.TicketTypeRequest;

public class Main {
    public static void main(String[] args) {
        //Instantiating the Ticket types
        TicketServiceImpl ticketService = new TicketServiceImpl();
        Long accountId = 123L;
        TicketTypeRequest adultTicket = new TicketTypeRequest(TicketTypeRequest.Type.ADULT, 2);
        TicketTypeRequest childTicket = new TicketTypeRequest(TicketTypeRequest.Type.CHILD, 1);
        TicketTypeRequest infantTicket = new TicketTypeRequest(TicketTypeRequest.Type.INFANT, 1);

        //Testing all criteria to see if it meets the requirements
        ticketService.purchaseTickets(accountId, adultTicket);      
        // ticketService.purchaseTickets(accountId, childTicket);
        // ticketService.purchaseTickets(accountId, infantTicket);
    }
}
