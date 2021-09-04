package tatu.home.finances.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Account {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String accountNumber;

  private String bank;

  private BigDecimal balance;

  private String accountName;

  @OneToMany(mappedBy = "account")
  private List<Receive> receives;

  @ManyToOne
  private Wallet wallet;

  @ManyToOne
  private AccountUser accountUser;
}
