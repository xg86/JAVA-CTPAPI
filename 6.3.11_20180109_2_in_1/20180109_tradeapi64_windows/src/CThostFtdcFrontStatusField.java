/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.thostapi;

public class CThostFtdcFrontStatusField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcFrontStatusField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcFrontStatusField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thosttraderapiJNI.delete_CThostFtdcFrontStatusField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setFrontID(int value) {
    thosttraderapiJNI.CThostFtdcFrontStatusField_FrontID_set(swigCPtr, this, value);
  }

  public int getFrontID() {
    return thosttraderapiJNI.CThostFtdcFrontStatusField_FrontID_get(swigCPtr, this);
  }

  public void setLastReportDate(String value) {
    thosttraderapiJNI.CThostFtdcFrontStatusField_LastReportDate_set(swigCPtr, this, value);
  }

  public String getLastReportDate() {
    return thosttraderapiJNI.CThostFtdcFrontStatusField_LastReportDate_get(swigCPtr, this);
  }

  public void setLastReportTime(String value) {
    thosttraderapiJNI.CThostFtdcFrontStatusField_LastReportTime_set(swigCPtr, this, value);
  }

  public String getLastReportTime() {
    return thosttraderapiJNI.CThostFtdcFrontStatusField_LastReportTime_get(swigCPtr, this);
  }

  public void setIsActive(int value) {
    thosttraderapiJNI.CThostFtdcFrontStatusField_IsActive_set(swigCPtr, this, value);
  }

  public int getIsActive() {
    return thosttraderapiJNI.CThostFtdcFrontStatusField_IsActive_get(swigCPtr, this);
  }

  public CThostFtdcFrontStatusField() {
    this(thosttraderapiJNI.new_CThostFtdcFrontStatusField(), true);
  }

}
