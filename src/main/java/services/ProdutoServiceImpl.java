package services;

import java.util.ArrayList;
import java.util.List;

import domain.Produto;

public class ProdutoServiceImpl implements ProdutoService {

	private List<Produto> produtos = new ArrayList<>();
	
	public ProdutoServiceImpl() {
		for (int i = 0; i < 10; i++) {
			Produto vehicle = new Produto();
			vehicle.setId(i);
			vehicle.setNome("Subaru" + i);
			produtos.add(vehicle);
		}
	}
	
	public List<Produto> getAll() {
		return produtos;
	}


//    @Override
//    public Vehicle saveVehicle(Vehicle vehicle) {
//    	if(vehicle.getId() != null) {
//    		this.deleteById(vehicle.getId());
//    	} else {
//    		actualId++;
//    		vehicle.setId(actualId);
//    	}
//    	this.vehicles.add(vehicle);
//        return vehicle;
//    }

//    @Override
//    public void deleteById(Integer id) {
//    	this.vehicles.removeIf(vehicle -> vehicle.getId().equals(id));
//    }
}