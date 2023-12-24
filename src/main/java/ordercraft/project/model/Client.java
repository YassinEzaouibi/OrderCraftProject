package ordercraft.project.model;

public class Client {
    private int clientId;
    private String clientName;
    private String clientEmail;
    private String clientPhone;

    public Client(int clientId, String clientName, String clientEmail, String clientPhone) {
        this.clientId = clientId;
        this.clientName = clientName;
        this.clientEmail = clientEmail;
        this.clientPhone = clientPhone;
    }
    public Client(String clientName, String clientEmail, String clientPhone) {
        this.clientName = clientName;
        this.clientEmail = clientEmail;
        this.clientPhone = clientPhone;
    }

    public int getId() {
        return clientId;
    }

    public void setId(int clientId) {
        this.clientId = clientId;
    }

    public String getName() {
        return clientName;
    }

    public void setName(String clientName) {
        this.clientName = clientName;
    }

    public String getEmail() {
        return clientEmail;
    }

    public void setEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public String getPhone() {
        return clientPhone;
    }

    public void setPhone(String clientPhone) {
        this.clientPhone = clientPhone;
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientId=" + clientId +
                ", clientName='" + clientName + '\'' +
                ", clientEmail='" + clientEmail + '\'' +
                ", clientPhone='" + clientPhone + '\'' +
                '}';
    }
}
