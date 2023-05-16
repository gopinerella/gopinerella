package com.amway.gi.os.pojo;

import java.util.ArrayList;

public class Fee {
	public int feeAmount;
    public String feeCode;
    public ArrayList<FeeTaxDetail> feeTaxDetails;
    public ArrayList<InvoiceDetail> invoiceDeatails;
    public int feeTaxTotalAmount;
    
    public ArrayList<FeeTaxDetail> getFeeTaxDetails() {
		return feeTaxDetails;
	}
	public void setFeeTaxDetails(ArrayList<FeeTaxDetail> feeTaxDetails) {
		this.feeTaxDetails = feeTaxDetails;
	}
	public ArrayList<InvoiceDetail> getInvoiceDeatails() {
		return invoiceDeatails;
	}
	public void setInvoiceDeatails(ArrayList<InvoiceDetail> invoiceDeatails) {
		this.invoiceDeatails = invoiceDeatails;
	}
	public int getFeeAmount() {
		return feeAmount;
	}
	public void setFeeAmount(int feeAmount) {
		this.feeAmount = feeAmount;
	}
	public String getFeeCode() {
		return feeCode;
	}
	public void setFeeCode(String feeCode) {
		this.feeCode = feeCode;
	}
	public int getFeeTaxTotalAmount() {
		return feeTaxTotalAmount;
	}
	public void setFeeTaxTotalAmount(int feeTaxTotalAmount) {
		this.feeTaxTotalAmount = feeTaxTotalAmount;
	}
}
