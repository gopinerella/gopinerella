package com.amway.gi.os.pojo;

import java.util.ArrayList;

public class InvoiceAdjustment {
	public int adjustmentAppliedQuantity;
    public String adjustmentCode;
    public String adjustmentType;
    public int bvAdjustmentAmount;
    public int feesAdjustmentAmount;
    public int priceAdjustmentAmount;
    public int pvAdjustmentAmount;
    public String serializedAdjustmentId;
    public ArrayList<TaxDetail> taxDetails;
    public int totalTaxAmount;
    
	public int getAdjustmentAppliedQuantity() {
		return adjustmentAppliedQuantity;
	}
	public void setAdjustmentAppliedQuantity(int adjustmentAppliedQuantity) {
		this.adjustmentAppliedQuantity = adjustmentAppliedQuantity;
	}
	public String getAdjustmentCode() {
		return adjustmentCode;
	}
	public void setAdjustmentCode(String adjustmentCode) {
		this.adjustmentCode = adjustmentCode;
	}
	public String getAdjustmentType() {
		return adjustmentType;
	}
	public void setAdjustmentType(String adjustmentType) {
		this.adjustmentType = adjustmentType;
	}
	public int getBvAdjustmentAmount() {
		return bvAdjustmentAmount;
	}
	public void setBvAdjustmentAmount(int bvAdjustmentAmount) {
		this.bvAdjustmentAmount = bvAdjustmentAmount;
	}
	public int getFeesAdjustmentAmount() {
		return feesAdjustmentAmount;
	}
	public void setFeesAdjustmentAmount(int feesAdjustmentAmount) {
		this.feesAdjustmentAmount = feesAdjustmentAmount;
	}
	public int getPriceAdjustmentAmount() {
		return priceAdjustmentAmount;
	}
	public void setPriceAdjustmentAmount(int priceAdjustmentAmount) {
		this.priceAdjustmentAmount = priceAdjustmentAmount;
	}
	public int getPvAdjustmentAmount() {
		return pvAdjustmentAmount;
	}
	public void setPvAdjustmentAmount(int pvAdjustmentAmount) {
		this.pvAdjustmentAmount = pvAdjustmentAmount;
	}
	public String getSerializedAdjustmentId() {
		return serializedAdjustmentId;
	}
	public void setSerializedAdjustmentId(String serializedAdjustmentId) {
		this.serializedAdjustmentId = serializedAdjustmentId;
	}
	public ArrayList<TaxDetail> getTaxDetails() {
		return taxDetails;
	}
	public void setTaxDetails(ArrayList<TaxDetail> taxDetails) {
		this.taxDetails = taxDetails;
	}
	public int getTotalTaxAmount() {
		return totalTaxAmount;
	}
	public void setTotalTaxAmount(int totalTaxAmount) {
		this.totalTaxAmount = totalTaxAmount;
	}
}
