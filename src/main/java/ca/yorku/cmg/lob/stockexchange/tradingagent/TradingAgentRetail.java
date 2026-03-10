package ca.yorku.cmg.lob.stockexchange.tradingagent;

import ca.yorku.cmg.lob.stockexchange.StockExchange;
import ca.yorku.cmg.lob.stockexchange.events.NewsBoard;
import ca.yorku.cmg.lob.trader.Trader;

public class TradingAgentRetail extends TradingAgent{

    String type;
    String style;

    public TradingAgentRetail(String type, String style, Trader t, StockExchange e, NewsBoard n) {
        super(t, e, n);
        this.style = style;
        this.type = type;
    }


}
