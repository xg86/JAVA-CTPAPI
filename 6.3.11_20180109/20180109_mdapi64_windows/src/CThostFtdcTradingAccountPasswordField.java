/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcTradingAccountPasswordField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcTradingAccountPasswordField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcTradingAccountPasswordField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmduserapiJNI.delete_CThostFtdcTradingAccountPasswordField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thostmduserapiJNI.CThostFtdcTradingAccountPasswordField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmduserapiJNI.CThostFtdcTradingAccountPasswordField_BrokerID_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    thostmduserapiJNI.CThostFtdcTradingAccountPasswordField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return thostmduserapiJNI.CThostFtdcTradingAccountPasswordField_AccountID_get(swigCPtr, this);
  }

  public void setPassword(String value) {
    thostmduserapiJNI.CThostFtdcTradingAccountPasswordField_Password_set(swigCPtr, this, value);
  }

  public String getPassword() {
    return thostmduserapiJNI.CThostFtdcTradingAccountPasswordField_Password_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    thostmduserapiJNI.CThostFtdcTradingAccountPasswordField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return thostmduserapiJNI.CThostFtdcTradingAccountPasswordField_CurrencyID_get(swigCPtr, this);
  }

  public CThostFtdcTradingAccountPasswordField() {
    this(thostmduserapiJNI.new_CThostFtdcTradingAccountPasswordField(), true);
  }

}