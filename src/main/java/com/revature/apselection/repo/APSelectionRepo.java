package com.revature.apselection.repo;

@Repository
public interface APSelectionRepo extends JpaRepository<String, String>{

}

public interface SuperHumanRepo extends JpaRepository<Hero, String>{
}