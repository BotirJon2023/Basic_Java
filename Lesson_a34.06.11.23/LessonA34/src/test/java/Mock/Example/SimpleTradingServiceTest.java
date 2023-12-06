package Mock.Example;

import static org.junit.jupiter.api.Assertions.*;


import jdk.internal.foreign.abi.Binding;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.anyLong;

@ExtendWith(MockitoExtension.class)
class SimpleTradingServiceTest {

    @Mock
    AuditService auditService;

    @Mock
    TradeRepository tradeRepository;

    @Mock
     Trade trade;

    public void logNewTradeWithMockTest() {
        Mockito.when(tradeRepository.createTrade(trade)).thenReturn(anyLong());
        TradingService tradingService = new SimpleTradingService(tradeRepository, auditService);
        tradingService.createTrade(trade);

        Mockito.verify(auditService).logNewTrade(trade);
    }
}
