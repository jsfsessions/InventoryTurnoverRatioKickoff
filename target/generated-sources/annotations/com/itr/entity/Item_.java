package com.itr.entity;

import com.itr.entity.Address;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-15T18:46:01")
@StaticMetamodel(Item.class)
public class Item_ { 

    public static volatile SingularAttribute<Item, String> subCategory;
    public static volatile SingularAttribute<Item, String> color;
    public static volatile SingularAttribute<Item, Integer> totalQty;
    public static volatile SingularAttribute<Item, String> itemNameFromProforma;
    public static volatile SingularAttribute<Item, String> slotInBinLocation;
    public static volatile SingularAttribute<Item, String> categoryFull;
    public static volatile SingularAttribute<Item, Integer> storeQty;
    public static volatile SingularAttribute<Item, Enum> salesChannel;
    public static volatile SingularAttribute<Item, Float> customerReviews;
    public static volatile SingularAttribute<Item, Enum> palletSize;
    public static volatile SingularAttribute<Item, String> storeLocation;
    public static volatile SingularAttribute<Item, Float> standardShipRate;
    public static volatile SingularAttribute<Item, String> vendor;
    public static volatile SingularAttribute<Item, String> returnReason;
    public static volatile SingularAttribute<Item, Date> dateShipmentReceived;
    public static volatile SingularAttribute<Item, Long> id;
    public static volatile SingularAttribute<Item, String> itemDescription;
    public static volatile SingularAttribute<Item, String> palletName;
    public static volatile SingularAttribute<Item, String> department;
    public static volatile SingularAttribute<Item, String> binLocation;
    public static volatile SingularAttribute<Item, String> brandName;
    public static volatile SingularAttribute<Item, Integer> productId;
    public static volatile SingularAttribute<Item, Float> salePrice;
    public static volatile SingularAttribute<Item, String> upc;
    public static volatile SingularAttribute<Item, Float> weight;
    public static volatile SingularAttribute<Item, String> sellerInfo;
    public static volatile SingularAttribute<Item, Float> customerRating;
    public static volatile SingularAttribute<Item, Address> storeAddress;
    public static volatile SingularAttribute<Item, Integer> palletId;
    public static volatile SingularAttribute<Item, String> modelNumber;
    public static volatile SingularAttribute<Item, Float> dimsY;
    public static volatile SingularAttribute<Item, Float> retailPrice;
    public static volatile SingularAttribute<Item, Float> dimsZ;
    public static volatile SingularAttribute<Item, Float> dimsX;

}