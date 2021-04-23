package controllers;

import play.mvc.*;
import play.libs.ws.WSClient;
import com.google.inject.Inject;
import java.util.concurrent.ExecutionException;

public class HomeController extends Controller {
    private static WSClient ws;

    @Inject
    public HomeController(final WSClient wsClient) {
        this.ws = wsClient;
    }

    public Result index() throws ExecutionException, InterruptedException {
        return ok(ws.url("http://127.0.0.1:9095/metrics").get().toCompletableFuture().get().getBody());
    }
}
