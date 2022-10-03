package pro.edu.security22.controller;
/*
  @author   george
  @project   security22
  @class  ItemApiController
  @version  1.0.0 
  @since 03.10.22 - 15.46
*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.edu.security22.model.Item;
import pro.edu.security22.service.ItemServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/api/v1/items")
public class ItemApiController {

    @Autowired
    ItemServiceImpl service;

    @GetMapping
    List<Item> getAll(){
        return service.getAll();
    }

}
