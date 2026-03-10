package ca.yorku.cmg.lob.stockexchange.tradingagent;

import ca.yorku.cmg.lob.stockexchange.StockExchange;
import ca.yorku.cmg.lob.stockexchange.events.NewsBoard;
import ca.yorku.cmg.lob.trader.Trader;

public class TradingAgentFactory extends AbstractTradingAgentFactory{

    TradingAgent agent;
    @Override
    public TradingAgent createAgent(String type, String style, Trader t, StockExchange e, NewsBoard n) {



        if(type.equals("Institutional")) {
            agent = new TradingAgentInstitutional(type, style, t, e, n);
        } else {
            agent = new TradingAgentRetail(type, style, t, e, n);
        }

        if (style.equals("Aggressive")) {
            ITradingStrategy aggressive = new AggressiveStrategy(t, e);
            agent.setStrategy(aggressive);
        } else {
            ITradingStrategy conservative = new ConservativeStrategy(t, e);
            agent.setStrategy(conservative);
        }
        return agent;
    }


}
