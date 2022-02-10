package br.senai.cotia.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.senai.cotia.hellospring.dao.DaoProduto;
import br.senai.cotia.hellospring.modelo.Produto;
import br.senai.cotia.hellospring.modelo.TipoProduto;

@Controller
public class ProdutoController {
	@RequestMapping("formProduto")
	public String form(Model model) {
		model.addAttribute("tipos", TipoProduto.values());
		return "formproduto";
	}
	@RequestMapping ("salvarProduto")
	public String salvarProduto(Produto produto) {
		System.out.println(produto.getNome());
		System.out.println(produto.getPreco());
		System.out.println(produto.getEstoque());
		System.out.println(produto.getDataValidade());
		System.out.println(produto.getTipoProduto());
		
		DaoProduto dao = new DaoProduto();
		dao.inserir(produto);
		
		return "redirect:listarProduto";
	}
	@RequestMapping("listarProduto")
	public String lisarProdutos(Model model) {
		DaoProduto dao = new DaoProduto();
		model.addAttribute("produtos", dao.listar());
		return"listaproduto";
	}
	@RequestMapping("excluirProduto")
	public String excluir(long idProduto) {
		DaoProduto dao = new DaoProduto();
		dao.excluir(idProduto);
		return "redirect:listarProduto";
	}
	@RequestMapping("alterarProduto")
	public String alterar(long idProduto, Model model) {
		DaoProduto dao = new DaoProduto();
		model.addAttribute("produto", dao.buscar(idProduto));
		
		return "forward:formProduto";
	}
}
