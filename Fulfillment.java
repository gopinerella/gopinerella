package com.amway.gi.os.pojo;

import java.util.ArrayList;
import java.util.Date;

public class Fulfillment {
	  public Date actualDeliverydate;
	    public String fulfilledBaseItemId;
	    public Date fulfilledDate;
	    public String fulfilledItemLot;
	    public String fulfilledItemRevision;
	    public int fulfilledQuantity;
	    public String fulfilledSKU;
	    public ArrayList<String> fulfilledSerialNumbers;
	    public String fulfillmentLocation;
	    public String trackingId;
	    public String trackingURL;
	    public String uniqueFulfillmentID;
	    public String consignmentId;
	    public String uniqueShipId;
	    
	    public String getUniqueFulfillmentID() {
			return uniqueFulfillmentID;
		}
		public void setUniqueFulfillmentID(String uniqueFulfillmentID) {
			this.uniqueFulfillmentID = uniqueFulfillmentID;
		}
		public String getConsignmentId() {
			return consignmentId;
		}
		public void setConsignmentId(String consignmentId) {
			this.consignmentId = consignmentId;
		}
		public String getUniqueShipId() {
			return uniqueShipId;
		}
		public void setUniqueShipId(String uniqueShipId) {
			this.uniqueShipId = uniqueShipId;
		}
		public Date getActualDeliverydate() {
			return actualDeliverydate;
		}
		public void setActualDeliverydate(Date actualDeliverydate) {
			this.actualDeliverydate = actualDeliverydate;
		}
		public String getFulfilledBaseItemId() {
			return fulfilledBaseItemId;
		}
		public void setFulfilledBaseItemId(String fulfilledBaseItemId) {
			this.fulfilledBaseItemId = fulfilledBaseItemId;
		}
		public Date getFulfilledDate() {
			return fulfilledDate;
		}
		public void setFulfilledDate(Date fulfilledDate) {
			this.fulfilledDate = fulfilledDate;
		}
		public String getFulfilledItemLot() {
			return fulfilledItemLot;
		}
		public void setFulfilledItemLot(String fulfilledItemLot) {
			this.fulfilledItemLot = fulfilledItemLot;
		}
		public String getFulfilledItemRevision() {
			return fulfilledItemRevision;
		}
		public void setFulfilledItemRevision(String fulfilledItemRevision) {
			this.fulfilledItemRevision = fulfilledItemRevision;
		}
		public int getFulfilledQuantity() {
			return fulfilledQuantity;
		}
		public void setFulfilledQuantity(int fulfilledQuantity) {
			this.fulfilledQuantity = fulfilledQuantity;
		}
		public String getFulfilledSKU() {
			return fulfilledSKU;
		}
		public void setFulfilledSKU(String fulfilledSKU) {
			this.fulfilledSKU = fulfilledSKU;
		}
		public ArrayList<String> getFulfilledSerialNumbers() {
			return fulfilledSerialNumbers;
		}
		public void setFulfilledSerialNumbers(ArrayList<String> fulfilledSerialNumbers) {
			this.fulfilledSerialNumbers = fulfilledSerialNumbers;
		}
		public String getFulfillmentLocation() {
			return fulfillmentLocation;
		}
		public void setFulfillmentLocation(String fulfillmentLocation) {
			this.fulfillmentLocation = fulfillmentLocation;
		}
		public String getTrackingId() {
			return trackingId;
		}
		public void setTrackingId(String trackingId) {
			this.trackingId = trackingId;
		}
		public String getTrackingURL() {
			return trackingURL;
		}
		public void setTrackingURL(String trackingURL) {
			this.trackingURL = trackingURL;
		}
		
}
