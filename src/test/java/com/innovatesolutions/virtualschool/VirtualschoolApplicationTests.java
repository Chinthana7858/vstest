package com.innovatesolutions.virtualschool;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(properties = {
		"spring.data.mongodb.uri=mongodb+srv://chinthana:chinthana99@chinthana.ydhrjtg.mongodb.net/virtualschool?retryWrites=true&w=majority&appName=Chinthana"
})
class VirtualschoolApplicationTests {

	@Test
	void contextLoads() {
	}
}
