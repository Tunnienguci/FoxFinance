package foxfinance.transfer.entities;

import java.util.Date;
public class Transfer {
    private Integer _id;
    private String sender;
    private String receiver;

    private Integer amount;
    private Date date;

    public Transfer(Integer _id, String sender, String receiver, Integer amount, Date date) {
        this._id = _id;
        this.sender = sender;
        this.receiver = receiver;
        this.amount = amount;
        this.date = date;
    }

    public Integer get_id() {
        return _id;
    }

    public void set_id(Integer _id) {
        this._id = _id;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
