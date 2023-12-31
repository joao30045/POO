package negocio;

import dados.Animal;
import dados.Aquario;
import dados.Peixe;
import dados.Viveiro;
import exceptions.EspacoIndisponivelException;

public class Zoologico {
	private Animal animais[] = new Animal[100];
	private Viveiro viveiros[] = new Viveiro[50];
	private int quantViveiros = 0;
	private int quantAnimais = 0;

	public void cadastrarViveiro(Viveiro viveiro) {
		viveiros[quantViveiros] = viveiro;
		quantViveiros++;
	}

	public void cadastrarAnimal(Animal animal) {
		animais[quantAnimais] = animal;
		quantAnimais++;
	}

	public Animal[] getAnimais() {
		return animais;
	}

	public Viveiro[] getViveiros() {
		return viveiros;
	}

	public int getQuantViveiros() {
		return quantViveiros;
	}

	public int getQuantAnimais() {
		return quantAnimais;
	}

	public Viveiro[] getSoViveiros() {
		int quant = 0;

		for (int i = 0; i < quantViveiros; i++) {
			if (!(viveiros[i] instanceof Aquario)) {
				quant++;
			}
		}

		Viveiro viveirosTemp[] = new Viveiro[quant];

		int cont = 0;
		for (int i = 0; i < quantViveiros; i++) {
			if (!(viveiros[i] instanceof Aquario)) {
				viveirosTemp[cont] = viveiros[i];
				cont++;
			}
		}
		return viveirosTemp;
	}

	public Aquario[] getSoAquarios() {
		int quant = 0;

		for (int i = 0; i < quantViveiros; i++) {
			if (viveiros[i] instanceof Aquario) {
				quant++;
			}
		}

		Aquario aquariosTemp[] = new Aquario[quant];

		int cont = 0;
		for (int i = 0; i < quantViveiros; i++) {
			if (viveiros[i] instanceof Aquario) {
				aquariosTemp[cont] = (Aquario) viveiros[i];
				cont++;
			}
		}
		return aquariosTemp;
	}

	public void alocarAnimal(Animal animal, Viveiro viveiro) throws EspacoIndisponivelException{
		viveiro.adicionaAnimal(animal);
	}
}