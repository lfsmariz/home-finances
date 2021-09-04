package tatu.home.finances.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Expense {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String expenseName;

  private LocalDate createdAt;

  private LocalDate paymentAt;

  private LocalDate deletedAt;

  private boolean deleted;

  @ManyToOne
  private ExpenseType expenseType;

  @OneToMany(mappedBy = "expense")
  private List<ItemExpense> expenses;
}
