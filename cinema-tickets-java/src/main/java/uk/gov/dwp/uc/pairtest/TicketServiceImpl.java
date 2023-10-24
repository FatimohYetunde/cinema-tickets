package uk.gov.dwp.uc.pairtest;

import thirdparty.paymentgateway.TicketPaymentServiceImpl;
import uk.gov.dwp.uc.pairtest.domain.TicketTypeRequest;
import uk.gov.dwp.uc.pairtest.exception.InvalidPurchaseException;

public class TicketServiceImpl extends TicketPaymentServiceImpl implements TicketService {
    /**
     * Should only have private methods other than the one below.
     */

    @Override
    public void purchaseTickets(Long accountId, TicketTypeRequest... ticketTypeRequests) throws InvalidPurchaseException {

    }
   
    private int getTicketPrice(TicketTypeRequest.Type ticketType) {
        int price;
        switch (ticketType) {
            case ADULT:
                price = 20;
                break;
            case CHILD:
                price = 10;
                break;
            case INFANT:
                price = 0;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + ticketType);
        }
        return price;
    }

}
