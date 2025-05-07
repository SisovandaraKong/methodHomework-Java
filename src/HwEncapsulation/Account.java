package HwEncapsulation;

import java.time.LocalDate;

public class Account {
    private Integer id;
    private String uuid;
    private String username;
    private Double amount;
    private String email;
    private LocalDate createdAt;
    private LocalDate expiredAt;
    public void setId(Integer id) {
        this.id = id;
    }
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setAmount(Double amount) {
        this.amount = amount;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }
    public void setExpiredAt(LocalDate expiredAt) {
        this.expiredAt = expiredAt;
    }

    public Integer getId() {
        return id;
    }

    public String getUuid() {
        return uuid;
    }

    public String getUsername() {
        return username;
    }
    public Double getAmount() {
        return amount;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public LocalDate getExpiredAt() {
        return expiredAt;
    }

}
