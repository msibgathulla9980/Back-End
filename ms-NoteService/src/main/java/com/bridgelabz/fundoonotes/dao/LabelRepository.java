package com.bridgelabz.fundoonotes.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bridgelabz.fundoonotes.model.Label;

public interface LabelRepository extends JpaRepository<Label, Integer>  {
	
	List<Label> findByUserId(int userId);

Label findByLabelId(int labelId);	 

	Optional<Label> findByLabelIdAndUserId(int labelId, int userId);
	
}
