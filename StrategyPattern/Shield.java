package StrategyPattern;

public class Shield implements DefenseStrategy{
    @Override
    public void defense() {
        System.out.println("using a shield to defend!");
    }
}
