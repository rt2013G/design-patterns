public class ConcreteHandler2 extends Handler {
    public void handleRequest(Request request) {
        boolean canHandleRequest = true; // depends on the request
        if(canHandleRequest) {
            // handle the request
        } else {
            successor.handleRequest(request);
        }
    }
}