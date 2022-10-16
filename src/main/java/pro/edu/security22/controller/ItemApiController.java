package pro.edu.security22.controller;
/*
  @author   george
  @project   security22
  @class  ItemApiController
  @version  1.0.0 
  @since 03.10.22 - 15.46
*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pro.edu.security22.model.Item;
import pro.edu.security22.service.ItemServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/api/v1/items")
public class ItemApiController {

    @Autowired
    ItemServiceImpl service;

    @GetMapping("/")
    List<Item> getAll(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    Item getOne(@PathVariable String id){
        return service.getOne(id);
    }

    @DeleteMapping("/{id}")
    boolean deleteOne(@PathVariable String id){
        return service.deleteOne(id);
    }

    @PostMapping("/")
    Item insertOne(@RequestBody Item item){
        return service.addOne(item);
    }




}
