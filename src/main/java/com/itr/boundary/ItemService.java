package com.itr.boundary;
 
import com.itr.entity.Item;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.slf4j.LoggerFactory;

@Stateless
public class ItemService {
    
    private final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(this.getClass());
    
    @PersistenceContext(unitName = "itrPU")
    private EntityManager em;
    
    public Item findItem(long id) { 
        return em.find(Item.class, id);
    }
    
    public void saveItem(Item item) { 
        if (item.getId() == null) { 
            em.persist(item);
            LOGGER.debug("item successfully saved...");
        }
    }
    
    public void deleteItem(Item item) { 
        if (item.getId() != null) { 
            em.remove((item));
            LOGGER.debug("Item with ID " + item.getId() + " successfully removed...");
        }
    }
}
