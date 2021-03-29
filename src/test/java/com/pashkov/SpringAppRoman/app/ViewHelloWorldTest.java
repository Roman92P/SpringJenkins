package com.pashkov.SpringAppRoman.app;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
@WithMockUser
class ViewHelloWorldTest {
	
	@Autowired
	MockMvc mockMvc;

	@Test
	void testViewHello() throws Exception {
		mockMvc.perform(get("/hello"))
		.andExpect(content().string("Hello From Jenkins Spring app"));
	}

}
