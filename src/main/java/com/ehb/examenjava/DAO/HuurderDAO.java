package com.ehb.examenjava.DAO;

import com.ehb.examenjava.model.Huurder;
import org.springframework.data.repository.CrudRepository;

public interface HuurderDAO extends CrudRepository<Huurder, Integer> {

}
