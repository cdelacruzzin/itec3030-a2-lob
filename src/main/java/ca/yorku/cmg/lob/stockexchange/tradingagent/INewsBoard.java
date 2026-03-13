package ca.yorku.cmg.lob.stockexchange.tradingagent;

public interface INewsBoard {
     void registerObserver (TradingAgent agent);
     void runEventsList();
}
