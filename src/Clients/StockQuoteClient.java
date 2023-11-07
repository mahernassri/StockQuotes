package Clients;


import ApiKey.ApiKey;
import DTOs.StockPriceDTO;
import org.springframework.web.client.RestTemplate;


import java.math.BigDecimal;

public class StockQuoteClient
{
    private RestTemplate restTemplate = new RestTemplate();


    private static final String BASE_URL = "https://financialmodelingprep.com/api/v3/quote-short/";


    public BigDecimal getSharePrice(String ticker)
    {
        //insert try/catch

        StockPriceDTO[] dto = restTemplate.getForObject(BASE_URL + ticker + ApiKey.API_KEY, StockPriceDTO[].class);

        return dto[0].getPrice();
    }
}
