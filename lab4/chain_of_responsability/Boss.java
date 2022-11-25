package breaking_bad.chain_of_responsability;

import breaking_bad.chain_of_responsability.abstractions.RequestHandler;

public class Boss {

    RequestHandler chain;

    public Boss() {
        buildChain();
    }

    private void buildChain() {
        chain = new WildHuntCommander(new Driver(new Lieutenant(null)));
    }

    public void makeRequest(Request req) {
        chain.handleRequest(req);
    }


}
