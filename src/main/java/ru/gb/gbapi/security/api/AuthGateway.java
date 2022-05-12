package ru.gb.gbapi.security.api;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import ru.gb.gbapi.security.AuthenticationUserDto;

public interface AuthGateway {

	@PostMapping
	ResponseEntity<AuthenticationUserDto> loginUser(@Validated @RequestBody AuthenticationUserDto authenticationUserDto);
}
