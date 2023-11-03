package bank.authentication.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "guards")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Auth {
    @Id
    private Integer id;

    @Column(name = "username")
    private String username;

    @Column(name = "passcode")
    private Integer passcode;

    @Column(name = "accountNum")
    private Integer accountNum;
}
