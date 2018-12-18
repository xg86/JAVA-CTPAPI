/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.thostapi;

public class CThostFtdcTradeField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcTradeField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcTradeField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thosttraderapiJNI.delete_CThostFtdcTradeField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thosttraderapiJNI.CThostFtdcTradeField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thosttraderapiJNI.CThostFtdcTradeField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    thosttraderapiJNI.CThostFtdcTradeField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thosttraderapiJNI.CThostFtdcTradeField_InvestorID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    thosttraderapiJNI.CThostFtdcTradeField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return thosttraderapiJNI.CThostFtdcTradeField_InstrumentID_get(swigCPtr, this);
  }

  public void setOrderRef(String value) {
    thosttraderapiJNI.CThostFtdcTradeField_OrderRef_set(swigCPtr, this, value);
  }

  public String getOrderRef() {
    return thosttraderapiJNI.CThostFtdcTradeField_OrderRef_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    thosttraderapiJNI.CThostFtdcTradeField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return thosttraderapiJNI.CThostFtdcTradeField_UserID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    thosttraderapiJNI.CThostFtdcTradeField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return thosttraderapiJNI.CThostFtdcTradeField_ExchangeID_get(swigCPtr, this);
  }

  public void setTradeID(String value) {
    thosttraderapiJNI.CThostFtdcTradeField_TradeID_set(swigCPtr, this, value);
  }

  public String getTradeID() {
    return thosttraderapiJNI.CThostFtdcTradeField_TradeID_get(swigCPtr, this);
  }

  public void setDirection(char value) {
    thosttraderapiJNI.CThostFtdcTradeField_Direction_set(swigCPtr, this, value);
  }

  public char getDirection() {
    return thosttraderapiJNI.CThostFtdcTradeField_Direction_get(swigCPtr, this);
  }

  public void setOrderSysID(String value) {
    thosttraderapiJNI.CThostFtdcTradeField_OrderSysID_set(swigCPtr, this, value);
  }

  public String getOrderSysID() {
    return thosttraderapiJNI.CThostFtdcTradeField_OrderSysID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    thosttraderapiJNI.CThostFtdcTradeField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return thosttraderapiJNI.CThostFtdcTradeField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    thosttraderapiJNI.CThostFtdcTradeField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return thosttraderapiJNI.CThostFtdcTradeField_ClientID_get(swigCPtr, this);
  }

  public void setTradingRole(char value) {
    thosttraderapiJNI.CThostFtdcTradeField_TradingRole_set(swigCPtr, this, value);
  }

  public char getTradingRole() {
    return thosttraderapiJNI.CThostFtdcTradeField_TradingRole_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    thosttraderapiJNI.CThostFtdcTradeField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return thosttraderapiJNI.CThostFtdcTradeField_ExchangeInstID_get(swigCPtr, this);
  }

  public void setOffsetFlag(char value) {
    thosttraderapiJNI.CThostFtdcTradeField_OffsetFlag_set(swigCPtr, this, value);
  }

  public char getOffsetFlag() {
    return thosttraderapiJNI.CThostFtdcTradeField_OffsetFlag_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    thosttraderapiJNI.CThostFtdcTradeField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return thosttraderapiJNI.CThostFtdcTradeField_HedgeFlag_get(swigCPtr, this);
  }

  public void setPrice(double value) {
    thosttraderapiJNI.CThostFtdcTradeField_Price_set(swigCPtr, this, value);
  }

  public double getPrice() {
    return thosttraderapiJNI.CThostFtdcTradeField_Price_get(swigCPtr, this);
  }

  public void setVolume(int value) {
    thosttraderapiJNI.CThostFtdcTradeField_Volume_set(swigCPtr, this, value);
  }

  public int getVolume() {
    return thosttraderapiJNI.CThostFtdcTradeField_Volume_get(swigCPtr, this);
  }

  public void setTradeDate(String value) {
    thosttraderapiJNI.CThostFtdcTradeField_TradeDate_set(swigCPtr, this, value);
  }

  public String getTradeDate() {
    return thosttraderapiJNI.CThostFtdcTradeField_TradeDate_get(swigCPtr, this);
  }

  public void setTradeTime(String value) {
    thosttraderapiJNI.CThostFtdcTradeField_TradeTime_set(swigCPtr, this, value);
  }

  public String getTradeTime() {
    return thosttraderapiJNI.CThostFtdcTradeField_TradeTime_get(swigCPtr, this);
  }

  public void setTradeType(char value) {
    thosttraderapiJNI.CThostFtdcTradeField_TradeType_set(swigCPtr, this, value);
  }

  public char getTradeType() {
    return thosttraderapiJNI.CThostFtdcTradeField_TradeType_get(swigCPtr, this);
  }

  public void setPriceSource(char value) {
    thosttraderapiJNI.CThostFtdcTradeField_PriceSource_set(swigCPtr, this, value);
  }

  public char getPriceSource() {
    return thosttraderapiJNI.CThostFtdcTradeField_PriceSource_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    thosttraderapiJNI.CThostFtdcTradeField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return thosttraderapiJNI.CThostFtdcTradeField_TraderID_get(swigCPtr, this);
  }

  public void setOrderLocalID(String value) {
    thosttraderapiJNI.CThostFtdcTradeField_OrderLocalID_set(swigCPtr, this, value);
  }

  public String getOrderLocalID() {
    return thosttraderapiJNI.CThostFtdcTradeField_OrderLocalID_get(swigCPtr, this);
  }

  public void setClearingPartID(String value) {
    thosttraderapiJNI.CThostFtdcTradeField_ClearingPartID_set(swigCPtr, this, value);
  }

  public String getClearingPartID() {
    return thosttraderapiJNI.CThostFtdcTradeField_ClearingPartID_get(swigCPtr, this);
  }

  public void setBusinessUnit(String value) {
    thosttraderapiJNI.CThostFtdcTradeField_BusinessUnit_set(swigCPtr, this, value);
  }

  public String getBusinessUnit() {
    return thosttraderapiJNI.CThostFtdcTradeField_BusinessUnit_get(swigCPtr, this);
  }

  public void setSequenceNo(int value) {
    thosttraderapiJNI.CThostFtdcTradeField_SequenceNo_set(swigCPtr, this, value);
  }

  public int getSequenceNo() {
    return thosttraderapiJNI.CThostFtdcTradeField_SequenceNo_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    thosttraderapiJNI.CThostFtdcTradeField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return thosttraderapiJNI.CThostFtdcTradeField_TradingDay_get(swigCPtr, this);
  }

  public void setSettlementID(int value) {
    thosttraderapiJNI.CThostFtdcTradeField_SettlementID_set(swigCPtr, this, value);
  }

  public int getSettlementID() {
    return thosttraderapiJNI.CThostFtdcTradeField_SettlementID_get(swigCPtr, this);
  }

  public void setBrokerOrderSeq(int value) {
    thosttraderapiJNI.CThostFtdcTradeField_BrokerOrderSeq_set(swigCPtr, this, value);
  }

  public int getBrokerOrderSeq() {
    return thosttraderapiJNI.CThostFtdcTradeField_BrokerOrderSeq_get(swigCPtr, this);
  }

  public void setTradeSource(char value) {
    thosttraderapiJNI.CThostFtdcTradeField_TradeSource_set(swigCPtr, this, value);
  }

  public char getTradeSource() {
    return thosttraderapiJNI.CThostFtdcTradeField_TradeSource_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    thosttraderapiJNI.CThostFtdcTradeField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return thosttraderapiJNI.CThostFtdcTradeField_InvestUnitID_get(swigCPtr, this);
  }

  public CThostFtdcTradeField() {
    this(thosttraderapiJNI.new_CThostFtdcTradeField(), true);
  }

}
