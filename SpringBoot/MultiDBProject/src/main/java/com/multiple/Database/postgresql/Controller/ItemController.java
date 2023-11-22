package com.multiple.Database.postgresql.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.multiple.Database.postgresql.entity.Item;
import com.multiple.Database.postgresql.repository.ItemRepository;

@RestController
public class ItemController {

	@Autowired
	private ItemRepository itemRepository;

	@PostMapping("/items")
	public Item additem(@RequestBody Item item) {
		return itemRepository.save(item);
	}

	@GetMapping("/items")
	public List<Item> getAllItems() {
		return itemRepository.findAll();
	}

	@PutMapping("/items/{id}")
	public Item updateCustomer(@PathVariable("id") int id, @RequestBody Item item) {
		Item it = new Item();
		it.setPrice(item.getPrice());
		it.setName(item.getName());
		it.setId(item.getId());
		return itemRepository.save(it);
	}

	@DeleteMapping("/items/{id}")
	public void deleteitem(@PathVariable("id") int id) {
		itemRepository.deleteById(id);
	}
}
