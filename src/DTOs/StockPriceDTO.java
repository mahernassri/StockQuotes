package DTOs;

import java.math.BigDecimal;

public class StockPriceDTO
{
    private BigDecimal price;

    @Override
    public String toString()
    {
        return "Price: " + price;
    }


    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
