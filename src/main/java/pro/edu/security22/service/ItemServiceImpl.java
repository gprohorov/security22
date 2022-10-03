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

import java.util.List;

@Service
public class ItemServiceImpl {

    public List<Item> getAll(){
        return List.of(
                new Item("1", "John", "Desc1"),
                new Item("2", "Paul", "Desc2"),
                new Item("3", "George", "Desc3")
        );
    }

}
