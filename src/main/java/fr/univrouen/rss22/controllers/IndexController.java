package fr.univrouen.rss22.controllers;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

import javax.servlet.http.HttpServletResponse;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
@GetMapping(value = "/",produces = MediaType.TEXT_HTML_VALUE)
public String getAcceuil() throws IOException {
	org.springframework.core.io.Resource  resource = new DefaultResourceLoader().getResource("classpath:acceuil.html");
	 InputStream inputStream = resource.getInputStream();
	 String acceuilPage = new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);
	return acceuilPage;
}

@GetMapping("/help")
public void apiDocumentation(HttpServletResponse response) throws IOException {
  response.sendRedirect("/swagger-ui/index.html");
}
}