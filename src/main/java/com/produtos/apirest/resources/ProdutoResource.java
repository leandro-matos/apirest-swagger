package com.produtos.apirest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.produtos.apirest.repository.ProdutoRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import com.produtos.apirest.models.Produto;

@RestController
@RequestMapping(value ="/api")
@Api(value="API REST Produtos")
@CrossOrigin(origins="*")
public class ProdutoResource {

	@Autowired
	ProdutoRepository produtoRepository;
	
	//Lista todos os produtos
	@GetMapping("/produtos")
	@ApiOperation(value="Retorna uma lista de Produtos")
	public List<Produto> listaProdutos(){
		return produtoRepository.findAll();
	}
	
	//Lista apenas um produto específico
	@GetMapping("/produto/{id}")
	@ApiOperation(value="Retorna um único Produto")
	public Produto listaProdutounico(@PathVariable(value="id") long id){
		return produtoRepository.findById(id);
	}
	
	//Salva um novo produto
	@PostMapping("/produto")
	@ApiOperation(value="Salva um Produto")
	public Produto salvaProduto(@RequestBody Produto produto) {
		return produtoRepository.save(produto);
	}
	
	//Atualiza um produto específico
	@DeleteMapping("/produto")
	@ApiOperation(value="Deleta um Produto")
	public void deletaProduto(@RequestBody Produto produto) {
		produtoRepository.delete(produto);
	}

	//Deleta um produto específico
	@PutMapping("/produto")
	@ApiOperation(value="Atualiza um Produto")
	public Produto atualizaProduto(@RequestBody Produto produto) {
		return produtoRepository.save(produto);
	}
	
}

