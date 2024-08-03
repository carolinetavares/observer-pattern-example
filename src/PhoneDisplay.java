public class PhoneDisplay implements Observer {

    private String phoneId;

    public PhoneDisplay(String phoneId) {
        this.phoneId = phoneId;
    }

    @Override
    public void update(float temperature) {
        System.out.println("Phone " + phoneId + ": Temperatura atualizada para " + temperature + " graus.");
    }
}
