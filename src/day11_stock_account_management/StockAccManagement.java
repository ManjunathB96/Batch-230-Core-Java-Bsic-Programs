package day11_stock_account_management;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class StockAccManagement {
    public static void main(String[] args) throws IOException {
        Stocks stocks = readStockJsonFile();
        calculateStockTotalValue(stocks);
    }

    private static Stocks readStockJsonFile() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
     Stocks stocks = objectMapper.readValue(new File("F:/Batch-230 Core Java Programs/src/day11_stock_account_management/Stock.json"),Stocks.class);
        return stocks;
    }
    private static void calculateStockTotalValue(Stocks stocks) {
        for (int i = 0; i < stocks.getStockList().size(); i++) {
            int totalValueOfStock =
                    stocks.getStockList().get(i).getNumberOfShare()
                            * stocks.getStockList().get(i).getSharePrice();
            System.out.println("Stock name is: " + stocks.getStockList().get(i).getNameOfStock());
            System.out.println("Number Of Shares "+stocks.getStockList().get(i).getNumberOfShare());
            System.out.println("Value of Each Share is:" + stocks.getStockList().get(i).getSharePrice());
            System.out.println("Stock total value is: " + totalValueOfStock);
            System.out.println();
        }
    }
}
