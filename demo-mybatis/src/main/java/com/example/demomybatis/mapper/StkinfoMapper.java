package com.example.demomybatis.mapper;

import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StkinfoMapper {

    @Select("SELECT exchId, stkId, ExchIDEx, stkname, ShortPrefix, stkEnglishAbbr, ISINCode, stkType, \n" +
            "    tradeType, exchProperty, BeginDate, orderPriceUnit, DecimalUnit, tradeUnit, tradeStatus, \n" +
            "    SuspendedFlag, LowBuyQtyLimit, LowSellQtyLimit, HighBuyQtyLimit, HighSellQtyLimit, \n" +
            "    ParValue, TotalCirculatingShare, accuredInterest, LastAnnualProfit, AnnualProfit, \n" +
            "    BeginInterestDate, BondConvertRate, GuarantyConvertRate, FinancingLoanFlag, SecuritiesLoanFlag, \n" +
            "    MarketMakerFlag, LevelFlag, FinancingLoanTradingFlag, SecuritiesLoanTradingFlag, \n" +
            "    VoteFlag, StkIssueType, StkOrderStatus, PrevTotalMktKnockQty,\n" +
            "    PrevTotalMktKnockAmt, PreOpenPosition, preContractTimes, preSettlementPrice, TotalIssueQty, \n" +
            "    convertQty, maxOrderPrice, minOrderPrice, closePrice, openPrice, EndDate, AccountDate, \n" +
            "    OpenPosition, ContractTimes, ContractSerialNo, settlementPrice, TotalQty, UserOwnerID, \n" +
            "    f_productId, F_MappingContractId, MaxLimitOrderQty, MinLimitOrderQty, MaxMarketOrderQty, \n" +
            "    MinMarketOrderQty, RepurchaseDay, OptionCPFlag, ExecPrice, BasicStkId, OptionType, \n" +
            "    BigMarginFlag, HV, FundApplyRedemptionPrice, MarketMarkerQty, TransferType, TotalShare, \n" +
            "    fundProcessDays, unDeliveryFundUseFlag, stkDeliveryDays, unDeliverystkUseFlag, StkProperty, \n" +
            "    stkType2, Issuer, TradingPhaseStatus, TotalMktKnockQty, TotalMktKnockAmt, ActualRepurchaseDays, \n" +
            "    HighPrice, Lowprice, staticVer, dynamicVer, MarketValueFlag, NAV, InStituTionName, \n" +
            "    NoProfit, WeightedVotingRights, IOPV, lastModifyTime FROM stkinfo WHERE exchid = '0' limit 100")
    List<Stkinfo> listStkinfo();
}
