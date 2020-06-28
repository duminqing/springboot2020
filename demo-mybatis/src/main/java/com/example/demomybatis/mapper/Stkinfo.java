package com.example.demomybatis.mapper;

import com.baidu.bjf.remoting.protobuf.FieldType;
import com.baidu.bjf.remoting.protobuf.annotation.Protobuf;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
public class Stkinfo implements Serializable {
    @Protobuf(fieldType = FieldType.STRING, required = true, order = 1)
    private String exchid;

    @Protobuf(fieldType = FieldType.STRING, required = true, order = 2)
    private String stkid;

    @Protobuf(fieldType = FieldType.STRING, required = true, order = 3)
    private String exchidex;

    @Protobuf(fieldType = FieldType.STRING, required = true, order = 4)
    private String stkname;

    @Protobuf(fieldType = FieldType.STRING, required = true, order = 5)
    private String shortprefix;

    @Protobuf(fieldType = FieldType.STRING, required = true, order = 6)
    private String stkenglishabbr;

    @Protobuf(fieldType = FieldType.STRING, required = true, order = 7)
    private String isincode;

    @Protobuf(fieldType = FieldType.STRING, required = true, order = 8)
    private String stktype;

    @Protobuf(fieldType = FieldType.STRING, required = true, order = 9)
    private String tradetype;

    @Protobuf(fieldType = FieldType.STRING, required = true, order = 10)
    private String exchproperty;

    @Protobuf(fieldType = FieldType.INT64, required = true, order = 11)
    private Long begindate;

    @Protobuf(fieldType = FieldType.BIGDECIMAL, required = true, order = 12)
    private BigDecimal orderpriceunit;

    @Protobuf(fieldType = FieldType.INT32, required = true, order = 13)
    private Integer decimalunit;

    @Protobuf(fieldType = FieldType.INT32, required = true, order = 14)
    private Integer tradeunit;

    @Protobuf(fieldType = FieldType.STRING, required = true, order = 15)
    private String tradestatus;

    @Protobuf(fieldType = FieldType.STRING, required = true, order = 16)
    private String suspendedflag;

    @Protobuf(fieldType = FieldType.INT64, required = true, order = 17)
    private Long lowbuyqtylimit;

    @Protobuf(fieldType = FieldType.INT64, required = true, order = 18)
    private Long lowsellqtylimit;

    @Protobuf(fieldType = FieldType.INT64, required = true, order = 19)
    private Long highbuyqtylimit;

    @Protobuf(fieldType = FieldType.INT64, required = true, order = 20)
    private Long highsellqtylimit;

    @Protobuf(fieldType = FieldType.BIGDECIMAL, required = true, order = 21)
    private BigDecimal parvalue;

    @Protobuf(fieldType = FieldType.INT64, required = true, order = 22)
    private Long totalcirculatingshare;

    @Protobuf(fieldType = FieldType.BIGDECIMAL, required = true, order = 23)
    private BigDecimal accuredinterest;

    @Protobuf(fieldType = FieldType.BIGDECIMAL, required = true, order = 24)
    private BigDecimal lastannualprofit;

    @Protobuf(fieldType = FieldType.BIGDECIMAL, required = true, order = 25)
    private BigDecimal annualprofit;

    @Protobuf(fieldType = FieldType.INT64, required = true, order = 26)
    private Long begininterestdate;

    @Protobuf(fieldType = FieldType.BIGDECIMAL, required = true, order = 27)
    private BigDecimal bondconvertrate;

    @Protobuf(fieldType = FieldType.BIGDECIMAL, required = true, order = 28)
    private BigDecimal guarantyconvertrate;

    @Protobuf(fieldType = FieldType.STRING, required = true, order = 29)
    private String financingloanflag;

    @Protobuf(fieldType = FieldType.STRING, required = true, order = 30)
    private String securitiesloanflag;

    @Protobuf(fieldType = FieldType.STRING, required = true, order = 31)
    private String marketmakerflag;

    @Protobuf(fieldType = FieldType.STRING, required = true, order = 32)
    private String levelflag;

    @Protobuf(fieldType = FieldType.STRING, required = true, order = 33)
    private String financingloantradingflag;

    @Protobuf(fieldType = FieldType.STRING, required = true, order = 34)
    private String securitiesloantradingflag;

    @Protobuf(fieldType = FieldType.STRING, required = true, order = 35)
    private String creditsharesellpriceflag;

    @Protobuf(fieldType = FieldType.STRING, required = true, order = 36)
    private String voteflag;

    @Protobuf(fieldType = FieldType.STRING, required = true, order = 37)
    private String stkissuetype;

    @Protobuf(fieldType = FieldType.STRING, required = true, order = 38)
    private String stkorderstatus;

    @Protobuf(fieldType = FieldType.INT64, required = true, order = 39)
    private Long prevtotalmktknockqty;

    @Protobuf(fieldType = FieldType.BIGDECIMAL, required = true, order = 40)
    private BigDecimal prevtotalmktknockamt;

    @Protobuf(fieldType = FieldType.INT64, required = true, order = 41)
    private Long preopenposition;

    @Protobuf(fieldType = FieldType.INT32, required = true, order = 42)
    private Integer precontracttimes;

    @Protobuf(fieldType = FieldType.BIGDECIMAL, required = true, order = 43)
    private BigDecimal presettlementprice;

    @Protobuf(fieldType = FieldType.INT64, required = true, order = 44)
    private Long totalissueqty;

    @Protobuf(fieldType = FieldType.INT32, required = true, order = 45)
    private Integer convertqty;

    @Protobuf(fieldType = FieldType.BIGDECIMAL, required = true, order = 46)
    private BigDecimal maxorderprice;

    @Protobuf(fieldType = FieldType.BIGDECIMAL, required = true, order = 47)
    private BigDecimal minorderprice;

    @Protobuf(fieldType = FieldType.BIGDECIMAL, required = true, order = 48)
    private BigDecimal closeprice;

    @Protobuf(fieldType = FieldType.BIGDECIMAL, required = true, order = 49)
    private BigDecimal openprice;

    @Protobuf(fieldType = FieldType.INT64, required = true, order = 50)
    private Long enddate;

    @Protobuf(fieldType = FieldType.INT64, required = true, order = 51)
    private Long accountdate;

    @Protobuf(fieldType = FieldType.INT64, required = true, order = 52)
    private Long openposition;

    @Protobuf(fieldType = FieldType.INT32, required = true, order = 53)
    private Integer contracttimes;

    @Protobuf(fieldType = FieldType.INT32, required = true, order = 54)
    private Integer contractserialno;

    @Protobuf(fieldType = FieldType.BIGDECIMAL, required = true, order = 55)
    private BigDecimal settlementprice;

    @Protobuf(fieldType = FieldType.INT32, required = true, order = 56)
    private Integer totalqty;

    @Protobuf(fieldType = FieldType.STRING, required = true, order = 57)
    private String userownerid;

    @Protobuf(fieldType = FieldType.STRING, required = true, order = 58)
    private String fProductid;

    @Protobuf(fieldType = FieldType.STRING, required = true, order = 59)
    private String fMappingcontractid;

    @Protobuf(fieldType = FieldType.INT32, required = true, order = 60)
    private Integer maxlimitorderqty;

    @Protobuf(fieldType = FieldType.INT32, required = true, order = 61)
    private Integer minlimitorderqty;

    @Protobuf(fieldType = FieldType.INT32, required = true, order = 62)
    private Integer maxmarketorderqty;

    @Protobuf(fieldType = FieldType.INT32, required = true, order = 63)
    private Integer minmarketorderqty;

    @Protobuf(fieldType = FieldType.INT32, required = true, order = 64)
    private Integer repurchaseday;

    @Protobuf(fieldType = FieldType.STRING, required = true, order = 65)
    private String optioncpflag;

    @Protobuf(fieldType = FieldType.BIGDECIMAL, required = true, order = 66)
    private BigDecimal execprice;

    @Protobuf(fieldType = FieldType.STRING, required = true, order = 67)
    private String basicstkid;

    @Protobuf(fieldType = FieldType.STRING, required = true, order = 68)
    private String optiontype;

    @Protobuf(fieldType = FieldType.INT32, required = true, order = 69)
    private Integer bigmarginflag;

    @Protobuf(fieldType = FieldType.BIGDECIMAL, required = true, order = 70)
    private BigDecimal hv;

    @Protobuf(fieldType = FieldType.BIGDECIMAL, required = true, order = 71)
    private BigDecimal fundapplyredemptionprice;

    @Protobuf(fieldType = FieldType.INT32, required = true, order = 72)
    private Integer marketmarkerqty;

    @Protobuf(fieldType = FieldType.STRING, required = true, order = 73)
    private String transfertype;

    @Protobuf(fieldType = FieldType.INT64, required = true, order = 74)
    private Long totalshare;

    @Protobuf(fieldType = FieldType.INT32, required = true, order = 75)
    private Integer fundprocessdays;

    @Protobuf(fieldType = FieldType.STRING, required = true, order = 76)
    private String undeliveryfunduseflag;

    @Protobuf(fieldType = FieldType.INT32, required = true, order = 77)
    private Integer stkdeliverydays;

    @Protobuf(fieldType = FieldType.STRING, required = true, order = 78)
    private String undeliverystkuseflag;

    @Protobuf(fieldType = FieldType.STRING, required = true, order = 79)
    private String stkproperty;

    @Protobuf(fieldType = FieldType.STRING, required = true, order = 80)
    private String stktype2;

    @Protobuf(fieldType = FieldType.STRING, required = true, order = 81)
    private String issuer;

    @Protobuf(fieldType = FieldType.STRING, required = true, order = 82)
    private String tradingphasestatus;

    @Protobuf(fieldType = FieldType.INT64, required = true, order = 83)
    private Long totalmktknockqty;

    @Protobuf(fieldType = FieldType.BIGDECIMAL, required = true, order = 84)
    private BigDecimal totalmktknockamt;

    @Protobuf(fieldType = FieldType.INT32, required = true, order = 85)
    private Integer actualrepurchasedays;

    @Protobuf(fieldType = FieldType.BIGDECIMAL, required = true, order = 86)
    private BigDecimal highprice;

    @Protobuf(fieldType = FieldType.BIGDECIMAL, required = true, order = 87)
    private BigDecimal lowprice;

    @Protobuf(fieldType = FieldType.INT64, required = true, order = 88)
    private Long staticver;

    @Protobuf(fieldType = FieldType.INT64, required = true, order = 89)
    private Long dynamicver;

    @Protobuf(fieldType = FieldType.INT32, required = true, order = 90)
    private Integer marketvalueflag;

    @Protobuf(fieldType = FieldType.BIGDECIMAL, required = true, order = 91)
    private BigDecimal nav;

    @Protobuf(fieldType = FieldType.STRING, required = true, order = 92)
    private String institutionname;

    @Protobuf(fieldType = FieldType.STRING, required = true, order = 93)
    private String noprofit;

    @Protobuf(fieldType = FieldType.STRING, required = true, order = 94)
    private String weightedvotingrights;

    @Protobuf(fieldType = FieldType.BIGDECIMAL, required = true, order = 95)
    private BigDecimal iopv;

    @Protobuf(fieldType = FieldType.BIGDECIMAL, required = true, order = 96)
    private BigDecimal actualparvalue;

    @Protobuf(fieldType = FieldType.INT64, required = true, order = 97)
    private Long lastmodifytime;

    @Protobuf(fieldType = FieldType.INT32, required = true, order = 98)
    private Integer minbuyqtytimes;

    @Protobuf(fieldType = FieldType.STRING, required = true, order = 99)
    private String strategystatus;

    @Protobuf(fieldType = FieldType.INT32, required = true, order = 100)
    private Integer minsellqtytimes;

    @Protobuf(fieldType = FieldType.INT32, required = true, order = 101)
    private Integer highmarketbuyqtylimit;

    @Protobuf(fieldType = FieldType.INT32, required = true, order = 102)
    private Integer highmarketsellqtylimit;

    @Protobuf(fieldType = FieldType.INT32, required = true, order = 103)
    private Integer lowmarketbuyqtylimit;

    @Protobuf(fieldType = FieldType.INT32, required = true, order = 104)
    private Integer lowmarketsellqtylimit;

    @Protobuf(fieldType = FieldType.INT32, required = true, order = 105)
    private Integer marketbuyqtytimes;

    @Protobuf(fieldType = FieldType.INT32, required = true, order = 106)
    private Integer marketsellqtytimes;

    @Protobuf(fieldType = FieldType.STRING, required = true, order = 107)
    private String isregistration;

    @Protobuf(fieldType = FieldType.STRING, required = true, order = 108)
    private String isvie;

}