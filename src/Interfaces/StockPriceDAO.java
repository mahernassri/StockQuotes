package Interfaces;

import Models.StockQuotes;

import java.util.ArrayList;

public interface StockPriceDAO
{
    StockQuotes getSingleQuote(String symbol);
    ArrayList<StockQuotes> getQuotes();
}
