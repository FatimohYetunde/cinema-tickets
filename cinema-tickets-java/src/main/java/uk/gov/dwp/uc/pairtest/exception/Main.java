package uk.gov.dwp.uc.pairtest.exception;

import uk.gov.dwp.uc.pairtest.TicketServiceImpl;
import uk.gov.dwp.uc.pairtest.domain.TicketTypeRequest;

public class Main {
    public static void main(String[] args) {
        // Calling the method to test ticket types
        testPurchaseTickets_NoAdultTicket();
        testPurchaseTickets_InvalidNoOfTickets();
    }

    public static void testPurchaseTickets_InvalidNoOfTickets() throws InvalidPurchaseException {
        // Instatiating the class
        TicketServiceImpl ticketService = new TicketServiceImpl();
        Long accountId = 123L;
        TicketTypeRequest adultTicket = new TicketTypeRequest(TicketTypeRequest.Type.ADULT, 21); // More than the
        
        // New Object
        ticketService.purchaseTickets(accountId, adultTicket);
    }

    public static void testPurchaseTickets_NoAdultTicket() throws InvalidPurchaseException {
        // Instatiating the class 
        TicketServiceImpl ticketService = new TicketServiceImpl();
        Long accountId = 123L;
        TicketTypeRequest childTicket = new TicketTypeRequest(TicketTypeRequest.Type.CHILD, 2);
        TicketTypeRequest infantTicket = new TicketTypeRequest(TicketTypeRequest.Type.INFANT, 2);

        // New objects
        ticketService.purchaseTickets(accountId, childTicket);
        ticketService.purchaseTickets(accountId, infantTicket);
    }
}
