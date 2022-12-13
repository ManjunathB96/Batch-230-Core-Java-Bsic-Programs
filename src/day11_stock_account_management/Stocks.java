package day11_stock_account_management;

import java.util.List;

public class Stocks  {
    private List<Stock> stockList;

    public List<Stock> getStockList() {
        return stockList;
    }

    public void setStockList(List<Stock> stockList) {
        this.stockList = stockList;
    }
}
/*
steps to add JSON external library

File-> Project Structure -> Libraries-> (+)->maven repo->com.fasterxml.jackson.core:jackson-databind:2.13.3 -> ok
 */