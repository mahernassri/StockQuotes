import Clients.StockQuoteClient;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        //Create prompter to avoid using business logic here
        StockQuoteClient newClient = new StockQuoteClient();
        String ticker = "";
        System.out.println("Enter the ticker to get a quote: ");
        Scanner scanner = new Scanner(System.in);
        ticker = scanner.nextLine();
        System.out.println("$" + newClient.getSharePrice(ticker));
    }
}