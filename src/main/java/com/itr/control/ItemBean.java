package com.itr.control;

import com.itr.boundary.ItemService;
import com.itr.entity.Item;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class ItemBean {

    private Item item;

    @EJB
    private ItemService itemService;

    @PostConstruct
    public void init() {
        item = new Item();
    }

    public void saveItemAction() {
        itemService.saveItem(item);
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "ItemBean{" + "item=" + item + '}';
    }
}
