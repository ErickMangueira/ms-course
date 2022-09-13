package com.erick.worker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.erick.worker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
