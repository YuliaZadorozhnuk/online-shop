package by.bsuir.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "credit_card", schema = "online_shop", catalog = "")
public class CreditCard {
    private Long id;
    private Integer creditСardNumber;
    private String nameOwner;
    private Integer cvv;
    private Date expiryDate;
    private Long idClient;
    private Clients clientsByIdClient;

    @Id
    @GeneratedValue
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "creditСard_number")
    public Integer getCreditСardNumber() {
        return creditСardNumber;
    }

    public void setCreditСardNumber(Integer creditСardNumber) {
        this.creditСardNumber = creditСardNumber;
    }

    @Basic
    @Column(name = "name_owner")
    public String getNameOwner() {
        return nameOwner;
    }

    public void setNameOwner(String nameOwner) {
        this.nameOwner = nameOwner;
    }

    @Basic
    @Column(name = "cvv")
    public Integer getCvv() {
        return cvv;
    }

    public void setCvv(Integer cvv) {
        this.cvv = cvv;
    }

    @Basic
    @Column(name = "expiry_date")
    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Basic
    @Column(name = "id_client")
    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreditCard that = (CreditCard) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (creditСardNumber != null ? !creditСardNumber.equals(that.creditСardNumber) : that.creditСardNumber != null)
            return false;
        if (nameOwner != null ? !nameOwner.equals(that.nameOwner) : that.nameOwner != null) return false;
        if (cvv != null ? !cvv.equals(that.cvv) : that.cvv != null) return false;
        if (expiryDate != null ? !expiryDate.equals(that.expiryDate) : that.expiryDate != null) return false;
        if (idClient != null ? !idClient.equals(that.idClient) : that.idClient != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (creditСardNumber != null ? creditСardNumber.hashCode() : 0);
        result = 31 * result + (nameOwner != null ? nameOwner.hashCode() : 0);
        result = 31 * result + (cvv != null ? cvv.hashCode() : 0);
        result = 31 * result + (expiryDate != null ? expiryDate.hashCode() : 0);
        result = 31 * result + (idClient != null ? idClient.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "id_client", referencedColumnName = "id", nullable = false)
    public Clients getClientsByIdClient() {
        return clientsByIdClient;
    }

    public void setClientsByIdClient(Clients clientsByIdClient) {
        this.clientsByIdClient = clientsByIdClient;
    }
}
