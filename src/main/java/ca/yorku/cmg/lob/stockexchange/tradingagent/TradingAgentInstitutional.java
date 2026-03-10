package ca.yorku.cmg.lob.stockexchange.tradingagent;

import ca.yorku.cmg.lob.orderbook.Bid;
import ca.yorku.cmg.lob.stockexchange.StockExchange;
import ca.yorku.cmg.lob.stockexchange.events.Event;
import ca.yorku.cmg.lob.stockexchange.events.NewsBoard;
import ca.yorku.cmg.lob.trader.Trader;
import ca.yorku.cmg.lob.tradestandards.IOrder;

public class TradingAgentInstitutional extends TradingAgent{

    String type;
    String style;

    public TradingAgentInstitutional(String type, String style, Trader t, StockExchange e, NewsBoard n) {
        super(t, e, n);
        this.style = style;
        this.type = type;
    }

}
