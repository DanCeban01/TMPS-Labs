package breaking_bad.chain_of_responsability;

import breaking_bad.chain_of_responsability.abstractions.RequestHandler;
import breaking_bad.chain_of_responsability.enums.RequestType;

public class Capo extends RequestHandler {

    public Capo(RequestHandler handler) {
        super(handler);
    }

    @Override
    public void handleRequest(Request req) {
        if (req.getRequestType().equals(RequestType.PREPARE_GUNS)) {
            printHandling(req);
            req.markHandled();
        } else {
            super.handleRequest(req);
        }
    }

    @Override
    public String toString() {
        return "This is the Capo, nothing more you need to know.";
    }
}
