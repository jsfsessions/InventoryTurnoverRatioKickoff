package com.vectorfreight.control;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import org.primefaces.event.RowEditEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Named
@ViewScoped
public class QuoteBean implements Serializable {

    Logger LOGGER = LoggerFactory.getLogger(QuoteBean.class);

    private String shipfromZip;
    private String shipFromZone;
    private Date dateFrom;
    private String shipToZip;
    private String shipToZone;
    private boolean extremelength;
    private boolean freezeprotect;

    private List<Item> items;
    private List<String> shipFromServices;
    private List<String> shipToServices;

    @PostConstruct
    public void init() {
        items = new ArrayList<>();
        shipFromServices = new ArrayList<>();
        shipToServices = new ArrayList<>();

        shipFromZone = "Residence";
        shipToZone = "Business";
        items.add(new Item());
    }

    public boolean isExtremelength() {
        return extremelength;
    }

    public void setExtremelength(boolean extremelength) {
        this.extremelength = extremelength;
    }

    public boolean isFreezeprotect() {
        return freezeprotect;
    }

    public void setFreezeprotect(boolean freezeprotect) {
        this.freezeprotect = freezeprotect;
    }    

    public String getShipFromZone() {
        return shipFromZone;
    }

    public void setShipFromZone(String shipFromZone) {
        this.shipFromZone = shipFromZone;
    }

    public String getShipfromZip() {
        return shipfromZip;
    }

    public void setShipfromZip(String shipfromZip) {
        this.shipfromZip = shipfromZip;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public List<String> getShipFromServices() {
        return shipFromServices;
    }

    public void setShipFromServices(List<String> shipFromServices) {
        this.shipFromServices = shipFromServices;
    }

    public String getShipToZip() {
        return shipToZip;
    }

    public void setShipToZip(String shipToZip) {
        this.shipToZip = shipToZip;
    }

    public String getShipToZone() {
        return shipToZone;
    }

    public void setShipToZone(String shipToZone) {
        this.shipToZone = shipToZone;
    }

    public List<String> getShipToServices() {
        return shipToServices;
    }

    public void setShipToServices(List<String> shipToServices) {
        this.shipToServices = shipToServices;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public void onRowEdit(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Item Edited", ((Item) event.getObject()).getDesc());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public void onRowCancel(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Edit Cancelled", ((Item) event.getObject()).getDesc());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public void addItem() {
        items.add(new Item());
    }

    public void removeItem(Item item) {
        if (items.size() > 1) {
            items.remove(item);
        } else {
            FacesMessage msg = new FacesMessage("At least one item needed!");
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
    }

    public void dummyAction() {
        LOGGER.debug("------------------------------------------");

        LOGGER.debug("------------------------------------------");

    }
}
