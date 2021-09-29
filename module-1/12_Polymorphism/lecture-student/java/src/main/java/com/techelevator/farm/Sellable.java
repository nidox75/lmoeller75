package com.techelevator.farm;

import java.math.BigDecimal;

public interface Sellable {

    default BigDecimal getPrice() {
      return  this.getPrice();

    }
}
