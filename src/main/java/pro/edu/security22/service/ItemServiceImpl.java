package pro.edu.security22.service;
/*
  @author   george
  @project   security22
  @class  ItemServiceImpl
  @version  1.0.0 
  @since 03.10.22 - 15.51
*/

import org.springframework.stereotype.Service;
import pro.edu.security22.model.Item;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Service
public class ItemServiceImpl {

    private List<Item> items = new ArrayList<>(
            Arrays.asList(
                    new Item("1", "John", "Desc1"),
                    new Item("2", "Paul", "Desc2"),
                    new Item("3", "George", "Desc3")
            )
    );

    public List<Item> getAll(){
      return items;
    }

    public Item getOne(String id) {
        return items.stream().filter(item -> item.getId().equals(id)).findFirst().get();
    }

    public boolean deleteOne(String id) {
        Item item = this.getOne(id);
        return items.remove(item);
    }

    public Item addOne(Item item) {
        if( !(item.getId() == null) ){
            item.setId(UUID.randomUUID().toString());
        }
        items.add(item);
        return item;
    }

}
