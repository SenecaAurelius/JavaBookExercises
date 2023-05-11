package org.example.ch9.endOfChapterExercises;

public class B2Stock {
    public static void main(String[] args) {
//        B2Stock stock1 = new B2Stock("ORCL", "Oracle");
//        stock1.setCurrentPrice(50.35);
//        stock1.setPreviousClosingPrice(43.5);
//        System.out.println(stock1.getChangePercent());

        B2Stock HUF = new B2Stock("HUF", "Hungarian Currency");
        HUF.setCurrentPrice(336);
        HUF.setPreviousClosingPrice(300);
        System.out.println(HUF.getChangePercent());
    }

    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    public B2Stock(String symbol, String name){
        this.symbol = symbol;
        this.name = name;
    }

    public double getChangePercent(){
        double difference = currentPrice - previousClosingPrice;
        double average = (currentPrice + previousClosingPrice) / 2;
        double changePercent = (difference / average) * 100;
        return changePercent;
    }

    public double getPreviousClosingPrice(){
        return this.previousClosingPrice;
    }

    public double getCurrentPrice(){
        return this.currentPrice;
    }

    public void setPreviousClosingPrice(double previous){
        this.previousClosingPrice = previous;
    }

    public void setCurrentPrice(double currentPrice){
        this.currentPrice = currentPrice;
    }
}
