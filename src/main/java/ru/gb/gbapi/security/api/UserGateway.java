package ru.gb.gbapi.security.api;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.gb.gbapi.product.dto.ProductDto;
import ru.gb.gbapi.security.AuthenticationUserDto;
import ru.gb.gbapi.security.UserDto;

import java.util.List;

public interface UserGateway {

//	@GetMapping
//	List<ProductDto> getProductList();
//
//	@GetMapping("/{id}")
//	ResponseEntity<ProductDto> getProduct(@PathVariable("id") Long id);

	@PostMapping
	ResponseEntity<UserDto> registerUser(@Validated @RequestBody UserDto userDto);

//	@PutMapping("/{id}")
//	ResponseEntity<ProductDto> handleUpdate(@PathVariable("id") Long id,
//											@Validated @RequestBody ProductDto productDto);
//
//	@DeleteMapping("/{id}")
//	void deleteById(@PathVariable("id") Long id);
}
