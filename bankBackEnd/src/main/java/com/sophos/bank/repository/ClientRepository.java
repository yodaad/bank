package com.sophos.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sophos.bank.entity.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client,Integer>{

}