package ordercraft.project.model;

import java.util.Date;

public class Order {
    private int orderId;
    private Date creationDate;
    private Date updateDate;
    private int clientId;
    private Status status;

    public Order(int orderId, Date creationDate, Date updateDate, int clientId, Status status) {
        this.orderId = orderId;
        this.creationDate = creationDate;
        this.updateDate = updateDate;
        this.clientId = clientId;
        this.status = status;
    }
    public Order(Date creationDate, int clientId, Status status) {
        this.creationDate = creationDate;
        this.clientId = clientId;
        this.status = status;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getStatus() {
        return String.valueOf(status);
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "orderId=" + orderId +
                ", creationDate=" + creationDate +
                ", updateDate=" + updateDate +
                ", clientId=" + clientId +
                ", status=" + status +
                '}';
    }
}
