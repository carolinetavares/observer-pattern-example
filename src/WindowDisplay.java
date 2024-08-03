public class WindowDisplay implements Observer {

    private String windowId;

    public WindowDisplay(String windowId) {
        this.windowId = windowId;
    }

    @Override
    public void update(float temperature) {
        System.out.println("Window " + windowId + ": Temperatura atualizada para " + temperature + " graus.");
    }
}
