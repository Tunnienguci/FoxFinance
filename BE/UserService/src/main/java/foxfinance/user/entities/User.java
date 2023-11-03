package foxfinance.user.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    private Integer id;
    @Column
    private String fullName;
    @Column
    private String dob;
    @Column
    private Integer accountNum;
    @Column
    private Integer cash;

}
