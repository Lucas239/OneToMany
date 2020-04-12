package br.clima.usjt_clima_jpa_hibernate.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.clima.usjt_clima_jpa_hibernate.model.Temperatura;

public class TesteAtualizaTemperatura {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Temperatura t = manager.find(Temperatura.class, 1L);
		t.setTempMin("24°");
		t.setTempMax("27°");
		t.setHumidadeAr("40%");
		t.setLatitude("80°");
		t.setLongitude("60°");
		t.setDescricao("Sem nuvens no céu");
		t.setDataHora("19:23");
		transaction.commit();
		manager.close();
		JPAUtil.close();

	}

}
