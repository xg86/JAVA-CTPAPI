/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.thostapi;

public class CThostFtdcExchangeOptionSelfCloseActionField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcExchangeOptionSelfCloseActionField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcExchangeOptionSelfCloseActionField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thosttraderapiJNI.delete_CThostFtdcExchangeOptionSelfCloseActionField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setExchangeID(String value) {
    thosttraderapiJNI.CThostFtdcExchangeOptionSelfCloseActionField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return thosttraderapiJNI.CThostFtdcExchangeOptionSelfCloseActionField_ExchangeID_get(swigCPtr, this);
  }

  public void setOptionSelfCloseSysID(String value) {
    thosttraderapiJNI.CThostFtdcExchangeOptionSelfCloseActionField_OptionSelfCloseSysID_set(swigCPtr, this, value);
  }

  public String getOptionSelfCloseSysID() {
    return thosttraderapiJNI.CThostFtdcExchangeOptionSelfCloseActionField_OptionSelfCloseSysID_get(swigCPtr, this);
  }

  public void setActionFlag(char value) {
    thosttraderapiJNI.CThostFtdcExchangeOptionSelfCloseActionField_ActionFlag_set(swigCPtr, this, value);
  }

  public char getActionFlag() {
    return thosttraderapiJNI.CThostFtdcExchangeOptionSelfCloseActionField_ActionFlag_get(swigCPtr, this);
  }

  public void setActionDate(String value) {
    thosttraderapiJNI.CThostFtdcExchangeOptionSelfCloseActionField_ActionDate_set(swigCPtr, this, value);
  }

  public String getActionDate() {
    return thosttraderapiJNI.CThostFtdcExchangeOptionSelfCloseActionField_ActionDate_get(swigCPtr, this);
  }

  public void setActionTime(String value) {
    thosttraderapiJNI.CThostFtdcExchangeOptionSelfCloseActionField_ActionTime_set(swigCPtr, this, value);
  }

  public String getActionTime() {
    return thosttraderapiJNI.CThostFtdcExchangeOptionSelfCloseActionField_ActionTime_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    thosttraderapiJNI.CThostFtdcExchangeOptionSelfCloseActionField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return thosttraderapiJNI.CThostFtdcExchangeOptionSelfCloseActionField_TraderID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    thosttraderapiJNI.CThostFtdcExchangeOptionSelfCloseActionField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return thosttraderapiJNI.CThostFtdcExchangeOptionSelfCloseActionField_InstallID_get(swigCPtr, this);
  }

  public void setOptionSelfCloseLocalID(String value) {
    thosttraderapiJNI.CThostFtdcExchangeOptionSelfCloseActionField_OptionSelfCloseLocalID_set(swigCPtr, this, value);
  }

  public String getOptionSelfCloseLocalID() {
    return thosttraderapiJNI.CThostFtdcExchangeOptionSelfCloseActionField_OptionSelfCloseLocalID_get(swigCPtr, this);
  }

  public void setActionLocalID(String value) {
    thosttraderapiJNI.CThostFtdcExchangeOptionSelfCloseActionField_ActionLocalID_set(swigCPtr, this, value);
  }

  public String getActionLocalID() {
    return thosttraderapiJNI.CThostFtdcExchangeOptionSelfCloseActionField_ActionLocalID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    thosttraderapiJNI.CThostFtdcExchangeOptionSelfCloseActionField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return thosttraderapiJNI.CThostFtdcExchangeOptionSelfCloseActionField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    thosttraderapiJNI.CThostFtdcExchangeOptionSelfCloseActionField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return thosttraderapiJNI.CThostFtdcExchangeOptionSelfCloseActionField_ClientID_get(swigCPtr, this);
  }

  public void setBusinessUnit(String value) {
    thosttraderapiJNI.CThostFtdcExchangeOptionSelfCloseActionField_BusinessUnit_set(swigCPtr, this, value);
  }

  public String getBusinessUnit() {
    return thosttraderapiJNI.CThostFtdcExchangeOptionSelfCloseActionField_BusinessUnit_get(swigCPtr, this);
  }

  public void setOrderActionStatus(char value) {
    thosttraderapiJNI.CThostFtdcExchangeOptionSelfCloseActionField_OrderActionStatus_set(swigCPtr, this, value);
  }

  public char getOrderActionStatus() {
    return thosttraderapiJNI.CThostFtdcExchangeOptionSelfCloseActionField_OrderActionStatus_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    thosttraderapiJNI.CThostFtdcExchangeOptionSelfCloseActionField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return thosttraderapiJNI.CThostFtdcExchangeOptionSelfCloseActionField_UserID_get(swigCPtr, this);
  }

  public void setBranchID(String value) {
    thosttraderapiJNI.CThostFtdcExchangeOptionSelfCloseActionField_BranchID_set(swigCPtr, this, value);
  }

  public String getBranchID() {
    return thosttraderapiJNI.CThostFtdcExchangeOptionSelfCloseActionField_BranchID_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    thosttraderapiJNI.CThostFtdcExchangeOptionSelfCloseActionField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return thosttraderapiJNI.CThostFtdcExchangeOptionSelfCloseActionField_IPAddress_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    thosttraderapiJNI.CThostFtdcExchangeOptionSelfCloseActionField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return thosttraderapiJNI.CThostFtdcExchangeOptionSelfCloseActionField_MacAddress_get(swigCPtr, this);
  }

  public CThostFtdcExchangeOptionSelfCloseActionField() {
    this(thosttraderapiJNI.new_CThostFtdcExchangeOptionSelfCloseActionField(), true);
  }

}
