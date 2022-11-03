package utils.services;

import play.libs.ws.WSBodyReadables;
import play.libs.ws.WSBodyWritables;
import play.libs.ws.WSClient;

import javax.inject.Inject;

public class CallApiUtils implements WSBodyReadables, WSBodyWritables {
    private final WSClient ws;

    @Inject
    public CallApiUtils(WSClient ws) {
        this.ws = ws;
    }
}
