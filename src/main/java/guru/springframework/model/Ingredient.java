package guru.springframework.model;


import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


@Getter
@Setter
public class Ingredient {
    private Long id;
    private String description;
    private BigDecimal amount;
    private Recipe recipe;
    private UnitOfMeasure uom;
}
