/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fst.sir.biblio.ws.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fst.sir.biblio.bean.Fournisseur;
import fst.sir.biblio.service.facade.FournisseurService;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@CrossOrigin(origins = {"http://localhost:4200"})
@RequestMapping("biblio/fournisseur")
public class FournisseurRest {
	@Autowired
	private FournisseurService fournisseurService;
@GetMapping("/cin/{cin}")
	public Fournisseur findByCin( @PathVariable String cin) {
		return fournisseurService.findByCin(cin);
	}
@PostMapping("/")
	public int save( @RequestBody Fournisseur fournisseur) {
		return fournisseurService.save(fournisseur);
	}
@DeleteMapping("/cin/{cin}")
	public int deleteByCin(@PathVariable String cin) {
		return fournisseurService.deleteByCin(cin);
	}
@GetMapping("/")
	public List<Fournisseur> findAll() {
		return fournisseurService.findAll();
	}
	

}
