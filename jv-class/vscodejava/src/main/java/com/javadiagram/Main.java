package com.javadiagram;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();

        // Inicie uma transação para garantir que o Hibernate tente criar o esquema
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        transaction.commit();

        em.close();
        emf.close();
    }
}
