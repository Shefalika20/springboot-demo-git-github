package io.java.learning.moviecatalogservice.resource;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.java.learning.moviecatalogservice.model.CatalogueItem;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

	@RequestMapping("/{userId}")
	public List<CatalogueItem> getCatalogue(@PathVariable("userId") String userID){
			
		return Collections.singletonList(new CatalogueItem(4, "Transformer", "Test")
			);
	}
}
