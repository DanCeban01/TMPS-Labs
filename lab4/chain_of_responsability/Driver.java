package breaking_bad.chain_of_responsability;

import breaking_bad.chain_of_responsability.abstractions.RequestHandler;
import breaking_bad.chain_of_responsability.enums.RequestType;

public class Driver extends RequestHandler {

    public Driver(RequestHandler handler) {
        super(handler);
    }

    @Override
    public void handleRequest(Request req) {
        if (req.getRequestType().equals(RequestType.OPEN_DOOR)) {
            printHandling(req);
            req.markHandled();
        } else {
            super.handleRequest(req);
        }
    }

    @Override
    public String toString() {
        return "Simple driver, with the name Ryan Gosling.";
    }
}
