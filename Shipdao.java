package com.dao;

import com.entities.Ship;

import java.util.List;

public interface Shipdao {

    void createShipTable();
    void insert (Ship ship);
    Ship selectById (int id);
    List<Ship> selectAll();
    List<Ship> selectByName(String name);
    List<Ship> selectByDate(String year, String month, String day, String hour, String minute, String second);
    //void delete (int id);day
    void update (Ship ship, int id);
}
